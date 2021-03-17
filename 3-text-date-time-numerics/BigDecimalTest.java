
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest{
    public static void main(String[] args) {
        double price = 1.85;
        double rate = 0.065;

        price -= price*rate;
        p( price );

        price = Math.round(price*100)/100.0;
        p( price );

        BigDecimal priceB = BigDecimal.valueOf( 1.85 );
        BigDecimal rateB = BigDecimal.valueOf( 0.065 );

        priceB = priceB.subtract( priceB.multiply(rateB) ).setScale(2, RoundingMode.HALF_UP );
        p( priceB );
    }

    public static void p(Object o){
        System.out.println(o);
    }
}