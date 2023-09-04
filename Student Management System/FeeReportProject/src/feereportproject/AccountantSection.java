/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereportproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ABC
 */
public class AccountantSection extends javax.swing.JFrame {

    /**
     * Creates new form AccountantSection
     */
    public AccountantSection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        acAddStd = new javax.swing.JButton();
        adGoback = new javax.swing.JButton();
        acViewStd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acStdname = new javax.swing.JTextField();
        acStdemail = new javax.swing.JTextField();
        acStdcontact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        acStdcourse = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        acStdaddress = new javax.swing.JTextField();
        acDeleteStd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        acStdfee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        acStdpaid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        acStddue = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AccountantTbl = new javax.swing.JTable();
        acROllnum = new javax.swing.JLabel();
        acStdid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        acViewSStd = new javax.swing.JButton();
        acUpdateStd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        acAddStd.setBackground(new java.awt.Color(51, 51, 51));
        acAddStd.setForeground(new java.awt.Color(255, 255, 255));
        acAddStd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_add_new_16px_1.png")); // NOI18N
        acAddStd.setText("Add Student");
        acAddStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acAddStdActionPerformed(evt);
            }
        });

        adGoback.setBackground(new java.awt.Color(51, 51, 51));
        adGoback.setForeground(new java.awt.Color(255, 255, 255));
        adGoback.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_previous_32px_3.png")); // NOI18N
        adGoback.setText("Go Back");
        adGoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adGobackActionPerformed(evt);
            }
        });

        acViewStd.setBackground(new java.awt.Color(51, 51, 51));
        acViewStd.setForeground(new java.awt.Color(255, 255, 255));
        acViewStd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_view_16px_1.png")); // NOI18N
        acViewStd.setText("View Students");
        acViewStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acViewStdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Accountant Section");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name: ");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email: ");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact No:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        jLabel7.setToolTipText("");

        acDeleteStd.setBackground(new java.awt.Color(51, 51, 51));
        acDeleteStd.setForeground(new java.awt.Color(255, 255, 255));
        acDeleteStd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_close_window_16px.png")); // NOI18N
        acDeleteStd.setText("Delete Record");
        acDeleteStd.setActionCommand("");
        acDeleteStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acDeleteStdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Fee:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paid Fee:");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Due:");
        jLabel10.setToolTipText("");

        AccountantTbl.setBackground(new java.awt.Color(0, 0, 0));
        AccountantTbl.setForeground(new java.awt.Color(255, 255, 255));
        AccountantTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        AccountantTbl.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(AccountantTbl);

        acROllnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acROllnum.setForeground(new java.awt.Color(255, 255, 255));
        acROllnum.setText("Roll No: ");
        acROllnum.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_manager_32px_1.png")); // NOI18N

        acViewSStd.setBackground(new java.awt.Color(51, 51, 51));
        acViewSStd.setForeground(new java.awt.Color(255, 255, 255));
        acViewSStd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_eye_16px.png")); // NOI18N
        acViewSStd.setText("View Specific");
        acViewSStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acViewSStdActionPerformed(evt);
            }
        });

        acUpdateStd.setBackground(new java.awt.Color(51, 51, 51));
        acUpdateStd.setForeground(new java.awt.Color(255, 255, 255));
        acUpdateStd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\AppData\\Local\\Temp\\icons8_refresh_16px_1.png")); // NOI18N
        acUpdateStd.setText("Update Record");
        acUpdateStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acUpdateStdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acStdname)
                            .addComponent(acStdemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acStdaddress)
                            .addComponent(acStdcourse, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acStdcontact, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acStdpaid)
                            .addComponent(acStdfee)
                            .addComponent(acStddue)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adGoback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59)
                        .addComponent(acAddStd)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(acROllnum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acStdid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(acDeleteStd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(acUpdateStd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acViewSStd, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acViewStd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acStdid)
                            .addComponent(acDeleteStd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acViewStd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acViewSStd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acUpdateStd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acROllnum, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acStdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acStdemail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStdcontact))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStdcourse))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStdaddress))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStdfee))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStdpaid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acStddue))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adGoback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acAddStd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acAddStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acAddStdActionPerformed
        // TODO add your handling code here:
        ResultSet resultSet = null;
        
        String Name = acStdname.getText().trim().toString();
        String Email = acStdemail.getText().trim().toString();
        String Contact = acStdcontact.getText().trim().toString();
        String Course = acStdcourse.getText().trim().toString();
        String Address = acStdaddress.getText().trim().toString();
        String Fee = acStdfee.getText().trim().toString();
        String Paid = acStdpaid.getText().trim().toString();
        String Due = acStddue.getText().trim().toString();
        
        JFrame j = new JFrame();
        
        if(Name.equals(""))
        {
            JOptionPane.showMessageDialog(j,"Please Enter Name...");
        }
        else if(Email.equals(""))
        {
            JOptionPane.showMessageDialog(j,"Please Enter Email...");   
        }
        else if(Contact.equals(""))
        {
            JOptionPane.showMessageDialog(j,"Please Enter Contact Number...");   
        }
        else if(Course.equals(""))
        {
            JOptionPane.showMessageDialog(j,"Please Enter Course Name...");   
        }
        else if(Address.equals(""))
        {
            JOptionPane.showMessageDialog(j,"Please Enter Address...");   
        }
        else
        {   
            try
            {
                String connectionUrl="jdbc:sqlserver://RASIKH-LAPTOP:1433;databaseName=Fee_Report;IntegratedSecurity=true";
                Connection connection = DriverManager.getConnection(connectionUrl);
                System.out.println("Connection Successful");

                String sql = "";
                PreparedStatement statement = null;
                if(Fee.equals(""))
                {
                    sql = "insert into Student_Rec([Name], Email, Contact, Course, [Address], Paid, Due) values( ?, ?, ?, ?, ?, ?, ?)";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Paid);
                    statement.setString(7, Due);
                }
                else if(Paid.equals(""))
                {
                    sql = "insert into Student_Rec([Name], Email, Contact, Course, [Address], Total_Fee, Due) values( ?, ?, ?, ?, ?, ?, ?)";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Fee);
                    statement.setString(7, Due);
                }
                else if(Due.equals(""))
                {
                    sql = "insert into Student_Rec([Name], Email, Contact, Course, [Address], Total_Fee, Paid) values( ?, ?, ?, ?, ?, ?, ?)";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Fee);
                    statement.setString(7, Paid);
                }
                if(Fee.equals("") && Due.equals(""))
                {
                    sql = "insert into Student_Rec([Name], Email, Contact, Course, [Address], Paid) values( ?, ?, ?, ?, ?, ?)";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    statement.setString(6, Paid);
                }
                if(Fee.equals("") && Paid.equals("") && Due.equals(""))
                {
                    sql = "insert into Student_Rec([Name], Email, Contact, Course, [Address]) values( ?, ?, ?, ?, ?)";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                }
                
                int res = statement.executeUpdate();
                if(res > 0)
                {
                    JOptionPane.showMessageDialog(j,"Details Inserted Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(j,"Details Not Inserted");
                }
            }
            catch(java.sql.SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_acAddStdActionPerformed

    private void adGobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adGobackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AccountantLogin().setVisible(true);
    }//GEN-LAST:event_adGobackActionPerformed

    private void acViewStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acViewStdActionPerformed
        // TODO add your handling code here:
        ResultSet resultSet = null;
         
        try
        {
            String connectionUrl="jdbc:sqlserver://RASIKH-LAPTOP:1433;databaseName=Fee_Report;IntegratedSecurity=true";
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection Successful");
            
            String sql = "SELECT * from Student_Rec ";
            Statement  statement  = connection.createStatement();
            
            resultSet = statement.executeQuery(sql);
            AccountantTbl.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        }
        catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_acViewStdActionPerformed

    private void acDeleteStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acDeleteStdActionPerformed
        // TODO add your handling code here:
        ResultSet resultSet = null;
        
        String ID = acStdid.getText().trim().toString();
        
        JFrame j = new JFrame();
        
        if(ID.equals(null))
        {
            JOptionPane.showMessageDialog(j,"Please Enter RollNumber to delete record...");
        }
        else
        {   
            try
            {
                String connectionUrl="jdbc:sqlserver://RASIKH-LAPTOP:1433;databaseName=Fee_Report;IntegratedSecurity=true";
                Connection connection = DriverManager.getConnection(connectionUrl);
                System.out.println("Connection Successful");
                
                String sql = "Delete from Student_rec where RollNo = ? ";
                PreparedStatement statement  = connection.prepareStatement(sql);
                
                statement.setString(1, ID);
                
                int res = statement.executeUpdate();
                if(res > 0)
                {
                    JOptionPane.showMessageDialog(j,"Details Deleted Successfully...");
                }
                else
                {
                    JOptionPane.showMessageDialog(j,"Details Not Deleted...");
                }
            }
            catch(java.sql.SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_acDeleteStdActionPerformed

    private void acViewSStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acViewSStdActionPerformed
        // TODO add your handling code here:
        String ID = acStdid.getText().trim().toString();
        ResultSet resultSet = null;
        if(!ID.isEmpty())
        {
            try
            {
                String connectionUrl="jdbc:sqlserver://RASIKH-LAPTOP:1433;databaseName=Fee_Report;IntegratedSecurity=true";
                Connection connection = DriverManager.getConnection(connectionUrl);
                System.out.println("Connection Successful");

                String sql = "SELECT * from Student_rec where RollNo = " + ID;
                Statement  statement  = connection.createStatement();

                resultSet = statement.executeQuery(sql);
                AccountantTbl.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(java.sql.SQLException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            JFrame j = new JFrame();
            JOptionPane.showMessageDialog(j,"Please Enter ID...");
        }
    }//GEN-LAST:event_acViewSStdActionPerformed

    private void acUpdateStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acUpdateStdActionPerformed
        // TODO add your handling code here:
        String ID = acStdid.getText().trim().toString();
        
        String Name = acStdname.getText().trim().toString();
        String Email = acStdemail.getText().trim().toString();
        String Contact = acStdcontact.getText().trim().toString();
        String Course = acStdcourse.getText().trim().toString();
        String Address = acStdaddress.getText().trim().toString();
        String Fee = acStdfee.getText().trim().toString();
        String Paid = acStdpaid.getText().trim().toString();
        String Due = acStddue.getText().trim().toString();
        
        ResultSet resultSet = null;
        if(!ID.isEmpty())
        {
            try
            {
                String connectionUrl="jdbc:sqlserver://RASIKH-LAPTOP:1433;databaseName=Fee_Report;IntegratedSecurity=true";
                Connection connection = DriverManager.getConnection(connectionUrl);
                System.out.println("Connection Successful");

                String sql = "";
                PreparedStatement statement  = null;
                if(Fee.equals(""))
                {
                    sql = "UPDATE Student_Rec set [Name] = ?, Email = ?, Contact = ?, Course = ?, [Address] = ?, Paid = ?, Due = ? where RollNo = ?";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Paid);
                    statement.setString(7, Due);
                    
                    statement.setInt(8, Integer.valueOf(ID));
                }
                else if(Paid.equals(""))
                {
                    sql = "UPDATE Student_Rec set [Name] = ?, Email = ?, Contact = ?, Course = ?, [Address] = ?, Fee = ?, Due = ? where RollNo = ?";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Fee);
                    statement.setString(7, Due);
                    
                    statement.setInt(8, Integer.valueOf(ID));
                }
                else if(Due.equals(""))
                {
                    sql = "UPDATE Student_Rec set [Name] = ?, Email = ?, Contact = ?, Course = ?, [Address] = ?, Fee = ?, Paid = ? where RollNo = ?";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setString(6, Fee);
                    statement.setString(7, Paid);
                    
                    statement.setInt(8, Integer.valueOf(ID));
                }
                if(Fee.equals("") && Due.equals(""))
                {
                    sql = "UPDATE Student_Rec set [Name] = ?, Email = ?, Contact = ?, Course = ?, [Address] = ?, Paid = ? where RollNo = ?";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    statement.setString(6, Paid);
                    
                    statement.setInt(7, Integer.valueOf(ID));
                }
                if(Fee.equals("") && Paid.equals("") && Due.equals(""))
                {
                    sql = "UPDATE Student_Rec set [Name] = ?, Email = ?, Contact = ?, Course = ?, [Address] = ?  where RollNo = ?";
                    statement  = connection.prepareStatement(sql);
                    
                    statement.setString(1, Name);
                    statement.setString(2, Email);
                    statement.setString(3, Contact);
                    statement.setString(4, Course);
                    statement.setString(5, Address);
                    
                    statement.setInt(6, Integer.valueOf(ID));
                }

                int res = statement.executeUpdate();

                if(res > 0)
                {
                    JFrame j = new JFrame();
                    JOptionPane.showMessageDialog(j,"Details Updated Successfully");
                }
                else
                {
                    JFrame j = new JFrame();
                    JOptionPane.showMessageDialog(j,"Details Not Updated");
                }
            }
            catch(java.sql.SQLException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            JFrame j = new JFrame();
            JOptionPane.showMessageDialog(j,"Please Enter ID...");
        }
    }//GEN-LAST:event_acUpdateStdActionPerformed

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
            java.util.logging.Logger.getLogger(AccountantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountantSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccountantTbl;
    private javax.swing.JButton acAddStd;
    private javax.swing.JButton acDeleteStd;
    private javax.swing.JLabel acROllnum;
    private javax.swing.JTextField acStdaddress;
    private javax.swing.JTextField acStdcontact;
    private javax.swing.JTextField acStdcourse;
    private javax.swing.JTextField acStddue;
    private javax.swing.JTextField acStdemail;
    private javax.swing.JTextField acStdfee;
    private javax.swing.JTextField acStdid;
    private javax.swing.JTextField acStdname;
    private javax.swing.JTextField acStdpaid;
    private javax.swing.JButton acUpdateStd;
    private javax.swing.JButton acViewSStd;
    private javax.swing.JButton acViewStd;
    private javax.swing.JButton adGoback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
