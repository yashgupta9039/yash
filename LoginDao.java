/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Dbconnection.MyCon;
import Model.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author PC
 */
public class LoginDao {

     public boolean signUp(Registration r) throws Exception
    {
        String sql="insert into registration values(?,?,?)";
        Connection con = MyCon.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,r.getUsername());
         ps.setString(2,r.getPassword());
          ps.setString(3,r.getEmail());
          if(ps.executeUpdate()>0)
              return true;
          else
              return false;
    }

    public Registration checkLogin(String user, String pass) throws Exception   
    {
         Connection con=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;
         sql="select * from registration where username=? and password=?";
         ps=con.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, pass);
         Registration r = new Registration();
        ResultSet  rs=ps.executeQuery();
     //    System.out.println("yoyoyoyo");
      
        boolean status=rs.next();
        System.out.println(status);
         if(status)
         {
                // System.out.println("yash here"); 
             r.setUsername(rs.getString(1));
             r.setPassword(rs.getString(2));
              r.setEmail(rs.getString(3));
              return r;
         }
         else
         {
       //      System.out.println("java here");
             r= null;
             return r;
         }
    }
}