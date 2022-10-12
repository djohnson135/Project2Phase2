public class grantAccess {
    public static String access(String tableName) {
        return "grant all on " + tableName + " to csce315_915_erdman;"
        + "grant all on " + tableName + " to csce315_915_tao;"
        + "grant all on " + tableName + " to csce315_915_ramirez;"
        + "grant all on " + tableName + " to csce315_915_johnson;";
    }
}
