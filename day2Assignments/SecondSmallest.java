package week1.day2Assignments;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int n=4;
		int[] arr= {23,45,67,32,89,22};
		Arrays.sort(arr);
		System.out.println("The "+n+" smallest number is "+arr[n-1]);
	}

}
