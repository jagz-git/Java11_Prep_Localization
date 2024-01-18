package org.learning.localeExamples.currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by Jagadesh Narayanaswamy on 18/01/24.
 * Author comment: Currency Formatting example
 */
public class CurrencyDemoExample {

    public static void main(String[] args) {
        Double amountToConvert = 10818108.18;

        Locale locale = Locale.getDefault();
        Currency currency = Currency.getInstance(locale);

        System.out.println("Currency Display Name: " + currency.getDisplayName());
        System.out.println("Currency Symbol: " + currency.getSymbol());
        System.out.println("Currency Code: " + currency.getCurrencyCode());

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amountToConvert));

        System.out.println("--------------------------------------");

        Double ukAmount = 1818108.18;
        Locale ukLocale = Locale.UK;
//        Locale ukLocale = new Locale("en", "GB");
//        Both ways can be used to define locale.

        Currency ukCurrency = Currency.getInstance(ukLocale);
        System.out.println("Currency Display Name: " + ukCurrency.getDisplayName());
        System.out.println("Currency Symbol: " + ukCurrency.getSymbol());
        System.out.println("Currency Code: " + ukCurrency.getCurrencyCode());

        NumberFormat ukCurrencyFormatter = NumberFormat.getCurrencyInstance(ukLocale);
        System.out.println(ukCurrencyFormatter.format(ukAmount));

    }

}
