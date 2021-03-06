package edu.iss.ca.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="facility")
public class Facility {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int facilityid;
	
	@Column(name="name")
	private String name;
	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy="facility", cascade=CascadeType.ALL)
//	private List<Maintenance> maintenancelist = new ArrayList<Maintenance>();
//	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy="facility", cascade=CascadeType.ALL)
//	private List<Booking> bookinglist = new ArrayList<Booking>();
//	
//	public List<Booking> getBookinglist() {
//		return bookinglist;
//	}
//
//	public void setBookinglist(List<Booking> bookinglist) {
//		this.bookinglist = bookinglist;
//	}
//
//	public List<Maintenance> getMaintenancelist() {
//		return maintenancelist;
//	}
//
//	public void setMaintenancelist(List<Maintenance> maintenancelist) {
//		this.maintenancelist = maintenancelist;
//	}

	public Facility() {}
	
	public Facility(int facilityid, String name) {
		super();
		this.facilityid = facilityid;
		this.name = name;
	}
	public int getFacilityid() {
		return facilityid;
	}
	public void setFacilityid(int facilityid) {
		this.facilityid = facilityid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Facility [facilityid=" + facilityid + ", name=" + name + "]";
	}

}