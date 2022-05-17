package com.example.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;


public class Repository {

    public static void main(String[] args) {

        get("said0");
    }
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("");

    private static SessionFactory sessionFactory;

    public static SessionFactory sessionFactory() {
        if (sessionFactory == null) {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        }
        return sessionFactory;
    }

    public static void create(long id) {


//
//        EntityManager entityManager1 = sessionFactory.createEntityManager();
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//         CriteriaBuilder builder=entityManager.getCriteriaBuilder();
//        CriteriaQuery<Book> query = builder.createQuery(Book.class);
//        Root<Book> from = query.from(Book.class);
//        Path<Object> path = from.get("id");
//        Predicate predicate = builder.equal(path,id);
//
//          entityManager.persist(new Book());
//          entityManager.createNamedQuery("select",Book.class);
//
//
//        query.where(predicate);
//        TypedQuery<Book> query1 = entityManager.createQuery(query);
//        List<Book> resultList = query1.getResultList();
//

    }

    public static void get(String name) {

//        Session session = sessionFactory()
//                .openSession();
//        sessionFactory.close();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Book> query = builder.createQuery(Book.class);
//        Root<Book> from = query.from(Book.class);
//
//        Predicate name1 = builder.like(from.get("name"), "%said%");
//        query.where(name1);
//        Query<Book> query1 = session.createQuery(query);
//        List<Book> resultList = query1.getResultList();
//        for (Book book : resultList) {
//            System.out.println(book.getName());
//        }
//
//
//        session.createQuery(query.where());
    }
}
