package com.retailer.rewards;

import java.util.Date;

public class CustomerRewards {
	// customer A transaction1 (jan, 120)
	//A transaction 2(feb,150)
	//A transaction 3 (mar,80) 
	public String customerName;
	public int transactionAmount;
	public String transactionDate;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int calculateRewardsPerTransaction(CustomerRewards object) {
		int rewardPoints =0;
		System.out.println("calculating rewards for  " +object.getCustomerName() +"  in the " +object.transactionDate);
		int price = object.getTransactionAmount();
	    if (price >=50 && price < 100) {
	    	 rewardPoints = price-50;
	    	System.out.println("reward points for  "+object.customerName + "  are  "+rewardPoints);
	        return rewardPoints;
	    } else if (price >100){
	    	rewardPoints = (2*(price-100) + 50);
	    	System.out.println("reward points for "+object.customerName +  " are    "+rewardPoints);
	        return rewardPoints;
	    }
	    return 0;
	}
	public static int calculateRewards(int price) {
		int rewardPoints =0;
		System.out.println("calculating total rewards for 3 months ");
			    if (price >=50 && price < 100) {
	    	 rewardPoints = price-50;
	    	System.out.println("total reward points are  " +rewardPoints);
	        return rewardPoints;
	    } else if (price >100){
	    	rewardPoints = (2*(price-100) + 50);
	    	System.out.println("total reward points for 3 months are " +rewardPoints);
	        return rewardPoints;
	    }
	    return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerRewards customer1 = new CustomerRewards();
		customer1.setCustomerName("John"); 
		customer1.setTransactionAmount(120);
	    customer1.setTransactionDate("DEC2019");
	    customer1.calculateRewardsPerTransaction(customer1);
	    CustomerRewards customer2 = new CustomerRewards();
		customer2.setCustomerName("John"); 
		customer2.setTransactionAmount(140);
	    customer2.setTransactionDate("NOV2019");
	    customer2.calculateRewardsPerTransaction(customer2);
	    CustomerRewards customer3 = new CustomerRewards();
		customer3.setCustomerName("John"); 
		customer3.setTransactionAmount(60);
	    customer3.setTransactionDate("JAN2020");
	    customer3.calculateRewardsPerTransaction(customer3);
	    if(customer1.getCustomerName()==customer2.customerName&&customer1.getCustomerName()==customer3.getCustomerName()) {
	    int totalTransactionAmount=0;
	    totalTransactionAmount = customer1.getTransactionAmount() + customer2.getTransactionAmount() +customer3.getTransactionAmount();
	    calculateRewards(totalTransactionAmount);
	    }
	}

}
