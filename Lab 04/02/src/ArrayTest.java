//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class ArrayTest {

	public static void main(String[] args) {
		//2차원 배열 선언, new 연산자 사용, 4문장
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
