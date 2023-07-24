package L3Q1;
import java.util.*;
public class Smallest {
public static void main(String[]args) {
	
	try (Scanner in = new Scanner(System.in)) {
		int i,temp;
		
		//Input part:
		System.out.print("Enter the size of array: ");
		int size = in.nextInt();
		int array[]=new int[size];
		System.out.print("Enter the elements of array: ");
		for(i=0;i<size;i++) {
			array[i]=in.nextInt();
		}
		
		//Question's solution part:
		temp=array[0];
		for(i=0;i<array.length;i++) {
			if(array[i]<temp) {
				temp=array[i];
			}
		}
		System.out.print(temp+" is the smallest.");
	}
	
}
}