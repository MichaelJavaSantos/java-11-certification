import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationAndFormatMessages {
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        ResourceBundle msg = ResourceBundle.getBundle("messages", locale);

        String offerPatern = msg.getString("offer");
        p ( offerPatern );

        String result = MessageFormat.format(offerPatern, "Tea", "U$ 1.73", "6.5%", LocalDateTime.now(ZoneId.systemDefault()));
        p( result );




        Locale locale1 = new Locale("ru", "RU");
        ResourceBundle msg1 = ResourceBundle.getBundle("messages", locale1);

        String offerPatern1 = msg1.getString("offer");
        p ( offerPatern1 );

        String result1 = MessageFormat.format(offerPatern1, "Tea", "U$ 1.73", "6.5%", LocalDateTime.now(ZoneId.systemDefault()));
        p( result1 );
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}