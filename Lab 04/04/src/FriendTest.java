//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�

public class FriendTest {

	public static void main(String[] args) {
		String[] names= {"������", "��ȣ��", "�賲��"};
		int[] ages= {1997,1994,1994};
		Friend[] stu = new Friend[3];
		
		for (int i = 0; i < 3; i++)
		{
			stu[i] = new Friend();
			stu[i].Name = names[i];
			stu[i].age = ages[i];
		}
		
		for (int i = 0; i < stu.length; i++)
		{
			System.out.printf("%s %d\n", stu[i].Name, stu[i].age);
		}
		
		for (Friend k: stu)
		{
			System.out.printf("%s %d\n", k.Name, k.age);
		}
	}

}
