package neu.edu.model;

import java.util.Date;

public class UserRegistration {
	private String userName;
	private String name;
	private String password;
	private String dob;
	private String gender;
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
	private String company;
	private String position;
	private String jobDescription;
	private String skill1;
	private String rateSkill1;
	private String skill2;
	private String rateSkill2;
	private String skill3;
	private String rateSkill3;
	public String getRateSkill3() {
		return rateSkill3;
	}
	public void setRateSkill3(String rateSkill3) {
		this.rateSkill3 = rateSkill3;
	}
	private String reference1Name;
	private String reference1Email;
	private String reference1Relation;
	private String reference2Name;
	private String reference2Email;
	private String reference2Relation;
	
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getRateSkill1() {
		return rateSkill1;
	}
	public void setRateSkill1(String rateSkill1) {
		this.rateSkill1 = rateSkill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public String getRateSkill2() {
		return rateSkill2;
	}
	public void setRateSkill2(String rateSkill2) {
		this.rateSkill2 = rateSkill2;
	}
	public String getSkill3() {
		return skill3;
	}
	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
	public String getReference1Name() {
		return reference1Name;
	}
	public void setReference1Name(String reference1Name) {
		this.reference1Name = reference1Name;
	}
	public String getReference1Email() {
		return reference1Email;
	}
	public void setReference1Email(String reference1Email) {
		this.reference1Email = reference1Email;
	}
	public String getReference1Relation() {
		return reference1Relation;
	}
	public void setReference1Relation(String reference1Relation) {
		this.reference1Relation = reference1Relation;
	}
	public String getReference2Name() {
		return reference2Name;
	}
	public void setReference2Name(String reference2Name) {
		this.reference2Name = reference2Name;
	}
	public String getReference2Email() {
		return reference2Email;
	}
	public void setReference2Email(String reference2Email) {
		this.reference2Email = reference2Email;
	}
	public String getReference2Relation() {
		return reference2Relation;
	}
	public void setReference2Relation(String reference2Relation) {
		this.reference2Relation = reference2Relation;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+userName+","+name+","+dob+"]";
	}
	
}
