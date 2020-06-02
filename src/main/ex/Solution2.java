package main.ex;

import java.text.NumberFormat;
import java.util.Locale;

public class Solution2 {

    public static void main(String[] args) {
        Locale locale = new Locale("en", "IN");

        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        System.out.println("getInstance: " + numberFormat.format(100000000.99));

        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(locale);
        System.out.println("getCurrencyInstance: " + numberFormat2.format(100.999));

        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        System.out.println("getPercentInstance: " + percentageFormat.format(2000.399));

    }
}