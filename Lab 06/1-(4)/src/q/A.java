//2020112099 송민지

package q;

import p.B;

public class A {
	void f() {
		B b = new B();
		b.n = 3;	//private는 같은 패키지의 같은 클래스에서만 참조 가능하다
		b.g(); //메소드도 같다
	}
}
