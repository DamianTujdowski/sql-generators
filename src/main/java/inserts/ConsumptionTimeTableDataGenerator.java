package inserts;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumptionTimeTableDataGenerator extends DataGenerator{


    public String generateInsertIntoQueries(String rowsNumber, String id) {
        return IntStream.rangeClosed(0, Integer.parseInt(rowsNumber))
                .mapToObj(num -> mapToSingleInsertIntoQuery(num, id))
                .collect(Collectors.joining("\n"));
    }


    public String mapToSingleInsertIntoQuery(int rowId, String mealId) {
        return String.format("INSERT INTO consumption_time (id, consumption_time, meal_id) VALUES (%d, %s, %s);",
                rowId, generateDateTime(), mealId);
    }

    private String generateDateTime() {
        return String.format("\'%s %s\'", generateDate(), generateTime());
    }

    private String generateDate() {
        return String.format("2020-%s-%s", generateRandomDateOrTime(12), generateRandomDateOrTime(30));
    }

    private String generateTime() {
        return String.format("%s:%s:00", generateRandomDateOrTime(12), generateRandomDateOrTime(60));
    }

    private String generateRandomDateOrTime(int bound) {
        int dateOrTime = new Random().nextInt(bound);
        return dateOrTime < 10 ? "0" + dateOrTime : "" + dateOrTime;
    }
}
