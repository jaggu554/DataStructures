
public class MergeSort {
	public void merge(int arr[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r-q;   // r is the length of the array
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			a1[i] = arr[p + i];
		}
		for (int j = 0; j < n2; j++) {
			a2[j] = arr[q +  j+1];
		}
		int i = 0;
		int j = 0;
		int k = p;
		while (i < n1 && j < n2) {
			if (a1[i] <= a2[j]) {
				arr[k] = a1[i];
				i++;
			} else {
				arr[k] = a2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = a1[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = a2[j];
			j++;
			k++;
		}
	}

	void mergeSort(int arr[], int l, int r) {
		int m = (l + r) / 2;
		if (l < r) {
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}

	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 6, 7 };
		MergeSort ob = new MergeSort();
		ob.mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
		printArray(arr);

	}

}
