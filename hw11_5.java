package Java11;

interface Math {
	public void show();

	public void add(int a, int b); // �p�� a+b

	public void sub(int a, int b); // �p�� a-b

	public void mul(int a, int b); // �p�� a*b

	public void div(int a, int b); // �p�� a/b
}

class Compute implements Math {
	public int ans;

	public void add(int a, int b) {
		ans = a + b;
	}

	public void sub(int a, int b) {
		ans = a - b;
	}

	public void mul(int a, int b) {
		ans = a * b;
	}

	public void div(int a, int b) {
		ans = a / b;
	}

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class hw11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5); 
		cmp.show(); 
	}

}
