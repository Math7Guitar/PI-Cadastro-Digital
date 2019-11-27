package servlets;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Aluno;
import classes.DigitalDAO;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author matheus
 */

@WebServlet(name = "Caluno", urlPatterns = {"/Caluno"})
public class Caluno extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        DigitalDAO alu = new DigitalDAO();
        Aluno aluno = new Aluno();
        aluno.setNome(request.getParameter("nome"));
        aluno.setCurso(request.getParameter("curso"));
        aluno.setRa(Integer.parseInt(request.getParameter("ra")));
        aluno.setTurma(request.getParameter("turma"));
        aluno.setFoto(request.getParameter("foto"));
        aluno.setDigital(Double.parseDouble(request.getParameter("digital")));
        
        try {
            alu.cadastrarA(aluno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
        request.setAttribute("aluno", aluno);
        RequestDispatcher view = request.getRequestDispatcher("cadastrar.jsp");
        view.forward(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
