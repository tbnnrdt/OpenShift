package hei.devweb.projet.entities;

public class Bar {

	private Integer idBar;
	private String nomBar;
	private Integer heureOuverture;
	private Integer heureFermeture;

	public Bar(Integer idBar, String nomBar, Integer heureOuverture, Integer heureFermeture) {
		super();
		this.idBar = idBar;
		this.nomBar = nomBar;
		this.heureOuverture=heureOuverture;
		this.heureFermeture = heureFermeture;
		}

	public Integer getIdBar() {
		return idBar;
	}

	public void setIdBar(Integer idBar) {
		this.idBar = idBar;
	}

	public String getNomBar() {
		return nomBar;
	}

	public void setNomBar(String nomBar) {
		this.nomBar = nomBar;
	}

	public Integer getHeureOuverture() {
		return heureOuverture;
	}

	public void setHeureOuverture(Integer heureOuverture) {
		this.heureOuverture = heureOuverture;
	}

	public Integer getHeureFermeture() {
		return heureFermeture;
	}

	public void setHeureFermeture(Integer heureFermeture) {
		this.heureFermeture = heureFermeture;
	}
	
	


	}
