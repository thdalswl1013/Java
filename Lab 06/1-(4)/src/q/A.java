//2020112099 �۹���

package q;

import p.B;

public class A {
	void f() {
		B b = new B();
		b.n = 3;	//private�� ���� ��Ű���� ���� Ŭ���������� ���� �����ϴ�
		b.g(); //�޼ҵ嵵 ����
	}
}
