package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Operation 
{

	public static void insert(int pid, String pname) throws Exception {
	SessionFactory factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
	
	Session theSession = factory.getCurrentSession();
	
	try 
	{
		Product product = new Product(pid, pname);
		
		theSession.beginTransaction();
		theSession.save(product);
		theSession.getTransaction().commit();
		
	} 
	catch (Exception e) 
	{
		throw new Exception(e);
	}
	finally
	{
		factory.close();
	}
	
	}
}
