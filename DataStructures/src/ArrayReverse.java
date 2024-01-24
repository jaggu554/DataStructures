import java.util.Scanner;

public class ArrayReverse {
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void reverse(int [] arr,int start ,int end) {
		while(start<end) {
			int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			
			 start++;
			 end--;
		}
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] myArray=new int[n];
		for(int i=0;i<n;i++) {
			myArray[i]=in.nextInt();
		}
		ArrayReverse ar=new ArrayReverse();
		ar.reverse(myArray, 0, n-1);
		ar.printArray(myArray);
	}

}
