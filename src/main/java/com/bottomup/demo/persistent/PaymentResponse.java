package com.bottomup.demo.persistent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PaymentResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentResponse {

	@XmlElement(name="result", required = true)
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
