package com.googlecode.flickrjandroid.machinetags;

/**
 * 
 * @author mago
 * @version $Id: Predicate.java,v 1.2 2009/07/12 22:43:07 x-mago Exp $
 */
public class Predicate implements ITag {
	public static final long serialVersionUID = 12L;

    private int usage;
    private int namespaces;
    private String value;
    
    /**
	 * 
	 */
	public Predicate() {
		super();
	}

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getUsage() {
        return usage;
    }

	public void setUsage(String predicates) {
        try {
            setUsage(Integer.parseInt(predicates));
        } catch (NumberFormatException e) {}
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int getNamespaces() {
        return namespaces;
    }

	public void setNamespaces(String namespaces) {
        try {
            setNamespaces(Integer.parseInt(namespaces));
        } catch (NumberFormatException e) {}
    }

	public void setNamespaces(int namespaces) {
        this.namespaces = namespaces;
    }

}
