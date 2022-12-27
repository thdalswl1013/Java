//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다

public class FriendTest {

	public static void main(String[] args) {
		String[] names= {"전정국", "정호석", "김남준"};
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
