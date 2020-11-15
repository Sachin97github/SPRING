package com.nit.service;

import java.util.Date;

public class WishMsgGeneratorService {
	
	public String generateMsg()
	{  
	    int hours=0;
	    hours=new Date().getHours();
	    
	     if(hours<12)
	    	 return "GOOD MORNING";
	     else if(hours<16)
	    	 return "GOOD AFTERNOON";
	     else if(hours<20)
	    	 return "GOOD EVENING";
	     else 
	    	 return "GOOD NIGHT";
	}

}
