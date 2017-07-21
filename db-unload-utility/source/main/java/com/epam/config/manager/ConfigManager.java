package com.epam.config.manager;

import com.epam.config.cmd_handler.CmdConfig;
import com.epam.config.table_handler.TableConfig;
import com.epam.config.cmd_handler.CmdArgsParser;
import com.epam.config.table_handler.TableParser;
import com.epam.config.table_handler.attribute.AttributeParser;

import java.io.IOException;
import java.util.ArrayList;

public class ConfigManager {
    private CmdConfig cmdConfig = null;
    private ArrayList<TableConfig> tableConfigs = null;

    public ConfigManager(CmdArgsParser cmdArgsParser,
                         TableParser tableParser,
                         AttributeParser attributeParser,
                         String args[],
                         String directory,
                         String fileType) throws IOException {
        cmdConfig = cmdArgsParser.parseArgs(args);
        String namePattern = directory + cmdConfig.getSrctp() + "_" + cmdConfig.getSpecver() + "_";

        tableConfigs = tableParser.parseTable(attributeParser, namePattern, fileType);
    }

    public CmdConfig getCmdConfig() {
        return cmdConfig;
    }

    public ArrayList<TableConfig> getTableConfig() {
        return tableConfigs;
    }

}
