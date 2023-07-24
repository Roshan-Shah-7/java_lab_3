package L3Q3;
import java.util.*;
public class Decending_Order {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int size,i,j,temp=0;
			System.out.print("Enter the size of array: ");
			size = in.nextInt();
			int array[] = new int[size];
			System.out.println("Enter the elements for array:");
			for(i=0;i<size;i++) {
				array[i] = in.nextInt();
			}
			
			//Question Solution:
			for(i=0;i<size;i++) {
				for(j=i+1;j<size;j++) {
					if(array[i]<array[j]) {
						 temp = array[i];
						 array[i]=array[j];
						 array[j]=temp;
					}
				}
			}
			System.out.println("Elements of array in decending order: ");
			for(i=0;i<size;i++) {
				System.out.print(array[i]);
				System.out.print("\n");
			}
		}

	}

}
