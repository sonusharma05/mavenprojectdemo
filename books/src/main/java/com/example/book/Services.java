package com.example.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.book.utils.HibernateUtils;
import com.example.books.entities.Book;

/* Update book details (updateBook(Book book))
 Delete a book by ID (deleteBook(int id))
 Configure Hibernate with hibernate.cfg.xml
 Use Hibernate’s Session and Transaction management*/


public class Services {
		private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		public void saveBook(Book b1) {
			try(Session session = sessionFactory.openSession()){
				Transaction transaction = session.beginTransaction();
				session.persist(b1);
				transaction.commit();
				
			}
			
		}
		public Book fetchBook(int id) {
			try(Session session = sessionFactory.openSession()){
				Transaction transaction = session.beginTransaction();
				Book b2 = session.get(Book.class, id);
				return b2;

			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
				
			}
			
		}
		
		public Book updatebook(int id, Book B1) {
			try(Session session = sessionFactory.openSession()){
				Transaction transaction = session.beginTransaction();
				Book old_book = session.get(Book.class, id);
				if(old_book!=null) {
					old_book.setTitle(B1.getTitle());
					old_book.setAuthor(B1.getAuthor());
					old_book = session.merge(old_book);
					
				
				}
					transaction.commit();
					return old_book;
				
			}
			
		}
		
		public void deleteEmp(int id) {
			try(Session session = sessionFactory.openSession()){
				Transaction transaction = session.beginTransaction()	;
				Book b = session.get(Book.class, id);
				if(b!=null) {
					session.remove(b);
				}
				transaction.commit();
			}
		}
		
		
		

		
}
