package Day_24_12_2025_ArraysQuestionPractice;

public class AverageofAnEachElement {

	public static void main(String[] args) {
		int arr [] = { 2,2,4,5,6,7,8,9};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			  double avg = (double)sum /(i + 1);
		if(i<arr.length-1) {
			System.out.print(",");
		}
		System.out.printf("%.1f",avg);

	}
	}

}
