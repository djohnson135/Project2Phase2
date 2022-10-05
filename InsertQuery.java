import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class InsertQuery{
    public static Random random_method = new Random();
    public static NamesDict dict = new NamesDict();
  public static List<String> days = new ArrayList<>(Arrays.asList(
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
    ));
  public static String populateOrders(){

    String createTableQuery = "CREATE TABLE Orders (orderID SERIAL PRIMARY KEY, firstName varchar(25), lastName varchar(25), price float, orderDay varchar(25));";
    // String primaryKey = "ALTER TABLE Orders ADD COLUMN orderID SERIAL PRIMARY KEY";
    String insertQuery = "";
    float totalOrder = 0;
    float order = 0;
    for (int i=0; i < 24; i++){
      String Day = days.get(i %6);
      if (Day == "Saturday" || Day == "Friday"){
        while (totalOrder < 5000){
          order = (float) (random_method.nextFloat() * 35.00f);
          totalOrder += order;
          insertQuery += " INSERT INTO Orders (firstName, lastName, price, orderDay) VALUES ('" 
          + dict.names.get(random_method.nextInt(dict.names.size()))
          + "', '" + dict.names.get(random_method.nextInt(dict.names.size()))
          + "'," +  String.valueOf(order) + " ,'" + Day +"' );";
        }
      }else{
        while (totalOrder <3000){
          order = (float) (random_method.nextFloat() * 35.00f);
          totalOrder += order;
          insertQuery += " INSERT INTO Orders (firstName, lastName, price, orderDay) VALUES ('" 
          + dict.names.get(random_method.nextInt(dict.names.size()))
          + "', '" + dict.names.get(random_method.nextInt(dict.names.size()))
          + "'," +  String.valueOf(order) + " ,'" + Day +"' );";
        }
      }
      totalOrder = 0;
      
    }
    
    // System.out.println(createTableQuery + insert);

    //insert randomized rows
    return createTableQuery + insertQuery;
  }
}