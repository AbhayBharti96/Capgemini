package Day_24_12_2025_ArraysQuestionPractice;

public class SumOfOddAndEvenElements {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,9,10};
		int se = 0;
		int so = 0;
		int n = arr.length;
		//h
		for(int i=0;i<n;i++) {
			
			if(arr[i]%2==0) {
				se += arr[i];
				System.out.println("Even: "+arr[i]+" ");
			}else {
				so += arr[i];
				System.out.println("Odd: "+arr[i]+" ");
			}
			
		}
		System.out.println("Sum of Even Element: "+se);
		System.out.println("Sum of Odd Elements: "+so);

	}

}
