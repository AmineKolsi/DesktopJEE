package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rent
 *
 */
@Entity

public class Rent implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date dateDepart;
	private Date dateArriv;
	private Location depart;
	private Location dest;
	private TransportMean transportmean;
	@ManyToOne
	@JoinColumn(name="idTransportMean")
	public TransportMean getTransportmean() {
		return transportmean;
	}
	public void setTransportmean(TransportMean transportmean) {
		this.transportmean = transportmean;
	}
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArriv() {
		return dateArriv;
	}
	public void setDateArriv(Date dateArriv) {
		this.dateArriv = dateArriv;
	}
	@OneToOne
	public Location getDepart() {
		return depart;
	}
	
	public void setDepart(Location depart) {
		this.depart = depart;
	}
	@OneToOne
	public Location getDest() {
		return dest;
	}
	public void setDest(Location dest) {
		this.dest = dest;
	}









}