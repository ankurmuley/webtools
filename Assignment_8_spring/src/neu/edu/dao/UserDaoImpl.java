package neu.edu.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.UserAccount;
import neu.edu.util.HibernateUtil;

@Service
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {

		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserAccount validateUserSQL(String username, String password) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createSQLQuery("select * from user_account where user_name=:un and password=password(:pass) ");
		query.setString("un", username);
		query.setString("pass", password);

		List userAccounts =  query.list();
		Object row[];
		if (userAccounts.size() > 0) {
			row = (Object[])userAccounts.get(0);
			UserAccount userAccount = new UserAccount((String)row[0], (String)row[1], (String)row[2], (Date)row[3], null);
			return userAccount;
		}
		try {
			session.close();
		} catch (Exception ex) {
			
		}
		return null;
	}

	@Override
	public UserAccount validateUser(String username, String password) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from UserAccount "
										+ "where userName=:un "
										+ "and password=password(:pass)");
		query.setString("un", username);
		query.setString("pass", password);

		List<UserAccount> userAccounts = (List<UserAccount>) query.list();
		if (userAccounts.size() > 0) {
			return userAccounts.get(0);
		}
		try {
			session.close();
		} catch (Exception ex) {
			
		}
		return null;
	}
	
	@Override
	public List<UserAccount> listUser() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from UserAccount");
		

		List<UserAccount> userAccounts = (List<UserAccount>) query.list();
		
		try {
			session.close();
		} catch (Exception ex) {
			return null;
		}
		return userAccounts;
	}

	@Override
	public boolean createUser(UserAccount userAccount) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(userAccount);
			tx.commit();

		} catch (Exception ex) {
			System.out.println(ex);
			try {
				tx.rollback();
			} catch (Exception e) {
			}
			return false;
		} finally {
			try {
				session.close();
			} catch (Exception ex) {
				return false;
			}
		}

		return true;

	}

	@Override
	public boolean deleteUser(UserAccount userAccount) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(userAccount);
			tx.commit();

		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		} finally {
			try {
				session.close();
			} catch (Exception ex) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean updateUser(UserAccount userAccount) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(userAccount);
			tx.commit();

		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		} finally {
			try {
				session.close();
			} catch (Exception ex) {
				return false;
			}
		}

		return true;
	}

}
