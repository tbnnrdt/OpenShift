package hei.devweb.projet.dao;

import hei.devweb.projet.entities.Bar;

import java.util.List;

public interface BarDao {


	public List<Bar> listerBars(Integer id) ;
	
	public List<Bar> listerBarsOffLocalisation(Integer id, String ville) ;
	
	public Bar getBar(Integer id) ;
	
	public Bar ajouterBar(Bar bar);
	
	public List<String> listerVilles() ;
}
