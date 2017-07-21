package com.epam;


import com.epam.config.cmd_handler.CmdArgsParser;
import com.epam.config.cmd_handler.CmdConfig;
import com.epam.config.manager.ConfigManager;
import com.epam.config.table_handler.TableParser;
import com.epam.config.table_handler.attribute.AttributeParser;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            ConfigManager manager = new ConfigManager(new CmdArgsParser(),
                    new TableParser(),
                    new AttributeParser(),
                    args,
                    "",
                    ".edwex");
            System.out.printf("Nya");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
