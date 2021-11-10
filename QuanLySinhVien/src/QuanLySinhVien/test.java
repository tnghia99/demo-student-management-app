/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySinhVien;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Trong Nghia MSSV: 17520802
 */
public class test {
    public static void main(String[] args) {
        try {
            DatabaseConnect db = new DatabaseConnect();
            ResultSet rs = db.getAllStudents();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
