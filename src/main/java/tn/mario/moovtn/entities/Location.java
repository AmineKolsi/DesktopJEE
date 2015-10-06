package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity

public class Location implements Serializable {

	
	private Integer id;
	private float x;
	private float y;
	private static final long serialVersionUID = 1L;
	private Rent rent;
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	@OneToOne
	public Rent getRent() {
		return rent;
	}
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	
	
   
}
