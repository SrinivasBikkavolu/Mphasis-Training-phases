package assisted.practice.project31;

  //    As a developer, you are given a project to find out the longest increasing subsequence.

import java.util.Arrays;

public class LongestIncreasingSubSequence31 
{
	public int LengthOfLIS(int[] nums) 
	{
	    if(nums==null || nums.length==0)
	        return 0;
	 
	    int[] max = new int[nums.length];
	    Arrays.fill(max, 1);
	 
	    int result = 1;
	    for(int i=0; i<nums.length; i++)
	    {
	        for(int j=0; j<i; j++)
	        {
	            if(nums[i]>nums[j])
	            {
	                max[i]= Math.max(max[i], max[j]+1);
	 
	            }
	        }
	        result = Math.max(max[i], result);
	    }
	 
	   return result;
	}

	public static void main(String[] args) 
	{
		LongestIncreasingSubSequence31 object = new LongestIncreasingSubSequence31();
		int[] Array = {2,6,5,3,6,7,8,1,9,};
		System.out.println(object.LengthOfLIS(Array));
		
	}

}
