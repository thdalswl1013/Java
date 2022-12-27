//2020112099 송민지
//“본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.” 

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
		//instanceof 연산자를 활용하여 적절한 upcasting인지 확인 후 downcasting하라

		Fish fish = new GoldFish();  // upcasting
		
		if(fish instanceof GoldFish)
		{
			((GoldFish)fish).move(); // downcasting
		}
	}
}
