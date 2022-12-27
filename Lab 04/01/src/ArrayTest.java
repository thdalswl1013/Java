//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		System.out.printf("sumArray1D1: %d, sumArray1D2: %d\n", sumArray1D1(array), sumArray1D2(array));
	}
	public static int sumArray1D1(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < 4; i++)
		{
			sum += array[i];
		}
		return sum;
	}
		
	public static int sumArray1D2(int[] array)
	{
		int sum = 0;
		for (int i : array)
		{
			sum += i;
		}
		return sum;
	}
		
		
		
	}

