/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import classes.Aluno;
import classes.DigitalDAO;
import classes.Professor;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author matheus
 */
@WebServlet(name = "Cprofessor.do", urlPatterns = {"/Cprofessor"})
public class Cprofessor extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         DigitalDAO p = new DigitalDAO();
         Professor prof = new Professor();
        
         prof.setNome(request.getParameter("nome"));
         prof.setMateria(request.getParameter("materia"));
         prof.setRp(Integer.parseInt(request.getParameter("rp")));
         prof.setFoto(request.getParameter("foto"));
         prof.setDigital(Double.parseDouble(request.getParameter("digital")));
        
        try {
            p.cadastrarP(prof);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
        request.setAttribute("prof", prof);
        RequestDispatcher view = request.getRequestDispatcher("cadastrarP.jsp");
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
