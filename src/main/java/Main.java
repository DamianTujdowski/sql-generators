import inserts.IngredientTableDataGenerator;
import inserts.MealTableDataGenerator;
import inserts.WriteToFile;

public class Main {
    public static void main(String[] args) {
        WriteToFile writer = new WriteToFile();
        if (args[0].equals("m")) {
            MealTableDataGenerator mealGenerator = new MealTableDataGenerator();
            writer.setPath(args[1] + "/insertIntoMealTable.sql");
            writer.write(mealGenerator.generateInsertIntoQueries(args[2]));
        } else {
            IngredientTableDataGenerator ingredientGenerator = new IngredientTableDataGenerator();
            writer.setPath(args[1] + "/insertIntoIngredientTable.sql");
            writer.write(ingredientGenerator.generateInsertIntoQueries(args[2]));
        }
    }
}
