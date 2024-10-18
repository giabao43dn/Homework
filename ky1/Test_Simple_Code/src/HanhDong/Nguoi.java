package HanhDong;

public class Nguoi {
// thuoc tinh
	private String ten;
	private int tuoi;
	private int sdt;
	
//
	public Nguoi(String ten, int tuoi, int sdt) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.sdt = sdt;
	}
	
//
public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public int getTuoi() {
		return tuoi;
	}



	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}



	public int getSdt() {
		return sdt;
	}



	public void setSdt(int sdt) {
		this.sdt = sdt;
	}


// 
	

// hanh dong
	void ngu() {
			System.out.println( " dang ngu " + " " + tuoi + " " + sdt);
		}


/*
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", sdt=" + sdt + "]";
	}
*/
}