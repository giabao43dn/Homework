package HanhDong;

public class SinhVien {
	private String name;
	private String sex;
	private int age;
	
	//constructor
	public SinhVien(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//hanh dong
	void check() {
		if (age>19) {
			System.out.println(name + " da truong thanh");}
		else System.out.println(name + " chua truong thanh");
	}
	void hoc() {
		System.out.println(name +" dang hoc bai " + "gioi tinh " + sex);
	}
}
