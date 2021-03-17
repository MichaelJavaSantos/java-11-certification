import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDateTime{
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        p( today );
        p( today.plusYears(1) );
        p( today.plusYears(1).getDayOfWeek() );


        LocalTime teaTime = LocalTime.of(17,30);
        p( teaTime );

        Duration timeGap = Duration.between(LocalTime.now(), teaTime);
        p (timeGap );
        p ( timeGap.toHours() );
        p ( timeGap.toMinutes() );
        p ( timeGap.toMinutesPart() );


        String datePattern =  "EE', 'd' of 'MMM yyyy' at 'HH:m z";
        Locale locale = Locale.forLanguageTag("BST");
        p ( locale );

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
        p( dateFormat );


        String timeTxt = dateFormat.format( LocalDateTime.now().atZone( ZoneId.of("UTC").normalized() ) );
        String timeTxt0 = dateFormat.format( LocalDateTime.now().atZone( ZoneId.of("Asia/Ho_Chi_Minh") ) );
        String timeTxt1 = dateFormat.format( LocalDateTime.now().atZone( ZoneId.systemDefault() ) );

        p ( ZoneId.systemDefault() );
        p ( timeTxt );
        p ( timeTxt0 );
        p ( timeTxt1 );


    }

    public static void p(Object o){
        System.out.println(o);
    }
}