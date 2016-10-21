package model;

public class User {
	private String name;
	private boolean isActive;
	private String sessionIDVariable;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getSessionIDVariable() {
		return sessionIDVariable;
	}
	public void setSessionIDVariable(String sessionIDVariable) {
		this.sessionIDVariable = sessionIDVariable;
	}
}
