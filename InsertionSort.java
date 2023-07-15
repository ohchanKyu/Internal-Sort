package internalSort;

import java.util.*;

public class InsertionSort {

	public static void insertionSort(int data[]) {
		int key,j,i;
		for(i=1;i<data.length;i++) {
			key = data[i];
			for(j=i-1;j>=0 && data[j] > key;j--) {
				data[j+1] = data[j];
			}
			data[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int data[] = {8,5,6,2,4,1,7,9,10,3};
		insertionSort(data);
		System.out.println("After Sort");
		for(int num:data) {
			System.out.print(num+" ");
		}
	}

}
