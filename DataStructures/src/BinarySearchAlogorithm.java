import java.util.Scanner;
//the array must sorted to use binarysearch alogarithm
public class BinarySearchAlogorithm {
	public int binarySearch(int arr[], int x, int low, int high) {
		/*this iterative method
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				high = mid - 1;
			}else {
				low =mid+1;
			}
			
		}
		return -1;
		*/
		//this can be sovled by recursive method
		if(high>=low) {
			int mid=(low+high)/2;
		
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[mid]>x) {
			return binarySearch(arr,x,0,mid-1);
		}else {
			
		return binarySearch(arr,x,mid+1,high);
		}
		
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//length of the array 
		int n=in.nextInt();
		System.out.println("Enter the x value ");
		int x=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		BinarySearchAlogorithm b=new BinarySearchAlogorithm();
		int result=b.binarySearch(a, x, 0, n-1);
		if(result==-1) {
			System.out.println("Search element is not found");
		}else {
			System.out.println(result);
		}
	}
}
