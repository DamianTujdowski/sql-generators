package inserts;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumptionTimeTableDataGenerator extends DataGenerator {


    String generateInsertIntoQueries(String rowsNumber) {
        return IntStream.rangeClosed(0, Integer.parseInt(rowsNumber))
                .mapToObj(this::mapToSingleInsertIntoQuery)
                .collect(Collectors.joining("\n"));
    }


    String mapToSingleInsertIntoQuery(int id) {
        return null;
    }
}
