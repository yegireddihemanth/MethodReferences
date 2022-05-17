
interface Sayble{
	void say();
}

public class StaticMethodReference {
	
	public static void saySomething() {
		
		System.out.println("staic reference..");
	}
	
	public static void sum() {
		int a=10;
		int b= 20;
		
		int c = a+b;
		System.out.println("sum is : "+c);
		
	}

	public static void main(String[] args) {
		//refering static method
		
	Sayble sayble = StaticMethodReference::saySomething;	
	Sayble sayble2	 = StaticMethodReference::sum;
	sayble.say();
	sayble2.say();
	}

}
