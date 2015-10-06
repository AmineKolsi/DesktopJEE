package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="USER")
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Une seule table contenant un type de users dérivés
	@DiscriminatorColumn(name="type_user",length=20) //Preciser quelle colonne va diférencier les types de users
	public class Users implements Serializable {
		
		public Users(){	
			super();
		}
		
		private Integer id;
		private String mail;
		private String login;
		private String password;
		private String nom;
		private String prenom; 
		private List<Line> lines;
		
	//	private List<SubscriptionCard> subscriptionCards;
		
		private List<Claims> claims;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
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
		
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	
		
		@ManyToMany
		public List<Line> getLines() {
			return lines;
		}
		public void setLines(List<Line> lines) {
			this.lines = lines;
		}
		@OneToMany(mappedBy="users")
		public List<Claims> getClaims() {
			return claims;
		}
		public void setClaims(List<Claims> claims) {
			this.claims = claims;
		}
		
	}

