package Package;
import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		double r ;
		final float pi =3.1415f;
		Scanner k=new Scanner (System.in);
		r=k.nextDouble();
		System.out.println("Circle area = " +r*r*pi);
		System.out.println("Circle perimeter = " +2*pi*r);
	}
}
