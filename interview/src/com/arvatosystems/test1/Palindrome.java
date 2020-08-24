package com.arvatosystems.test1;

public class Palindrome {

    /**
     * FILL IN THE CODE
     * such that isPalindrome(...) is a RECURSIVE function to determine if passed word is a palindrome.
     * A palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nursesrun.
     * @param word the word
     * @return true if word is palindrome, false otherwise
     */
    public boolean isPalindrome(String word) {
        // TODO: code!
    	String temp = "";
    	int end = word.length() - 1;
    	
    	if(word.length() ==0 || word.length()==1)
    	{
    		return true;
    	}
    	
    	if (word.charAt(0) != word.charAt(word.length()-1))
    	{
    		return false;
    	}
    	
    	for (int i = 1; i < end; i++)
		{
			temp = temp+word.charAt(i);
		}
    	
    	boolean res = isPalindrome(temp);
    	return res;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        // sample tests
        String[] words = { "madam", "nursesrun", "lol", "kodok", "love", "peep", "peek"};
        for (String word : words) {
            System.out.println("\"" + word + "\" is " + palindrome.isPalindrome(word));
        }
    }
}
