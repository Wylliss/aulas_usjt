package othermethod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	private Connection con;

	Conexao (){					
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/aulasusjt?user=alunos&password=alunos&useTimezone=true&serverTimezone=UTC");
			System.out.println("Conex�o realizada com sucesso!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public int executaSQL(String sql) {
//		try {
//			Statement stm = con.createStatement();
//			int res = stm.executeUpdate(sql);
//			con.close ();
//			return res;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		}
//	}

	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			con.close ();
			return rs;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
}

