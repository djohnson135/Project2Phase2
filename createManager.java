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
    int[] sales = new int[3];
    for (int i = 0; i < 3; i++) {
      sales[i] = (int)(Math.random() * range) + min;
    }
    String managers = "CREATE TABLE managers(managerId SERIAL PRIMARY KEY, Name string, Location string, Sales float, Gross float);";

    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0001\", \"Steve\", \"College Station\", "+sales[0]+ ", "+sales[0]*12+");";
    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0002\", \"James\", \"College Station\", "+sales[1]+", "+sales[1]*11+");";
    managers = managers + "INSERT INTO managers (managerid, name, location, sales, gross) VALUES(\"0003\", \"Mary\", \"College Station\", "+sales[2]+", "+sales[2]*12.5+");";
   

    return managers;
  }

  public static String createServers() {
    String servers = "CREATE TABLE servers(serverId SERIAL PRIMARY KEY, Name string, Location string, Manager Foreign Key)";
    

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
}
