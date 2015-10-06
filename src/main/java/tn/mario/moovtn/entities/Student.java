package tn.mario.moovtn.entities;

import tn.mario.moovtn.*;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;


@Entity
@DiscriminatorValue("student") //Si on crée un student, la colonne role de la table USER va prendre student comme valeur
public class Student extends Users implements Serializable {

	
	private String address;
	private String gradeLevel;
	private Date dateNaissance;
	
	public Student(String address, String gradeLevel, Date dateNaissance) {
		super();
		this.address = address;
		this.gradeLevel = gradeLevel;
		this.dateNaissance = dateNaissance;
	}


	public Student() {
		super();
	}   
	
	
	public String getGradeLevel() {
		return gradeLevel;
	}


	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}


	@Temporal(TemporalType.DATE)
	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	
   
}
