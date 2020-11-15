package com.nit.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service("service")
public class GreetMsgService {

	public String greetMsg()
	{
		String msg;
		LocalTime ldt=LocalTime.now();
		int hour=ldt.getHour();
		if(hour<12)
		 msg="GoodMorning";
		else if(hour<16)
			msg="GoodAfternoon";
		else if(hour<20)
			msg="GoodEvening";
		else
			msg="GoodNight";
return msg;
	}
}
