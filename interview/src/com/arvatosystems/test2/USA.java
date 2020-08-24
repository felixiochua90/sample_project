package com.arvatosystems.test2;

public class USA {
	public boolean validateCountry(String countryCode)
	{
		if ("US".equals(countryCode))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String[] format(Address address)
	{
		/*<li>US Address Format
	     * <pre>
	     *   street
	     *   state, pobox
	     *   US
	     * </pre>*/
		return new String[] {address.getStreet(), address.getState()+","+address.getPoBox(), address.getCountryCode()};
	}
}
