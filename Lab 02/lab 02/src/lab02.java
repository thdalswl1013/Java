//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.Scanner;
public class lab02 {
		static void q1()
		{
			int num1=0;
			int num2=0;
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.printf("\n���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.\n");
				System.out.printf("���� >> ");
				String hm = new String(sc.next());
				if(hm.equals("exit")) {
					break;
				}
				System.out.printf("�ع� >> ");
				String jb = new String(sc.next());
				if (jb.equals("exit")) {
					break;
				}
			
				if (hm.equals("����")) {
					num1=0;
					}
				else if (hm.equals("����")) {
					num1=1;
					}
				else if (hm.equals("��")) {
					num1=2;
					}
			
				if (jb.equals("����")) {
					num2=0;
					}
				else if (jb.equals("����")) {
					num2=1;
					}
				else if (jb.equals("��")) {
					num2=2;
				}
			
				//int result = (num1-num2+3)%3;
				int result = (num1-num2 + 3) % 3;
				switch(result) {
					case 0:
						System.out.printf("���º��Դϴ�.");
						break;
					case 1:
						System.out.printf("���̰� �̰���ϴ�.");
						break;
					case 2:
						System.out.printf("���̰� �����ϴ�.");
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
			System.out.printf("�� �� x�� �Է��Ͻÿ� : ");
			int x = sc.nextInt();

			System.out.printf("�� �� y�� �Է��Ͻÿ� : ");
			int y = sc.nextInt();
			
			if((x>=50) && (x<=100))
			{
				if ((y>=50) && (y<=100))
				{
					System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �����մϴ�.");
				}
				else
					System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �������� �ʽ��ϴ�.");
				
			}
			else
				System.out.printf("�� �� (x, y)�� �� ���簢�� �ȿ� �������� �ʽ��ϴ�.");
		}
		
		static void q4()
		{
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
		
	public static void main(String[] args)
	{

	//q1();
	//q2();
	//q3();
	q4();
	}
}
