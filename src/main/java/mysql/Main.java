package mysql;

public class Main {
    public static void main(String[] args) {
        MysqlnsertIntoMeal mealInsert = new MysqlnsertIntoMeal();
        WriteToFile writer = new WriteToFile("B://Dokumenty//SqlScripts//mealInsert.sql");

        writer.write(mealInsert.insertIntoMealTable(50));
    }
}
