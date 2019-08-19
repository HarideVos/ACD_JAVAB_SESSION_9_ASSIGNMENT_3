package ninepointthree;

public class HDTV {
	String brandName;
	int size;
	
	public HDTV(String brandName, int size) {
		this.brandName = brandName;
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof HDTV) {
			HDTV tv = (HDTV) o;
			return (this.brandName.equals(tv.brandName) && this.size == tv.size);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return size + " cm " + brandName + " HDTV";
	}
}
