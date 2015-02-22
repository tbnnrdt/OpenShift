package hei.devweb.projet.dao;

import hei.devweb.projet.entities.Biere;

import java.util.List;

public interface BiereDao {

	public List<Biere> listerBieres() ;
	
	public Biere getBiere(Integer id) ;
	
	public void supprimeBiere(Integer id) ;

	public Biere ajouterBiere(Biere biere) ;
	
	public Biere modifierBiere(Biere biere) ;
	
}
