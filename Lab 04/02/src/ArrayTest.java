//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

public class ArrayTest {

	public static void main(String[] args) {
		//2���� �迭 ����, new ������ ���, 4����
		int intArray[][] = new int[3][];
		intArray[0] = new int[2];
		intArray[1] = new int[1];
		intArray[2] = new int[3];
		
		
		for (int i=0;i<intArray.length;i++)
			for (int j=0; j<intArray[i].length;j++)
			{
				intArray[i][j] = 1;
			}
				
		
		for (int[] i : intArray) {
			for (int j : i)
			{
				System.out.printf("%d", j);
			}
			System.out.println();	
	}
}
}
