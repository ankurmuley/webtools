package neu.edu.entity;
// Generated Nov 17, 2016 6:35:49 AM by Hibernate Tools 5.1.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserAccount generated by hbm2java
 */
public class UserAccount implements java.io.Serializable {

	private String userName;
	private String name;
	private String password;
	private Date age;
	private Set<Profile> profiles = new HashSet<Profile>(0);

	public UserAccount() {
	}

	public UserAccount(String userName) {
		this.userName = userName;
	}

	public UserAccount(String userName, String name, String password, Date age, Set<Profile> profiles) {
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.age = age;
		this.profiles = profiles;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getAge() {
		return this.age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

}