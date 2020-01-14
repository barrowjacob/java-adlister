import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads{

    public MySQLAdsDao() throws SQLException {
        Config config = new Config();
        Connection connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
