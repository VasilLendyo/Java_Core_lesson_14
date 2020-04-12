package Maximum;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getLenght() > o2.getLenght()?1:-1;
	}

}
