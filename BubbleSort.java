package internalSort;

public class BubbleSort {

	public static void bubbleSort(int data[]) {
		
		for(int i=data.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int data[] = {8,5,6,2,4,1,7,9,10,3};
		bubbleSort(data);
		System.out.println("After Sort");
		for(int num:data) {
			System.out.print(num+" ");
		}
	}

}
