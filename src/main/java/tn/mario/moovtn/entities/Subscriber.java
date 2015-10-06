package tn.mario.moovtn.entities;

import tn.mario.moovtn.*;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscriber
 *
 */
@Entity

public class Subscriber extends Users implements Serializable {

	
	private String job;

	public Subscriber() {
		super();
	}   
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}
   
}
