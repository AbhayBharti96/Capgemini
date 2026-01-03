package Day_24_12_2025_ArraysQuestionPractice;

public class OddIndex {

	public static void main(String[] args) {
		int arr [] = { 2,2,4,5,6,7,8,9};
		System.out.print("Odd index element are:  ");
		for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}


	}

}
