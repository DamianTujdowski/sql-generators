package inserts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MealTableDataGenerator extends DataGenerator{

    public String generateInsertIntoQueries(String rowsNumber) {
        return IntStream.rangeClosed(0, Integer.parseInt(rowsNumber))
                .mapToObj(this::mapToSingleInsertIntoQuery)
                .collect(Collectors.joining("\n"));
    }

    public String mapToSingleInsertIntoQuery(int i) {
        return String.format("INSERT INTO meal (id, designation, energy, meal_category, preparation_description, " +
                "preparation_difficulty, preparation_duration, child_id, is_pre_defined) VALUES (%d, %s, %d, %s, %s, %s ,%d, %d, %d);",
                i, generateDesignation(), generateEnergy(), generateMealCategory(), generateDescription(),
                generateDifficulty(), generatePrepDuration(), generateChildId(i), 0);
    }

    private String generateDesignation() {
        List<String> names = Arrays.asList("\'porridge\'", "\'milk\'", "\'potato puree\'", "\'grated apple\'",
                "\'boiled broccoli\'", "\'boiled carrot\'", "\'water\'", "\'pear mousse\'", "\'vegetable salad\'");
        Collections.shuffle(names);
        return names.get(0);
    }

    private int generateEnergy() {
        return new Random().nextInt(900);
    }

    private String generateMealCategory() {
        List<String> categories = Arrays.asList("\'BREAKFAST\'", "\'DINNER\'", "\'SUPPER\'", "\'SNACK\'");
        Collections.shuffle(categories);
        return categories.get(0);
    }

    private String generateDescription() {
        return "\'" + new Random().ints(97, 123)
                .limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString() + "\'";
    }

    private String generateDifficulty() {
        List<String> categories = Arrays.asList("\'EASY\'", "\'MEDIUM\'", "\'HARD\'");
        Collections.shuffle(categories);
        return categories.get(0);
    }

    private int generatePrepDuration() {
        return 5 + (int) (new Random().nextFloat() * (30 - 5));
    }

    private Integer generateChildId(int i) {
        return i % 5 == 0 ? 2 : 1;
    }

}
