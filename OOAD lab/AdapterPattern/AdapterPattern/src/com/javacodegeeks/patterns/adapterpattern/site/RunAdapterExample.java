package com.javacodegeeks.patterns.adapterpattern.site;

import com.javacodegeeks.patterns.adapterpattern.payd.PayD;
import com.javacodegeeks.patterns.adapterpattern.xpay.Xpay;

public class RunAdapterExample {

	public static void main(String[] args) {
		
		// Object for Xpay
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("3789565874102367");
		xpay.setCustomerName("Gulam Mustafa");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("2025");
		xpay.setCardCVVNo((short)786);
		xpay.setAmount(2700.00);
		
		PayD payD = new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}
	
	private static void testPayD(PayD payD){
		
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}

}
