package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Professor;
import classes.DigitalDAO;

/**
 * Servlet implementation class ListandoA
 */
@WebServlet("/Listando.do")
public class ListandoP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListandoP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DigitalDAO dao = new DigitalDAO();
		ArrayList<Professor> prof = new ArrayList<>();
		
		try {
			prof = dao.listarP();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("lista", prof);
		RequestDispatcher view = request.getRequestDispatcher("ListarP.jsp");
		view.forward(request, response);
	}

}







