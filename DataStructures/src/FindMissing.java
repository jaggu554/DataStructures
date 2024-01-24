
public class FindMissing {
	public static int findMissingNumber(int a[]) {
		int n=a.length+1;
		int sum=n*(n+1)/2;
		for(int num:a) {
			sum=sum-num;
		}
		return sum;
	}
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6};
	System.out.println(findMissingNumber(arr));
}
}
