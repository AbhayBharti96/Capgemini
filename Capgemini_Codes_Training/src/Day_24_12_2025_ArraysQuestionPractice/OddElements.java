package Day_24_12_2025_ArraysQuestionPractice;

public class OddElements {

	public static void main(String[] args) {
		int arr [] = { 2,2,4,5,6,7,8,9};
		int sum =0;
		System.out.print("Odd Elements are:  ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum +=arr[i];
			System.out.print(arr[i]+" ");
		}
		}
		System.out.println();
			System.out.println("Sum of Odd elements are: "+sum);


	}

	}


