package com.iban.support;

public class IncomingMessage {

	private String email;
	private String firstName;
	private String gender;
	private String dateOfBirth;
	private String consent;
	private String newsletterId;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getConsent() {
		return consent;
	}

	public void setConsent(String consent) {
		this.consent = consent;
	}

	public String getNewsletterId() {
		return newsletterId;
	}

	public void setNewsletterId(String newsletterId) {
		this.newsletterId = newsletterId;
	}

}
