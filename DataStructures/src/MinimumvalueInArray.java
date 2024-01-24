import java.util.Scanner;

public class MinimumvalueInArray {
	public int findMini(int [] arr) {
		if(arr==null|| arr.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}	
		MinimumvalueInArray mn=new MinimumvalueInArray();
		System.out.println(mn.findMini(a));
		
	}

	public void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		
	}
}
