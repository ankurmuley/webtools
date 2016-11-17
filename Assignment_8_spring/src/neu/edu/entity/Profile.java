package neu.edu.entity;
// Generated Nov 17, 2016 6:35:49 AM by Hibernate Tools 5.1.0.CR1

/**
 * Profile generated by hbm2java
 */
public class Profile implements java.io.Serializable {

	private int desc;
	private UserAccount userAccount;
	private String linesaboutyou;
	private String emailAddress;
	private String phoneNumber;
	private String address;
	private String project1Name;
	private String project1Description;
	private String project2Name;
	private String project2Description;
	private String university;
	private String relevantCourses;

	public String getLinesaboutyou() {
		return linesaboutyou;
	}

	public void setLinesaboutyou(String linesaboutyou) {
		this.linesaboutyou = linesaboutyou;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProject1Name() {
		return project1Name;
	}

	public void setProject1Name(String project1Name) {
		this.project1Name = project1Name;
	}

	public String getProject1Description() {
		return project1Description;
	}

	public void setProject1Description(String project1Description) {
		this.project1Description = project1Description;
	}

	public String getProject2Name() {
		return project2Name;
	}

	public void setProject2Name(String project2Name) {
		this.project2Name = project2Name;
	}

	public String getProject2Description() {
		return project2Description;
	}

	public void setProject2Description(String project2Description) {
		this.project2Description = project2Description;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getRelevantCourses() {
		return relevantCourses;
	}

	public void setRelevantCourses(String relevantCourses) {
		this.relevantCourses = relevantCourses;
	}

	public Profile() {
	}

	public Profile(int desc) {
		this.desc = desc;
	}

	public Profile(int desc, UserAccount userAccount) {
		this.desc = desc;
		this.userAccount = userAccount;
	}

	public int getDesc() {
		return this.desc;
	}

	public void setDesc(int desc) {
		this.desc = desc;
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}