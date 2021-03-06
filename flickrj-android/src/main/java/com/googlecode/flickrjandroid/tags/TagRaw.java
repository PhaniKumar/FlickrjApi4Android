package com.googlecode.flickrjandroid.tags;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @see com.googlecode.flickrjandroid.tags.TagsInterface#getListUserRaw
 * @author mago
 * @version $Id: TagRaw.java,v 1.2 2009/07/12 22:43:07 x-mago Exp $
 */
public class TagRaw {
	private static final long serialVersionUID = 12L;
    String owner;
    String clean;
    List<String> raw = new ArrayList<String>();

    public TagRaw() {
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getRaw() {
        return raw;
    }

    public void addRaw(String rawStr) {
        raw.add(rawStr);
    }
}
