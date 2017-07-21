package com.epam.config.table_handler.attribute;

public class Attribute {
    private Integer attrno = null;
    private String attrname = null;
    //TODO: Custom type
    private String attrtp = null;
    private Integer attrln = null;
    private Integer attrprc = null;
    //TODO: Custom type
    private String attrdepers = null;

    public Attribute(Integer attrno, String attrname, String attrtp, Integer attrln, Integer attrprc, String attrdepers) {
        this.attrno = attrno;
        this.attrname = attrname;
        this.attrtp = attrtp;
        this.attrln = attrln;
        this.attrprc = attrprc;
        this.attrdepers = attrdepers;
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