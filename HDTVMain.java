package ninepointthree;

import java.util.ArrayList;

public class HDTVMain {
	public static void main(String[] args) {

	ArrayList<HDTV> tele=new ArrayList<HDTV>();
	tele.add(new HDTV("Philips",40));
	tele.add(new HDTV("Siemens",35));
	tele.add(new HDTV("Sony",45));
	tele.sort(new HDTVCompare());
	System.out.println("TV's after sort");
	for (HDTV hdtv : tele) {
		System.out.println(hdtv);
	}
	}
}
