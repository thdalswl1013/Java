//2020112099 송민지

package q;

import p.B;

class D extends B {
	void f() {
		n=3; // default 변수는 상속을 하더라도 참조할 수 없다.
		g(); //메소드도 같다
	}
}
