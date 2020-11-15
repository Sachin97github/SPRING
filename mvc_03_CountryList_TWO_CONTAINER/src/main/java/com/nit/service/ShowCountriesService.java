package com.nit.service;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ShowCountriesService {
	
	public Set<String> getCountries()
	{
		Set<String> countriesSet=new HashSet();
	    String[] locale=Locale.getISOCountries();
		
	    for(String country : locale)
	    {
	        System.out.println(country);
	        countriesSet.add(country);
	    }
	    
		return countriesSet;
	}

}
