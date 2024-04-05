package rodez.java.exam.tp.task;

import java.sql.Date;

public class Task {
	private String titre;
	private String description;
	private Date dateEcheance;
	
	public Task(String titre, String description, Date dateEcheance) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}


}
