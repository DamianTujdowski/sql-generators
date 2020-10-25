import inserts.*;

public class Main {
    public static void main(String[] args) {
        WriteToFile writer = new WriteToFile();
        DataGenerator generator;
        switch (args[0]) {
            case "m":
                generator = new MealTableDataGenerator();
                writer.setPath(args[1] + "/insertIntoMealTable.sql");
                writer.write(generator.generateInsertIntoQueries(args[2], args[3]));
                break;
            case "i":
                generator = new IngredientTableDataGenerator();
                writer.setPath(args[1] + "/insertIntoIngredientTable.sql");
                writer.write(generator.generateInsertIntoQueries(args[2], args[3]));
                break;
            default:
                generator = new ConsumptionTimeTableDataGenerator();
                writer.setPath(args[1] + "/insertIntoConsumptionTimeTable.sql");
                writer.write(generator.generateInsertIntoQueries(args[2], args[3]));
                break;
        }
    }
}
