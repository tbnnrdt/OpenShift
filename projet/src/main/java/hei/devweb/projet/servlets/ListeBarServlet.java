package hei.devweb.projet.servlets;

import hei.devweb.projet.entities.Bar;
import hei.devweb.projet.entities.Biere;
import hei.devweb.projet.managers.BarManager;
import hei.devweb.projet.managers.BiereManager;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bar")
public class ListeBarServlet extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	
try{
	Integer id = Integer.parseInt(req.getParameter("id"));
	
	List<Bar> bars = BarManager.getInstance().listerBars(id);
	req.setAttribute("listeBars", bars);

	RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/bar.jsp");
	view.forward(req, resp);
}
catch (NumberFormatException e) {
	resp.sendRedirect("accueil");
}

}



}
