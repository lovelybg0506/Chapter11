package part01.sec01.exam02;

public class ArrayVarTest1_01 {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = arr1;	// 여기서 참조하는것이 같아지므로 (1,2,3) 아래 2개의 for문이 같은값을 내뱉음.

		for (int cnt = 0; cnt < arr2.length; cnt++) {
			System.out.println(arr2[cnt]);
		}

		arr2[1] = 7;

		for (int cnt = 0; cnt < arr1.length; cnt++) {
			System.out.println(arr1[cnt]);
		}
		for (int cnt = 0; cnt < arr2.length; cnt++) {
			System.out.println(arr2[cnt]);
		}

	}
}