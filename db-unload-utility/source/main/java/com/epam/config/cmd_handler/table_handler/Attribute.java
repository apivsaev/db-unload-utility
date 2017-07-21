package com.epam.config.cmd_handler.table_handler;

import java.util.ArrayList;

public class Attribute {
    private ArrayList<Attribute> attributes = null;
    private int attrno = 0;
    private String attrname = "";
    private Integer attrln = null;
    private Integer attrprc = null;
    //TODO: Custom type
    private String attrdepers = null;

    public Attribute(ArrayList<Attribute> attributes, int attrno, String attrname, Integer attrln, Integer attrprc, String attrdepers) {
        this.attributes = attributes;
        this.attrno = attrno;
        this.attrname = attrname;
        this.attrln = attrln;
        this.attrprc = attrprc;
        this.attrdepers = attrdepers;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public int getAttrno() {
        return attrno;
    }

    public String getAttrname() {
        return attrname;
    }

    public Integer getAttrln() {
        return attrln;
    }

    public Integer getAttrprc() {
        return attrprc;
    }

    public String getAttrdepers() {
        return attrdepers;
    }

}