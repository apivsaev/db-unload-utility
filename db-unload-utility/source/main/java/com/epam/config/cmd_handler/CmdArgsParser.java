package com.epam.config.cmd_handler;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CmdArgsParser {

    public CmdConfig parseArgs(String args[]) {
        //TODO:Create exceptions
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        if(args.length == 0)
            throw new IllegalArgumentException("Args is missing!");

        int srctp;
        if (args[0].length() < 3) srctp = Integer.parseInt(args[0]);
        else throw null;

        int srcno;
        if (args[1].length() < 6) srcno = Integer.parseInt(args[1]);
        else throw null;

        int specver;
        if (args[2].length() < 6) specver = Integer.parseInt(args[2]);
        else throw null;

        //TODO: String -> JDBC String
        String dbcs = args[3];
        String dbuser = args[4];
        String dbpass = args[5];
        //TODO: String -> HTML String
        String svncs = args[6];
        String svnuser = args[7];
        String svnpass = args[8];

        LocalDateTime fromdt = null;
        try {
            fromdt = LocalDateTime.parse(args[9], formatter);
        } catch (DateTimeException e) {
            e.printStackTrace();
        }

        LocalDateTime actualdt = null;
        try {
            actualdt = LocalDateTime.parse(args[10], formatter);
        } catch (DateTimeException e) {
            e.printStackTrace();
        }

        Charset encoding = null;
        try {
            encoding = Charset.forName(args[11]);
        } catch (UnsupportedCharsetException e) {
            e.printStackTrace();
        }
        boolean depers = Boolean.parseBoolean(args[12]);

        int maxthreads = 10;
        if (args[13].length() < 6) specver = Integer.parseInt(args[2]);
        else throw null;

        return new CmdConfig(srctp,
                srcno,
                specver,
                dbcs,
                dbuser,
                dbpass,
                svncs,
                svnuser,
                svnpass,
                fromdt,
                actualdt,
                encoding,
                depers,
                maxthreads);
    }
}
