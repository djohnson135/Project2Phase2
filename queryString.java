public class queryString {
    public static String qString() {
        //1. count the number of items
        //2. count the number of orders
        //3. max order price
        //4. min order price
        //5. average order price
        //6. max item price
        //7. min item price
        //8. average item price
        //9. average item availibility
        //10. Most amounted item
        //11. Least amounted item
        //12. Most quantity of an item
        //13. Least quantity of an item
        //14. Average quantity of an item
        //15. total sum of orders
        //16. sum for all the saturdays
        //17. sum for all the sundays

        String stringOfQueries = "SELECT COUNT(itemid) FROM items;" + 
                                 "SELECT COUNT(orderid) FROM orders;" +
                                 "SELECT MAX(price) FROM orders;" +
                                 "SELECT MIN(price) FROM orders;" +
                                 "SELECT AVG(price) FROM orders;" +
                                 "SELECT MAX(price) FROM items;" +
                                 "SELECT MIN(price) FROM items;" +
                                 "SELECT AVG(price) FROM items;" +
                                 "SELECT AVG(amount) FROM items;" +
                                 "SELECT MAX(amount) FROM items;" +
                                 "SELECT MIN(amount) FROM items;" +
                                 "SELECT MAX(quantity) FROM inventory;" +
                                 "SELECT MIN(quantity) FROM inventory;" +
                                 "SELECT AVG(quantity) FROM inventory;" +
                                 "SELECT SUM(quantity) FROM orders;" +
                                 "SELECT SUM(quantity) FROM orders WHERE orderday = 'Saturday';" + 
                                 "SELECT SUM(quantity) FROM orders WHERE orderday = 'Sunday';";
                            
        return stringOfQueries;
      }
}

