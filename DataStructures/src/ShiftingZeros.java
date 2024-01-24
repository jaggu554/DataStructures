
public class ShiftingZeros {
	public void moveZeros(int[] arr,int n) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {1,0,2,0,5};
		ShiftingZeros sz=new ShiftingZeros();
		sz.printArray(arr);
		sz.moveZeros(arr, arr.length);
		sz.printArray(arr);
	}

}
