package com.bottomup.demo;

import com.bottomup.demo.persistent.PaymentRequest;
import com.bottomup.demo.persistent.PaymentResponse;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public PaymentResponse processPayment(PaymentRequest paymentRequest) {
		
		PaymentResponse paymentResponse = new PaymentResponse();
		paymentResponse.setResult(true);
		return paymentResponse;
	}

}
