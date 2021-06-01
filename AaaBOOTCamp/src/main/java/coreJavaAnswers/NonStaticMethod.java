package coreJavaAnswers;

public class NonStaticMethod {

	public static void main(String[] args) {
		
		NonStaticMethod method=new NonStaticMethod();
		
		method.print();
		
		int total=method.sum(25,69);

	}

	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("The total is "+c);
		return c;
	}
	
	public void print() {
		System.out.println("This is to invoke a non static method!");
	}
}
