package Day_24_12_2025_ArraysQuestionPractice;

public class MergerArrays {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {5, 6, 7};

	        int n1 = arr1.length;
	        int n2 = arr2.length;

	        int[] merged = new int[n1 + n2];

	        // Copy first array
	        for (int i = 0; i < n1; i++) {
	            merged[i] = arr1[i];
	        }

	        // Copy second array
	        for (int i = 0; i < n2; i++) {
	            merged[n1 + i] = arr2[i];
	        }

	        System.out.println("Merged Array:");
	        for (int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i] + " ");
	        }
	    }
	}
