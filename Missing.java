package week1.day2;

import java.util.Arrays;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
						
		Arrays.sort (arr);
		for(int i =0; i <= length; i++)
		{
			if(i+1 != arr[i])
			{
				System.out.println(i+1);
				break;
			}
		}
		
	}



}
