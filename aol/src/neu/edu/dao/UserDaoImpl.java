package neu.edu.dao;

import java.util.Date;
import java.util.List;

import org.apache.catalina.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import neu.edu.exception.AdException;

import neu.edu.entity.UserRegistration;
import neu.edu.utils.HibernateUtil;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {

		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public UserRegistration validateUserSQL(String username, String password) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createSQLQuery("select * from user_account where user_name=:un and password=password(:pass) ");
		query.setString("un", username);
		query.setString("pass", password);

		List userRegistrations =  query.list();
		Object row[];
		if (userRegistrations.size() > 0) {
			row = (Object[])userRegistrations.get(0);
			UserRegistration userregis = new UserRegistration((String)row[0], (String)row[1], (String)row[2], (String)row[3],(String)row[4], (String)row[5], (String)row[6], (String)row[7],(String)row[8], (String)row[9], (String)row[10], (String)row[11], (String)row[12], (String)row[13], (String)row[14],(String)row[15], (String)row[16], (String)row[17], (String)row[18],(String)row[19], (String)row[20], (String)row[21], (String)row[22], (String)row[23], (String)row[24],(String)row[25], (String)row[26], (String)row[27], (String)row[28],(String)row[29] );
			return userregis; 
			
		}
		try {
			session.close();
		} catch (Exception ex) {
			
		}
		return null;
	}

	@Override
	public UserRegistration validateUser(String username, String password) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from useraccountdb "
										+ "where userName=:un "
										+ "and password=password(:pass)");
		query.setString("un", username);
		query.setString("pass", password);

		List<UserRegistration> userRegistrations = (List<UserRegistration>) query.list();
		if (userRegistrations.size() > 0) {
			return userRegistrations.get(0);
		}
		try {
			session.close();
		} catch (Exception ex) {
			
		}
		return null;
	}
	
	@Override
	public List<UserRegistration> listUser() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from UserAccount");
		

		List<UserRegistration> userRegistrations = (List<UserRegistration>) query.list();
		
		try {
			session.close();
		} catch (Exception ex) {
			return null;
		}
		return userRegistrations;
	}

	@Override
	public boolean createUser(UserRegistration userRegis) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(userRegis);
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
	public boolean deleteUser(UserRegistration userRegis) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(userRegis);
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

	
	public boolean updateUser(UserRegistration userRegis) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(userRegis);
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
	public void updateUser(String abtme,String emailid,int phnno)throws AdException{
		Transaction tx = null;
		try{
			tx.begin();
			Session session = HibernateUtil.getSessionFactory().openSession();
			 Query q = session.createQuery("Update users set linesaboutyou = :carName, "
			 		+ " emailaddress = :carType, phonenumber = :rate,  
			 		+ "WHERE username = :id");
			 q.setString("carName", );
			 q.setString("carType", );
			 q.setString("rate", );
			 q.setString("id",)
		
			 q.executeUpdate();

			 tx.commit();
		}
		catch (HibernateException e) {
		      tx.rollback();
		      throw new AdException("Could not get user " + carName, e);
		  }
	}

}
