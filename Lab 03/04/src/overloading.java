//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

public class overloading {
	public static void main(String[] args) {
		
		overloading ol = new overloading();
		
		System.out.printf("������: ");
		ol.sum(1, 2);
		System.out.printf("�Ǽ���: ");
		ol.sum(2.5, 8);

	}

	public void sum(int a, int b) {
		System.out.println(a+b);	
	}
	
	public void sum(double a, double b) {
		System.out.println(a+b);	
	}
	
	
}
