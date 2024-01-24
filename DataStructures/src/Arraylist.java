
public class Arraylist {
	public void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrayDemo() {
		int [] myArray=new int[5];
		myArray[0]=12;
		myArray[1]=24;
		myArray[3]=25;
		myArray[2]=4;
		myArray[4]=54;
		myArray[2]=40;
		printArray(myArray);
	}
	public int[] resize(int[] a,int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
		return a;
	}
	public static void main(String[] args) {
		Arraylist al=new Arraylist();
		al.arrayDemo();
		int original[]=new int[] {5,1,2,9,10};
		System.out.println("the size of the original array "+original.length);
		original=al.resize(original, 10);
		System.out.println("the size of the original array "+original.length);
		
	}

}
