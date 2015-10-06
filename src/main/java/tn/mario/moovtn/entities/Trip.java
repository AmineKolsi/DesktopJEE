package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trip
 *
 */
@Entity

public class Trip implements Serializable {

	
	private Integer id;
	private Timestamp departureTime;
	private int allTripTime;
	private static final long serialVersionUID = 1L;

	private Line line;
	@ManyToOne
	@JoinColumn(name="idLine")
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Trip() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Timestamp getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}   
	public int getAllTripTime() {
		return this.allTripTime;
	}

	public void setAllTripTime(int allTripTime) {
		this.allTripTime = allTripTime;
	}
   
}
