package inserts;

abstract public class DataGenerator {

    abstract public String generateInsertIntoQueries(String startId, String rowsNumber, String id);

    abstract public String mapToSingleInsertIntoQuery(int rowId, String id);
}
