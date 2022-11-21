package net.javaguides.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import net.javaguides.hibernate.entity.Branch;
import net.javaguides.hibernate.entity.Customer;
import net.javaguides.hibernate.entity.CustomerLoanAmount;
import net.javaguides.hibernate.entity.Loan;
import net.javaguides.hibernate.entity.LoanTypeAmount;
import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.entity.StudentMarks;
import net.javaguides.hibernate.entity.Test;
import net.javaguides.hibernate.entity.TotalBranchLoan;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_demo?useSSL=false");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "Mysql$12345");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

				settings.put(Environment.SHOW_SQL, "false");
				settings.put(Environment.ENABLE_LAZY_LOAD_NO_TRANS, "true");
//				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Branch.class);
				configuration.addAnnotatedClass(Loan.class);
				configuration.addAnnotatedClass(CustomerLoanAmount.class);
				configuration.addAnnotatedClass(TotalBranchLoan.class);
				configuration.addAnnotatedClass(LoanTypeAmount.class);
				configuration.addAnnotatedClass(Student.class);
				configuration.addAnnotatedClass(Test.class);
				configuration.addAnnotatedClass(StudentMarks.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
