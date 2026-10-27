
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/sistema_pago_salarios";

    private static final String USER = "postgres";

    private static final String PASSWORD = "12345678";

    public static Connection conectar() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(
                    URL, USER, PASSWORD);

            System.out.println("Conectado a PostgreSQL");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(
                    "Error de conexión: " + e.getMessage());
        }

        return conn;
    }
    
}
