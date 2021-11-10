/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package QuanLySinhVien;
/**
 *
 * @author Tran Trong Nghia MSSV: 17520802
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {
    private Connection conn;
    private Statement stmt;
    private PreparedStatement preparedStmt;
    
    public DatabaseConnect() throws SQLException, ClassNotFoundException{
        conn = getSqlConnection();
        stmt = conn.createStatement();
    }
    
    private Connection getSqlConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //Change suitable database name, user, password below to run program
        String connectionURL = "jdbc:sqlserver://localhost:1433;"+"databaseName=BTH4;user=sa;password=nghiatran";
        Connection conn = DriverManager.getConnection(connectionURL);
        return conn;
    }
    
    public ResultSet getAllStudents() throws SQLException{
        String query = "select * from SINHVIEN SV, DIEM D where SV.mssv = D.mssv";
        return stmt.executeQuery(query);
    }
    
    private void addStudentInformation(Student sv) throws SQLException {
        String sinhVien = "insert into SINHVIEN(mssv,hoTen,ngaySinh) values(?,?,?)";
        preparedStmt = conn.prepareStatement(sinhVien);
        preparedStmt.setString(1, sv.getMssv());
        preparedStmt.setString(2, sv.getName());
        preparedStmt.setDate(3, sv.getBirthDay());
        preparedStmt.executeUpdate();
        preparedStmt.close();
    }
    
    private void addStudentScore(Student sv) throws SQLException{
        String diem = "insert into DIEM(mssv,toan,ly,hoa) values (?,?,?,?)";
        preparedStmt = conn.prepareStatement(diem);
        preparedStmt.setString(1, sv.getMssv());
        preparedStmt.setFloat(2, sv.getDiemToan());
        preparedStmt.setFloat(3, sv.getDiemLy());
        preparedStmt.setFloat(4, sv.getDiemHoa());
        preparedStmt.executeUpdate();
        preparedStmt.close();
    }
    
    public void addStudent(Student sv) throws SQLException{
        addStudentInformation(sv);
        addStudentScore(sv);
    }
    

    
    private void deleteDiem(String mssv) throws SQLException{
        String deleteDiem = "delete from DIEM where mssv = ?";
        preparedStmt = conn.prepareStatement(deleteDiem);
        preparedStmt.setString(1, mssv);
        preparedStmt.executeUpdate();
        preparedStmt.close();
    }
     private void deleteInformation(String mssv) throws SQLException{
        String deleteInfo = "delete from SINHVIEN where mssv = ?";
        preparedStmt = conn.prepareStatement(deleteInfo);
        preparedStmt.setString(1, mssv);
        preparedStmt.executeUpdate();
        preparedStmt.close();
    }
    
    public void deleteStudent(String mssv) throws SQLException{
        deleteDiem(mssv);
        deleteInformation(mssv);
    }
    
    public void updateStudent(Student sv) throws SQLException{
        deleteStudent(sv.getMssv());
        addStudent(sv);
    }
}
