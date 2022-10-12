public class Inventory {
    public static String createInventory() {
        String inventory = "CREATE TABLE inventory(InventoryId SERIAL PRIMARY KEY, Quantity int);";
        int max = 300;
        int min = 50;
        int range = max - min + 1;
        for (int i = 1; i <= 47; i++) {
          int randQuant = (int)(Math.random() * range) + min;
          String quant= String.valueOf(randQuant);
          inventory = inventory +  "INSERT INTO inventory (Quantity) VALUES(" + quant + ");";
        }
        return inventory + grantAccess.access("inventory");
      }
}
