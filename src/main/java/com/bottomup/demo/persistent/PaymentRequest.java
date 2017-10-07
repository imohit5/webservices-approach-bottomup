package com.bottomup.demo.persistent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PaymentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentRequest {

	@XmlElement(name="creditCardInfo", required = true)
	private CCInfo creditCardInfo;
	@XmlElement(name="amount", required = true)
	private Double amount;

	public CCInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CCInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
