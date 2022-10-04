public class insertItemsTable {
    public static String populateItems() {
    String createTable = "CREATE TABLE Items (itemID SERIAL PRIMARY KEY, name varchar(50), price float, amount int);";
    String insertTable = "";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chicken Biscuit', 3.55, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Spicy Chicken Biscuit', 3.85, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chicken Egg and Cheese Biscuit', 3.99, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chicken Egg and Cheese Muffin', 4.85, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chicken Sandwich', 4.79, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Deluxe Sandwich', 5.49, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Spicy Chicken Sandwich', 5.15, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Spicy Deluxe Sandwich', 5.85, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Grilled Chicken Sandwich', 6.49, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Nuggets', 4.85, 8);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Grilled Nuggets', 5.69, 8);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chick-n-Strips', 5.19, 3);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Cobb Salad', 9.49, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Spicy Southwest Salad', 9.69, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Waffle Potato Fries', 2.35, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Mac & Cheese', 3.99, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chicken Noodle Soup', 3.85, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Market Salad', 9.69, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chocolate Chunk Cookie', 1.65, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chocolate Fudge Brownie', 2.25, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Milkshake', 4.45, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Icedream', 1.69, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Iced Tea Sweetened', 2.19, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Iced Tea Unsweetened', 2.19, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Lemonade', 2.55, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Diet Lemonade', 2.55, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Coffee', 2.19, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Coca-Cola', 2.19, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Dr Pepper', 2.19, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Water', 2.25, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Barbeque Sauce', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Chick-fil-A Sauce', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Ranch Sauce', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Hash Browns', 1.55, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Buttered Biscuit', 1.35, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('English Muffin', 1.55, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Egg', .60, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Cheese', .30, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Sandwich Buns', .25, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Pickles', 0, 2);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Lettuce', .20, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Sliced Tomatoes', .20, 2);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Cups', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Straws', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Bags', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Napkins', 0, 1);";
    insertTable += 
    "INSERT INTO Items (name, price, amount)" + 
    "VALUES ('Utensils', 0, 1);";             
    return createTable + insertTable;
  }
    
}
