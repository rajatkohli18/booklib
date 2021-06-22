package client;

import java.util.Comparator;


import model.Libraries;

public class SortByName implements Comparator<Libraries> {
	
	@Override
	public int compare(Libraries o1, Libraries o2) {
		return o2.getLibrary_name().compareTo(o1.getLibrary_name());
	}

}