import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.ResultSet;

public class model {
    public static String url = "jdbc.sqlite:sql_gerenciamento.db";
    public void insert_User(String nome,String nascimento,String cpf){

        String sql = "INSERT INTO Usario(nome,nascimento,cpf) VALUES(?,?,?)";
        try (Connection conn = this.connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setString(2, nascimento);
            pstmt.setString(3, cpf);
            pstmt.executeUpdate();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } // Final do metodo
    
    private Connection connect(){
        Connection conn = null;

        try{
         conn = DriverManager.getConnection(url);   
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
            return conn;
    }// Final do metodo connection
    public static void main(String[] args) {
        model mod = new  model();
        mod.insert_User("nome","08/10/2003","123456789-10");
    }
    }// Final da classe



