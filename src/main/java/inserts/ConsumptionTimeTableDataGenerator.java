package inserts;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumptionTimeTableDataGenerator extends DataGenerator {

    private Random randomDayOrMonth = new Random();

    public String generateInsertIntoQueries(String startId, String rowsNumber, String id) {
        return IntStream.rangeClosed(Integer.parseInt(startId), Integer.parseInt(rowsNumber) + Integer.parseInt(startId))
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
        int dayOrMonth = randomDayOrMonth.nextInt(bound) + 1;
        return dayOrMonth < 10 ? "0" + dayOrMonth : "" + dayOrMonth;
    }
}
