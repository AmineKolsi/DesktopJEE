package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Station
 *
 */
@Entity

public class Station implements Serializable {

	
	private Integer id;
	private Float x;
	private Float y;
	

	public Station() {
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
	public Float getX() {
		return this.x;
	}

	public void setX(Float x) {
		this.x = x;
	}   
	public Float getY() {
		return this.y;
	}

	public void setY(Float y) {
		this.y = y;
	}
   
}
