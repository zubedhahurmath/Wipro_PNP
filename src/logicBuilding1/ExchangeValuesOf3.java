package logicBuilding1;

public class ExchangeValuesOf3 {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int temp=a;
		a=c;
		c=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
