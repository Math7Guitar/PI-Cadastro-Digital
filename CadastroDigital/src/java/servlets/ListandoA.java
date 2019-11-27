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

import classes.Aluno;
import classes.DigitalDAO;

/**
 * Servlet implementation class ListandoA
 */
@WebServlet("/Listando.do")
public class ListandoA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListandoA() {
        super();
    }

        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DigitalDAO dao = new DigitalDAO();
		ArrayList<Aluno> aluno = new ArrayList<>();
		
		try {
                    aluno = dao.listarA();
		} catch (SQLException e) {
                    e.printStackTrace();
		}
		
		request.setAttribute("lista", aluno);
		RequestDispatcher view = request.getRequestDispatcher("Listar.jsp");
		view.forward(request, response);
	}

}



