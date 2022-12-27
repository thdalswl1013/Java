//2020112099 송민지

package q;

import p.B;

class A {
	
	void f() {
		B b = new B();
		b.n=3; // Public이라 클래스는 객체가 가능하지만, 변수는 protected로 선언했으므로 다른 패키지에서 상속을 통해서만 참조 가능하다.
		b.g(); //메소드도 같음
	}
}
