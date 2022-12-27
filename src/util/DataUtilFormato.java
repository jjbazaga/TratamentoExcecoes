package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUtilFormato {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formatoData(LocalDate data) {
        return dtf.format(data);
    }

    public static LocalDate formatoData(String data) {
        return LocalDate.parse(data, dtf);
    }
}
