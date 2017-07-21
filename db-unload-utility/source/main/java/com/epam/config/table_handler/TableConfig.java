package com.epam.config.table_handler;


import com.epam.config.table_handler.attribute.Attribute;
import com.epam.config.table_handler.attribute.AttributeParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class TableConfig {
    private Integer fileno = null;
    private String filenm = null;
    private String schnm = null;
    private String tblnm = null;
    private String tblpartdt = null;
    private String tblfltr = null;
    private ArrayList<Attribute> attributes = null;

    public TableConfig(Integer fileno, String filenm, String schnm, String tblnm, String tblpartdt, String tblfltr, ArrayList<Attribute> attributes) throws IOException {
        this.fileno = fileno;
        this.filenm = filenm;
        this.schnm = schnm;
        this.tblnm = tblnm;
        this.tblpartdt = tblpartdt;
        this.tblfltr = tblfltr;
        this.attributes = attributes;
    }
}
