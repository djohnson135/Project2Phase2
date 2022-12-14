public class queryString {
    public static String[] qString() {
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

        String[] stringOfQueries = {"SELECT COUNT(itemid) FROM item;", 
                                 "SELECT COUNT(orderid) FROM orders;",
                                 "SELECT MAX(price) FROM orders;",
                                 "SELECT MIN(price) FROM orders;",
                                 "SELECT AVG(price) FROM orders;",
                                 "SELECT MAX(price) FROM item;",
                                 "SELECT MIN(price) FROM item;",
                                 "SELECT AVG(price) FROM item;",
                                 "SELECT AVG(amount) FROM item;",
                                 "SELECT MAX(amount) FROM item;",
                                 "SELECT MIN(amount) FROM item;",
                                 "SELECT MAX(Quantity) FROM inventory;",
                                 "SELECT MIN(Quantity) FROM inventory;",
                                 "SELECT AVG(Quantity) FROM inventory;",
                                 "SELECT SUM(price) FROM orders;",
                                 "SELECT SUM(price) FROM orders WHERE orderday = 'Saturday';", 
                                 "SELECT SUM(price) FROM orders WHERE orderday = 'Monday';"};
                            
        return stringOfQueries;
      }
}

