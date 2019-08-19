package ninepointthree;

import java.util.Comparator;

public class HDTVCompare implements Comparator<HDTV> {
		public int compare(HDTV tv1,HDTV tv2) {
			if(tv1.getSize()>tv2.getSize()) {
				return 1;
			}
			else if(tv2.getSize()>tv1.getSize()) {
				return -1;
			}
			return 0;
		}
	}


