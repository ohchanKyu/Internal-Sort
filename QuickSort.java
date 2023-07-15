package internalSort;

public class QuickSort {

	public static void swap(int data[],int m,int n) {
		int tmp = data[m];
		data[m] = data[n];
		data[n] = tmp;
	}
	
	public static void quickSort(int data[],int start,int end) {
		
		if(start < end) {
			int pivot = data[start];
			int low = start;
			int high = end+1;
			while(low<high) {
				do {
					low++;
				}while(low < end && data[low] < pivot);
				do {
					high--;
				}while(high > start && data[high] > pivot);
				if(low<high) {
					swap(data,low,high);
				}
			}
			swap(data,start,high);
			quickSort(data,start,high-1);
			quickSort(data,high+1,end);
		}
	}
	
	public static void main(String[] args) {
		int data[] = {8,5,6,2,4,1,7,9,10,3,15,87,100,500,87,79,65,44,88,501,999,888};
		quickSort(data,0,data.length-1);
		System.out.println("After Sort");
		for(int num:data) {
			System.out.print(num+" ");
		}
	}

}
