import java.sql.*;
import javax.swing.JOptionPane;
public class BDCC {
	
	
	
	
	public static Connection conector(){
		 Connection c = null;
		 String driver = "com.mysql.jdbc.Driver";
		 String dbname = "cinematos";
		String url = "jdbc:mysql://localhost:3306/"+dbname;
		 String login = "root";
		 String senha = "";
		try{
			Class.forName(driver);
			c = DriverManager.getConnection(url,login,senha);
			return c;
		}
			catch (ClassNotFoundException erro){
				JOptionPane.showMessageDialog(null,"Driver não encontrado\n" + erro.toString());
				return null;
			}
			catch (SQLException erro){
				JOptionPane.showMessageDialog(null,"Problema de conexão com a fonte de dados\n" + erro.toString());
				return null;
			}
			
		}
	public void close(){
		try{
			conector().close();
			
		}catch(SQLException erro){
			
		}
	}
	
	}


