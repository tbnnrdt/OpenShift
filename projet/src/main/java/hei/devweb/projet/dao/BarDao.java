package hei.devweb.projet.dao;

import hei.devweb.projet.entities.Bar;

import java.util.List;

public interface BarDao {


	public List<Bar> listerBars(Integer id) ;
	
	public Bar getBar(Integer id) ;
	
	public Bar ajouterBar(Bar bar);
}
