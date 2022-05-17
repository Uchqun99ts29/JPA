package com.example.jpa;


import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class BookService {
    //private final BookRepository repository;


    public BookService() {


        entityManager = Persistence.createEntityManagerFactory("uchqun").createEntityManager();
    }


    @PersistenceContext
    private final EntityManager entityManager;


    public Book get(long id) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> query = builder.createQuery(Book.class);

        query
                .where(builder
                        .equal(query.from(Book.class)
                                .get("id"), id));
        return entityManager.createQuery(query).getSingleResult();


//        Query query = entityManager.createQuery("select b from Book b where b.id=:id");
//
//        query.setParameter("id", id);
//        if (Objects.isNull(query.getSingleResult())) {
//            throw new RuntimeException("book not found");
//        }
//        return (Book) query.getSingleResult();

//        /**
//         * named query querylarni umumy joyga chiqarib quiyasib name orqali chaqirish uchun qulay
//         */
//        TypedQuery<Book> namedQuery = entityManager.createNamedQuery("Book.select", Book.class);
//        TypedQuery<Book> bookTypedQuery = namedQuery.setParameter(1, id);
//        return bookTypedQuery.getSingleResult();

//
//        /**
//         * native query
//         */
//        Query nativeQuery = entityManager.createNativeQuery("select b from book  b where b.id=?1 ", Book.class);
//          nativeQuery.setParameter(1,id);
//        Object singleResult = nativeQuery.getSingleResult();

        /**
         * creatireiya query for get
         */
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Book> criteriaQuery = builder.createQuery(Book.class);
//        Root<Book> bookRoot = criteriaQuery.from(Book.class);
//        entityManager.createQuery(criteriaQuery
//                .select(bookRoot)
//                .where(builder.equal(bookRoot.get("id"), id))
//                .where(bookRoot.join())
//
//                .distinct(true)
//                .groupBy(bookRoot.get("id"))
//                .having(builder.ge(bookRoot.get("id"), 15)));
//        entityManager.clear();


    }

    public List<Book> getAll() {
        return null;
    }


    public Long create(Book book) {
        Session session = entityManager.unwrap(Session.class);
        session.save(book);


       // entityManager.persist(book);


        return book.getId();
    }

    public Void delete(Long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaDelete<Book> criteriaDelete = builder.createCriteriaDelete(Book.class);
        Root<Book> from = criteriaDelete.from(Book.class);
        criteriaDelete.where(builder.equal(from.get("id"), id));
        entityManager.createQuery(criteriaDelete);
        return null;
    }

//    public EntityManagerFactory getEMF() {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc:postgresql://localhost:5432/jpa?currentSchema=jpa");
//        emf.createEntityManager().getTransaction().rollback();
//
//
//        return emf;
//
//    }
}
