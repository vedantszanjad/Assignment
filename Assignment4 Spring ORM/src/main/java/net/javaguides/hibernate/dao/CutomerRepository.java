package net.javaguides.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import net.javaguides.hibernate.entity.Branch;
import net.javaguides.hibernate.entity.Customer;
import net.javaguides.hibernate.entity.Loan;
import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.util.HibernateUtil;

@Repository
public class CutomerRepository {

	public List<Customer> getAllCustomer() {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			String hql = "FROM Customer";
			Query query = session.createQuery(hql);
			List results = query.getResultList();

			transaction.commit();
			session.close();

			return results;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
	
	

}
