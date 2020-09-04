package gestion_etudiant;

public class Model {
	
	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private String filier;
	private static int compt = 1;
	
	public Model(int id) {
		this.id = id;
		compt++;
	}
	
	public Model() {
		this.id = compt++;
	}

	public Model(String nom, String prenom, String sexe, String filier) {
		super();
		this.id = compt++;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.filier = filier;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", filier=" + filier
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getFilier() {
		return filier;
	}

	public void setFilier(String filier) {
		this.filier = filier;
	}
	
}
