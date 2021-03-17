import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumberFormatTest{
    public static void main(String[] args) {

        

        double price = 1.85;
        double rate = 0.065;

        price -= price*rate;
        price = Math.round(price*100)/100.0;


        BigDecimal priceB = BigDecimal.valueOf( 1.85 );
        BigDecimal rateB = BigDecimal.valueOf( 0.065 );

        priceB = priceB.subtract( priceB.multiply(rateB) ).setScale(2, RoundingMode.HALF_UP );


////////////////////////////////////////////



        Locale locale = Locale.FRANCE;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);

        p( currencyFormat.format( priceB) );
        p( percentFormat.format( rateB ) );
        p( locale );

    }

    public static void p(Object o){
        System.out.println(o);
    }
}