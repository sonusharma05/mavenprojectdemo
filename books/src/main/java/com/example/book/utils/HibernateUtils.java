package com.example.book.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;

	static {
		try {
			if(sessionFactory==null) {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();			//create session factory if not already there
				}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("error in creating Session Factory"+ e.getMessage());
		}
	}
	public static  SessionFactory getSessionFactory(){
		return sessionFactory;
		
		
	}
}
