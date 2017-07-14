package com.epam.config.cmd_handler;

import java.nio.charset.*;
import java.time.LocalDateTime;

public class CmdConfig {
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
    private LocalDateTime fromdt = LocalDateTime.of(0,0,30,0,0,0);
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
    //TODO: Constructors with default args

}
