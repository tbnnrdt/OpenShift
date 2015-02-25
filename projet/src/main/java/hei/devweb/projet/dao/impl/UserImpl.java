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
	
	public int ajouteBar(Bar bar){
		int i=0;
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO `option`(`idBar`,`nomBar`,`heureOuverture`,`heureFermeture`) VALUES (?,?,?,?)");
			stmt.setInt(1,bar.getIdBar());
			stmt.setString(2,bar.getNomBar());
			stmt.setInt(3,bar.getHeureOuverture());
			stmt.setInt(4,bar.getHeureFermeture());
			i=stmt.executeUpdate();
		
			return i;

		} 
		catch(NullPointerException e){e.printStackTrace();}
		catch (SQLException e) {
			
		}
		return i;
    	
	}

	 public Integer longueurListeBar(){
       	int rep=0;
           try{
        	   Connection connection = DataSourceProvider.getDataSource().getConnection();
        	   PreparedStatement stmt = connection.prepareStatement("SELECT COUNT( * ) FROM `bar`");
               ResultSet rs=stmt.executeQuery();
               rs.next();
               rep=rs.getInt(1);
           }
           catch (SQLException e) {
               e.printStackTrace();
           }
       	return rep;
       }
	 

		public int supprimeBar(int id){
			int i=0;
			try {
				Connection connection = DataSourceProvider.getDataSource().getConnection();
				PreparedStatement stmt = connection.prepareStatement("DELETE FROM `bar` WHERE `idBar`="+id+"");
	            i=stmt.executeUpdate();
			
				return i;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
	    	
		}

		
		public ArrayList<String> getListeVille() {
			String newVille="";
			try {
				Connection connection = DataSourceProvider.getDataSource().getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT `villeBar` FROM `bar` ORDER BY `villeBar` ASC");
				ResultSet rs = stmt.executeQuery();
				ArrayList<String> listeVilleTotale=new ArrayList<String>();
				while (rs.next()){
					if(newVille.equals(rs.getString(1))){}
					else{
					newVille=rs.getString(1);
					listeVilleTotale.add(newVille);
					}
	            }
				return listeVilleTotale;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		
}
