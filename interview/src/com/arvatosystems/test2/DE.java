package com.arvatosystems.test2;

public class DE {
	public boolean validateCountry(String countryCode)
	{
		if ("DE".equals(countryCode))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String[] format(Address address)
	{
		/*
		* <li>German Address Format
	     * <pre>
	     *   street, pobox
	     *   state, DE
	     * </pre>*/
		return new String[] {address.getStreet()+","+address.getPoBox(), address.getState()+","+address.getCountryCode()};
	}
}
