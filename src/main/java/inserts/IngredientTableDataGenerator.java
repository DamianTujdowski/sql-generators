package inserts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IngredientTableDataGenerator extends DataGenerator{


    public String generateInsertIntoQueries(String rowsNumber, String id) {
        return IntStream.rangeClosed(0, Integer.parseInt(rowsNumber))
                .mapToObj(num -> mapToSingleInsertIntoQuery(num, id))
                .collect(Collectors.joining("\n"));
    }

    public String mapToSingleInsertIntoQuery(int rowId, String mealId) {
        return String.format("INSERT INTO ingredient (id, designation, energy_per100grams, is_disliked, is_favourite, " +
                        "weight_per_meal, meal_id, child_id, is_pre_defined) VALUES (%d, %s, %d, %d, %d, %d ,%s, %s, %d);",
                rowId, generateDesignation(), generateEnergy(), 0, 0,
                generateWeight(), mealId, "null", 0);
    }

    private String generateDesignation() {
        List<String> names = Arrays.asList("\'oat\'", "\'water\'", "\'potato\'", "\'apple\'", "\'broccoli\'",
                "\'carrot\'", "\'pear\'", "\'cucumber\'", "\'tomato\'");
        Collections.shuffle(names);
        return names.get(0);
    }

    private int generateEnergy() {
        return new Random().nextInt(300);
    }

    private int generateWeight() {
        return new Random().nextInt(300);
    }

}
