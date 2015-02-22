package hei.devweb.projet.managers;

import hei.devweb.projet.dao.BarDao;
import hei.devweb.projet.dao.impl.BarImpl;
import hei.devweb.projet.entities.Bar;

import java.util.ArrayList;
import java.util.List;

public class BarManager implements BarDao{

	private static BarManager instance;

	public static BarManager getInstance() {
		if (instance == null) {
			instance = new BarManager();
		}
		return instance;
	}

	public List<Bar> listerBars(Integer id) {
		return new ArrayList<Bar>(BarImpl.getInstance().getListeBar(id));
	}
	
	public Bar getBar(Integer id) {
		return BarImpl.getInstance().getBar(id);
	}
	
	public Bar ajouterBar(Bar bar) {
		Integer id = BarImpl.getInstance().longueurListeBar()+1;
		bar.setIdBar(id);
		BarImpl.getInstance().ajouteBar(bar);
		return bar;}

	public void supprimeBar(Integer id) {
		 BarImpl.getInstance().supprimeBar(id);
	}
	
}
