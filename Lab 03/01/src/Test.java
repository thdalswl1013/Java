//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class Test {
	
	private static int num1;
	private int num2;

	public static void show1() 
	{
		System.out.println(num1);//1(o) : num1은 static필드라서 사용가능하다.
		System.out.println(num2);//2(x) : static메소드에 static필드가 아닌 num2를 사용할 수 없다.
		show4();//3(o) : static 메소드는 같은 클래스 내에 static메소드는 사용 가능하다.
		show5();//4(x) : static 메소드는 같은 클래스 내에 static을 제외한 메소드는 사용할 수 없다.
	}
	
	public void show2()
	{
		System.out.println(num1);//5(o) : non-static메소드라서 모든 필드를 사용할 수 있다.
		System.out.println(num2);//6(o) : non-static메소드라서 모든 필드를 사용할 수 있다.
		show4();//7(o) : non-static메소드라서 모든 메소를 사용할 수 있다.
		show5();//8(o) : non-static메소드라서 모든 메소를 사용할 수 있다.
	}
	
	public static void show4() {	
	}
	
	public void show5() {	
	}

}
	
