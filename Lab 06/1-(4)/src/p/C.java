//2020112099 송민지

package p;

class C {

	public void k() {
		B b = new B();
		b.n = 7; // 같은 패키지라도 private로 선언되면 같은 클래스 외에는 참조할 수 없다
		b.g(); // 메소드도 같다
	}
}
