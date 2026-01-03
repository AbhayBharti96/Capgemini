package Day_24_12_2025_ArraysQuestionPractice;

public class SumOfArrayAndAverage {

	public static void main(String[] args) {
		int arr [] = { 2,2,4,5,6,7,8,9};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum  += arr[i];
		}
		System.out.println("Sum of array is: "+sum);
		System.out.println("Average of array is: "+(sum/arr.length));

	}

}
