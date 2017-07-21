package com.epam.config.cmd_handler.table_handler;


import java.util.ArrayList;

public class TableConfig {
    private int fileno = 0;
    private String filenm = "";
    private String schnm = "";
    private String tblnm = "";
    private String tblpartdt = null;
    private String tblfltr = "";
    private ArrayList<Attribute> attributes = null;

    public TableConfig(int srctp, int srcno, AttributeParser parser) {
        attributes = parser.parseAttributes(srctp,srcno);

    }

}
