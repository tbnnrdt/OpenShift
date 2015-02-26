package hei.devweb.projet.managers;

import hei.devweb.projet.dao.BiereDao;
import hei.devweb.projet.dao.impl.BiereImpl;
import hei.devweb.projet.entities.Biere;

import java.util.ArrayList;
import java.util.List;

public class BiereManager implements BiereDao{

	private static BiereManager instance;

	public static BiereManager getInstance() {
		if (instance == null) {
			instance = new BiereManager();
		}
		return instance;
	}
	public List<Biere> listerBieres(){
		return new ArrayList<Biere>(BiereImpl.getInstance().getListeBiere());
	}
	
	public Biere getBiere(Integer id) {
		return BiereImpl.getInstance().getBiere(id);
	}
	
	public void supprimeBiere(Integer id) {
		 BiereImpl.getInstance().supprimeBiere(id);
	}

	public Biere ajouterBiere(Biere biere) {
		Integer id = BiereImpl.getInstance().longueurListeBiere()+1;
		biere.setIdBiere(id);;
		BiereImpl.getInstance().ajouteBiere(biere);
		return biere;
	}
	
	public Biere modifierBiere(Biere biere) {
		BiereImpl.getInstance().updateBiere(biere);
		return biere;
	}
	
	
}
