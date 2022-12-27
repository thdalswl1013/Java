import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.printf("한 점 x를 입력하시오 : ");
		int x = sc.nextInt();

		System.out.printf("한 점 y를 입력하시오 : ");
		int y = sc.nextInt();
		
		if((x>=50) && (x<=100))
		{
			if ((y>=50) && (y<=100))
			{
				System.out.printf("이 점 (x, y)는 이 직사각형 안에 존재합니다.");
			}
			else
				System.out.printf("이 점 (x, y)는 이 직사각형 안에 존재하지 않습니다.");
			
		}
		else
			System.out.printf("이 점 (x, y)는 이 직사각형 안에 존재하지 않습니다.");
	}

}
