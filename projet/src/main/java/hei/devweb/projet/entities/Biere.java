package hei.devweb.projet.entities;

public class Biere {

	private Integer idBiere;
	private String nomBiere;
	private double degresBiere;
	
	public Biere(Integer idBiere, String nomBiere, double degresBiere) {
		super();
		this.idBiere = idBiere;
		this.nomBiere = nomBiere;
		this.degresBiere=degresBiere;
		}

	public double getDegresBiere() {
		return degresBiere;
	}

	public void setDegresBiere(double degresBiere) {
		this.degresBiere = degresBiere;
	}

	public Integer getIdBiere() {
		return idBiere;
	}

	public void setIdBiere(Integer idBiere) {
		this.idBiere = idBiere;
	}

	public String getNomBiere() {
		return nomBiere;
	}

	public void setNomBiere(String nomBiere) {
		this.nomBiere = nomBiere;
	}


	
	}
