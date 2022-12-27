//2020112099 �۹���
//�������� �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.�� 

class Animal
{
	public void show()
	{
		System.out.println("Animal : show()");
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
		//instanceof �����ڸ� Ȱ���Ͽ� ������ upcasting���� Ȯ�� �� downcasting�϶�

		Fish fish = new GoldFish();  // upcasting
		
		if(fish instanceof GoldFish)
		{
			((GoldFish)fish).move(); // downcasting
		}
	}
}
