//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

public class Craps {
	private enum Status {CONTINUE, WON, LOST};
	private enum Numbers {ZERO, ONE, TWO};

	public void play() 
	{
		//syntax errors
		//enum ���� �� ������ �ڷ����� ���������ʾ�, enum�� int Ÿ���� ����ġ��
		int intNum1 = Status.class CONTINUE;
		int intNum2 = (int)Status.CONTINUE;
		
		Status enmNum1 = 1;
		Status enmNum2 = (Status)1;
		
		//correct statements
		//enum Ÿ���� ��ġ��
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
		//int Ÿ���� ��ġ��
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3)
		{
		case intConsNum;
			break;
		}

		//syntax error
		//enum�� int Ÿ���� ����ġ��
		int untNum4=0;
		switch (intNum4)
		{
		case ZERO;
			break;
		}
	}
}
