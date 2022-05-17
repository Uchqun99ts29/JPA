//package com.example.jpa;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.jmx.spi.JmxService;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//public class Sinle {



//    public static void main(String[] args) {
//
//        StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure().build();
//
//       SessionFactory sessionFactory=new MetadataSources(ssr).buildMetadata().buildSessionFactory();
//        StandardServiceRegistryBuilder.destroy(ssr);
//        System.out.println(sessionFactory.isClosed());
//        Session session = sessionFactory.getCurrentSession();
//        session.getTransaction().begin();
//        session.save(new Book());
//        session.getTransaction().commit();
//        session.close();
//
//    }
//
//}
