package hei.devweb.projet.servlets;

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

@WebServlet("/accueilofflocalisation")
public class AccueilOffServlet extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	List<String> villes = BarManager.getInstance().listerVilles();
	req.setAttribute("listeVilles", villes);
	
	List<Biere> bieres = BiereManager.getInstance().listerBieres();
	req.setAttribute("listeBieres", bieres);

	RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/mainOffloc.jsp");
	view.forward(req, resp);
}


}
