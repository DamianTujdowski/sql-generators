import inserts.*;

public class Main {
    public static void main(String[] args) {
        WriteToFile writer = new WriteToFile();
        DataGenerator generator;
        String insertType = args[0], filePath = args[1], startId = args[2], queryQuantity = args[3], parentId = args[4];
        switch (insertType) {
            case "m":
                generator = new MealTableDataGenerator();
                writer.setPath(filePath);
                writer.write(generator.generateInsertIntoQueries(startId, queryQuantity, parentId));
                break;
            case "i":
                generator = new IngredientTableDataGenerator();
                writer.setPath(filePath);
                writer.write(generator.generateInsertIntoQueries(startId, queryQuantity, parentId));
                break;
            default:
                generator = new ConsumptionTimeTableDataGenerator();
                writer.setPath(filePath);
                writer.write(generator.generateInsertIntoQueries(startId, queryQuantity, parentId));
                break;
        }
        System.out.println(String.format("Next id = %d", Integer.parseInt(startId) + Integer.parseInt(queryQuantity) + 1));
    }
}
