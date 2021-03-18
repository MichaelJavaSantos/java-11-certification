package labs;

import java.math.BigDecimal;

import labs.data.Product;
import labs.data.Rating;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product = new Product(1, "Tea", BigDecimal.valueOf(1.9));
        Product product2 = new Product(1, "Cake", BigDecimal.valueOf(2.87), Rating.FOUR_STAR);
        Product product3 = new Product();

        System.out.println( product.getId() + " " + product.getName() + " " + product.getPrice() + " " + product.getDiscount() + "  " + product.getRating().getStars());
        System.out.println( product2.getId() + " " + product2.getName() + " " + product2.getPrice() + " " + product2.getDiscount() + "  " + product2.getRating().getStars());
        System.out.println( product3.getId() + " " + product3.getName() + " " + product3.getPrice() + " " + product3.getDiscount() + "  " + product3.getRating().getStars());
    }
}
