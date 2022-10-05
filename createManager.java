public class createManager {
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

  public static String createManagers() { 
    int min = 1500;
    int max = 5000;
    int range = max - min + 1;
    float[] sales = new float[3];
    for (int i = 0; i < 3; i++) {
      sales[i] = (float)(Math.random() * range) + min;
    }
    String managers = "CREATE TABLE manager(managerId SERIAL PRIMARY KEY, Name varchar(25), Location varchar(50), Sales float, Gross float);"

    + " INSERT INTO manager (Name, Location, Sales, Gross) VALUES( 'Steve', 'College Station', "+ String.valueOf(sales[0]) + ", "+String.valueOf(sales[0] * 12)+");"
    + " INSERT INTO manager ( Name, Location, Sales, Gross) VALUES( 'James', 'College Station', "+String.valueOf(sales[1])+", "+String.valueOf(sales[1] * 11)+");"
    + " INSERT INTO manager ( Name, Location, Sales, Gross) VALUES('Mary', 'College Station', "+String.valueOf(sales[2])+", "+String.valueOf(sales[2] * 12.5)+");";
   
    System.out.println(managers);
    return managers;
  }

  public static String createServers() {
    String servers = "CREATE TABLE server(serverId SERIAL PRIMARY KEY, Name varchar(25), Location varchar(50));"
    

    + " INSERT INTO server ( Name, Location) VALUES('Robert', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Patricia', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'John', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Jennifer', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Michael', 'College Station');"
    
     + " INSERT INTO server ( Name, Location) VALUES( 'Linda', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Elizabeth', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'David', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Barbara', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'William', 'College Station');"
    
     + " INSERT INTO server ( Name, Location) VALUES( 'Richard', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Joseph', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Susan', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Jessica', 'College Station');"
     + " INSERT INTO server ( Name, Location) VALUES( 'Thomas', 'College Station');";

    return servers;
  } 
}
