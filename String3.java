
public class String3 {
	
	/*
	 * Given a string, count the number of words ending in 'y' or 'z'
	 */
	public int countYZ(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length()-1; i++)
		  {
		    if (str.charAt(i) == 'y' && !Character.isLetter(str.charAt(i+1)) || str.charAt(i) == 'z' && !Character.isLetter(str.charAt(i+1)) || str.charAt(i) == 'Y' && !Character.isLetter(str.charAt(i+1)) || str.charAt(i) == 'Z' && !Character.isLetter(str.charAt(i+1)))
		    {
		      count++;
		    }
		  }
		  
		  if (str.charAt(str.length()-1) == 'y' || str.charAt(str.length()-1) == 'z' || str.charAt(str.length()-1) == 'Y' || str.charAt(str.length()-1) == 'Z')
		  {
		    count++;
		  }
		  
		  return count;
		}
	
	/*
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
	 * Return true if all the g's in the given string are happy.
	 */
	
	public boolean gHappy(String str) {
		  int happyG = 0;
		  if (str.length() == 1 && str.charAt(0) == 'g')
		  {
		    return false;
		  }
		  if (str.length() < 1)
		  {
		    return true;
		  }
		  if (str.charAt(0) == 'g' && str.charAt(1) == 'g')
		  {
		    happyG++;
		  }
		  
		  if ((str.charAt(str.length()-1) == 'g' && str.charAt(str.length()-2) == 'g'))
		  {
		    happyG++;
		  }
		  int totalG = 0;
		  
		  for (int i = 1; i < str.length()-1; i++)
		  {
		    if (str.charAt(i) == 'g' && str.charAt(i+1) == 'g' || str.charAt(i) == 'g' && str.charAt(i-1) == 'g')
		    {
		      happyG++;
		    }
		  }
		  
		  for (int i = 0; i < str.length(); i++)
		  {
		    if (str.charAt(i) == 'g')
		    {
		      totalG++;
		    }
		  }
		  
		  return happyG == totalG;
		}
	
	/*
	 * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string.
	 */
	
	public int countTriple(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length()-2; i++)
		  {
		    if (str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
		    {
		      count++;
		    }
		  }
		  
		  return count;
		}
	
	/*
	 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. 
	 * In other words, zero or more characters at the very begining of the given string, and at the very end of the string 
	 * in reverse order (possibly overlapping).
	 */
	
	public String reverseString(String string) //Helper method
	{
	  String reversed = "";
	  for (int i = string.length()-1; i >= 0; i--)
	  {
	    reversed+=string.charAt(i);
	  }
	  
	  return reversed;
	}

	public boolean isPalindrome(String string) //Helper method
	{
	  if (string.length() < 1)
	  {
	    return true;
	  }
	  for (int i = 0; i < string.length(); i++)
	  {
	    if (string.charAt(i) != string.charAt(string.length()-i-1))
	    {
	      return false;
	    }
	  }
	  
	  return true;
	}
	public String mirrorEnds(String string) { //Main method
	  int p = 1;
	  String reversed = reverseString(string);
	  String str1 = "a";
	  String str2 = "a";
	  if (isPalindrome(string))
	  {
	    return string;
	  }
	  while (str1.equals(str2) && p < string.length())
	  {
	    str1 = string.substring(0, p);
	    str2 = reversed.substring(0, p);
	    p++;
	  }
	  
	  return str2.substring(0, str2.length()-1);
	}

}
