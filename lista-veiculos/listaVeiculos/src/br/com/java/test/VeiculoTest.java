package br.com.java.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.java.dao.VeiculoDao;
import br.com.java.entity.Veiculo;

public class VeiculoTest {

	@Test
	@Ignore
	public void TestInserir () {
		
		Veiculo f2 = new Veiculo();
		f2.setModelo("outro");
		f2.setAno(2017);
		f2.setMarca("sadsdaasdasda");
		f2.setSituacao("hahahahha");
		
		VeiculoDao dao = new VeiculoDao();
		
		try {
			dao.inserir(f2);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void listar() {
		VeiculoDao dao = new VeiculoDao();
		List<Veiculo> veiculos;
		try {
			veiculos = dao.listarTodos();
			for (Veiculo veiculo : veiculos) {
				System.out.println(veiculo);
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void buscarProCodigo() {
		VeiculoDao dao = new VeiculoDao();
		Veiculo f1;
		try {
			f1 = dao.selecionar(1);
			System.out.println(f1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		VeiculoDao dao = new VeiculoDao();
		try {
			dao.excluir(1);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void editar() {
		VeiculoDao dao = new VeiculoDao();
		try {
			Veiculo veiculo = new Veiculo();
			veiculo.setModelo("novo");
			veiculo.setAno(2000);
			veiculo.setMarca("sadsdasdasdasdasdasd");
			veiculo.setSituacao("disponivel");
			dao.atualizar(veiculo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}