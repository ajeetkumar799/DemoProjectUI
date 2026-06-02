package programs;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 10, 25, 3, 99, 45, 67, 100 };

		// Assume first element is the largest
		int largest = arr[0];

		// Loop through the array
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i]; // update if current element is bigger
			}
		}

		System.out.println("Largest number in the array is: " + largest);
	}
}
