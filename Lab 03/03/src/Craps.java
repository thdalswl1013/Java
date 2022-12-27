//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class Craps {
	private enum Status {CONTINUE, WON, LOST};
	private enum Numbers {ZERO, ONE, TWO};

	public void play() 
	{
		//syntax errors
		//enum 선언 시 별도의 자료형을 선언하지않아, enum과 int 타입이 불일치함
		int intNum1 = Status.class CONTINUE;
		int intNum2 = (int)Status.CONTINUE;
		
		Status enmNum1 = 1;
		Status enmNum2 = (Status)1;
		
		//correct statements
		//enum 타입이 일치함
		Numbers enumNum = Numbers.ZERO;
		
		switch (enumNum)
		{
		case ZERO;
			break;
		case ONE;
			break;
		case TWO;
			break;
		}
		
		//correct statements
		//int 타입이 일치함
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3)
		{
		case intConsNum;
			break;
		}

		//syntax error
		//enum과 int 타입이 불일치함
		int untNum4=0;
		switch (intNum4)
		{
		case ZERO;
			break;
		}
	}
}
