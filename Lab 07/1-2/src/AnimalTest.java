//2020112099 �۹���
//�������� �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.�� 

class Animal
{
	public void show()
	{
		System.out.println("Animal : show()");
	}
	public void move()
	{
		System.out.println("Animal : move()");
	}
}

class Fish extends Animal
{
	public void draw()
	{
		System.out.println("Fish : draw()");
	}
	public void move()
	{
		System.out.println("Fish : move()");
	}
}

public class AnimalTest 
{
	public static void main(String[] args)
	{
		Fish fish = new Fish();
		fish.move();
	}
}
