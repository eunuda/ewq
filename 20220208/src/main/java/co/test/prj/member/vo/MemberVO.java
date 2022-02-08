package co.test.prj.member.vo;

public class MemberVO {

		private String Id;
		private String password;
		private String name;
		private String tel;
		private String address;
		private String author;
		public String getId() {
			return Id;
		}
		@Override
		public String toString() {
			return "MemberVo [Id=" + Id + ", password=" + password + ", name=" + name + ", tel=" + tel + ", address="
					+ address + ", author=" + author + "]";
		}
		public void setId(String id) {
			Id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
 	
		
	}

	
	

