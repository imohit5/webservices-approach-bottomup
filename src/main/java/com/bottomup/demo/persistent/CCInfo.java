package com.bottomup.demo.persistent;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CCInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCInfo {

	@XmlElement(name = "cardNumber", required = true)
	private String cardNumber;
	@XmlElement(name = "expirtyDate", required = true)
	private Date expirtyDate;
	@XmlElement(name = "firstName", required = true)
	private String firstName;
	@XmlElement(name = "lastName", required = true)
	private String lastName;
	@XmlElement(name = "secCode", required = true)
	private String secCode;
	@XmlElement(name = "address", required = true)
	private String address;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpirtyDate() {
		return expirtyDate;
	}

	public void setExpirtyDate(Date expirtyDate) {
		this.expirtyDate = expirtyDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
