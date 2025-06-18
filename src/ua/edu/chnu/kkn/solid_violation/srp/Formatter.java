package ua.edu.chnu.kkn.solid_violation.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";
    private static final DecimalFormat decimalFormat = new DecimalFormat(AMOUNT_FORMAT, DecimalFormatSymbols.getInstance(Locale.UK));

    public String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }

    public String formatAmount(int amount) {
        return decimalFormat.format(amount);
    }
}
