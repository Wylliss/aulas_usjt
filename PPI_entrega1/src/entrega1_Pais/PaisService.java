package entrega1_Pais;


import java.util.ArrayList;


public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	@SuppressWarnings({ "rawtypes" })
	public ArrayList getPaisMaisHab() {
		return PaisDAO.buscaPaisMaisHab();	
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getPaisMenor() {
		return PaisDAO.buscaPaisMenor();	
	}
	
	public int criar(Pais pais) {
		return PaisDAO.criar(pais.getId(), pais.getNome(), pais.getPopulacao(), pais.getArea());
	}
	
	public void atualizar(Pais pais){
		PaisDAO.atualizar(0, null, 0, 0);
	}
	
	public void excluir(int id){
		PaisDAO.excluir(id);
	}
	
	public Pais carregar(int id){
		return PaisDAO.carregar(id);
	}

}