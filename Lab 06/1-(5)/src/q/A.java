//2020112099 송민지

package q;

import p.B;		//default 클래스는 다른 패키지에서 접근하지 못한다
public class A {

	void f() {//import가 되지 않음
		B b= new B();
		b.n=3;
		b.g();
	}
}
