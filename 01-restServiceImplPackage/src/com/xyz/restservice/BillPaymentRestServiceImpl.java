package com.xyz.restservice;
 
import java.util.Date;

import com.xyz.pojo.Bill;
 
public class BillPaymentRestServiceImpl implements BillPaymentRestService {
 
 public Bill getBill(String accountID) {
  Bill bill = new Bill();
  /*
   
   Code to retrieve the bill for the user goes here
   
   */
   
  //for now: setting up a dummy bill
  bill.setAccountID(accountID);
  bill.setBillAmount(48.93);
  bill.setDueDate(new Date());
   
  return bill;
 }
 
}