import java.sql.*;

class Connection {
    public static void main(String args[]) {
        try {
            // Step 1: Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Establish the connection
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String pass = "test@123";
            Connection con = DriverManager.getConnection(url, user, pass);
            // Step 3: Creation of Statement
            Statement stmt = con.createStatement();
            // Step 4: Execution of Query/Sql
            String sql = "select * from person";
            ResultSet rs = stmt.executeQuery(sql); // select
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
            }
            // Step 5: Closing of Database Connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
