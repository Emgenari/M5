package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Boss;
import com.jobs.domain.Manager;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {
	
	//declarar e inicializar repositorio
	private EmployeeRepository repository = new EmployeeRepository();
	
	//constructor
	public JobsController(){		
	}
	
	//crear empleado
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}
	
	//crear boss
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	//crear manager
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);	
	}
	
	//crear voluntario
	public void createVolunteer (String name, String address, String phone, String description) throws Exception { 
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);	
	}
	
	//pagar empleados
	public void payAllEmployees() {
		for (AbsStaffMember member : repository.getAllMembers()) {
			member.pay();
		}
	}
	
	//ver empleados
	public String getAllEmployees() {
		return repository.toString();
	}
}