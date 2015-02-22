package hei.devweb.projet.dao.impl;


import hei.devweb.projet.entities.Biere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BiereImpl {
	
	private static BiereImpl instance;

	public static BiereImpl getInstance() {
		if (instance == null) {
			instance = new BiereImpl();
		}
		return instance;
	}

	
	public ArrayList<Biere> getListeBiere() {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `biere` ORDER BY `idBiere` ");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Biere> listeBiereTotale=new ArrayList<Biere>();
			while (rs.next()){
				Biere biere=new Biere(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getDouble(4));
            	listeBiereTotale.add(biere);
            }
			return listeBiereTotale;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public Biere getBiere(int id) {
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `biere` WHERE `idBiere`=? ");
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			Biere biere=new Biere(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getDouble(4));
			return biere;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int ajouteBiere(Biere biere){
		int i=0;
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO `prestation`(`idBiere`,`nomBiere`,`prixBiere`,`degresBiere`) VALUES (?,?,?)");
			stmt.setInt(1,biere.getIdBiere());
			stmt.setString(2,biere.getNomBiere());
			stmt.setDouble(3,biere.getPrixBiere());
			stmt.setDouble(4, biere.getDegresBiere());
			i=stmt.executeUpdate();
		
			return i;

		} 
		catch(NullPointerException e){e.printStackTrace();}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
    	
	}
	

	public int updateBiere(Biere biere){
		int i=0;
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("UPDATE `biere` SET `nomBiere`=?,`prixBiere`=?,`degresBiere`=? WHERE `idBiere`=?");
			stmt.setString(1,biere.getNomBiere());
			stmt.setDouble(2,biere.getPrixBiere());
			stmt.setDouble(3, biere.getDegresBiere());
			stmt.setInt(4,biere.getIdBiere());

			i=stmt.executeUpdate();
		
			return i;

		} 
		catch(NullPointerException e){e.printStackTrace();}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
    	
	}
	
	public int supprimeBiere(int id){
		int i=0;
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM `biere` WHERE `idBiere`="+id+"");
            i=stmt.executeUpdate();
		
			return i;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
    	
	}

	 public Integer longueurListeBiere(){
       	int rep=0;
           try{
        	   Connection connection = DataSourceProvider.getDataSource().getConnection();
        	   PreparedStatement stmt = connection.prepareStatement("SELECT COUNT( * ) FROM `biere`");
               ResultSet rs=stmt.executeQuery();
               rs.next();
               rep=rs.getInt(1);
           }
           catch (SQLException e) {
               e.printStackTrace();
           }
       	return rep;
       }

}
