package class12;

public class Student {
		private int fees;
		private String name;
		private String gender;
		public void setFee(int fee) {
		this.fees=fee;
		}
		public int getFee() {
			 return fees;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		public Student(int fee,String name,String gender) {
			this.fees=fee;
			this.name=name;
			this.gender=gender;
		}
		public String toString() {
		return fees+name+gender;
		}
	}