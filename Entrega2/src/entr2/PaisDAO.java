package entr2;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class PaisDAO {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	// Obt�m conex�o com o banco de dados
	public static Connection obtemConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/aulasusjt?useTimezone=true&serverTimezone=America/Sao_Paulo&user=alunos&password=alunos");
	}
	public static void criar(Pais pais) {
		String sqlInsert = "INSERT INTO pais(nome, populacao, area) VALUES (?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, pais.getNomePais());
			stm.setLong(2, pais.getPopulacaoPais());
			stm.setDouble(3, pais.getAreaPais());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void atualizar(int id, String nome, long populacao, double area) {
		String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE id=?";
		// usando o try with resources do Java 7, quefecha o queabriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, id);
			stm.setString(2, nome);
			stm.setLong(3, populacao);
			stm.setDouble(4, area);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void excluir(int id) {
		String sqlDelete = "DELETE FROM pais WHERE id = ?";
		// usando o try with resources do Java 7, quefecha o queabriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Pais carregar(int id) {
		Pais pais = null;
		String sqlSelect = "SELECT nome, populacao, area FROM pais WHERE id = ?";
		// usando o try with resources do Java 7, quefecha o queabriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, id);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					String nome = rs.getString("nome");
					Long populacao = rs.getLong("populacao");
					Double area = rs.getDouble("area");
					pais = new Pais (id, nome, populacao, area);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return pais;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList maiorPopulacao() {
		ArrayList buscaHabi = new ArrayList();
		String sqlSelect = "select * from pais order by populacao desc limit 1";
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					buscaHabi.add(rs.getString("nome"));
					buscaHabi.add(rs.getString("populacao"));
					buscaHabi.add(rs.getString("area"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return buscaHabi;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList areaMenor() {
		ArrayList buscaArea = new ArrayList();
		String sqlSelect = "select * from pais order by area limit 1";
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					buscaArea.add(rs.getString("nome"));
					buscaArea.add(rs.getString("populacao"));
					buscaArea.add(rs.getString("area"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return buscaArea;
	}

	//Criar o vetor de 3 paises	
	public static Pais[] Vetor() {
		Pais pais = null;
		Pais[] vetor = new Pais[3];
		int count = 0;
		String sqlSelect = "SELECT id, nome, populacao, area FROM pais limit 3";
		// usando o try with resources do Java 7, quefecha o queabriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					Integer id = rs.getInt("id");
					String nome = rs.getString("nome");
					Long populacao = rs.getLong("populacao");
					Double area = rs.getDouble("area");
					pais = new Pais(id, nome, populacao, area);
					vetor[count++] = pais;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return vetor;
	}
	
}