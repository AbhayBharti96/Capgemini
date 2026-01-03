package Day_24_12_2025_ArraysQuestionPractice;

public class ReverseEachElement {
	    // Method to reverse a number
	    static int reverse(int num) {
	        int rev = 0;

	        while (num != 0) {
	            int r = num % 10;
	            rev = rev * 10 + r;
	            num /= 10;
	        }
	        return rev;
	    }

	    public static void main(String[] args) {

	        int[] arr = {123, 450, 67, 89};

	        System.out.println("Array after reversing each element:");

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = reverse(arr[i]);
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
