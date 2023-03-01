package Baiktra02;
import java.util.Scanner;
public class Main02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Manhanvien: ");
		String Manhanvien = sc.nextLine();
		System.out.println("Enter Hoten: ");
		String Hoten = sc.nextLine();
		System.out.println("Enter Namsinh: ");
		String Namsinh = sc.nextLine();
		System.out.println("Enter Diachi: ");
		String Diachi = sc.nextLine();
		System.out.println("Enter :chuyenNganh ");
		String  chuyenNganh= sc.nextLine();
		System.out.println("Mo ta cong viec");
		String motaCV = sc.nextLine();
		NhanVien nv = new NhanVien() {
	
		@Override
		public String moTaCongViec() {
			return motaCV;
				}
		};
			KyThuat kt = new KyThuat(chuyenNganh);
			System.out.println(nv.toString());
			System.out.println(kt.toString());
		}
}



