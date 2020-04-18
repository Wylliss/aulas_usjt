package entrega4_observer_81_e_82;

public class Programa {

	public static void main(String[] args) {

		ConsomeNoticia agregadorTopico = new AgregadorTopico("Games");
		ConsomeNoticia agregadorMensal = new AgregadorMensal();

		NoticiarioAssina noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("Concurso de game indie retorna na Brasil Game Show 2020", 16, 04, "Games");
		
		new Consumidor("Wyllis Silva", noticiario);
		noticiario.notificaNoticia("Valorant: Riot Games anuncia início de beta fechado para o Brasil", 9, 04, "Games");

		new Consumidor("Marcus Fernandes", noticiario);
		noticiario.notificaNoticia("GDC 2020, conferência de desenvolvedores de games, é adiada por causa do coronavírus", 28, 02, "Games");
		
		new Consumidor("Cesar", noticiario);
		noticiario.notificaNoticia("Agrotins: em Tocantins, feira de tecnologia deve ser realizada de forma virtual", 17, 04, "Técnologia");
	
		noticiario = new NoticiarioAssina(agregadorMensal);
		new Consumidor("Eliu Silva", noticiario);
		noticiario.notificaNoticia("falta de testes é desafio para ministro da saude", 18, 04, "Saúde");
		
		}

}
