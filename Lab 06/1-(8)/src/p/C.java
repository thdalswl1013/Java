//2020112099 송민지

package p;

class C {
	public void k() {
		B b= new B();//default 클래스에서 private 변수가 선언되면 클래스에서만 참조 가능
		b.n=7;//메소드도 같다
		b.g();
	}
}
