package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pId = Integer.parseInt(request.getParameter("id"));
		String pNome = request.getParameter("nome");
		long pPopulacao = Long.parseLong(request.getParameter("populacao"));
		double pArea = Double.parseDouble(request.getParameter("area"));
		
		//instanciar o javabean
		Pais pais = new Pais();
		pais.setId(pId);
		pais.setNome(pNome);
		pais.setPopulacao(pPopulacao);
		pais.setArea(pArea);
		
		//instanciar o service
		PaisService cs = new PaisService();
		int id = cs.criar(pais);
		pais = cs.carregar(id);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><title>PaisCadastrado</title></head><body>");
//		out.println( "id: "+pais.getId()+"<br>");
//		out.println( "nome: "+pais.getNome()+"<br>");
//		out.println( "Populacao: "+pais.getPopulacao()+"<br>");
//		out.println( "Area: "+pais.getArea()+"<br>");
//		out.println("</body></html>");
		
				
		//enviar para o jsp
		request.setAttribute("Pais", pais);

		RequestDispatcher view = request.getRequestDispatcher("Pais.jsp");
		view.forward(request, response);
		
	}

}