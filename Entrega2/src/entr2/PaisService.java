package entr2;

import java.util.ArrayList;

public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	@SuppressWarnings({ "rawtypes" })
	public ArrayList getPaisMaisHab() {
		return PaisDAO.maiorPopulacao();	
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getPaisMenor() {
		return PaisDAO.areaMenor();	
	}
	

}