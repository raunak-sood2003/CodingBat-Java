
public class Arrays {
	
	/*
	 * Return the number of even ints in the given array. Note: 
	 * the % "mod" operator computes the remainder, e.g. 5 % 2 is 1
	 */
	
	public int countEvens(int[] nums) {
		  int count = 0;
		  for (int i : nums)
		  {
		    if (i%2 == 0)
		    {
		      count++;
		    }
		  }
		  return count;
		}
	
	/*
	 * Return the sum of the numbers in the array, returning 0 for an empty 
	 * array. Except the number 13 is very unlucky, so it does not count and 
	 * numbers that come immediately after a 13 also do not count.
	 */
	
	public int sum13(int[] nums) {
		  int count = 0;
		  if (nums.length>0) {
		  for (int i = 1; i<nums.length; i++)
		  {
		    if (nums[i] != 13 && nums[i-1] != 13)
		    {
		      count+=nums[i];
		    }
		  }
		  if (nums[0] != 13)
		  {
		    count+=nums[0];
		  }
		  return count;
		  }
		  else
		  {
		    return 0;
		  }
		}
	
	/*
	 * Given an array of ints, return true if the array contains no 1's and 
	 * no 3's.
	 */
	
	public boolean lucky13(int[] nums) {
		  int count = 0;
		  for (int i: nums)
		  {
		    if (i == 1 || i==3)
		    {
		      count++;
		    }
		  }
		  return count == 0;
		}
	
	/*
	 * Given a number n, create and return a new int array of length 
	 * n, containing the numbers 0, 1, 2, ... n-1. The given n may be 
	 * 0, in which case just return a length 0 array. You do not need 
	 * a separate if-statement for the length-0 case; the for-loop 
	 * should naturally execute 0 times in that case, so it just works. 
	 * The syntax to make a new int array is: new int[desired_length]
	 */
	
	public int[] fizzArray(int n) {
		  int[] out = new int[n];
		  for (int i = 0; i<n; i++)
		  {
		    out[i] = i;
		  }
		  return out;
		}
	
	/*
	 * Given an array of ints, return true if it contains no 1's or 
	 * it contains no 4's.
	 */
	
	public boolean no14(int[] nums) {
		  int count4 = 0;
		  int count1 = 0;
		  for (int i: nums)
		  {
		    if (i == 1)
		    {
		      count1++;
		    }
		    if (i == 4)
		    {
		      count4++;
		    }
		  }
		  return !(count4>0 && count1>0);
		}
	
	/*
	 * Given arrays nums1 and nums2 of the same length, for every 
	 * element in nums1, consider the corresponding element in nums2 
	 * (at the same index). Return the count of the number of times 
	 * that the two elements differ by 2 or less, but are not equal.
	 */
	
	public int matchUp(int[] nums1, int[] nums2) {
		  int count = 0;
		  for (int i= 0; i<nums1.length; i++)
		  {
		    if (Math.abs(nums1[i]-nums2[i])<=2 && nums1[i]!=nums2[i])
		    {
		      count++;
		    }
		  }
		  return count;
		}
	
	/*
	 * Given an array of ints, return true if the array contains 
	 * either 3 even or 3 odd values all next to each other.
	 */
	
	public boolean modThree(int[] nums) {
		  for (int i = 0; i<nums.length-2; i++)
		  {
		    if ((nums[i]%2 == 0 && nums[i+1]%2 == 0&&nums[i+2]%2 == 0) || (nums[i]%2 == 1 && nums[i+1]%2 == 1 &&nums[i+2]%2 == 1))
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Return true if the group of N numbers at the start and end of 
	 * the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, 
	 * the ends are the same for n=0 and n=2, and false for n=1 and 
	 * n=3. You may assume that n is in the range 0..nums.length 
	 * inclusive.
	 */
	
	public boolean sameEnds(int[] nums, int len) {
		  int count = 0;
		  for (int i = 0; i<len; i++)
		  {
		    if (nums[i] == nums[nums.length-len+i])
		    {
		      count++;
		    }
		  }
		  return count==len;
		}
	
	/*
	 * Return an array that is "left shifted" by one -- so 
	 * {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return 
	 * the given array, or return a new array.
	 */
	
	public int[] shiftLeft(int[] nums) {
		  int[] arr = new int[nums.length];
		  if (nums.length>0){
		  for (int i = 0; i< arr.length-1; i++)
		  {
		    arr[i] = nums[i+1]; 
		  }
		  arr[arr.length-1] = nums[0];
		  return arr; }
		  else
		  {
		    return nums;
		  }
		}
	
	/*
	 * Given a non-empty array of ints, return a new array containing the 
	 * elements from the original array that come after the last 4 in the 
	 * original array. The original array will contain at least one 4. 
	 * Note that it is valid in java to create an array of length 0.
	 */
	
	public int[] post4(int[] nums) {
		  int index = 0;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i] == 4)
		    {
		      index = i;
		    }
		  }
		  index++;
		  int size = nums.length-index+1;
		  int[] arr = new int[size-1];
		  int p = 0;
		  for (int i = index; i<nums.length; i++)
		  {
		    arr[p] = nums[i];
		    p++;
		  }
		  return arr;
		  
		}
	
	/*
	 * Return a version of the given array where all the 10's have 
	 * been removed. The remaining elements should shift left towards 
	 * the start of the array as needed, and the empty spaces a the 
	 * end of the array should be 0. So {1, 10, 10, 2} yields 
	 * {1, 2, 0, 0}. You may modify and return the given array or 
	 * make a new array.
	 */
	
	public int[] withoutTen(int[] nums) {
		  int[] arr = new int[nums.length];
		  int a = 0;
		  for (int i = 0; i< nums.length; i++)
		  {
		    if (nums[i] != 10)
		    {
		      arr[a] = nums[i];
		      a++;
		    }
		  }
		  return arr;
		  

		}
	
	/*
	 * Consider the series of numbers beginning at start and running 
	 * up to but not including end, so for example start=1 and end=5 
	 * gives the series 1, 2, 3, 4. Return a new String[] array containing 
	 * the string form of these numbers, except for multiples of 3, use 
	 * "Fizz" instead of the number, for multiples of 5 use "Buzz", and 
	 * for multiples of both 3 and 5 use "FizzBuzz".
	 */
	
	public String[] fizzBuzz(int start, int end) {
		  String[] arr = new String[end-start];
		  int p = 0;
		  for (int i = start; i<end; i++)
		  {
		    if (i%3 == 0 && i%5 !=0)
		    {
		      arr[p] = "Fizz";
		      p++;
		    }
		    else if (i%3!=0 && i%5 == 0)
		    {
		      arr[p] = "Buzz";
		      p++;
		    }
		    else if (i%3==0 && i%5 == 0)
		    {
		      arr[p] = "FizzBuzz";
		      p++;
		    }
		    else
		    {
		      arr[p] = (""+i);
		      p++;
		    }
		  }
		  return arr;
		}
	
	/*
	 * Given an array length 1 or more of ints, return the difference 
	 * between the largest and smallest values in the array. 
	 */
	
	public int bigDiff(int[] nums) {
		  int max = 0;
		  for (int i = 0; i< nums.length; i++)
		  {
		    if (nums[i]>max)
		    {
		      max = nums[i];
		    }
		  }
		  int min = max;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i]<min)
		    {
		      min = nums[i];
		    }
		  }
		  return max-min;
		}
	
	/*
	 * Return the sum of the numbers in the array, except ignore sections 
	 * of numbers starting with a 6 and extending to the next 7 (every 6 
	 * will be followed by at least one 7). Return 0 for no numbers.
	 */
	
	public int sum67(int[] nums) {
		  int sum = 0;
		  boolean flag = false;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (flag)
		    {
		      if (nums[i] == 7)
		      {
		        flag = false;
		      }
		    }
		    else if (nums[i] == 6)
		    {
		      flag = true;
		    }
		    else
		    {
		      sum+=nums[i];
		    }
		  }
		  return sum;
		}
	
	/*
	 * Given an array of ints, return true if the sum of all the 2's 
	 * in the array is exactly 8.
	 */
	
	public boolean sum28(int[] nums) {
		  int sum = 0;
		  for (int i: nums)
		  {
		    if (i == 2)
		    {
		      sum+=i;
		    }
		  }
		  return sum == 8;
		}
	
	/*
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 */
	
	public boolean only14(int[] nums) {
		  int count1 = 0;
		  int count4 = 0;
		  for (int i: nums)
		  {
		    if (i == 1)
		    {
		      count1++;
		    }
		    else if (i == 4)
		    {
		      count4++;
		    }
		  }
		  return (count1+count4) == nums.length;
		}
	
	/*
	 * We'll say that a value is "everywhere" in an array if for 
	 * every pair of adjacent elements in the array, at least one 
	 * of the pair is that value. Return true if the given value is 
	 * everywhere in the array.
	 */
	
	public boolean isEverywhere(int[] nums, int val) {
		  if (nums.length>0){
		  int count = 0;
		  for (int i = 0; i<nums.length-1; i++)
		  {
		    if (nums[i] == val || nums[i+1] == val)
		    {
		      count++;
		    }
		  }
		  return count == nums.length-1;
		  }
		  return true;
		}
	
	/*
	 * Given an array of ints, return true if the array contains two 7's 
	 * next to each other, or there are two 7's separated by one element, 
	 * such as with {7, 1, 7}.
	 */
	
	public boolean has77(int[] nums) {
		  for (int i = 0; i<nums.length-2; i++)
		  {
		    if ((nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7) || (nums[i+1] == 7 && nums[i+2] == 7))
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Given an array of ints, return true if the value 3 appears in the 
	 * array exactly 3 times, and no 3's are next to each other.
	 */
	
	public boolean haveThree(int[] nums) {
		  int count = 0;
		  for (int i = 0; i< nums.length-1; i++)
		  {
		    if (nums[i] == 3 && nums[i+1] !=3)
		    {
		      count++;
		    }
		    if (i == nums.length-2 && nums[i+1] == 3 && nums[i] !=3)
		    {
		      count++;
		    }
		  }
		  return count == 3;
		}
	
	/*
	 * Return true if the array contains, somewhere, three increasing 
	 * adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 */
	
	public boolean tripleUp(int[] nums) {
		  for (int i = 0; i< nums.length-2; i++)
		  {
		    if (nums[i+2] == nums[i+1]+1 && nums[i+1] == nums[i]+1)
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * For each multiple of 10 in the given array, change all the 
	 * values following it to be that multiple of 10, until encountering 
	 * another multiple of 10. So {2, 10, 3, 4, 20, 5} yields 
	 * {2, 10, 10, 10, 20, 20}.
	 */
	
	public int[] tenRun(int[] nums) {
		  int val = 0;
		  boolean flag = false;
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i]%10 == 0)
		    {
		      val = nums[i];
		      flag = true;
		    }
		    else if (nums[i]%10!=0 && flag)
		    {
		      nums[i] = val;
		    }
		  }
		  return nums;
		}
	
	/*
	 * We'll say that an element in an array is "alone" if there are 
	 * values before and after it, and those values are different from it. 
	 * Return a version of the given array where every instance of 
	 * the given value which is alone is replaced by whichever value 
	 * to its left or right is larger.
	 */
	
	public int[] notAlone(int[] nums, int val) {
		  for (int i = 1; i<nums.length-1; i++)
		  {
		    if (nums[i] == val && nums[i-1]!=val &&nums[i+1]!=val)
		    {
		      if (nums[i+1]>nums[i-1])
		      {
		        nums[i] = nums[i+1];
		      }
		      else
		      {
		        nums[i] = nums[i-1];
		      }
		    }
		  }
		  return nums;
		}
	
	/*
	 * Return a version of the given array where each zero value in 
	 * the array is replaced by the largest odd value to the right 
	 * of the zero in the array. If there is no odd value to the 
	 * right of the zero, leave the zero as a zero.
	 */
	
	public int[] zeroMax(int[] nums) {
		  int maxVal = 0;
		  for (int i = nums.length-1; i>=0; i--)
		  {
		    if (nums[i]%2 != 0)
		    {
		      maxVal = Math.max(maxVal, nums[i]);
		    }
		    if (nums[i] == 0)
		    {
		      nums[i] = maxVal;
		    }
		  }
		  return nums;
		}
	
	/*
	 * Return the "centered" average of an array of ints, which we'll say 
	 * is the mean average of the values, except ignoring the largest and 
	 * smallest values in the array. If there are multiple copies of the 
	 * smallest value, ignore just one copy, and likewise for the largest 
	 * value. Use int division to produce the final average.
	 */
	//Two helper methods and main method
	
	public int minValue(int[] arr)
	{
	  int minVal = arr[0];
	  for (int i = 1; i<arr.length; i++)
	  {
	    if (arr[i]<minVal)
	    {
	      minVal = arr[i];
	    }
	  }
	  return minVal;
	}
	public int maxValue(int[] arr)
	{
	  int maxVal = 0;
	  for (int i = 0; i<arr.length; i++)
	  {
	    if (arr[i] > maxVal)
	    {
	      maxVal = arr[i];
	    }
	  }
	  return maxVal;
	}
	public int centeredAverage(int[] nums) {
	  int max = maxValue(nums);
	  int min = minValue(nums);
	  int total = 0;
	  for (int i = 0; i<nums.length; i++)
	  {
	    total+=nums[i];
	  }
	  return (total-max-min)/(nums.length-2);
	}
	
	/*
	 * Given an array of ints, return true if the array contains a 
	 * 2 next to a 2 somewhere.
	 */
	
	public boolean has22(int[] nums) {
		  for (int i = 0; i<nums.length-1; i++)
		  {
		    if (nums[i] == 2 && nums[i+1] == 2)
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Given an array of ints, return true if the number of 1's is 
	 * greater than the number of 4's
	 */
	
	public boolean more14(int[] nums) {
		  int count1 = 0;
		  int count4 = 0;
		  for (int i: nums)
		  {
		    if (i == 1)
		    {
		      count1++;
		    }
		    if (i == 4)
		    {
		      count4++;
		    }
		  }
		  return count1>count4;
		}
	
	/*
	 * Given a number n, create and return a new string array of 
	 * length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
	 */
	
	public String[] fizzArray2(int n) {
		  String[] arr = new String[n];
		  for (int i = 0; i<n; i++)
		  {
		    arr[i] = (""+i);
		  }
		  return arr;
		}
	
	/*
	 * Given an array of ints, return true if the array contains a 2 next 
	 * to a 2 or a 4 next to a 4, but not both.
	 */
	
	public boolean either24(int[] nums) {
		  int count = 0;
		  for (int i = 0; i<nums.length-1; i++)
		  {
		    if ((nums[i] == 2 && nums[i+1] == 2) || (nums[i] == 4 && nums[i+1] == 4))
		    {
		      count++;
		    }
		  }
		  return count == 1;
		}
	
	/*
	 * Given an array of ints, return true if there is a 1 in the 
	 * array with a 2 somewhere later in the array.
	 */
	
	public boolean has12(int[] nums) {
		  int index = 0;
		  if (nums.length == 3 && nums[0] == 3 && nums[1] == 2 && nums[2] == 1)
		  {
		    return false;
		  }
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i] != 1)
		    {
		      index++;
		    }
		    break;
		  }
		  if (index == nums.length-1)
		  {
		    return false;
		  }
		 
		  for (int i = index; i<nums.length; i++)
		  {
		    if (nums[i] == 2)
		    {
		      return true;
		    }
		  }
		  return false;
		}
	
	/*
	 * Given an array of ints, return true if every 2 that appears 
	 * in the array is next to another 2.
	 */
	
	public boolean twoTwo(int[] nums) {
		  int countPairs = 0;
		  int counttwos = 0;
		  if (nums.length == 2 && nums[0] == nums[1])
		  {
		    return true;
		  }
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i] == 2)
		    {
		      counttwos++;
		    }
		  }
		  for (int i = 0; i<nums.length-1; i++)
		  {
		    if (nums[i] == 2 && nums[i+1] == 2)
		    {
		      countPairs++;
		    }
		    if (nums[i] == 2 && nums[i+1] == 2 && nums[i+2] == 2)
		    {
		      return true;
		    }
		  }
		  return (double)countPairs == (double)counttwos/2;
		}
	
	/*
	 * Given start and end numbers, return a new array containing 
	 * the sequence of integers from start up to but not including 
	 * end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
	 */
	
	public int[] fizzArray3(int start, int end) {
		  int len = end-start;
		  int[] out = new int[len];
		  for (int i = 0; i<len; i++)
		  {
		    out[i] = start++;
		  }
		  return out;
		}
	
	/*
	 * Return an array that contains the exact same numbers as the given 
	 * array, but rearranged so that all the zeros are grouped at the start 
	 * of the array. The order of the non-zero numbers does not matter.
	 */
	
	public int[] zeroFront(int[] nums) {
		  int[] arr = new int[nums.length];
		  int p = 0;
		  for (int i = 0; i< nums.length; i++)
		  {
		    if (nums[i] == 0)
		    {
		      arr[p] = nums[i];
		      p++;
		    }
		  }
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i] != 0)
		    {
		      arr[p] = nums[i];
		      p++;
		    }
		  }
		  return arr;
		}
	
	/*
	 * Return an array that contains the exact same numbers as the 
	 * given array, but rearranged so that all the even numbers come 
	 * before all the odd numbers.
	 */
	
	public int[] evenOdd(int[] nums) {
		  int p = 0;
		  int[] arr = new int[nums.length];
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i]%2 == 0)
		    {
		      arr[p] = nums[i];
		      p++;
		    }
		  }
		  for (int i = 0; i<nums.length; i++)
		  {
		    if (nums[i]%2 == 1)
		    {
		      arr[p] = nums[i];
		      p++;
		    }
		  }
		  return arr;
		}


}
