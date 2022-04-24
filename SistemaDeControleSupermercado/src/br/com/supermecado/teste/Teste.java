package br.com.supermecado.teste;

import br.com.suoermercado.dao.EntradaProdutoDao;
import br.com.suoermercado.dao.FuncionarioDao;
import br.com.supermercado.model.EntradaProduto;
import br.com.supermercado.model.Funcionario;

public class Teste {

	public static void main(String[] args) {
		


		Funcionario fun = new Funcionario();
		fun.setCodigo(0);
		fun.setNome("paulo henrique");
		fun.setFuncao("caixa");
		

		Funcionario fun1 = new Funcionario();
		fun1.setCodigo(0);
		fun1.setNome("natalia sobral");
		fun1.setFuncao("caixa");
		
		Funcionario fun2 = new Funcionario();
		fun2.setCodigo(0);
		fun2.setNome("maria socorro");
		fun2.setFuncao("repositora");
		
		FuncionarioDao funD = new FuncionarioDao();
		funD.inserir(fun);
		funD.inserir(fun1);
		funD.inserir(fun2);
		
		EntradaProduto entra = new EntradaProduto();
		entra.setCodigo(0);
		entra.setNomeMercadoria("feijao");
		entra.setQuantidade(10);
		entra.setValor(50);
		
		EntradaProdutoDao entradao = new EntradaProdutoDao();
		entradao.inserir(entra);
		
		
		
		

	}

}
