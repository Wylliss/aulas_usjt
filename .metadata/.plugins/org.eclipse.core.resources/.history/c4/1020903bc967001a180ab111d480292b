package othermethod;

import java.sql.ResultSet;

public class ConexaoTeste {

	public static void main ( String [] args) {

//		Conexao con = new Conexao () ;
//		String sql = "INSERT INTO `pais` (`nome`,`populacao`,`area`) VALUES ('NovoTeste',201032714,8515049)";
//
//		int res = con.executaSQL(sql);
//		if ( res > 0 ) {
//			System.out.println("Cadastro com sucesso");
//		}
//		else {
//			System.out.println("Erro durante o cadastro");
//		}

		
		Conexao con = new Conexao () ;
		String sql =  "Select * from pais";
		ResultSet rs = con.executaBusca(sql);

		try {
			while (rs.next ()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				long populacao = rs.getLong("populao");
				double area = rs.getDouble("area");
				System.out.println(id+ " - " +nome+ " - " +populacao+ " - " +area );
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}