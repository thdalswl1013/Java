//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class overloading {
	public static void main(String[] args) {
		
		overloading ol = new overloading();
		
		System.out.printf("정수형: ");
		ol.sum(1, 2);
		System.out.printf("실수형: ");
		ol.sum(2.5, 8);

	}

	public void sum(int a, int b) {
		System.out.println(a+b);	
	}
	
	public void sum(double a, double b) {
		System.out.println(a+b);	
	}
	
	
}
