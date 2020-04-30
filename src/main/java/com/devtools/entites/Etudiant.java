package com.devtools.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Etudiant implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(name="NOM",length = 30)
	private String nom;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	private String email;
	private String tel;
	
	public Etudiant() {
		super();
	}

	public Etudiant( String nom, Date dateNaissance, String email, String tel) {
		super();
		
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.tel = tel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	

}
