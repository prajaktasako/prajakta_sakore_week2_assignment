package p1;

public class Overloading {
	
	public void method() {    //args = 0
		System.out.println(1);
	}
	
	public void method(int x) {  //args = 1
		System.out.println(x);
	}
	
	public void method(int x, int y) {   //args = 2
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.method();
		o.method(2);
		o.method(3, 4);
	}

}
