package crud.entity;

public abstract class APersonaDTO {
	
	private Integer	id;
	private String nom;
	
	public APersonaDTO() {
	}

	public APersonaDTO(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
