import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.sql.*;
public final class Order{
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


  public static Connection dbConnect(){
    Connection conn = null;
    String teamNumber = "42";
    String sectionNumber = "915";
    String dbName = "csce315_915_42";
    String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
    dbSetup myCredentials = new dbSetup(); 
    try {
        conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
    } 
    return conn;
  }

  public static void executeStatement(Connection conn, String query){
    
    try{
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(query);

    }catch (Exception e){
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
  }
  

  public static float getItemPrice(Connection conn, int itemID){
    float returnVal = 0;
    try{
      Statement stmt = conn.createStatement();
      ResultSet query = stmt.executeQuery("SELECT price FROM item where itemID = " + String.valueOf(itemID)+ ";");
      query.next();
      returnVal = Float.parseFloat(query.getString(1));
      // System.out.println("itemID: " + String.valueOf(itemID)+ ", price: " + Float.toString(returnVal));

    }catch (Exception e){
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    // System.out.println("rounded: " + (float) Math.round(returnVal*100)/100);
    return (float) Math.round(returnVal*100)/100;
  }



  public static void setOrderPrice(Connection conn, int orderNum, float orderPrice){
    // System.out.println("Standard: " +orderPrice + " valueOf: " + String.valueOf(orderPrice))
    try{
      String query_stmt = "update orders set price = " + String.valueOf(orderPrice) + " where OrderNum = " + String.valueOf(orderNum) + ";";
      // String query_stmt = "update orders set price = 88;";
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(query_stmt);
    }catch (Exception e){
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    
  }


  public static String populateOrders(){

    String createTableQuery = "CREATE TABLE orders (orderID SERIAL Primary Key, OrderNum int, firstName varchar(25), lastName varchar(25), price float, orderDay varchar(25), itemID int,  Foreign Key (itemID) references item (itemID));";
    
    // String primaryKey = "ALTER TABLE Orders ADD COLUMN orderID SERIAL PRIMARY KEY";
    String insertQuery = "";
    float totalCost = 0f;
    int menu_items_size = 20;
    int order_num = 1;
    Connection conn = dbConnect();
    executeStatement(conn, createTableQuery);

    for (int i = 0; i < 24; i++){
      String Day = days.get(i %6);
      if (Day == "Saturday" || Day == "Friday"){
        for (int j =0; j < 450; j++){
          String firstName = dict.names.get(random_method.nextInt(dict.names.size()));
          String lastName = dict.names.get(random_method.nextInt(dict.names.size()));
          int fk_num = random_method.nextInt(3);
          int item_ID = random_method.nextInt(20) + 1;
          insertQuery += " INSERT INTO orders (orderNum, firstName, lastName, price, orderDay, itemID) VALUES (" 
            + String.valueOf(order_num)
            + ", '" + firstName
            + "', '" + lastName
            + "'," +  String.valueOf(totalCost) 
            + " ,'" + Day +"', " + String.valueOf(item_ID) +" );";
          
          totalCost += getItemPrice(conn, item_ID);
          
          for(int k = 0; k < fk_num; k++){
            item_ID = random_method.nextInt(20)+1;
            insertQuery += " INSERT INTO orders (orderNum, firstName, lastName, price, orderDay, itemID) VALUES ("  
            + String.valueOf(order_num)
            + ", '" +firstName
            + "', '" + lastName
            + "'," +  String.valueOf(totalCost) 
            + " ,'" + Day + "', " + String.valueOf(item_ID) +" );";
            totalCost += getItemPrice(conn, item_ID);
          }
          executeStatement(conn, insertQuery);
          totalCost = (float) Math.round(totalCost*100)/100;
          setOrderPrice(conn, order_num, totalCost);
          totalCost = 0;
          order_num++;
          insertQuery = "";
        }
      }else{
        for (int j =0; j < 300; j++){
          String firstName = dict.names.get(random_method.nextInt(dict.names.size()));
          String lastName = dict.names.get(random_method.nextInt(dict.names.size()));
          int fk_num = random_method.nextInt(3);
          int item_ID = random_method.nextInt(20) + 1;
          insertQuery += " INSERT INTO orders (orderNum, firstName, lastName, price, orderDay, itemID) VALUES (" 
            + String.valueOf(order_num)
            + ", '" + firstName
            + "', '" + lastName
            + "'," +  String.valueOf(totalCost) 
            + " ,'" + Day +"', " + String.valueOf(item_ID) +" );";
          
          totalCost += getItemPrice(conn, item_ID);
          
          for(int k = 0; k < fk_num; k++){
            item_ID = random_method.nextInt(20)+1;
            insertQuery += " INSERT INTO orders (orderNum, firstName, lastName, price, orderDay, itemID) VALUES ("  
            + String.valueOf(order_num)
            + ", '" +firstName
            + "', '" + lastName
            + "'," +  String.valueOf(totalCost) 
            + " ,'" + Day + "', " + String.valueOf(item_ID) +" );";
            totalCost += getItemPrice(conn, item_ID);
          }
          executeStatement(conn, insertQuery);
          totalCost = (float) Math.round(totalCost*100)/100;
          setOrderPrice(conn, order_num, totalCost);
          totalCost = 0;
          order_num++;
          insertQuery = "";
        }
      }
    }

    
    // System.out.println(createTableQuery + insert);

    //insert randomized rows
    // System.out.println(insertQuery);
    return createTableQuery + insertQuery + grantAccess.access("orders");
  }
}