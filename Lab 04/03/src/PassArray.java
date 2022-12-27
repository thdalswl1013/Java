//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class PassArray {

	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5},{6,7,8,9}};
		
		printArray2D1(array);
		printArray2D2(array);
	}
	
	public static void printArray2D1(int[][] array)
	{
		for (int row = 0; row < array.length;row++) {
			for (int column=0; column<array[row].length;column++) {
				System.out.printf("%d  ", array[row][column]);
			}
			System.out.println();
		}
	}
	

	public static void printArray2D2(int[][] array)
	{
		for (int arr[] : array) {
			for (int k : arr) {
				System.out.printf("%d  ", k);
			}
			System.out.println();
		}
	}
	
}
