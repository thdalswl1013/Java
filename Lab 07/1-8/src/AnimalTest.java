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
}

class GoldFish extends Fish
{
	public void move()
	{
		System.out.println("GOldFish : move()");
	}
}

public class AnimalTest
{
	public static void main(String[] args)
	{
		Fish fish = new GoldFish(); //upcasting
		fish.move(); //2
	}
}
