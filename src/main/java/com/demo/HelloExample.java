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
		        	

		        	
//		        	System.out.println("Number of events generated -> "+50*count++);
		    			//String formMethod, String uri, String userAgent, String responseCode, String parameter
		    


		        	
//		        	runMe("GET", "/signon", "Firefox", "200", "Text");
//					runMe("POST", "/homepage", "Chrome", "301", "Text");
//					runMe("GET", "/watchVideo.mov", "Safari", "500", "Video");
//					runMe("POST", "/downloadVideo/company.mov", "IE", "300", "Video");
//					runMe("POST", "/submitComments", "Chrome", "400", "Text");
//					runMe("GET", "/readComments", "Chrome", "300", "Text");
//					runMe("POST", "/submitTags", "Chrome", "500", "Text");
//					runMe("GET", "/downloadLogo/company.jpeg", "Chrome", "200", "Image");
//					
//					runMe("GET", "/signon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "User Signing In");
//					runMe("GET", "/homepage", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home Page");
//					runMe("GET", "/watchVideo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "Watch Video");
//					runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//					runMe("POST", "/submitComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Submit Comments");
//					runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Read Comments");
//					runMe("POST", "/submitTags", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Submit Tags");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//					
//					runMe("GET", "/signon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "User Signing In");
//					runMe("GET", "/homepage", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home Page");
//					runMe("GET", "/watchVideo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "Watch Video");
//					runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//					runMe("POST", "/submitComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Submit Comments");
//					runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Read Comments");
//					runMe("POST", "/submitTags", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Submit Tags");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//					
//					runMe("GET", "/signon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "User Signing In");
//					runMe("GET", "/homepage", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home Page");
//					runMe("GET", "/watchVideo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "Watch Video");
//					runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//					runMe("POST", "/submitComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Submit Comments");
//					runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Read Comments");
//					runMe("POST", "/submitTags", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Submit Tags");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//					
//					runMe("GET", "/signon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "User Signing In");
//					runMe("GET", "/homepage", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home Page");
//					runMe("GET", "/watchVideo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "Watch Video");
//					runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//					runMe("POST", "/submitComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Submit Comments");
//					runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Read Comments");
//					runMe("POST", "/submitTags", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Submit Tags");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//					
//					runMe("POST", "/as/as/", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "301", "Submit Comments");
//					runMe("GET", "/add/a", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "302", "Read Comments");
//					runMe("POST", "/proxy", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "305", "Submit Tags");
//					runMe("GET", "/autosignon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "400", "Download Logo");
//					runMe("GET", "/autosignon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "500", "Download Logo");
//					runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "401", "Download Logo");
//					runMe("GET", "/readComments/a", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "400", "Download Logo");
//					runMe("GET", "/download", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "403", "Download Logo");
//					runMe("POST", "/submitComments/s", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "404", "Submit Comments");
//					runMe("GET", "/readCo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "500", "Read Comments");
//					runMe("POST", "/submitTags/alkks", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "502", "Submit Tags");
//
//					runMe("GET", "/list", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "list");
//					runMe("GET", "/home", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home");
//					runMe("GET", "/contact", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "contact");
//					runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//					runMe("POST", "/products", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "products");
//					runMe("GET", "/company", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "company");
//					runMe("GET", "/logo.jpeg", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "logo");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//					runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
					
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		    }
		});
			
			//if(i==2)break;
		
		}
		
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			 
		}
		System.out.println("\nFinished all threads");
//		
//		//for (int i = 0; i < loopctr; i++) {
//			//System.out.println("Execute Service Accomplished");
//			//executorService.shutdown();	
//		//}
//		
//		long endTime   = System.currentTimeMillis();
//		long totalTime = endTime - startTime;
//		
//		runMe("POST", "/signOut", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Sign Out");
//
//		System.out.println("Task Completed in totalTime " + totalTime);
//		System.exit(0);
			
	}
	

	
	private static void runMe(String formMethod, String uri, String userAgent, String responseCode, String parameter) throws UnknownHostException{
		
		MDC.put("ipAddress",InetAddress.getLocalHost().getHostAddress());
		MDC.put("formMethod",formMethod);
		MDC.put("uri",uri);
		MDC.put("Protocol","HTTP/1.1");
		MDC.put("userAgent",userAgent);
		MDC.put("responseCode",responseCode);
		MDC.put("activity",parameter);
		
		//ThreadContext.put("logFileName", "David");
		
		//String threadId = String.valueOf(Thread.currentThread().getId());
		//System.out.println("Thread Id " + threadId);
	

	//	if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
//		}
		
			
	}
	
//	public static class MyRunnable implements Runnable {
//
// 
//		@Override
//		public void run() {
//			try {
//				System.out.println("Number of events generated -> "+count++);
//				runMe("GET", "/signon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "User Signing In");
//				runMe("GET", "/homepage", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home Page");
//				runMe("GET", "/watchVideo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "Watch Video");
//				runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//				runMe("POST", "/submitComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Submit Comments");
//				runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Read Comments");
//				runMe("POST", "/submitTags", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Submit Tags");
//				runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//				runMe("POST", "/as/as/", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "301", "Submit Comments");
//				runMe("GET", "/add/a", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "302", "Read Comments");
//				runMe("POST", "/proxy", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "305", "Submit Tags");
//				runMe("GET", "/autosignon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "400", "Download Logo");
//				runMe("GET", "/autosignon", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "500", "Download Logo");
//				runMe("GET", "/readComments", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "401", "Download Logo");
//				runMe("GET", "/readComments/a", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "400", "Download Logo");
//				runMe("GET", "/download", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "403", "Download Logo");
//				runMe("POST", "/submitComments/s", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "404", "Submit Comments");
//				runMe("GET", "/readCo", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "500", "Read Comments");
//				runMe("POST", "/submitTags/alkks", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "502", "Submit Tags");
//				runMe("GET", "/list", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "list");
//				runMe("GET", "/home", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "Home");
//				runMe("GET", "/contact", "[Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko]", "200", "contact");
//				runMe("GET", "/downloadVideo/company.mov", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Video");
//				runMe("POST", "/products", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "products");
//				runMe("GET", "/company", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "company");
//				runMe("GET", "/logo.jpeg", "[Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36]", "200", "logo");
//				runMe("GET", "/downloadLogo/company.jpeg", "[Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0]", "200", "Download Logo");
//
//				
//			} catch (UnknownHostException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}
	
}