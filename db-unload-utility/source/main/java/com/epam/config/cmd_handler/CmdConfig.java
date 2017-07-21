package com.epam.config.cmd_handler;

import java.nio.charset.*;
import java.time.LocalDateTime;

public class CmdConfig {
    public int getSrctp() {
        return srctp;
    }

    public int getSrcno() {
        return srcno;
    }

    public int getSpecver() {
        return specver;
    }

    public String getDbcs() {
        return dbcs;
    }

    public String getDbuser() {
        return dbuser;
    }

    public String getDbpass() {
        return dbpass;
    }

    public String getSvncs() {
        return svncs;
    }

    public String getSvnuser() {
        return svnuser;
    }

    public String getSvnpass() {
        return svnpass;
    }

    public LocalDateTime getFromdt() {
        return fromdt;
    }

    public LocalDateTime getActualdt() {
        return actualdt;
    }

    public Charset getEncoding() {
        return encoding;
    }

    public boolean isDepers() {
        return depers;
    }

    public int getMaxthreads() {
        return maxthreads;
    }

    private int srctp = 0;
    private int srcno = 0;
    private int specver = 0;
    //TODO: String -> JDBC String
    private String dbcs = null;
    private String dbuser = null;
    private String dbpass = null;
    //TODO: String -> HTML String
    private String svncs = null;
    private String svnuser = null;
    private String svnpass = null;
    private LocalDateTime fromdt = LocalDateTime.of(0,1,30,0,0,0);
    private LocalDateTime actualdt;
    private Charset encoding = Charset.forName("UTF-8");
    private boolean depers = true;
    private int maxthreads = 10;

    CmdConfig(int srctp, int srcno, int specver, String dbcs, String dbuser, String dbpass, String svncs, String svnuser, String svnpass, LocalDateTime fromdt, LocalDateTime actualdt, Charset encoding, boolean depers, int maxthreads) {
        this.srctp = srctp;
        this.srcno = srcno;
        this.specver = specver;
        this.dbcs = dbcs;
        this.dbuser = dbuser;
        this.dbpass = dbpass;
        this.svncs = svncs;
        this.svnuser = svnuser;
        this.svnpass = svnpass;
        this.fromdt = fromdt;
        this.actualdt = actualdt;
        this.encoding = encoding;
        this.depers = depers;
        this.maxthreads = maxthreads;
    }

}
