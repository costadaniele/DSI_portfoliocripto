package com.aula.model;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MoedaDAO {
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void insertMoeda(Moeda moeda) {
		String sql = "INSERT INTO moeda (id_cliente, nome, preco_atual, maior_preco, "
				+ "menor_preco, preco_medio) VALUES (?, ?, ?, ?, ?, ?)";
		jdbc.update(sql, new Object[] {
				moeda.getId_cliente(), moeda.getNome(), moeda.getPreco_atual(),
				moeda.getMaior_preco(), moeda.getMenor_preco(), moeda.getPreco_medio()
		});
	}
	
	public Map<String, Object> getMoeda(int id){
		String sql = "SELECT * from moeda WHERE id=?";
		return jdbc.queryForMap(sql, new Object[] {id});
	}
	
	public List<Map<String, Object>> getMoedas(int id){
		String sql = "SELECT * from moeda WHERE id_cliente=?";
		List<Map<String, Object>> produtos = (List<Map<String, Object>>) jdbc.queryForList(sql,
				new Object[] {id});
		return produtos;
	}
	
	public void deleteMoeda(int id) {
		String sql =  "DELETE FROM moeda WHERE id=?";
		jdbc.update(sql, new Object[] {id});
	}
	
	public void updateMoeda(int id, Moeda moeda) {
		String sql = "UPDATE moeda SET preco_atual=?, maior_preco=?, menor_preco=?,"
				+ "preco_medio=? WHERE id=?";
		jdbc.update(sql, new Object[] {
				moeda.getPreco_atual(), moeda.getMaior_preco(), moeda.getMenor_preco(), moeda.getPreco_medio()
		});
	}
}
