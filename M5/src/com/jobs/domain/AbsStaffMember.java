package com.jobs.domain;

public abstract class AbsStaffMember {

	//atributos
	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid;

	private static int COUNTER_MEMBERS = 1;

	//constructor
	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	//metodos
	public abstract void pay();
	
	@Override
	public String toString() {
		return "Id: " + id + ". Name: " + name + ". Adress: " + address + ". Phone number: " + phone + ". Total paid: " + totalPaid + "€.\n";
	}
}