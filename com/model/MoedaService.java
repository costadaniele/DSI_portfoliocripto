package com.aula.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class MoedaService {
	@Autowired
	MoedaDAO pdao;
	
	public void insert(Moeda moeda) {
		pdao.insertMoeda(moeda);
	}
	
	public Map<String, Object> getMoeda(int id){
		return pdao.getMoeda(id);
	}
	
	public List<Map<String, Object>> getProdutos(int id){
		return pdao.getMoedas(id);
	}
	
	public void updateMoeda(int id, Moeda moeda) {
		pdao.updateMoeda(id, moeda);
	}
	
	public void deleteProduto(int id) {
		pdao.deleteMoeda(id);
	}
}
