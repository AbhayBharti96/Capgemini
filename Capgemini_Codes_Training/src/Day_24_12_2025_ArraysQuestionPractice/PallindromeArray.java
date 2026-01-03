package Day_24_12_2025_ArraysQuestionPractice;

class PallindromeArray {
	    // Method to check palindrome number
	    static boolean isPalindrome(int num) {
	        int temp = num;
	        int rev = 0;

	        while (temp != 0) {
	            int r = temp % 10;
	            rev = rev * 10 + r;
	            temp /= 10;
	        }

	        return rev == num;
	    }

	    public static void main(String[] args) {

	        int[] arr = {121, 234, 343, 567, 11, 98};

	        System.out.println("Palindrome elements in the array are:");

	        for (int i = 0; i < arr.length; i++) {
	            if (isPalindrome(arr[i])) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}
