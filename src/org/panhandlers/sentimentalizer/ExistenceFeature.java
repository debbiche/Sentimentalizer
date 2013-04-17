package org.panhandlers.sentimentalizer;

public class ExistenceFeature implements Feature{
	private boolean exists;
	private String token;
	public ExistenceFeature(String token) {
		this.token = token;
		exists = false;
	}
	public ExistenceFeature() {
		this.exists = false;
	}
	public String toString() {
		return "existence" + token + exists;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean doesExist() {
		return exists;
	}
	public void setExists(boolean exists) {
		this.exists = exists;
	}
}