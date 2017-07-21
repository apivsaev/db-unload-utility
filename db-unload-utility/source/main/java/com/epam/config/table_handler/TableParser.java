package com.epam.config.table_handler;

import com.epam.config.table_handler.attribute.AttributeParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableParser {
    public ArrayList<TableConfig> parseTable(AttributeParser attributeParser, String namePattern, String fileType) throws IOException {
        File file = new File(namePattern + "pack" + fileType);


        ArrayList<TableConfig> tableConfigs = new ArrayList<>();


        FileReader reader = new FileReader(file);
        CSVParser parser = CSVFormat.TDF.parse(reader);
        List<CSVRecord> records = parser.getRecords();

        Integer fileno = null;
        String filenm = null;
        String schnm = null;
        String tblnm = null;
        String tblpartdt = null;
        String tblfltr = null;

        CSVRecord currRecord = null;
        for (CSVRecord record : records) {
            currRecord = record;
            fileno = Integer.parseInt(currRecord.get(0));
            filenm = currRecord.get(1);
            schnm = currRecord.get(2);
            tblnm = currRecord.get(3);
            tblpartdt = currRecord.get(4);
            tblfltr = currRecord.get(5);

            if (fileno == null)
                throw new IllegalArgumentException(file + ": Null fileno!");
            if (filenm == null)
                throw new IllegalArgumentException(file + ": Null filenm!");
            if (schnm == null)
                throw new IllegalArgumentException(file + ": Null schnm!");
            if (tblnm == null)
                throw new IllegalArgumentException(file + ": Null tblnm!");
            if (tblfltr == null)
                throw new IllegalArgumentException(file + ": Null tblfltr!");
            tableConfigs.add(new TableConfig(fileno, filenm, schnm, tblnm, tblpartdt, tblfltr, attributeParser.parseAttributes(fileno, namePattern, fileType)));
        }


        return tableConfigs;
    }
}
