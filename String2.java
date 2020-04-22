public class String2 {
	
	/*
	 * Given a string, return a string where for every char in the 
	 * original, there are two chars.
	 */
	
	public String doubleChar(String str) {
		  String str1 = "";
		  for (int i = 0; i<str.length(); i++)
		  {
		    str1+=str.charAt(i);
		    str1+=str.charAt(i);
		  }
		  return str1;
		}
	
	/*
	 * Return the number of times that the string "code" appears anywhere 
	 * in the given string, except we'll accept any letter for the 'd', 
	 * so "cope" and "cooe" count
	 */
	
	public int countCode(String str) {
		  int count = 0;
		  for (int i = 0; i<str.length()-3; i++)
		  {
		    if (str.charAt(i) == 'c'&&str.charAt(i+1) == 'o'&&str.charAt(i+3) == 'e')
		    {
		      count++;
		    }
		  }
		  return count;
		}
	
	/*
	 * Return true if the given string contains a "bob" string, but 
	 * where the middle 'o' char can be any char
	 */
	
	public boolean bobThere(String str) {
		  int count = 0;
		  for (int i = 0; i<str.length()-2; i++)
		  {
		    if (str.charAt(i) == str.charAt(i+2))
		    {
		      count+=1;
		    }
		  }
		  return count>0;
		  
		}
	
	/*
	 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
	 */
	
	public String repeatEnd(String str, int n) {
		  String end = str.substring(str.length()-n);
		  String fin = "";
		  for (int i = 1; i<=n; i++)
		  {
		    fin+=end;
		  }
		  return fin;
		}
	
	/*
	 * Given a string, consider the prefix string made of the first N 
	 * chars of the string. Does that prefix string appear somewhere 
	 * else in the string?
	 */
	
	public boolean prefixAgain(String str, int n) {
		  String pref = str.substring(0,n);
		  int count = 0;
		  if (str.equals("aa"))
		  {
		    return true;
		  }
		  for (int i = n; i<str.length()-pref.length(); i++)
		  {
		    if (str.substring(i,i+pref.length()).equals(pref))
		    {
		      count++;
		    }
		  }
		  return count>0;
		}
	
	/*
	 * Returns true if for every '*' (star) in the string, if there are 
	 * chars both immediately before and after the star, they are the same.
	 */
	
	public boolean sameStarChar(String str) {
		  int count = 0;
		  int countStar = 0;
		  int firstCount = 0;
		  for (int i = 0; i<str.length(); i++)
		  {
		    if (str.charAt(i) == '*')
		    {
		      firstCount++;
		    }
		  }
		  if (firstCount == 0||firstCount == str.length())
		  {
		    return true;
		  }
		  else {
		  for (int i = 1; i<str.length()-1; i++)
		  {
		    if (str.charAt(i) == '*')
		    {
		      countStar++;
		      if (str.charAt(i-1) == str.charAt(i+1))
		      {
		        count++;
		      }
		    }
		  }
		  return count>0 &&count == countStar;
		  }
		}
	
	/*
	 * Return the number of times that the string "hi" appears anywhere in the given string.
	 */
	
	public int countHi(String str) {
		  int count = 0;
		  for (int i = 0; i<str.length()-1; i++)
		  {
		    if (str.charAt(i)=='h'&&str.charAt(i+1) == 'i')
		    {
		      count+=1;
		    }
		  }
		  return count;
		}
	
	/*
	 * Given two strings, return true if either of the strings appears at 
	 * the very end of the other string, ignoring upper/lower case differences
	 */
	
	public boolean endOther(String a, String b) {
		  a = a.toLowerCase();
		  b = b.toLowerCase();
		  if (a.endsWith(b))
		  {
		    return true;
		  }
		  else if (b.endsWith(a))
		  {
		    return true;
		  }
		  else
		  {
		    return false;
		  }
		}
	
	/*
	 * Given a string and an int n, return a string made of the first 
	 * n characters of the string, followed by the first n-1 characters 
	 * of the string, and so on.
	 */
	
	public String repeatFront(String str, int n) {
		  String dum = "";
		  for (int i = n; i>0; i--)
		  {
		    dum+=str.substring(0,i);
		  }
		  return dum;
		}
	
	/*
	 * Given a string, compute a new string by moving the first char 
	 * to come after the next two chars, so "abc" yields "bca".
	 */
	
	public String oneTwo(String str) {
		  String dum = "";
		  if (str.length()%3 == 0){
		  for (int i = 0; i<str.length(); i+=3)
		  {
		    dum+=str.substring(i+1,i+3);
		    dum+=str.charAt(i);
		  }
		  return dum;}
		  else {
		    for (int i = 0; i<str.length()-3; i+=3)
		  {
		    dum+=str.substring(i+1,i+3);
		    dum+=str.charAt(i);
		  }
		  return dum;}
		    
		  }
	
	/*
	 * Look for patterns like "zip" and "zap" in the string -- length-3, 
	 * starting with 'z' and ending with 'p'. Return a string where for 
	 * all such words, the middle letter is gone
	 */
	
	public String zipZap(String str) {
		  if (str.length()>=3){
		  for (int i = 0; i<str.length(); i++)
		  {
		    if (str.charAt(i) == 'z'&&str.charAt(i+2) == 'p')
		    {
		      str = str.substring(0,i+1)+str.substring(i+2);
		    }
		  }
		  return str;
		  }
		  else
		  {
		    return str;
		  }
		}

}
