//2020112099 송민지

package q;

import p.B; //default 클래스는 다른 패키지에서 접근하지 못함

public class D extends B { //상속X
	
	void f() { 
		n=3;
		g();
	}

}
