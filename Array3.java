public class Array3 {
	
	/*
	 * Consider the leftmost and righmost appearances of some value in an array. 
	 * We'll say that the "span" is the number of elements between the two inclusive. 
	 * A single value has a span of 1. Returns the largest span found in the given array.
	 */
	
	public int maxSpan(int[] nums) {
		  
		int span = 0;
		  int prevSpan = 0;
		  int indexStart = 0;
		  int indexEnd = 0;
		  int number = 0;
		  
		  for(int i=0;i<nums.length;i++)
		  {
			  span = 0;
			  number = nums[i];
			  indexStart = i;
		  for(int j=nums.length-1;j>=0;j--)
		  {
		    if(nums[j]==number)
		    {
		      indexEnd = j;
		      span = indexEnd - indexStart + 1;
		      
		      if(span>prevSpan)
		      {
		        prevSpan = span;
		      }
		    }
		  }
		  
		  }
		  
		  return prevSpan;
		}
	
	/*
	 * Given a non-empty array, return true if there is a place to split the array so that the sum of 
	 * the numbers on one side is equal to the sum of the numbers on the other side.
	 */
	
	public boolean canBalance(int[] nums) {
		  int counter = 0;
		  while (counter<nums.length-1) {
		  int sum1 = 0;
		  int sum2 = 0;
		  for (int i = 0; i <= counter; i++)
		  {
		    sum1+=nums[i];
		  }
		  for (int j = counter+1; j < nums.length; j++)
		    {
		      sum2+=nums[j];
		    }
		  if (sum1 == sum2)
		  {
		    return true;
		  }
		  counter++;
		}
		return false;
		}
	
	/*
	 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
	 */
	
	public int addFac(int n) //Helper method
	{
	  int sum = 0;
	  for (int i = 1; i <= n; i++)
	  {
	    sum+=i;
	  }
	  
	  return sum;
	}
	public int[] seriesUp(int n) {
	  int[] arr = new int[addFac(n)];
	  int p = 1;
	  int idx = 0;
	  while (p <= n)
	  {
	    for (int i = 1; i <= p; i++)
	    {
	      arr[idx] = i;
	      idx++;
	    }
	    
	    p++;
	  }
	  
	  return arr;
	}
	
	/*
	 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
	 */
	
	public boolean linearIn(int[] outer, int[] inner) {
		
		  String s = "";
		  boolean flag = true;
		  
		  for(int i=0;i<outer.length;i++)
		  {
		    s = s + outer[i];
		  }
		  
		  for(int j=0;j<inner.length;j++)
		  {
		    if(s.contains(String.valueOf(inner[j])))
		    {
		      flag=true;
		    }
		    
		    else
		    {
		      return false;
		    }
		  }
		  
		  return true;
		}

}
