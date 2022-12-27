//2020112099 송민지
//“본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.” 

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
