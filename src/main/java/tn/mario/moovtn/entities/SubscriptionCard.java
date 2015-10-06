package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SubscriptionCard
 *
 */
@Entity

public class SubscriptionCard implements Serializable {
  
	
	private Integer id;
	private Date validityStart;
	private Date validityEnd;
	private boolean locked;
	private boolean expired;
	
	
	private Users users;

	public SubscriptionCard() {
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
	@Temporal(TemporalType.DATE)
	public Date getValidityStart() {
		return this.validityStart;
	}

	public void setValidityStart(Date validityStart) {
		this.validityStart = validityStart;
	}  
	@Temporal(TemporalType.DATE)
	public Date getValidityEnd() {
		return this.validityEnd;
	}

	public void setValidityEnd(Date validityEnd) {
		this.validityEnd = validityEnd;
	}   
	public boolean getLocked() {
		return this.locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}   
	public boolean getExpired() {
		return this.expired;
	}

	public void setExpired(boolean canceled) {
		this.expired = canceled;
	}
	@ManyToOne
	@JoinColumn(name="idUser")
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
   
}
