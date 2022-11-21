package net.javaguides.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import net.javaguides.hibernate.entity.Branch;
import net.javaguides.hibernate.entity.Customer;
import net.javaguides.hibernate.util.HibernateUtil;

@Repository
public class BranchRepository {

	public List<Branch> getAllBranch() {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			String hql = "FROM Branch";
			Query query = session.createQuery(hql);
			List<Branch> branches = query.getResultList();

			transaction.commit();
			session.close();

			return branches;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
}
