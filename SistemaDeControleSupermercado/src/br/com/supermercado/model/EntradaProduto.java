package br.com.supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entradaproduto")
public class EntradaProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private String nomeMercadoria;
	private double quantidade;
	private double valor;
	
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeMercadoria() {
		return nomeMercadoria;
	}
	public void setNomeMercadoria(String nomeMercadoria) {
		this.nomeMercadoria = nomeMercadoria;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
