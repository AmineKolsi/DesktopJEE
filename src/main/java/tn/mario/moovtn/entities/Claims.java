package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.ManyToOne;


@Entity

public class Claims implements Serializable {

	
	private Integer id;
	private String question;
	private String response;
	private Date dateClaim;
	
	private Users users;
	
	public Claims() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}   
	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}  
	@Temporal(TemporalType.DATE)
	public Date getDateClaim() {
		return this.dateClaim;
	}

	public void setDateClaim(Date dateClaim) {
		this.dateClaim = dateClaim;
	}
	
	@ManyToOne
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	
	
	
	
   
}
