package Baiktra02;

public class KyThuat extends NhanVien{
		private String chuyenNganh;
		
		
		@Override
		public String moTaCongViec() {
			// TODO Auto-generated method stub
			return "";
		}
		
		public KyThuat() {
			// TODO Auto-generated constructor stub
		}

		public KyThuat(String chuyenNganh) {
			super();
			this.chuyenNganh = chuyenNganh;
		}

		public KyThuat(String Manhanvien, String Hoten, String Namsinh, String Diachi) {
			super(Manhanvien,Hoten,Namsinh,Diachi);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "KyThuat [chuyenNganh=" + chuyenNganh + "]";
		}
		
	}

