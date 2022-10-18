package class12;

public class Hotel {
	String hnames;
	String hlocations;
	String hrent;
	
	public void setHnames(String hnames) {
		this.hnames=hnames;
	}
	public String getHnames() {
		return hnames;
	}
	public void setHlocations(String hlocations) {
		this.hlocations=hlocations;
	}
	public String getHlocations() {
		return hlocations;
	}
	public void setHrent(String hrent) {
		this.hrent=hrent;
	}
	public String getHrent() {
		return hrent;
	}
	public Hotel(String hnames,String hlocations,String hrent) {
		this.hnames=hnames;
		this.hlocations=hlocations;
		this.hrent=hrent;
	}
	public String toString() {
		return hnames+" "+hlocations+" "+hrent;
	}

}
