/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "lostluggageclaims")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Lostluggageclaims.findAll", query = "SELECT l FROM Lostluggageclaims l"),
	@NamedQuery(name = "Lostluggageclaims.findByClaimID", query = "SELECT l FROM Lostluggageclaims l WHERE l.claimID = :claimID"),
	@NamedQuery(name = "Lostluggageclaims.findByFirstName", query = "SELECT l FROM Lostluggageclaims l WHERE l.firstName = :firstName"),
	@NamedQuery(name = "Lostluggageclaims.findByLastName", query = "SELECT l FROM Lostluggageclaims l WHERE l.lastName = :lastName"),
	@NamedQuery(name = "Lostluggageclaims.findByEmailAddress", query = "SELECT l FROM Lostluggageclaims l WHERE l.emailAddress = :emailAddress"),
	@NamedQuery(name = "Lostluggageclaims.findByPhoneNumber", query = "SELECT l FROM Lostluggageclaims l WHERE l.phoneNumber = :phoneNumber"),
	@NamedQuery(name = "Lostluggageclaims.findByAirline", query = "SELECT l FROM Lostluggageclaims l WHERE l.airline = :airline"),
	@NamedQuery(name = "Lostluggageclaims.findByFlightNumber", query = "SELECT l FROM Lostluggageclaims l WHERE l.flightNumber = :flightNumber"),
	@NamedQuery(name = "Lostluggageclaims.findByArrivalDate", query = "SELECT l FROM Lostluggageclaims l WHERE l.arrivalDate = :arrivalDate"),
	@NamedQuery(name = "Lostluggageclaims.findByChecking", query = "SELECT l FROM Lostluggageclaims l WHERE l.checking = :checking"),
	@NamedQuery(name = "Lostluggageclaims.findByNumberOfBags", query = "SELECT l FROM Lostluggageclaims l WHERE l.numberOfBags = :numberOfBags")})
public class Lostluggageclaims implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "ClaimID")
	private Integer claimID;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 32)
        @Column(name = "FirstName")
	private String firstName;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 32)
        @Column(name = "LastName")
	private String lastName;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 32)
        @Column(name = "EmailAddress")
	private String emailAddress;
	@Basic(optional = false)
        @NotNull
        @Column(name = "PhoneNumber")
	private int phoneNumber;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 16)
        @Column(name = "Airline")
	private String airline;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 8)
        @Column(name = "FlightNumber")
	private String flightNumber;
	@Basic(optional = false)
        @NotNull
        @Column(name = "ArrivalDate")
        @Temporal(TemporalType.TIMESTAMP)
	private Date arrivalDate;
	@Basic(optional = false)
        @NotNull
        @Column(name = "Checking")
	private boolean checking;
	@Basic(optional = false)
        @NotNull
        @Column(name = "NumberOfBags")
	private int numberOfBags;

	public Lostluggageclaims() {
	}

	public Lostluggageclaims(Integer claimID) {
		this.claimID = claimID;
	}

	public Lostluggageclaims(Integer claimID, String firstName, String lastName, String emailAddress, int phoneNumber, String airline, String flightNumber, Date arrivalDate, boolean checking, int numberOfBags) {
		this.claimID = claimID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.arrivalDate = arrivalDate;
		this.checking = checking;
		this.numberOfBags = numberOfBags;
	}

	public Integer getClaimID() {
		return claimID;
	}

	public void setClaimID(Integer claimID) {
		this.claimID = claimID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public boolean getChecking() {
		return checking;
	}

	public void setChecking(boolean checking) {
		this.checking = checking;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (claimID != null ? claimID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Lostluggageclaims)) {
			return false;
		}
		Lostluggageclaims other = (Lostluggageclaims) object;
		if ((this.claimID == null && other.claimID != null) || (this.claimID != null && !this.claimID.equals(other.claimID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.mavenproject9.Lostluggageclaims[ claimID=" + claimID + " ]";
	}
	
}
