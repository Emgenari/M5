package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	//crear lista de miembros
	private static List<AbsStaffMember> members=new ArrayList<>();
	
	//constructor
	public EmployeeRepository(){	
	}
	
	//obtener lista de miembros
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	//agregar miembros
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	@Override
	public String toString() {
		return getAllMembers().toString().substring(1).replaceFirst("]", "").replaceAll(",","");
	}
	
}