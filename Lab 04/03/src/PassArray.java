//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

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
