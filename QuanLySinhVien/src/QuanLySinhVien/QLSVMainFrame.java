/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package QuanLySinhVien;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tran Trong Nghia MSSV: 17520802
 */
public class QLSVMainFrame extends javax.swing.JFrame {

    private Student SinhVien;
    private String name;
    private String mssv;
    private float toan;
    private float ly;
    private float hoa;
    private Calendar birthDay;
    private DateFormat fm;
    private DefaultTableModel tbModel;
    private ResultSet rs;
    private DatabaseConnect dataBase;

    
    public QLSVMainFrame() {
        initComponents();
        name = new String();
        mssv = new String();
        toan = ly = hoa = -1;
        birthDay = new GregorianCalendar(0, 0, 0);
        this.activeButton();
        fm = new SimpleDateFormat("dd/MM/yyyy");
        fm.setLenient(false); 
        ftfBirthDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(fm))); 
        ftfBirthDay.setFocusLostBehavior(JFormattedTextField.PERSIST);
        tbModel = (DefaultTableModel)tbStudents.getModel();
        setSaveButton();
        this.setLocationRelativeTo(null);
        setCancelButton();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        dialogSearching = new javax.swing.JDialog();
        pnSearching = new javax.swing.JPanel();
        lbMssvSearching = new javax.swing.JLabel();
        lbNameSearching = new javax.swing.JLabel();
        cbMssvSearching = new javax.swing.JCheckBox();
        cbNameSearching = new javax.swing.JCheckBox();
        tfMssvSearching = new javax.swing.JTextField();
        tfNameSearching = new javax.swing.JTextField();
        btnOkSearching = new javax.swing.JButton();
        btnCancelSearching = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnStudentInfomation = new javax.swing.JPanel();
        lbMssv = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbBirthDay = new javax.swing.JLabel();
        tfMssv = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        ftfBirthDay = new javax.swing.JFormattedTextField();
        lbMathScore = new javax.swing.JLabel();
        lbPhiscScore = new javax.swing.JLabel();
        lbChemScore = new javax.swing.JLabel();
        tfMathScore = new javax.swing.JTextField();
        tfPhiscScore = new javax.swing.JTextField();
        tfChemScore = new javax.swing.JTextField();
        pnListStudent = new javax.swing.JPanel();
        spTableStudents = new javax.swing.JScrollPane();
        tbStudents = new javax.swing.JTable();
        btnDataBase = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        dialogSearching.setAutoRequestFocus(false);
        dialogSearching.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogSearching.setModalExclusionType(null);
        dialogSearching.setModalityType(null);
        dialogSearching.setResizable(false);
        dialogSearching.setSize(new java.awt.Dimension(390, 290));

        pnSearching.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbMssvSearching.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMssvSearching.setText("MSSV");

        lbNameSearching.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNameSearching.setText("Tên");

        javax.swing.GroupLayout pnSearchingLayout = new javax.swing.GroupLayout(pnSearching);
        pnSearching.setLayout(pnSearchingLayout);
        pnSearchingLayout.setHorizontalGroup(
            pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSearchingLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNameSearching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMssvSearching, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnSearchingLayout.createSequentialGroup()
                        .addComponent(cbNameSearching)
                        .addGap(18, 18, 18)
                        .addComponent(tfNameSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSearchingLayout.createSequentialGroup()
                        .addComponent(cbMssvSearching)
                        .addGap(18, 18, 18)
                        .addComponent(tfMssvSearching)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnSearchingLayout.setVerticalGroup(
            pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSearchingLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMssvSearching, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMssvSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMssvSearching))
                .addGap(33, 33, 33)
                .addGroup(pnSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNameSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNameSearching, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNameSearching))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnOkSearching.setText("OK");
        btnOkSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSearchingActionPerformed(evt);
            }
        });

        btnCancelSearching.setText("Cancel");
        btnCancelSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSearchingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogSearchingLayout = new javax.swing.GroupLayout(dialogSearching.getContentPane());
        dialogSearching.getContentPane().setLayout(dialogSearchingLayout);
        dialogSearchingLayout.setHorizontalGroup(
            dialogSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSearchingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogSearchingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOkSearching)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelSearching))
                    .addComponent(pnSearching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dialogSearchingLayout.setVerticalGroup(
            dialogSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSearchingLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnSearching, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogSearchingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelSearching)
                    .addComponent(btnOkSearching))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnStudentInfomation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Thông tin sinh viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        pnStudentInfomation.setToolTipText("");
        pnStudentInfomation.setFocusable(false);
        pnStudentInfomation.setName(""); // NOI18N
        pnStudentInfomation.setOpaque(false);
        pnStudentInfomation.setRequestFocusEnabled(false);
        pnStudentInfomation.setVerifyInputWhenFocusTarget(false);

        lbMssv.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbMssv.setText("Mã số sinh viên: ");

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbName.setText("Tên sinh viên: ");

        lbBirthDay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbBirthDay.setText("Ngày sinh:");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setText("Xoá");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lbMathScore.setText("Điểm Toán");

        lbPhiscScore.setText("Điểm Lý");

        lbChemScore.setText("Điểm Hóa");

        javax.swing.GroupLayout pnStudentInfomationLayout = new javax.swing.GroupLayout(pnStudentInfomation);
        pnStudentInfomation.setLayout(pnStudentInfomationLayout);
        pnStudentInfomationLayout.setHorizontalGroup(
            pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStudentInfomationLayout.createSequentialGroup()
                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnStudentInfomationLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBirthDay)
                            .addGroup(pnStudentInfomationLayout.createSequentialGroup()
                                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMssv)
                                    .addComponent(lbName))
                                .addGap(18, 18, 18)
                                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ftfBirthDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMssv, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbMathScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPhiscScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbChemScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMathScore, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(tfPhiscScore)
                            .addComponent(tfChemScore)))
                    .addGroup(pnStudentInfomationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        pnStudentInfomationLayout.setVerticalGroup(
            pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStudentInfomationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMssv)
                    .addComponent(tfMssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMathScore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMathScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPhiscScore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhiscScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChemScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbBirthDay)
                        .addComponent(ftfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfChemScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnStudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addGap(24, 24, 24))
        );

        pnListStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Danh sách sinh viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tbStudents.setAutoCreateRowSorter(true);
        tbStudents.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ Tên", "Ngày sinh", "Toán", "Lý", "Hóa", "DTB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudents.setEditingColumn(0);
        tbStudents.setEditingRow(0);
        tbStudents.setGridColor(new java.awt.Color(255, 255, 255));
        spTableStudents.setViewportView(tbStudents);

        javax.swing.GroupLayout pnListStudentLayout = new javax.swing.GroupLayout(pnListStudent);
        pnListStudent.setLayout(pnListStudentLayout);
        pnListStudentLayout.setHorizontalGroup(
            pnListStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTableStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        pnListStudentLayout.setVerticalGroup(
            pnListStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTableStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnDataBase.setText("CSDL");
        btnDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaseActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnListStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnStudentInfomation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnStudentInfomation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnListStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataBase)
                    .addComponent(btnExit)
                    .addComponent(btnFind))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Check if table is empty
    private boolean isTableEmpty(){
        if(tbStudents != null && tbStudents.getModel() != null){
            return tbStudents.getModel().getRowCount()<= 0;
        }
        return false;
    }

    private void activeButton(){
        if(this.isTableEmpty()){
            btnEdit.setEnabled(false);
            btnRemove.setEnabled(false);
            btnAdd.setEnabled(false);
            btnFind.setEnabled(false);
        }
        else{
            btnEdit.setEnabled(true);
            btnRemove.setEnabled(true);
            btnAdd.setEnabled(true);
            btnFind.setEnabled(true);
        }
    }
    private void setSaveButton(){
        pnStudentInfomation.add(btnSave);
        btnSave.setVisible(false);
        btnSave.setBounds(btnEdit.getBounds());
    }
    private void setCancelButton(){
        btnCancel.setBounds(btnFind.getBounds());
        this.add(btnCancel);
        btnCancel.setVisible(false);
    }
    private void clearTextField(){
        tfMssv.setText("");
        tfName.setText("");
        ftfBirthDay.setText("");
        tfMathScore.setText("");
        tfPhiscScore.setText("");
        tfChemScore.setText("");
    }
    private void setTextField(Student sv){
        tfMssv.setText(sv.getMssv());
        tfName.setText(sv.getName());
        ftfBirthDay.setText(fm.format(sv.getBirthDay().getTime()));
        tfMathScore.setText(String.valueOf(sv.getDiemToan()));
        tfPhiscScore.setText(String.valueOf(sv.getDiemLy()));
        tfChemScore.setText(String.valueOf(sv.getDiemHoa()));
    }

    private Calendar parseDate() throws ParseException{
        Date temp;
        ftfBirthDay.commitEdit();
        temp = (Date)ftfBirthDay.getValue();
       
        Calendar date =  Calendar.getInstance();
        date.setTime(temp);
        ftfBirthDay.setText(fm.format(date.getTime())); //correct dateformat 
        return date;
    }

    private boolean isEmpty(){
        return (tfName.getText().isEmpty() || tfMssv.getText().isEmpty() || tfMathScore.getText().isEmpty() || 
                tfChemScore.getText().isEmpty() || tfPhiscScore.getText().isEmpty());
    }

    
    private ArrayList getMssv(){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0 ; i < tbModel.getRowCount(); i++){
            data.add(tbModel.getValueAt(i, 0).toString());
        }
        return data;
    }

    private boolean isMssvDuplicate(String mssv){
        ArrayList<String> savedMssv = getMssv();
        for(int i = 0 ; i < savedMssv.size() ; i++){
            if (mssv.compareTo(savedMssv.get(i)) == 0)
                return true;
        }
        return false;
    }
    
    private boolean updateRowData(int index) throws ParseException, SQLException{
        name = tfName.getText();
        mssv = tfMssv.getText();
        toan = Float.parseFloat(tfMathScore.getText());
        ly = Float.parseFloat(tfPhiscScore.getText());
        hoa = Float.parseFloat(tfChemScore.getText());
        if(isEmpty()){
            JOptionPane.showMessageDialog(this,"Mã số sinh viên, tên, ngày sinh không được để trống","Thông báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            birthDay = parseDate();
            Student change = new Student(mssv,name,birthDay,toan,ly,hoa);
            dataBase.updateStudent(change);
            tbModel.setValueAt(mssv, index, 0);
            tbModel.setValueAt(name, index, 1);
            tbModel.setValueAt(fm.format(birthDay.getTime()), index, 2);
            tbModel.setValueAt(toan, index, 3);
            tbModel.setValueAt(ly, index, 4);
            tbModel.setValueAt(hoa, index, 5);
            tbModel.setValueAt((toan + ly + hoa) / 3, index, 6);
            activeButton();
            return true;
        }
    }
    
    
    
    private Vector<String> getColumnNames() {
        Vector<String> columnNames = new Vector<>();
        for (int i = 0; i < tbStudents.getColumnCount(); i++)
            columnNames.add(tbStudents.getColumnName(i));
        return columnNames;
    }
    

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(isEmpty()){
            JOptionPane.showMessageDialog(this,"Mã số sinh viên, tên, ngày sinh không được để trống","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else if(isMssvDuplicate(tfMssv.getText())){
            JOptionPane.showMessageDialog(this,"Mã số sinh viên "+ mssv +" này đã tồn tại, vui lòng nhập lại mssv khác","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                name = tfName.getText();
                mssv = tfMssv.getText();
                toan = Float.parseFloat(tfMathScore.getText());
                ly = Float.parseFloat(tfPhiscScore.getText());
                hoa = Float.parseFloat(tfChemScore.getText());
                birthDay = parseDate();
                SinhVien = new Student(mssv,name,birthDay,toan,ly,hoa);
                dataBase.addStudent(SinhVien);
                tbModel.addRow(SinhVien.insertTable(fm));
                clearTextField();
                JOptionPane.showMessageDialog(this, "Thêm sinh viên " + mssv + " thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Không đúng định dạng ngày.\nNhập lại!", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Không thể thêm sinh viên vào CSDL", "Eror", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(QLSVMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        activeButton();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnExitActionPerformed

    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Student selectedStudent = new Student();
        if(tbStudents.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn sinh viên trong danh sách!!!","Thông báo",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                btnSave.setVisible(true);
                btnEdit.setVisible(false);
                btnAdd.setEnabled(false); //đang sửa thì không được thêm
                selectedStudent.setMssv(tbModel.getValueAt(tbStudents.getSelectedRow(),0).toString());
                selectedStudent.setName(tbModel.getValueAt(tbStudents.getSelectedRow(),1).toString());
                selectedStudent.setBirthday(fm.parse(tbModel.getValueAt(tbStudents.getSelectedRow(),2).toString()).getTime());
                selectedStudent.setToan((float)tbModel.getValueAt(tbStudents.getSelectedRow(), 3));
                selectedStudent.setLy((float)tbModel.getValueAt(tbStudents.getSelectedRow(), 4));
                selectedStudent.setHoa((float)tbModel.getValueAt(tbStudents.getSelectedRow(), 5));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Không đúng định dạng ngày.\nNhập lại!", "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(QLSVMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setTextField(selectedStudent);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int choser;
        int index = tbStudents.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn sinh viên trong danh sách!!!","Thông báo",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                String name = tbModel.getValueAt(index, 1).toString();
                String mssv = tbModel.getValueAt(index, 0).toString();
                choser = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá sinh viên "+name+" không", "Question", JOptionPane.YES_NO_OPTION);
                if(choser == JOptionPane.YES_OPTION){
                    dataBase.deleteStudent(mssv) ;
                    tbModel.removeRow(index);
                }
                else{
                        // Do nothing
                        }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Không thể xoá sinh viên","Error",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(QLSVMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBaseActionPerformed
        try {
            dataBase = new DatabaseConnect();
            rs = dataBase.getAllStudents();
            addRow(rs);
            activeButton();
            JOptionPane.showMessageDialog(this, "Mở CSDL thành công!","Message",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Không thể mở CSDL !","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDataBaseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if(updateRowData(tbStudents.getSelectedRow())){
                btnSave.setVisible(false);
                btnEdit.setVisible(true);
                btnAdd.setEnabled(true);
                clearTextField();
                JOptionPane.showMessageDialog(this, "Đã sửa lại thông tin", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng ngày.\nNhập lại!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Không thể thay đổi thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(QLSVMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       //dialogSearching.setSize(390, 287);
       dialogSearching.setLocationRelativeTo(this);
       dialogSearching.setVisible(true);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnCancelSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSearchingActionPerformed
        dialogSearching.dispose();
    }//GEN-LAST:event_btnCancelSearchingActionPerformed

    private void btnOkSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSearchingActionPerformed
        DefaultTableModel result = new DefaultTableModel();
        if(!cbMssvSearching.isSelected() && !cbNameSearching.isSelected()){
            JOptionPane.showMessageDialog(this, "Chưa chọn loại tìm kiếm !", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(cbMssvSearching.isSelected() && cbNameSearching.isSelected()){
                result = checkBoth(tfNameSearching.getText(), tfMssvSearching.getText());
                dialogSearching.dispose();
            }else if(cbMssvSearching.isSelected()){
                result = checkMssv(tfMssvSearching.getText());
                dialogSearching.dispose();
            }else if(cbNameSearching.isSelected()){
                result = checkName(tfNameSearching.getText());
                dialogSearching.dispose();
            }
            if(result.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin", "Message", JOptionPane.INFORMATION_MESSAGE);
            }else{
                tbStudents.setModel(result);
                tbStudents.repaint();
                btnFind.setVisible(false);
                btnCancel.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnOkSearchingActionPerformed
    //exit search
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        tbStudents.setModel(tbModel);
        tbStudents.repaint();
        btnCancel.setVisible(false);
        btnFind.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    private DefaultTableModel checkBoth(String nameSearching,String mssvSearching){ //Kiểm tra cả 2 trường hợp
        DefaultTableModel result = new DefaultTableModel();
        DefaultTableModel checkName = checkName(nameSearching);
        DefaultTableModel checkMssv = checkMssv(mssvSearching);
        for(int i = 0; i < checkName.getRowCount() ; i++){
            if(checkMssv.getValueAt(0, 0) == checkName.getValueAt(i, 0))
                result.addRow((Vector) checkName.getDataVector().elementAt(i));
        }
        return result;
    }
    private DefaultTableModel checkName(String nameSearching){
        DefaultTableModel result = new DefaultTableModel();   
        result.setColumnIdentifiers(getColumnNames());
        String nameChecking;
        int rowCount = tbModel.getRowCount();
        for(int i = 0 ; i < rowCount ; i++){    
            nameChecking = (String) tbModel.getValueAt(i, 1);
            if(nameSearching.equals((nameChecking))){
                result.addRow((Vector)tbModel.getDataVector().elementAt(i));
            }
        }
        return result;
    }
private DefaultTableModel checkMssv(String mssvSearching){
        DefaultTableModel result = new DefaultTableModel(); 
        result.setColumnIdentifiers(getColumnNames());
        String mssvChecking;
        int rowCount = tbModel.getRowCount();
        for(int i = 0 ; i < rowCount ; i++){    
            mssvChecking = (String) tbModel.getValueAt(i, 0);
            if(mssvSearching.equals((mssvChecking))){
                result.addRow((Vector)tbModel.getDataVector().elementAt(i));
            }
        }
        return result;
    }

    private void addRow(ResultSet rs){
        Student sv = new Student();
        try {
            while(rs.next()){
                sv.setName(rs.getString(2));
                sv.setMssv(rs.getString(1));
                sv.setBirthday(rs.getDate(3).getTime());
                sv.setHoa(rs.getFloat(7));
                sv.setLy(rs.getFloat(6));
                sv.setToan(rs.getFloat(5));
                sv.setDTB(rs.getFloat(8));
                tbModel.addRow(sv.insertTable(fm));
                sv = new Student();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLSVMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLSVMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVMainFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelSearching;
    private javax.swing.JButton btnDataBase;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnOkSearching;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbMssvSearching;
    private javax.swing.JCheckBox cbNameSearching;
    private javax.swing.JDialog dialogSearching;
    private javax.swing.JFormattedTextField ftfBirthDay;
    private javax.swing.JLabel lbBirthDay;
    private javax.swing.JLabel lbChemScore;
    private javax.swing.JLabel lbMathScore;
    private javax.swing.JLabel lbMssv;
    private javax.swing.JLabel lbMssvSearching;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNameSearching;
    private javax.swing.JLabel lbPhiscScore;
    private javax.swing.JPanel pnListStudent;
    private javax.swing.JPanel pnSearching;
    private javax.swing.JPanel pnStudentInfomation;
    private javax.swing.JScrollPane spTableStudents;
    private javax.swing.JTable tbStudents;
    private javax.swing.JTextField tfChemScore;
    private javax.swing.JTextField tfMathScore;
    private javax.swing.JTextField tfMssv;
    private javax.swing.JTextField tfMssvSearching;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNameSearching;
    private javax.swing.JTextField tfPhiscScore;
    // End of variables declaration//GEN-END:variables
}
