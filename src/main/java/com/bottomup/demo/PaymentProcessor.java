package com.bottomup.demo;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bottomup.demo.persistent.PaymentRequest;
import com.bottomup.demo.persistent.PaymentResponse;

@WebService(name="PaymentProcessor")
public interface PaymentProcessor {
	
	public @WebResult(name="response")PaymentResponse processPayment(@WebParam(name="paymentRequest")PaymentRequest paymentRequest);

}
