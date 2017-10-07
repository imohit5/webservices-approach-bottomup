package com.bottomup.demo;

import com.bottomup.demo.persistent.PaymentRequest;
import com.bottomup.demo.persistent.PaymentResponse;
import com.bottomup.exceptions.BusinessException;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public PaymentResponse processPayment(PaymentRequest paymentRequest) throws BusinessException {

		// To throw soap fault execption
		if (paymentRequest.getCreditCardInfo().getCardNumber() == null
				|| paymentRequest.getCreditCardInfo().getCardNumber().length() == 0) {
			throw new RuntimeException("Invalid Card Number");
		}

		// To throw custom fault execption
		if (paymentRequest.getCreditCardInfo().getSecCode() == null
				|| paymentRequest.getCreditCardInfo().getSecCode().length() == 0) {
			throw new BusinessException("Invalid security code");
		}

		PaymentResponse paymentResponse = new PaymentResponse();
		paymentResponse.setResult(true);
		return paymentResponse;
	}

}
