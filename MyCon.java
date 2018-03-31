
package Dbconnection;
import java.sql.*;
import java.lang.NumberFormatException;
public class MyCon
{
    public static Connection con=null;
    
    static
    {
      try
     {
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver load ");
     }
     catch(ClassNotFoundException e)
     {
         System.out.println(e);
     }    
    }

    public static Connection getConnection()
    {
       try
         {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Personality","root","root");
             System.out.println("database load ");
         }
         catch(SQLException e)
         {
            System.out.println(e);
          }    
          return con;      
      }
}
