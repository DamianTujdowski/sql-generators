import inserts.MealTableRandomDataGenerator;
import inserts.WriteToFile;

public class Main {
    public static void main(String[] args) {
        MealTableRandomDataGenerator mealInsert = new MealTableRandomDataGenerator();
        WriteToFile writer = new WriteToFile(args[0]);
        writer.write(mealInsert.generateInsertIntoQueries(args[1]));
    }
}
