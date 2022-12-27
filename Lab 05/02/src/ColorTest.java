//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.EnumSet;

public class ColorTest {
	public enum MyColor {	
		WHITE("Nina"),
		BLACK("Yuna"),
		YELLOW("Sumi"),	
		RED("Mimi");

		private final String name;

		MyColor(String name)
		{
			this.name=name;
		}

		public String get() {
			return name;
		}
	}
	public static void main(String[] args) {
		
		for(MyColor i: MyColor.values()) {
			System.out.printf("%s-%s\n",i,i.get());
		}
		
		System.out.println();
		
		for(MyColor i: EnumSet.range(MyColor.BLACK, MyColor.YELLOW)) {
			System.out.printf("%s-%s\n",i,i.get());
		}	
		
		
		
		}


	}



