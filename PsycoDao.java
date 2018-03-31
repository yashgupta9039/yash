/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Dbconnection.MyCon;
import Model.PsycoTest;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class PsycoDao {
    public boolean Insert(PsycoTest pt) throws Exception
    {
        String sql="insert into personality1 values(?,?,?,?)";
        Connection con = MyCon.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,pt.getAge());
           ps.setInt(2,pt.getEngnat());  
           ps.setInt(3,pt.getGender());  
           ps.setInt(4,pt.getHand());  
//        ps.setInt(1,p.getE1());
//         ps.setInt(2,p.getE2());
//         ps.setInt(3,p.getE3());
//         ps.setInt(4,p.getE4());
//         ps.setInt(5,p.getE5());
//         ps.setInt(6,p.getE6());
//         ps.setInt(7,p.getE7());
//         ps.setInt(8,p.getE8());
//         ps.setInt(9,p.getE9());
//         ps.setInt(10,p.getE10());
//         ps.setInt(11,p.getN1());
//         ps.setInt(12,p.getN2());
//         ps.setInt(13,p.getN3());
//         ps.setInt(14,p.getN4());
//         ps.setInt(15,p.getN5());
//         ps.setInt(16,p.getN6());
//         ps.setInt(17,p.getN7());
//         ps.setInt(18,p.getN8());
//         ps.setInt(19,p.getN9());
//         ps.setInt(20,p.getN10());       
//         ps.setInt(21,p.getA1());
//         ps.setInt(22,p.getA2());
//         ps.setInt(23,p.getA3());
//         ps.setInt(24,p.getA4());
//         ps.setInt(25,p.getA5());
//         ps.setInt(26,p.getA6());
//         ps.setInt(27,p.getA7());
//         ps.setInt(28,p.getA8());
//         ps.setInt(29,p.getA9());
//         ps.setInt(30,p.getA10());
//         ps.setInt(31,p.getC1());
//         ps.setInt(32,p.getC2());
//         ps.setInt(33,p.getC3());
//         ps.setInt(34,p.getC4());
//         ps.setInt(35,p.getC5());
//         ps.setInt(36,p.getC6());
//         ps.setInt(37,p.getC7());
//         ps.setInt(38,p.getC8());
//         ps.setInt(39,p.getC9());
//         ps.setInt(40,p.getC10());
//          ps.setInt(41,p.getO1());
//         ps.setInt(42,p.getO2());
//         ps.setInt(43,p.getO3());
//         ps.setInt(44,p.getO4());
//         ps.setInt(45,p.getO5());
//         ps.setInt(46,p.getO6());
//         ps.setInt(47,p.getO7());
//         ps.setInt(48,p.getO8());
//         ps.setInt(49,p.getO9());
//         ps.setInt(50,p.getO10());
          if(ps.executeUpdate()>0)
              return true;
          else
              return false;
    }
}
