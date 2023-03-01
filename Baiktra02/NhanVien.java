package Baiktra02;

public abstract class NhanVien {
		private String Manhanvien;
		private String Hoten;
		private String Namsinh;
		private String Diachi;
		public NhanVien() {
			// TODO Auto-generated constructor stub
		}
		public NhanVien(String Manhanvien, String Hoten, String Namsinh, String Diachi) {
			super();
			this.Manhanvien=Manhanvien;
			this.Hoten=Hoten;
			this.Namsinh=Namsinh;
			this.Diachi=Diachi;	
		}
		public String getManhanvien() {
			return Manhanvien;
		}
		public String getHoten() {
			return Hoten;
		}

		public void setHoten(String Hoten) {
			this.Hoten = Hoten;
		}
		public String getNamsinh() {
			return Namsinh;
		}
		public void setNamsinh (String Namsinh ) {
			this.Namsinh = Namsinh;
		}
		public String getDiachi() {
			return Diachi;
		}
		public void setDiachi(String Diachi) {
			this.Diachi = Diachi;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		public abstract String moTaCongViec();

}

