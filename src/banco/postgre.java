package banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class postgre {

    public static void main(String[] args) {
        String driver = "org.postgresql.Driver";
        String user = "admin";
        String senha = "admin";
        String url = "jdbc:postgresql://localhost:5432/crud_funcioanrio";

        try {
            Class.forName(driver);
            Connection con = null;

            con = (Connection) DriverManager.getConnection(url, user, senha);

            JOptionPane.showMessageDialog(null, "Conexão realizada com Sucesso!");

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }
}