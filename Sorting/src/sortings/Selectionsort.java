package sortings;

public class Selectionsort {
	public static void main(String[] args) {
		int[] arr= {67,7,23,13,5,90};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int min_idx=i;
			for(int j=i+1;j<n-1;j++) {
				if(arr[min_idx] > arr[j]) {
					min_idx=j;
				}
				
				
			}
			int temp =	arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
			
			
	}

}
