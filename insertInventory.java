public class insertInventory {
    public static String createInventory() {
        String inventory = "CREATE TABLE Inventory(InventoryId SERIAL PRIMARY KEY, Quantity int);";
        int max = 300;
        int min = 50;
        int range = max - min + 1;
        for (int i = 1; i <= 47; i++) {
          int randQuant = (int)(Math.random() * range) + min;
          String quant= String.valueOf(randQuant);
          inventory = inventory +  "INSERT INTO Inventory (Quantity) VALUES(" + quant + ");";
        }
        return inventory;
      }
}
