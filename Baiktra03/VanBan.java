package Baiktra03;

public class VanBan {
		private String st;
		private VanBan() {
			// TODO Auto-generated constructor stub
		}
		public VanBan(String st) {
			super();
			this.st = st;
		}
		public String getSt() {
			return st;
		}
		public void setSt(String st) {
			this.st = st;
		}
		public int countWord() {
			String[] listWord = st.split(" ");
			return listWord.length;
		}
		
		}


