import java.sql.*;

/*
CSCE 315
9-27-2021 Lab
 */
public class createManager {

  //Commands to run this script
  //This will compile all java files in this directory
  //javac *.java
  //This command tells the file where to find the postgres jar which it needs to execute postgres commands, then executes the code
  //Windows: java -cp ".;postgresql-42.2.8.jar" jdbcpostgreSQL
  //Mac/Linux: java -cp ".:postgresql-42.2.8.jar" jdbcpostgreSQL

  //MAKE SURE YOU ARE ON VPN or TAMU WIFI TO ACCESS DATABASE
  public static String createInventory(String inventory) {
    inventory = "CREATE TABLE itemInventory(InventoryId SERIAL PRIMARY KEY, Quantity int);";
    int max = 300;
    int min = 50;
    int range = max - min + 1;
    for (int i = 1; i <= 47; i++) {
      int randQuant = (int)(Math.random() * range) + min;
      inventory = inventory +  "INSERT INTO itemInventory (Quantity) VALUES(" + randQuant + ");";
    }
    System.out.println(inventory);
    return inventory;
  }

  public static String createManagers(String managers) { 
    int min = 1500;
    int max = 5000;
    int range = max - min + 1;
    int[] sales = new int[3];
    for (int i = 0; i < 3; i++) {
      sales[i] = (int)(Math.random() * range) + min;
    }
    managers = "CREATE TABLE managers(managerId SERIAL PRIMARY KEY, Name string, Location string, Sales float, Gross float);";

    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0001\", \"Steve\", \"College Station\", "+sales[0]+ ", "+sales[0]*12+");";
    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0002\", \"James\", \"College Station\", "+sales[1]+", "+sales[1]*11+");";
    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0003\", \"Mary\", \"College Station\", "+sales[2]+", "+sales[2]*12.5+");";
   

    return managers;
  }

  public static String createServers(String servers) {
    servers = "CREATE TABLE servers(serverId SERIAL PRIMARY KEY, Name string, Location string, Manager Foreign Key)";
    

    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0004\", \"Robert\", \"College Station\", \"0001\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0005\", \"Patricia\", \"College Station\", \"0001\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0006\", \"John\", \"College Station\", \"0001\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0007\", \"Jennifer\", \"College Station\", \"0001\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0008\", \"Michael\", \"College Station\", \"0001\");";
    
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0009\", \"Linda\", \"College Station\", \"0002\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0010\", \"Elizabeth\", \"College Station\", \"0002\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0011\", \"David\", \"College Station\", \"0002\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0012\", \"Barbara\", \"College Station\", \"0002\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0013\", \"William\", \"College Station\", \"0002\");";
    
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0014\", \"Richard\", \"College Station\", \"0003\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0015\", \"Joseph\", \"College Station\", \"0003\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0016\", \"Susan\", \"College Station\", \"0003\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0017\", \"Jessica\", \"College Station\", \"0003\");";
    servers = servers + "INSERT INTO servers (serverid, name, location, manager) VALUES(\"0018\", \"Thomas\", \"College Station\", \"0003\");";

    return servers;
  }

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

       String manager = "";
       manager = createManagers(manager);
       String sqlStatement = manager;
       String server = "";
       server = createServers(server);
       sqlStatement = sqlStatement + server;
       //  "select * from TeamMembers";
       
       //"CREATE TABLE testingAgain (Id int, Name varchar(255), Height int);";
       

       //send statement to DBMS
       //This executeQuery command is useful for data retrieval
       ResultSet result = stmt.executeQuery(sqlStatement);
       //OR
       //This executeUpdate command is useful for updating data
       //int result = stmt.executeUpdate(sqlStatement);

       //OUTPUT
       //You will need to output the results differently depeninding on which function you use
       System.out.println("--------------------Query Results--------------------");
       //while (result.next()) {
       //System.out.println(result.getString("column_name"));
       //}
       //OR
       System.out.println(result);
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
