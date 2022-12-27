//2020112099 송민지

//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		int num1=0;
		int num2=0;

		System.out.printf("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.\n");
		
		System.out.printf("혜미 >> ");
		Scanner sc= new Scanner(System.in);
		String hm = new String(sc.next());
		
		System.out.printf("준범 >> ");
		String jb = new String(sc.next());
		
		
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
	}
	}
}
