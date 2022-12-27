import java.util.Scanner;

public class rectangle2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.printf("한 점 x1를 입력하시오 : ");
		int x1 = sc.nextInt();

		System.out.printf("한 점 y1를 입력하시오 : ");
		int y1 = sc.nextInt();
		
		System.out.printf("한 점 x2를 입력하시오 : ");
		int x2 = sc.nextInt();

		System.out.printf("한 점 y2를 입력하시오 : ");
		int y2 = sc.nextInt();
		
		
		if(((x1<50) && (x2>100))&&((y1<50)&&(y2<50)) ||
				((x1<50) && (x2>100))&&((y1>100)&&(y2>100))||
				((x1<50) && (x2<50))&&((y1<50)&&(y2>100))||
				((x1>100) && (x2>100))&&((y1<50)&&(y2>100))||
				((x1<50) && (x2<50))&&((y1<50)&&(y2<50))||
				((x1>100) && (x2>100))&&((y1>100)&&(y2>100)))
		{
			System.out.printf("두 직사각형은 서로 겹치지않는다.\n");
			
		}else
			System.out.printf("두 직사각형은 서로 겹친다.\n");

	}

}
