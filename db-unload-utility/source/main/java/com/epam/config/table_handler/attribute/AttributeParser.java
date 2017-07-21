package com.epam.config.table_handler.attribute;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AttributeParser {
    public ArrayList<Attribute> parseAttributes(Integer fileno, String namePattern, String fileType) throws IOException {
        File file = new File(namePattern + "data" + fileType);
        ArrayList<Attribute> attributes = new ArrayList<>();

        FileReader reader = new FileReader(file);
        CSVParser parser = CSVFormat.TDF.parse(reader);
        List<CSVRecord> records = parser.getRecords();

        Integer attrno = null;
        String attrname = null;
        //TODO: Custom type
        String attrtp = null;
        Integer attrln = null;
        Integer attrprc = null;
        //TODO: Custom type
        String attrdepers = null;

        CSVRecord currRecord;
        for (CSVRecord record : records) {
            currRecord = record;
            if (fileno == Integer.parseInt(currRecord.get(0))) {
                attrno = Integer.parseInt(currRecord.get(1));
                attrname = currRecord.get(2);
                attrtp = currRecord.get(3);
                attrln = !currRecord.get(4).equals("") ? Integer.parseInt(currRecord.get(4)) : null;
                attrprc = !currRecord.get(5).equals("") ? Integer.parseInt(currRecord.get(5)) : null;
                attrdepers = currRecord.get(6);

                if (attrno == null)
                    throw new IllegalArgumentException(file.getName() + ": Null attrno!");
                if (attrname == null)
                    throw new IllegalArgumentException(file.getName() + ": Null attrname!");
                if (attrtp == null)
                    throw new IllegalArgumentException(file.getName() + ": Null attrtp!");
            }
            attributes.add(new Attribute(attrno, attrname, attrtp, attrln, attrprc, attrdepers));
        }

        return attributes;
    }
}
