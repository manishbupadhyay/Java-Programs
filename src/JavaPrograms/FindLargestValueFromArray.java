package JavaPrograms;

public class FindLargestValueFromArray {

	public static void main(String[] args) {
		// find the largest value from the given array
		int arr[]= {4,4,17,6,12,91,10,11,94};
		int val=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > val) {
				val=arr[i];
			}
		}
		System.out.println("Largest value in this Array is :" + val);

	}

}
