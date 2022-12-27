//2020112099 송민지

package q;

import p.B; // default 클래스는 다른 패키지에서 접근 못한다


class D extends B { // 상속 안됨
	void f() {	//import 되지 않음
		n=3;
		g();
	}

}
