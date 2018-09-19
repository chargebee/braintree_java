package com.braintreegateway;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class TransactionLevelFeeReport {
    private List<TransactionLevelFeeReportRow> rows = new LinkedList<TransactionLevelFeeReportRow>();
    private Boolean valid;

    public TransactionLevelFeeReport(String urlValue) throws IOException, ParseException {
        if (urlValue == null || "".equals(urlValue)) {
            this.valid = false;
            return;
        }

        this.valid = true;
        URL url = new URL(urlValue);
        InputStreamReader is = new InputStreamReader(url.openStream());

        for (CSVRecord record : CSVFormat.EXCEL.withFirstRecordAsHeader().parse(is)) {
            rows.add(new TransactionLevelFeeReportRow(record));
        }
    }

    public List<TransactionLevelFeeReportRow> getRows() {
        return rows;
    }

    public Boolean isValid() {
        return this.valid;
    }
}
