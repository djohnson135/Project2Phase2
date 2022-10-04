public class insertInventory {
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
}
