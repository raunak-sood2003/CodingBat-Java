public class AP1 {
	
	/*
	 * Given an array of scores, return true if each score is equal or 
	 * greater than the one before.
	 */
	
	public boolean scoresIncreasing(int[] scores) {
		  int count = 0;
		  for (int i = 0; i<scores.length-1; i++)
		  {
		    if (scores[i]<=scores[i+1])
		    {
		      count++;
		    }
		  }
		  if (count == scores.length-1)
		  {
		    return true;
		  }
		  else
		  {
		    return false;
		  }
		}
	
	/*
	 * Given an array of scores, compute the int average of the first half and 
	 * the second half, and return whichever is larger. We'll say that the 
	 * second half begins at index length/2.
	 */
	
	// Helper method + main method
	
	public int average(int[] scores, int start, int end)
	{
	  int total = 0;
	  for (int i = start; i<=end; i++)
	  {
	    total+=scores[i];
	  }
	  return total/(end-start+1);
	}
	
	public int scoresAverage(int[] scores) {
	  int total1 = 0;
	  int total2 = 0;
	  for (int i = 0; i<scores.length/2; i++)
	  {
	    total1+=scores[i];
	  }
	  for (int i = scores.length/2; i<scores.length; i++)
	  {
	    total2+=scores[i];
	  }
	  if (total1/(scores.length/2)>total2/(scores.length/2))
	  {
	    return total1/(scores.length/2);
	  }
	  return total2/(scores.length/2);
	  
	}
	
	/*
	 * Given an array of positive ints, return a new array of length 
	 * "count" containing the first even numbers from the original array.
	 */
	
	public int[] copyEvens(int[] nums, int count) {
		  int[] arr = new int[count];
		  int counter = 0;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i]%2 == 0 && counter< count)
		    {
		      arr[counter] = nums[i];
		      counter++;
		    }
		  }
		  return arr;
		}
	
	/*
	 * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array 
	 * contains a student's answers, with "?" representing a question left blank. 
	 * The two arrays are not empty and are the same length. Return the score for this 
	 * array of answers, giving +4 for each correct answer, -1 for each incorrect answer, 
	 * and +0 for each blank answer.
	 */
	
	public int scoreUp(String[] key, String[] answers) {
		  int score = 0;
		  for (int i = 0; i<key.length; i++)
		  {
		    if (key[i].equals(answers[i]))
		    {
		      score+=4;
		    }
		    else if (answers[i].equals("?"))
		    {
		      score+=0;
		    }
		    else if (!key[i].equals(answers[i]) && !answers[i].equals("?"))
		    {
		      score-=1;
		    }
		  }
		  return score;
		}
	
	/*
	 * We have an array of heights, representing the altitude along a 
	 * walking trail. Given start/end indexes into the array, return 
	 * the sum of the changes for a walk beginning at the start index and ending 
	 * at the end index.
	 */
	
	public int sumHeights(int[] heights, int start, int end) {
		  int diff = 0;
		  for (int i = start; i<end; i++)
		  {
		    diff+=(Math.abs(heights[i+1]-heights[i]));
		  }
		  return diff;
		}
	
	/*
	 * Given an array of scores, return true if there are scores of 
	 * 100 next to each other in the array.
	 */
	
	public boolean scores100(int[] scores) {
		  for (int i = 0; i<scores.length-1; i++)
		  {
		    if (scores[i] == 100 && scores[i+1] == 100)
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Given an array of strings, return the count of the number of strings with the given length.
	 */
	
	public int wordsCount(String[] words, int len) {
		  int count = 0;
		  for (String str: words)
		  {
		    if (str.length() == len)
		    {
		      count++;
		    }
		  }
		  return count;
		}
	
	/*
	 * Given a positive int n, return true if it contains a 1 digit.
	 */
	
	public boolean hasOne(int n) {
		  String str = ""+n;
		  for (int i = 0; i<str.length(); i++)
		  {
		    if (str.charAt(i) == '1')
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * We'll say that a positive int n is "endy" if it is in the range 
	 * 0..10 or 90..100 (inclusive). Given an array of positive ints, 
	 * return a new array of length "count" containing the first endy 
	 * numbers from the original array.
	 */
	
	public int[] copyEndy(int[] nums, int count) {
		  int[] arr = new int[count];
		  int counter = 0;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100)) && counter<count)
		    {
		      arr[counter] = nums[i];
		      counter++;
		    }
		  }
		  return arr;
		}
	
	/*
	 * Given an array of strings, return a new array without the 
	 * strings that are equal to the target string.
	 */
	
	public String[] wordsWithout(String[] words, String target) {
		  int countNonTargets = 0;
		  for (String str: words)
		  {
		    if (!str.equals(target))
		    {
		      countNonTargets++;
		    }
		  }
		  
		  String[] arr = new String[countNonTargets];
		  int counter = 0;
		  for (int i = 0; i<words.length; i++)
		  {
		    if (!words[i].equals(target))
		    {
		      arr[counter] = words[i];
		      counter++;
		    }
		  }
		  return arr;
		  
		}
	
	/*
	 * We have an array of heights, representing the altitude along 
	 * a walking trail. Given start/end indexes into the array, 
	 * return the sum of the changes for a walk beginning at the start index 
	 * and ending at the end index, however increases in height count double.
	 */
	
	public int sumHeights2(int[] heights, int start, int end) {
		  int count = 0;
		  for (int i = start; i< end; i++)
		  {
		    if (heights[i]<heights[i+1])
		    {
		      count+=2*(heights[i+1]-heights[i]);
		    }
		    else if (heights[i]>=heights[i+1])
		    {
		      count+=Math.abs(heights[i]-heights[i+1]);
		    }
		  }
		  return count;
		}
	
	/*
	 * Given an array of scores sorted in increasing order, return true if 
	 * the array contains 3 adjacent scores that differ from each other by 
	 * at most 2, such as with {3, 4, 5} or {3, 5, 5}.
	 */
	
	public boolean scoresClump(int[] scores) {
		  for (int i = 0; i<scores.length-2; i++)
		  {
		    if (Math.abs(scores[i]-scores[i+1])<=2 && Math.abs(scores[i+1]-scores[i+2])<=2 &&Math.abs(scores[i+2]-scores[i])<=2)
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Given an array of strings, return a new array containing the 
	 * first N strings. N will be in the range 1..length.
	 */
	
	public String[] wordsFront(String[] words, int n) {
		  String[] str = new String[n];
		  for (int i = 0; i<n; i++)
		  {
		    str[i] = words[i];
		  }
		  return str;
		}
	
	/*
	 * Given 2 arrays that are the same length containing strings, 
	 * compare the 1st string in one array to the 1st string in the 
	 * other array, the 2nd to the 2nd and so on. Count the number of times 
	 * that the 2 strings are non-empty and start with the same char.
	 */
	
	public int matchUp(String[] a, String[] b) {
		  int count = 0;
		  for (int i = 0; i<a.length; i++)
		  {
		    if (a[i].length()>0 && b[i].length()>0 && a[i].charAt(0) == b[i].charAt(0))
		    {
		      count++;
		    }
		  }
		  return count;
		}
	
	/*
	 * Given two arrays, A and B, of non-negative int scores. A 
	 * "special" score is one which is a multiple of 10, such as 40 
	 * or 90. Return the sum of largest special score in A and the 
	 * largest special score in B. 
	 */
	
	public int scoresSpecial(int[] a, int[] b) {
		  int max1 = 0;
		  int max2 = 0;
		  for (int i = 0; i<a.length; i++)
		  {
		    if (a[i]%10 == 0 && a[i]>max1)
		    {
		      max1 = a[i];
		    }
		  }
		  for (int i = 0; i<b.length; i++)
		  {
		    if (b[i]%10 == 0 && b[i]>max2)
		    {
		      max2 = b[i];
		    }
		  }
		  return max1+max2;
		}

}
