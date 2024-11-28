package sortings;
public class quicksort {
	public static int  partition(int arr[],int  low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		i++;
		
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]= temp;
		return i;	
	}
	
	public static void Qs(int arr[], int low, int high) {
		if(low<high) {
			int pidx = partition(arr,low,high);
			
			Qs(arr,low,pidx-1);
			Qs(arr,pidx+1,high);
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,56,36,12,60};
		int n = arr.length;
		Qs(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
}