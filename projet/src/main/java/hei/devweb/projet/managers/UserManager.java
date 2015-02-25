package hei.devweb.projet.managers;

import hei.devweb.projet.dao.impl.UserImpl;

import java.util.ArrayList;

public class UserManager {

	private static UserManager instance;

	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManager();
		}
		return instance;
	}
	
	public ArrayList<String> getUserPasswd(Integer id) {
		return UserImpl.getInstance().getUserPasswd(id);
	}
}
