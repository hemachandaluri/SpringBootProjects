package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BookingRoom {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int guest_id;
	private Date check_out;
	private Date check_in_emp;
	private int number_of_guests;
	
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public Date getCheck_in_emp() {
		return check_in_emp;
	}
	public void setCheck_in_emp(Date check_in_emp) {
		this.check_in_emp = check_in_emp;
	}
	public int getNumber_of_guests() {
		return number_of_guests;
	}
	public void setNumber_of_guests(int number_of_guests) {
		this.number_of_guests = number_of_guests;
	}

}
