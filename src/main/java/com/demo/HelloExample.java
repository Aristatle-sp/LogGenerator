package com.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	private static final int MYTHREADS = 10;
	
	 static int count=0;  
	
	public static void main(String[] args) throws UnknownHostException,Exception  {
		
		
		long startTime = System.currentTimeMillis();
		int loopctr = 0;
		ExecutorService executorService = Executors.newFixedThreadPool(MYTHREADS);
		int noOfRecords= 0;	
		int n= Integer.parseInt(args[0]);
		
		for (int i=0; i<n;i++){
			loopctr++;
			if(loopctr%100000 == 0){
				Thread.sleep(1*1000);
				loopctr = 0;
				noOfRecords =noOfRecords+5000000;
				System.out.println("Number of events generated -> " + noOfRecords);
			}
			
//		while(true) {
//			loopctr++;
//			if(loopctr%5 == 0){
//				Thread.sleep(2*1000);
//				loopctr = 0;
//				noOfRecords =noOfRecords+50000;
//				System.out.println("Number of events generated -> " + noOfRecords);
//			}
			executorService.execute(new Runnable() {
			
		    public void run() {
		        try {
		        	runMe("PUT","/addItem","Chrome","400","Text");
		        	runMe("GET","/viewBill.jpeg","IE","200","Image");
		        	runMe("GET","/watchDemo.mov","Opera","300","Video");
		        	runMe("POST","/addFeedback","IE","200","Text");
		        	runMe("GET","/productAdvice.mp3","Safari","200","Audio");
		        	runMe("PUT","/updateContact","Chrome","200","Text");
		        	runMe("GET","/viewStatus","IE","404","Text");
		        	runMe("POST","/addComplaint.jpeg","Chrome","200","Image");
		        	runMe("GET","/newUserForm","IE","200","Text");
		        	runMe("PUT","/addCreditCard","Safari","200","Text");
		        	runMe("GET","/description/instagram.mov","Chrome","200","Video");
		        	runMe("PUT","/addProductforSale","IE","300","Text");
		        	runMe("PUT","/addProductPicture.jpeg","Chrome","200","Image");
		        	runMe("GET","/viewSellerInfo","Safari","201","Text");
		        	runMe("PUT","/addUser","Chrome","200","Text");
		        	runMe("GET","/DeliveryVideo.mov","Chrome","200","Video");
		        	runMe("PUT","/viewQuantity","IE","300","Text");
		        	runMe("GET","/updateOrder","Chrome","400","Text");
		        	runMe("GET","/DealoftheDay.jpeg","IE","200","Image");
		        	runMe("GET","/DiscountsThisWeek","Chrome","400","Text");
		        	runMe("GET","/intro/Deliveryman.mov","Safari","300","Video");
		        	runMe("POST","/addSellingInfo","Chrome","400","Text");
		        	runMe("PUT","/addRecommendation.jpeg","IE","200","Image");
		        	runMe("GET","/ourWarehouse.mov","Safari","200","Video");
		        	runMe("GET","/viewFAQ","Mozilla","200","Text");
		        	runMe("POST","/deleteFromCart","Chrome","300","Text");
		        	runMe("GET","/downloadOrderInfo.jpeg","IE","202","Image");
		        	runMe("PUT","/helpRequest","Chrome","304","Text");
		        	runMe("GET","/viewGiftCard.jpeg","IE","404","Image");
		        	runMe("PUT","/addRating","Mozilla","300","Text");
		        	runMe("POST","/addtoWishList","Chrome","200","Text");
		        	runMe("GET","/viewCustomerRights.mov","IE","404","Video");
		        	runMe("PUT","/askQuestion","Chrome","200","Text");
		        	runMe("GET","/getDealerInfo","IE","303","Text");
		        	runMe("GET","/magnifiedView.jpeg","Chrome","202","Image");
		        	runMe("POST","/deleteAccount","IE","303","Text");
		        	runMe("GET","/viewCompanyInfo.mov","Chrome","401","Video");
		        	runMe("PUT","/enterSearchString","IE","203","Text");
		        	runMe("GET","/ourWarehouse.mov","Safari","200","Video");
		        	runMe("GET","/viewFAQ","Mozilla","200","Text");
		        	runMe("POST","/deleteFromCart","Chrome","300","Text");
		        	runMe("GET","/downloadOrderInfo.jpeg","IE","202","Image");
		        	runMe("PUT","/helpRequest","Chrome","304","Text");
		        	runMe("GET","/viewGiftCard.jpeg","IE","404","Image");
		        	runMe("PUT","/addRating","Mozilla","300","Text");
		        	runMe("POST","/addtoWishList","Chrome","200","Text");
		        	runMe("GET","/viewSellerInfo","Safari","201","Text");
		        	runMe("PUT","/addUser","Chrome","200","Text");
		        	runMe("GET","/DeliveryVideo.mov","Chrome","200","Video");
		        	runMe("PUT","/viewQuantity","IE","300","Text");
					
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
		        
		    }
		});
			
		
		}
		
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			 
		}
		System.out.println("\nFinished all threads");
			
	}
	

	
	private static void runMe(String formMethod, String uri, String userAgent, String responseCode, String parameter) throws UnknownHostException{
		
		MDC.put("ipAddress",InetAddress.getLocalHost().getHostAddress());
		MDC.put("formMethod",formMethod);
		MDC.put("uri",uri);
		MDC.put("Protocol","HTTP/1.1");
		MDC.put("userAgent",userAgent);
		MDC.put("responseCode",responseCode);
		MDC.put("activity",parameter);
		
		logger.info("This is info : " + parameter);
			
	}
}