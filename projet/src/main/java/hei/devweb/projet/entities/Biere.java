package hei.devweb.projet.entities;

public class Biere {

	private Integer idBiere;
	private String nomBiere;
	private double prixBiere;
	private double degresBiere;
	
	public Biere(Integer idBiere, String nomBiere, double prixBiere, double degresBiere) {
		super();
		this.idBiere = idBiere;
		this.nomBiere = nomBiere;
		this.prixBiere=prixBiere;
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

	public double getPrixBiere() {
		return prixBiere;
	}

	public void setPrixBiere(double prixBiere) {
		this.prixBiere = prixBiere;
	}

	
	}
