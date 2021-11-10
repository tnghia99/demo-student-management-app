/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySinhVien;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Tran Trong Nghia MSSV: 17520802
 */
public class Student {
    private String mssv;
    private String name;
    private Calendar birthDay;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float DTB;
    
    public Student(){
        mssv = new String();
        name = new String();
        birthDay = new GregorianCalendar();
        
    }
    public Student(String ms, String nameStudent, Calendar day, float toan, float ly, float hoa){
        mssv = ms;
        name = nameStudent;
        birthDay = day;
        diemToan = toan;
        diemLy = ly;
        diemHoa = hoa;
        DTB = (toan + ly + hoa) / 3;
    }
    
    public String getName(){
        return name;
    }
    public String getMssv(){
        return mssv;
    }
    public Date getBirthDay(){
        return new Date(birthDay.getTimeInMillis());
    }

    public float getDiemToan() {
        return diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public float getDTB() {
        return DTB;
    }
    
    //set method
    public void setName(String name){
        this.name = name;
    }
    public void setMssv(String mssv){
        this.mssv = mssv;
    }
    public void setBirthday(String birthday){
        this.birthDay.setTimeInMillis(Date.valueOf(birthday).getTime());
    }
    public void setBirthday(Long date){
        birthDay.setTimeInMillis(date);
    }
    public void setToan(float toan){
        diemToan = toan;
    }
    public void setHoa(float hoa){
        diemHoa = hoa;
    }
    public void setLy(float ly){
        diemLy = ly;
    }
    public void setDTB(float DTB){
        this.DTB = round(DTB,2);
    }
    public Object [] insertTable(DateFormat fm){ // correct dateformat
        Object [] row = {mssv, name, fm.format(birthDay.getTime()), diemToan, diemLy, diemHoa, DTB};
        return row;
    }
    
    private static float round(float number, int decimalPlace) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
    }
    
}
