import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {
    private static final String URL = "jdbc:sqlite:kontak.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS kontak ("
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                   + "nama TEXT NOT NULL, "
                   + "nomor_telepon TEXT NOT NULL, "
                   + "kategori TEXT NOT NULL);";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
