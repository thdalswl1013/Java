//2020112099 송민지

package q;

import p.B;//default 클래스는 같은 패키지 안에서만 접근 가능


class D extends B {//상속이 안됨
	void f() {
		n = 3;
		g();
	}

}
