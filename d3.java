package Ds;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
//finding maximum number in an array.

class d3{
	public static void  main(String[] args) {
		
		System.out.print("please enter the values:");
		Scanner hello = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=hello.nextInt();
		}
		
		int max=arr[0];
		for(int j=0;j<5;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
			
			
		}
		
		System.out.println(max);
		System.out.println(Arrays.toString(arr));
		
	}

	
}