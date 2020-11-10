package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	//declarar e inicializar controlador
	private static JobsController controller=new JobsController();
	
	//metodo main
	public static void main(String[] args) throws Exception {
			
		//agregar empleados
		controller.createBossEmployee("Pepe Boss", "Dirección molona 1", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "Arts");
		controller.createManagerEmployee("Pedro Employee", "Direccion molona 2", "665226666", 80.0);
		
		//pagar empleados
		controller.payAllEmployees();
		
		//obtener e imprimir empleados
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:" + "\n" + allEmployees + "\n");	
	}
}