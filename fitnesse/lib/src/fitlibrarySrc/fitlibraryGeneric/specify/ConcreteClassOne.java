/*
 * Copyright (c) 2006 Rick Mugridge, www.RimuResearch.com
 * Released under the terms of the GNU General Public License version 2 or later.
*/
package fitlibraryGeneric.specify;

public class ConcreteClassOne implements InterfaceType {
    private int count;
    
    @Override
	public int getCount() {
        return count;
    }
    @Override
	public void setCount(int count) {
        this.count = count;
    }   
}

