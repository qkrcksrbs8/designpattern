package cg.park.designpattern.iterator;

import cg.park.designpattern.iterator.dinermerger.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
