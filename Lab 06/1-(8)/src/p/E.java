//2020112099 송민지

package p;

class E extends B {
	
	void f() {//default 클래스에서 private 변수가 선언되면 상속 받더라도 같은 클래스에서만 참조 가능
		n=3;
		g();//메소드도 같다
	}

}
