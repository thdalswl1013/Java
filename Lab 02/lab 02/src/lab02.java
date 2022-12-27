//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;
public class lab02 {
		static void q1()
		{
			int num1=0;
			int num2=0;
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.printf("\n가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.\n");
				System.out.printf("혜미 >> ");
				String hm = new String(sc.next());
				if(hm.equals("exit")) {
					break;
				}
				System.out.printf("준범 >> ");
				String jb = new String(sc.next());
				if (jb.equals("exit")) {
					break;
				}
			
				if (hm.equals("가위")) {
					num1=0;
					}
				else if (hm.equals("바위")) {
					num1=1;
					}
				else if (hm.equals("보")) {
					num1=2;
					}
			
				if (jb.equals("가위")) {
					num2=0;
					}
				else if (jb.equals("바위")) {
					num2=1;
					}
				else if (jb.equals("보")) {
					num2=2;
				}
			
				//int result = (num1-num2+3)%3;
				int result = (num1-num2 + 3) % 3;
				switch(result) {
					case 0:
						System.out.printf("무승부입니다.");
						break;
					case 1:
						System.out.printf("혜미가 이겼습니다.");
						break;
					case 2:
						System.out.printf("혜미가 졌습니다.");
						break;
				}//switch close
			}//while close
			sc.close();
		}
		
		static void q2()
		{
			int num=0;
			int max=0;
			int min=999;
			//num = sc.nextInt();
			
			while(num!=-1) {
				
				System.out.printf("Enter Integer : ");
				Scanner sc= new Scanner(System.in);
				num = sc.nextInt();

				if (num==-1)
					break;
				
				if (max<num)
					max=num;
				if (min>num)
					min=num;	
				//num = sc.nextInt();
			}
			if(num==-1) {
				System.out.printf("Smallest Integer is : %d\n", min);
				System.out.printf("Largest Integer is: %d\n", max);
			}
		}
		
		static void q3()
		{

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
		
		static void q4()
		{
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
		
	public static void main(String[] args)
	{

	//q1();
	//q2();
	//q3();
	q4();
	}
}
