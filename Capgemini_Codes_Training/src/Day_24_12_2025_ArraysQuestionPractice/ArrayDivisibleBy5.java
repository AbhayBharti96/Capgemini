package Day_24_12_2025_ArraysQuestionPractice;

public class ArrayDivisibleBy5 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,9};
		System.out.print("Elements divisible by 5 Are: ");
		for(int i =0;i<arr.length;i
				++) {
			if(arr[i]==arr[arr.length-1]) {
				arr[arr.length-1]++;
			}
			if(arr[arr.length-1]<9) {
				arr[0]=1;
				arr[1]=0;
			}
		}
		System.out.println(arr[arr.length-1]);

	}

}
