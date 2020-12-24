package skillrary;
/*
 * Given 2 int arrays, a and b, return a new array length 2 containing, 
 * as much as will fit, the elements from a followed by the elements from b. 
 * The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
public class Make2 {
	public static void main(String[] args) {
		int[] a= {};
		int[] b= {1, 2, 3};
		int[] arr = make2(a, b);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static int[] make2(int[] a,int[] b) {
		int[] arr=null;
		if(a.length==2) {
			return a;
		}else if(a.length==0) {
			arr=new int[2];
			for(int i=0;i<2;i++) {
				arr[i]=b[i];
			}
		}else if(a.length==1) {
			arr=new int[2];
			arr[0]=a[0];
			arr[1]=b[0];
		}
		return arr;
		
	}

}