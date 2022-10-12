import java.sql.*;

/*
CSCE 315
9-27-2021 Lab
 */
public class jdbcpostgreSQL {

  //Commands to run this script
  //This will compile all java files in this directory
  //javac *.java
  //This command tells the file where to find the postgres jar which it needs to execute postgres commands, then executes the code
  //Windows: java -cp ".;postgresql-42.2.8.jar" jdbcpostgreSQL
  //Mac/Linux: java -cp ".:postgresql-42.2.8.jar" jdbcpostgreSQL

  //MAKE SURE YOU ARE ON VPN or TAMU WIFI TO ACCESS DATABASE
  public static void main(String args[]) {

    //Building the connection with your credentials
    Connection conn = null;
    String teamNumber = "42";
    String sectionNumber = "915";
    String dbName = "csce315_915_42";
    String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
    dbSetup myCredentials = new dbSetup(); 

    //Connecting to the database
    try {
        conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
     }

     System.out.println("Opened database successfully");

     try{
       //create a statement object
       Statement stmt = conn.createStatement();

       //Running a query
       //TODO: update the sql command here
      
      String[] query = queryString.qString();
      
      //UNCOMMENT THE CODE BELOW TO REBUILD DATABASE NOT ADVISED
      //------------------------------------------------------------------------------------------------
      // stmt.executeUpdate("drop table if exists orders;");
      // stmt.executeUpdate("drop table if exists item;" + Item.populateItems());
      // stmt.executeUpdate("drop table if exists inventory;" +Inventory.createInventory());
      // stmt.executeUpdate("drop table if exists manager;" + ManagerServer.createManagers());
      // stmt.executeUpdate("drop table if exists server;" +ManagerServer.createServers());
      // Order.populateOrders();
      //------------------------------------------------------------------------------------------------
      
      for (int i = 0; i < query.length; i++) {
        ResultSet result = stmt.executeQuery(query[i]);

        //OUTPUT
        //You will need to output the results differently depeninding on which function you use
        System.out.println("--------------------Query Results--------------------");
        while (result.next()) {
          System.out.println(result.getString(1));
        }
        //OR
        // System.out.println(result);
      }

   } catch (Exception e){
       e.printStackTrace();
       System.err.println(e.getClass().getName()+": "+e.getMessage());
       System.exit(0);
   }

    //closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } catch(Exception e) {
      System.out.println("Connection NOT Closed.");
    }//end try catch
  }//end main
}//end Class
