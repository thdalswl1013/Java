//2020112099 송민지

package p;

class E extends B {
	void f() {
		n = 3; //private는 같은 클래스 안에서만 참조 가능
		g(); //메소드도 같다
	}
}
