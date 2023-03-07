
package pms;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import net.proteanit.sql.*;
import java.util.InputMismatchException;
public class selling extends javax.swing.JFrame {

    public selling() {
        initComponents();
        selectedMed();
        showdate();
        
    }
public void showdate(){
    Date date = new Date();
    SimpleDateFormat s = new SimpleDateFormat();
    DateB.setText(s.format(date));
}
    
    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Bid = new javax.swing.JTextField();
        MED = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        TRACE = new javax.swing.JButton();
        DateB = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        ClearBtn1 = new javax.swing.JButton();
        manufacturer = new javax.swing.JLabel();
        medicine = new javax.swing.JLabel();
        agent = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menubtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 610));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(903, 608));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Billing");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("BILLID");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("MEDICINE");

        Bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BidActionPerformed(evt);
            }
        });

        MED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(102, 102, 102));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 153, 255));
        AddBtn.setText(" ADD TO BILL");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(0, 51, 102));
        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 153, 255));
        PrintBtn.setText("PRINT");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "PRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ));
        MedicineTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("BILL");

        TRACE.setBackground(new java.awt.Color(102, 102, 102));
        TRACE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TRACE.setForeground(new java.awt.Color(0, 153, 255));
        TRACE.setText("TRACE");
        TRACE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRACEMouseClicked(evt);
            }
        });

        DateB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        DateB.setForeground(new java.awt.Color(0, 51, 102));
        DateB.setText("Date");

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Seller");

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("Medicine LIST");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("QUANTITY");

        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });

        BillTxt.setBackground(new java.awt.Color(255, 255, 255));
        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BillTxt.setForeground(new java.awt.Color(0, 0, 0));
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("AGENT ID");

        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });

        ClearBtn1.setBackground(new java.awt.Color(102, 102, 102));
        ClearBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearBtn1.setForeground(new java.awt.Color(0, 153, 255));
        ClearBtn1.setText("CLEAR");
        ClearBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(PrintBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bid, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(MED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(17, 17, 17)
                                .addComponent(aid)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TRACE)
                                .addGap(46, 46, 46)
                                .addComponent(AddBtn)
                                .addGap(33, 33, 33)
                                .addComponent(ClearBtn1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(262, 262, 262)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(233, 233, 233)
                                        .addComponent(DateB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(323, 323, 323))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DateB)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(TRACE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrintBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        manufacturer.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        manufacturer.setForeground(new java.awt.Color(255, 255, 255));
        manufacturer.setText("Manufacturer");
        manufacturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manufacturerMouseClicked(evt);
            }
        });

        medicine.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        medicine.setForeground(new java.awt.Color(255, 255, 255));
        medicine.setText("Medicine");
        medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineMouseClicked(evt);
            }
        });

        agent.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        agent.setForeground(new java.awt.Color(255, 255, 255));
        agent.setText("Agents");
        agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentMouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 204, 204));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        menubtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        menubtn.setForeground(new java.awt.Color(255, 255, 255));
        menubtn.setText("Main Menu");
        menubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicine, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agent)
                    .addComponent(menubtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(menubtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manufacturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medicine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agent))
                    .addComponent(jLabel13))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEDActionPerformed
public void selectedMed() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "password");
            st = con.createStatement();
            rs = st.executeQuery("select * from pharmacy.medicine");
            MedicineTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
int Medid,newQty;
public void Bill(){
     try{
         try{
             try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","password");//connection with database started
            PreparedStatement add = con.prepareStatement("insert into Bill values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(Bid.getText()));// adding to medicine label id in the gui
            add.setInt(2, Integer.valueOf(aid.getText()));
            add.setInt(3, Medid);
            add.setString(4, MED.getText());
            add.setInt(5,Integer.valueOf(Qty.getText()));
            
            add.executeUpdate();
            }catch(NullPointerException t)
                {
                    JOptionPane.showMessageDialog(this, "enter all necessary information");
                }
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter proper information");
            }
            
            
            con.close();
            }
         catch(SQLIntegrityConstraintViolationException ed)
                    {
                        JOptionPane.showMessageDialog(this, "the id is already in use");
                    }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
           
}
public void Report(){
    try{
         try{
             try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","password");//connection with database started
            PreparedStatement add = con.prepareStatement("insert into report values(?,?,?)");
            add.setInt(1, Integer.valueOf(aid.getText()));
            add.setInt(2,Integer.valueOf(Qty.getText()));
            add.setString(3, MED.getText());
            
         
            add.executeUpdate();
            }catch(NullPointerException t)
                {
                    JOptionPane.showMessageDialog(this, "enter all necessary information");
                }
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter proper information");
            }
            
            
            con.close();
            }
         catch(SQLIntegrityConstraintViolationException ed)
                    {
                        JOptionPane.showMessageDialog(this, "the id is already in use");
                    }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
}

public void update(){
   
    
           
    try{
        try{
            try{
        newQty = oldQty - Integer.valueOf(Qty.getText());
       
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "password");
                String updatequery = "UPDATE pharmacy.medicine set MedQty = "+newQty+  " where MedId = " + Medid;
                
                String sold = "UPDATE pharmacy.agent set sold = "+Qty.getText()+  " where  AID= " + aid.getText();
                String total_sold = "UPDATE  pharmacy.agent SET total_sold = sold + " + Qty.getText()+" where AID= "+ aid.getText();
                Statement Add = con.createStatement();
                Add.executeUpdate(updatequery);//we executeupdate not query
                Add.executeUpdate(sold);
                Add.executeUpdate(total_sold);
                selectedMed();
            }catch(SQLSyntaxErrorException h)
            {
                JOptionPane.showMessageDialog(this, "unknown ");

            }
        }catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(this, "Enter proper information");
        }
            } catch (SQLException e) {
                e.printStackTrace();
            }

}
int i =0,price,oldQty;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
     try{
         
        if(MED.getText().isEmpty()|| Qty.getText().isEmpty()|| aid.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "MISSING INFORMATION");
    }
        i++;
        update();
        Bill();
        Report();
        if(i == 1){
        BillTxt.setText(BillTxt.getText()+"            /*************************ZEWD  PHARMA  CENTER*************************/\n"
             +"\t    ID       MEDICINE       QTY      PRICE      TOTAL\n\t"
             +"      "+i+"       "+MED.getText()+"              "+Qty.getText()+"            "+price+"              "+ Integer.valueOf(Qty.getText())*price);   
            System.out.println("");
        }
        else
        {
            
            BillTxt.setText(BillTxt.getText()+ "\n\t"+"      "+i+"      "+MED.getText()+"                 "+Qty.getText()+"            "+price+"              "+ Integer.valueOf(Qty.getText())*price );
            System.out.println("");
        }
         
         
         
     }catch(NumberFormatException e)
     {
         JOptionPane.showMessageDialog(this, "Enter proper information");
     }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked

     
        try{
        BillTxt.print();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) MedicineTable.getModel();
        int myindex = MedicineTable.getSelectedRow();
        MED.setText(model.getValueAt(myindex, 1).toString());
      //  MedName.setText(model.getValueAt(myindex, 1).toString());
      Medid = Integer.valueOf(model.getValueAt(myindex, 0).toString());
         price = Integer.valueOf(model.getValueAt(myindex, 2).toString());
         oldQty = Integer.valueOf(model.getValueAt(myindex, 3).toString());
        //MedQty.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void TRACEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRACEMouseClicked
        new Trace().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_TRACEMouseClicked

    private void manufacturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manufacturerMouseClicked
        // TODO add your handling code here:
        new manufacturer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manufacturerMouseClicked

    private void medicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineMouseClicked
         new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_medicineMouseClicked

    private void agentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentMouseClicked
        // TODO add your handling code here:
        new agent().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agentMouseClicked

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void BidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BidActionPerformed

    private void menubtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubtnMouseClicked
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menubtnMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void ClearBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtn1MouseClicked
         Bid.setText("");
        BillTxt.setText("");
        MED.setText("");
        Qty.setText("");
         aid.setText("");
    }//GEN-LAST:event_ClearBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Bid;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JButton ClearBtn1;
    private javax.swing.JLabel DateB;
    private javax.swing.JTextField MED;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton TRACE;
    private javax.swing.JLabel agent;
    private javax.swing.JTextField aid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manufacturer;
    private javax.swing.JLabel medicine;
    private javax.swing.JLabel menubtn;
    // End of variables declaration//GEN-END:variables
}
