package com.nit.service;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service("localeService")
public class LocaleServiceImpl implements LocaleService {

	@Override
	public Set<String> getAllCountry() {
		Locale locale[] = null;
		Set<String> countriesSet = null;

		locale = Locale.getAvailableLocales();
		// All Countries Will be Sorted and Does not Contain any Duplicate
		countriesSet = new TreeSet();

		for (Locale l : locale) {
			if (!l.getDisplayCountry().equals(""))
				countriesSet.add(l.getDisplayCountry());
		}
		return countriesSet;

	}

	@Override
	public Set<String> getAllLanguage() {
		Locale locale[] = null;
		Set<String> countriesSet = null;

		locale = Locale.getAvailableLocales();
		// All Countries Will be Sorted and Does not Contain any Duplicate
		countriesSet = new TreeSet();

		for (Locale l : locale) {
			countriesSet.add(l.getLanguage());
		}
		return countriesSet;

	}

}
