package Day_24_12_2025_ArraysQuestionPractice;

public class ArmStrongArray {
	    // Method to check Armstrong number
	    static boolean isArmstrong(int num) {
	        int temp = num, sum = 0;
	        int digits = 0;

	        // Count digits
	        while (temp != 0) {
	            digits++;
	            temp /= 10;
	        }

	        temp = num;
	        // Calculate Armstrong sum
	        while (temp != 0) {
	            int r = temp % 10;
	            sum += Math.pow(r, digits);
	            temp /= 10;
	        }

	        return sum == num;
	    }

	    public static void main(String[] args) {

	        int[] arr = {153, 10, 371, 25, 407, 100};

	        System.out.println("Armstrong elements in the array are:");

	        for (int i = 0; i < arr.length; i++) {
	            if (isArmstrong(arr[i])) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}
