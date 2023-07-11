package es.makigas.hibernate.modelo.tests;

import java.util.*;
import javax.persistence.*;
import es.makigas.hibernate.modelo.Empleado;

public class TestEmpleados {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/* Crear el gestor de persistencia (EM) */
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();

		List<Empleado> empleados = (List<Empleado>) manager.createQuery("SELECT e FROM Empleados e").getResultList();
		System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
	}

}
