package entrega1_Pais;

import org.junit.FixMethodOrder; 
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTest {

	@Test
	public void test00Carregar() {
		System.out.println("Carregar país");
		System.out.println(PaisDAO.carregar(1));
		System.out.println(PaisDAO.carregar(2));
		System.out.println(PaisDAO.carregar(3));
		System.out.println(PaisDAO.carregar(4));
		System.out.println(PaisDAO.carregar(5));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test01Criar() {
		System.out.println("Criar país");
		PaisDAO.criar(6, "EUA", 185524943L, 97354080);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar país");
		PaisDAO.atualizar(6, "EUA", 000000001L, 97354080);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test03Excluir() {
		System.out.println("Excluir país");
		PaisDAO.excluir(6);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test04PaisMaisHab() {
		System.out.println("Buscar o país mais habitado");
		System.out.println(PaisDAO.buscaPaisMaisHab());
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void test05PaisMenor() {
		System.out.println("Buscar o país com menor área");
		System.out.println(PaisDAO.buscaPaisMenor());
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void test06Vetor() {
		System.out.println("Vetor 3 países");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
	}
}
