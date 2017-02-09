package com.patrickcompany.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.patrickcompany.duck.*;
import com.patrickcompany.flybehavior.*;

public class TestTheDuck {
	private static SessionFactory factory;
	
	public void runTest(){
		MalardDuck malard = new MalardDuck();		
		RubberDuck rubber = new RubberDuck();
		Duck duck = new Duck();	
		
		String configFileLocation = getClass().getProtectionDomain().getCodeSource().getLocation().getPath() + "hibernate.cfg.xml";
		System.out.println(configFileLocation);
		
		try{
	         //Configuration configuration = new Configuration().configure("/resources/hibernate.cfg.xml");
			Configuration configuration = new Configuration().configure();
	         factory = configuration.buildSessionFactory();
	    }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	    }
		
		//int harryId = addDuck("Harry", "rubber", 8);
		//listDucks();
		//updateDuck(10, 7);
		deleteDuck(11);
				
		/*malard.display();
		malard.performFly();
		rubber.display();
		rubber.performFly();
		duck.display();
		//duck.performFly();
		rubber.setBehavior(new FlyWithWings());
		rubber.display();
		rubber.performFly();*/
		
	}
	
	public Integer addDuck(String name, String type, int size){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer duckID = null;
	      try{
	         tx = session.beginTransaction();
	         Duck duck = new Duck();
	         duck.setName(name);
	         duck.setType(type);
	         duck.setSize(size);
	         duckID = (Integer) session.save(duck); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return duckID;
	}
	
	public void listDucks( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List ducks = session.createQuery("FROM Duck").list(); 
	         for (Iterator iterator = 
	                           ducks.iterator(); iterator.hasNext();){
	            Duck duck = (Duck) iterator.next(); 
	            System.out.print("  Name: " + duck.getName()); 
	            System.out.print("  Duck Type: " + duck.getType()); 
	            System.out.println("  Size: " + duck.getSize()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	
	public void updateDuck(Integer duckID, int size ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Duck duck = 
	                    (Duck)session.get(Duck.class, duckID); 
	         duck.setSize(size);
			 session.update(duck); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	
	public void deleteDuck(Integer duckID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Duck duck = 
	                   (Duck)session.get(Duck.class, duckID); 
	         session.delete(duck); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	
	public static void main(String [] args){
		new TestTheDuck().runTest();
	}
}
