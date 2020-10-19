package inserts;

abstract class DataGenerator {

    abstract String generateInsertIntoQueries(String rowsNumber);

    abstract String mapToSingleInsertIntoQuery(int id);
}
