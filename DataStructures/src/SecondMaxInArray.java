
public class SecondMaxInArray {
	public int findSecond(int[] arr){
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			secondMax=max;
			max=arr[i];
		}else if(arr[i]>secondMax && arr[i]!=max) {
			secondMax=arr[i];
		}
	}
	return secondMax;
	}
	public static void main(String[] args) {
		SecondMaxInArray sa=new SecondMaxInArray();
		int arr[]={12,34,2,34,33,1};
		int res=sa.findSecond(arr);
		System.out.println(res);
	}

}
