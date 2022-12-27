//2020112099 �۹���
//�������� �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.�� 

class Animal
{
	public void move()
	{
		System.out.println("Animal : move()");
	}
}

class Fish extends Animal
{
	public void move()
	{
		System.out.println("Fish : move()");
	}
}

class Frog extends Animal
{
	public void move()
	{
		System.out.println("Frog : move()");
	}
}

class Bird extends Animal
{
	public void move()
	{
		System.out.println("Bird : move()");
	}
}

public class AnimalTest 
{
	public static void main(String[] args)
	{
		Animal[] animal = new Animal[3];
		animal[0] = new Fish(); //upcasting Fish->Animal 
		animal[1] = new Frog(); //upcasting Frog->Animal 
		animal[2] = new Bird(); //upcasting Bird->Animal 
		
		for(int i=0; i<animal.length; i++)
		{
			animal[i].move();//polymorphic
		}
	}
}
