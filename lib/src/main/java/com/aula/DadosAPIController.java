package com.aula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aula.model.Coin;
import com.aula.model.DataTest;

@Controller
public class DadosAPIController {
	private static List<Coin> listTest;
	private List<DataTest> userList;

	@Autowired
	private ApplicationContext context;
	
	private static HttpURLConnection connection;
	
	@GetMapping("/")
	public String principal(Model model) {
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		
		userList = new ArrayList<>();
		
		try {
			URL urlT = new URL("http://coins-api-fatec.herokuapp.com/all");
//			URL urlT = new URL("http://127.0.0.1:5000/all");
			connection = (HttpURLConnection) urlT.openConnection();
			
			//Request setup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			int status = connection.getResponseCode();
			System.out.println(status);
			
			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
				System.out.println(responseContent.toString());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
		
		
		model.addAttribute("data", parseJson(responseContent.toString()));
			
		return "principal";
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		//Method 2: java.net.http.HttpClient
		HttpClient client = HttpClient.newHttpClient();
//		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://127.0.0.1:5000/all")).build();

		//		.thenAccept(System.out::println)
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenApply(DadosAPIController::parseJson)
		.join();
		
		return "principal";
	}
	
	private static List<Coin> parseJson(String responseBody) {
		JSONArray albums = new JSONArray(responseBody);
		listTest = new ArrayList<>();
		
		
		for (int i = 0; i < albums.length(); i++) {
			JSONObject album = albums.getJSONObject(i);
			
			int id = album.getInt("id");
			String url = album.getString("url");
			String symbol = album.getString("symbol");
			String name = album.getString("name");
			
			Coin dataTest = new Coin(id, url, symbol, name);
			listTest.add(dataTest);
			
//			System.out.println(id + " " + title + " " + userId);
		}
		
		return listTest;
	}
}
