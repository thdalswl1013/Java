//2020112099 송민지

package q;

import p.B;

public class A {
	void f() {
		B b = new B();
		b.n=3;	//default 변수는 다른 패키지에서 참조할 수 없다
		b.g(); // 메소드도 같다
	}
}
