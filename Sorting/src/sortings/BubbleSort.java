package sortings;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {1,5, 65,42,34,20,70};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				
				
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	
	}
	
}
//	static void bubsort(int arr[]) {
//		int n = arr.length;
//		int temp=0;
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<(n-i);j++) {
//				if(arr[j-1] > arr[j]) {
//					temp = arr[j-1];
//					arr[j-1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		//int[] arr= {1,6,7,88,33,82,34};
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			
//		}
//		System.out.println();
//		bubsort(arr);
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//			
//		}
//		
//		
//		
//		
//		
//	}
//


