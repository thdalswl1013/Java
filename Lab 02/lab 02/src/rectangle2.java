import java.util.Scanner;

public class rectangle2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.printf("�� �� x1�� �Է��Ͻÿ� : ");
		int x1 = sc.nextInt();

		System.out.printf("�� �� y1�� �Է��Ͻÿ� : ");
		int y1 = sc.nextInt();
		
		System.out.printf("�� �� x2�� �Է��Ͻÿ� : ");
		int x2 = sc.nextInt();

		System.out.printf("�� �� y2�� �Է��Ͻÿ� : ");
		int y2 = sc.nextInt();
		
		
		if(((x1<50) && (x2>100))&&((y1<50)&&(y2<50)) ||
				((x1<50) && (x2>100))&&((y1>100)&&(y2>100))||
				((x1<50) && (x2<50))&&((y1<50)&&(y2>100))||
				((x1>100) && (x2>100))&&((y1<50)&&(y2>100))||
				((x1<50) && (x2<50))&&((y1<50)&&(y2<50))||
				((x1>100) && (x2>100))&&((y1>100)&&(y2>100)))
		{
			System.out.printf("�� ���簢���� ���� ��ġ���ʴ´�.\n");
			
		}else
			System.out.printf("�� ���簢���� ���� ��ģ��.\n");

	}

}
