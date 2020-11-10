package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	//constructor
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
	}
	
	//metodo
	@Override
	public void pay() {
	}
}