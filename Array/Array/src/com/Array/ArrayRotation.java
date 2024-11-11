package com.Array;

public class ArrayRotation {
	public static void rotateRight(int[] arr, int k) {
		int n = arr.length; 
		k = k % n;
	    reverse(arr, 0, n - 1);
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	}
	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
	}

}
	public static void main(String[] args) { 
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3; 
	    System.out.println("Original array:"); 
	    for (int i : arr) { 
	    	System.out.print(i + " ");
	    }
	    rotateRight(arr, k); 
	    System.out.println("\nArray after rotation by " + k + " positions:");
	    for (int i : arr) { System.out.print(i + " "); 
	    }
	    }
	}

	
