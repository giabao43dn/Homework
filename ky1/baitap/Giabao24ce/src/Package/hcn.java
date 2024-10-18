package Package;
import java.util.Scanner;
public class hcn {
	public static void main(String[] args) {
		int cd,cr;
		Scanner k=new Scanner(System.in);
		System.out.println("Nhap cd");
		cd=k.nextInt();
		System.out.println("Nhap cr");
		cr=k.nextInt();
		System.out.println("Dien tich hcn la " + cd*cr);
		System.out.println("Chu vi hcn la " + (cd+cr)*2);
	}
}
