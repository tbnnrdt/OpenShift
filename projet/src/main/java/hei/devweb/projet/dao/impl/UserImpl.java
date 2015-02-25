package hei.devweb.projet.dao.impl;

import hei.devweb.projet.entities.Bar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserImpl {

	private static UserImpl instance;

	public static UserImpl getInstance() {
		if (instance == null) {
			instance = new UserImpl();
		}
		return instance;
	}

	
	public ArrayList<Bar> getListeBar(Integer idBiere) {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `bar` LEFT JOIN `tableBarBiere` ON bar.idBar=tableBarBiere.idBar ORDER BY bar.nomBar ASC");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Bar> listeBarTotale=new ArrayList<Bar>();
			while (rs.next()){
				Bar bar=new Bar(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				listeBarTotale.add(bar);
            }
			return listeBarTotale;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Bar getUser(int id) {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `bar` WHERE `idBar`=? ");
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			Bar bar=new Bar(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			return bar;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<String> getUserPasswd(int id) {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `user` WHERE `idBar`=? ");
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			ArrayList<String> infoLog= new ArrayList<String>();
			infoLog.add(rs.getString(1));
			infoLog.add(rs.getString(2));
			return infoLog;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

		
}
