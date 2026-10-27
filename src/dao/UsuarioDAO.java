
package dao;
import conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public boolean login(String usuario, String contrasena) {
        boolean valido = false;

        String sql = "SELECT usuario FROM usuario "
                + "WHERE usuario = ? "
                + "AND contrasena_hash = crypt(?, contrasena_hash) "
                + "AND estado = 'ACTIVO'";

        try (Connection conn = ConexionDB.conectar()) {

            if (conn == null) {
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, usuario);
                ps.setString(2, contrasena);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        valido = true;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error login: " + e.getMessage());
        }

        return valido;
    }
}

