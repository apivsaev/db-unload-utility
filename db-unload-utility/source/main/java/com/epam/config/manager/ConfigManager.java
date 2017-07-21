package com.epam.config.manager;

import com.epam.config.cmd_handler.CmdConfig;
import com.epam.config.cmd_handler.table_handler.TableConfig;
import com.epam.config.cmd_handler.CmdArgsParser;

public class ConfigManager {

    private CmdConfig cmdConfig;

    public ConfigManager(CmdArgsParser parser, String args[]) {
        cmdConfig = parser.Parse(args);
    }

    public CmdConfig getCmdCongig() {
        return null;
    }

    public TableConfig getTableConfig() {
        return null;
    }
}
