package HanhDong;

public class MainSinhVien {
	public static void main(String[] args) {
	SinhVien sv1 = new SinhVien("Ten A","Nam",18);
	SinhVien sv2 = new SinhVien("Ten B","Nu",21);
	
/*	sv1.hoc();
	sv1.setName("Ten AAA");
	sv1.hoc();
	System.out.println(sv2.getAge());
	} */
	sv1.check();
	sv2.check();
}
}