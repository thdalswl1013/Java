//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

enum Color {WHITE, BLACK, YELOOW, RED};

public class ColorTest {
	public static void main(String[] args) {
		
	Color[] array = Color.values();
	for(Color col: array) {
		System.out.println(col);
	}
	
	
	}

}
