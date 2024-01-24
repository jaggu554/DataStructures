`import java.util.Scanner;

public class ArrayOddIntegers {
	public static int[] removeEven(int[] arr) {
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddCount++;
			}
		}
		int[] result=new int[oddCount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[idx]=arr[i];
				idx++;
			}
		}
		return result;
	}
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a=new int[6];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	ArrayOddIntegers ad=new ArrayOddIntegers();
	int []res=ad.removeEven(a);
	ad.printArray(a);
	ad.printArray(res);
	
}
}
