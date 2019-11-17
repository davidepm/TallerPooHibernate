package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoCliente {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void create(Cliente client) {//insert
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(client);
		s.getTransaction().commit();
		s.close(); 
	}
	
	protected Cliente read(int clientID) {//select
		Session s =  sessionFactory.openSession();
		Cliente client = s.get(Cliente.class, clientID);
		s.close();
		return client;
	}
	
	protected void update(Cliente client) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(client);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int clientID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Cliente client = new Cliente();
		client.setId(clientID);
		s.delete(client);
		s.getTransaction().commit();
		s.close();
	}

}
