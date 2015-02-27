package hei.devweb.projet.servlets;

import hei.devweb.projet.entities.Biere;
import hei.devweb.projet.managers.BiereManager;
import hei.devweb.projet.managers.UserManager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserServlet extends HttpServlet{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	Integer id = Integer.parseInt(req.getParameter("id"));
	List<String> bieres = UserManager.getInstance().getUserPasswd(id);
	//req.setAttribute("listeBieres", bieres);

	RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/choix_gerant.jsp");
	view.forward(req, resp);
}


}
