package com.perkin.dev.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_driver")
public class Driver {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "driver_id")
	private Long driverId;
	
	@Column(name = "firstname")
	@Length(max = 100, message = "The firstname is too long (more than 100)")
	private String firstname;
	
	@Column(name = "secondname")
	@Length(max = 100, message = "The secondname is too long (more than 100)")
	private String secondname;
	
	@Column(name = "lastname")
	@Length(max = 100, message = "The lastname is too long (more than 100)")
	private String lastname;
	
	@Column(name = "passport_series")
	@Length(max = 4, message = "The passport series is too long (more than 4)")
	private String passportSeries;
	
	@Column(name = "passport_number")
	@Length(max = 6, message = "The passport number is too long (more than 6)")
	private String passportNumber;
	
	@Column(name = "passport_issue")
	@Length(max = 255, message = "The passport issue is too long (more than 255)")
	private String passportIssue;
	
	@Column(name = "date_issue_passport")
	private Date dateIssuePassport;
	
	@Column(name = "phone")
	@Length(max = 20, message = "The phone is too long (more than 20)")
	private String phone;
	
	@Column(name = "email")
	@Length(max = 50, message = "The email is too long (more than 50)")
	private String email;
	
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassportSeries() {
		return passportSeries;
	}
	public void setPassportSeries(String passportSeries) {
		this.passportSeries = passportSeries;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getPassportIssue() {
		return passportIssue;
	}
	public void setPassportIssue(String passportIssue) {
		this.passportIssue = passportIssue;
	}
	public Date getDateIssuePassport() {
		return dateIssuePassport;
	}
	public void setDateIssuePassport(Date dateIssuePassport) {
		this.dateIssuePassport = dateIssuePassport;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
