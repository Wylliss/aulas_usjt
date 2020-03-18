package entr2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTest {
	Pais pais, copia;
	static int id = 0;


	@Test
	public void test00Criar() {
		System.out.println("Inserir novo pa�s");
		Pais pais = new Pais(0, "Espanha", 46524943L, 504030.0);
		PaisDAO.criar(pais);
		System.out.println("Pa�s Inserido com sucesso\n");
	}

	@Test
	public void test01Carregar() {
		System.out.println("carregar pa�s com id 1");
		System.out.println(PaisDAO.carregar(1) +"\n");
	}


	@Test
	public void test03Excluir() {
		System.out.println("excluir pa�s com id 1");	
		PaisDAO.excluir(10);		
		System.out.println("exclus�o de pa�s realizada com sucesso\n");
	}


	@Test
	public void test04Vetor() {
		System.out.println("Verificar 3 primeiros pa�ses da tabela por Vetor");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais + "\n");
		}
	}
	@Test
	public void test05areaMenor() {		
		System.out.println("Verificar pa�s com menor area");
		System.out.println(PaisDAO.areaMenor() +"\n");
		
	}
	
	@Test
	public void test06maiorPopulacao() {		
		System.out.println("Verificar pa�s com maior Populacao");
		System.out.println(PaisDAO.maiorPopulacao() +"\n");
	}
	
}


