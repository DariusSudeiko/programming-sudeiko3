package ua.khpi.oop.darius.shapes;

public class bubbleSort {
	public static void sort(double arr[], int n) {

		if (n == 1) // passes are done
		{
			return;
		}

		for (int i = 0; i < n - 1; i++) // iteration through unsorted elements
		{
			if (arr[i] > arr[i + 1]) // check if the elements are in order
			{ // if not, swap them
				double temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

	}
}