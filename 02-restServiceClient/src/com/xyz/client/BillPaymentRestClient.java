package com.xyz.client;

import com.xyz.restservice.BillPaymentRestService;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

public class BillPaymentRestClient {
  
    public static void main(String[] args){
        String serviceUrl = "http://localhost:8080/billpayment-rest-2.2/billpaymentservices";
        BillPaymentRestService serviceClient = JAXRSClientFactory.create(serviceUrl, BillPaymentRestService.class);
	 
      try {
          //Submit bill payment request
          com.xyz.pojo.Bill bill = serviceClient.getBill("abc1234xyz");
     
          //access bill payment response
          if(bill.getAccountID() == null)
            System.err.println("In the bill, account ID not set");
          else
            System.out.println("Account ID:" + bill.getAccountID());
          System.out.println("Payment Amount Due:" + bill.getBillAmount());
          if(bill.getDueDate() == null)
            System.err.println("In the bill, payment due date not set");
          else
            System.out.println("Payment Due Date:" + bill.getDueDate());
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}