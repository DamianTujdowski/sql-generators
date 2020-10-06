package mysql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MysqlnsertIntoMeal {
    public void insertInto(String table) {
        for (int i = 0; i < 50; i++) {
            System.out.println(String.format("INSERT INTO %s (id, designation, energy, meal_category, preparation_description, preparation_difficulty, preparation_duration, child_id, is_pre_defined) " +
                    "VALUES (%d, %s, %d, %s, %s, %s ,%d, %d, %d)", table, i, generateDesignation(), generateEnergy(), generateMealCategory(), generateDescription(), generateDifficulty(), generatePrepDuration(), generateChildId(i), generatePreDefinitionity(i)));
        }
    }

    String generateDesignation() {
        List<String> names = Arrays.asList("porridge", "milk", "potato puree", "grated apple", "boiled broccoli", "boiled carrot", "water", "pear mousse", "vegetable salad");
        Collections.shuffle(names);
        return names.get(0);
    }

    private int generateEnergy() {
        return new Random().nextInt(900);
    }

    private String generateMealCategory() {
        List<String> categories = Arrays.asList("BREAKFAST", "DINNER", "SUPPER", "SNACK");
        Collections.shuffle(categories);
        return categories.get(0);
    }

    private String generateDescription() {
        return new Random().ints(97, 123)
                .limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private String generateDifficulty() {
        List<String> categories = Arrays.asList("EASY", "MEDIUM", "HARD");
        Collections.shuffle(categories);
        return categories.get(0);
    }

    private int generatePrepDuration() {
        return 5 + (int) (new Random().nextFloat() * (30 - 5));
    }

    private Integer generateChildId(int i) {
        return i % 5 == 0 ? 2 : 1;
    }

    private int generatePreDefinitionity(int i) {
        return i % 7 == 0 ? 1 : 0;
    }
}
