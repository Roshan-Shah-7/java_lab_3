package L3Q2;
import java.util.*;
public class Sum_Of_Elements {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the size of array: ");
			int size = in.nextInt();
			int i, sum = 0;
			int array[]=new int [size];
			System.out.println("Enter the elements: ");
			for(i=0;i<size;i++) {
				array[i]=in.nextInt();
			}
			
			
			//Ouestion Solution
			
			for(i=0;i<size;i++) {
				sum=sum+array[i];
			}
			System.out.print("Sum of elements of array= "+sum);
		}

	}

}
