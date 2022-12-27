//2020112099 송민지

package q;

import p.B;

class D extends B {
	void f() {
		n = 3; //private는 같은 패키지의 같은 클래스에서만 참조 가능
		g(); // 메소드도 같다
		
	}
}
