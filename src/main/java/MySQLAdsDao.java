import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private static Connection connection;

    public MySQLAdsDao() throws SQLException {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }


    @Override
    public Long insert(Ad ad) throws SQLException {
    String insertQuery = "INSERT INTO ads(user_id, title, description) " +
        "VALUES ('" + ad.getUserId() +"','" + ad.getTitle() + "','" + ad.getDescription() +"')";
    Statement stmt = connection.createStatement();
        stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }

    //main for testing
    public static void main(String[] args) throws SQLException {
//       Ads adsDao = new MySQLAdsDao();
//       Ad testAd = new Ad(
//               1,
//               "test",
//               "please");
//        adsDao.insert(testAd);
//        List<Ad> ads = adsDao.all();
//        for (Ad ad : ads) {
//            System.out.println(ad);
//        }
    }
}
