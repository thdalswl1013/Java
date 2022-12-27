//2020112099 송민지

package q;

import p.B;//default는 같은 패키지 안에서만 접근 가능
class A {

	void f() {
		B b = new B();
		b.n=3;
		b.g();
	}
	
}
