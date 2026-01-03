package Day_24_12_2025_ArraysQuestionPractice;

public class PrimeArray {
	    // Method to check prime number
	    static boolean isPrime(int num) {

	        if (num <= 1)
	            return false;

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0)
	                return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        int[] arr = {2, 4, 5, 10, 13, 15, 17, 20};

	        System.out.println("Prime elements in the array are:");

	        for (int i = 0; i < arr.length; i++) {
	            if (isPrime(arr[i])) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}
