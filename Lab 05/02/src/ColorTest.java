//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

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



