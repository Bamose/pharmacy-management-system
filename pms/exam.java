
package pms;


import javax.swing.*;
import javax.swing.plaf.synth.ColorType;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.sql.*;
import java.awt.Color;
import java.util.Scanner;
import java.awt.event.*;  
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.*;

public class exam {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    JFrame app = new JFrame("exam");
    JPanel panel = new JPanel();
    JLabel name = new JLabel("Name/n");
    JTextField nametxt = new JTextField();
    JLabel Id = new JLabel("ID");
    JTextField idtxt = new JTextField();
    JLabel gender = new JLabel("Gender");
    JTextField gendertxt = new JTextField();
    JLabel department = new JLabel("Department");
    JTextField deptxt = new JTextField();
    JButton Add = new JButton("ADD");

    public exam() {

        panel.setBounds(0, 0, 700, 500);
        panel.setBackground(Color.BLUE);

        name.setBounds(80, 70, 90, 90);
        name.setBackground(Color.RED);
        name.setForeground(Color.WHITE);
        nametxt.setColumns(13);
        nametxt.setBackground(Color.WHITE);
        panel.add(name);
        panel.add(nametxt);

        Id.setBounds(100, 200, 100, 90);
        Id.setBackground(Color.RED);
        Id.setForeground(Color.WHITE);
        idtxt.setColumns(13);
        idtxt.setBackground(Color.WHITE);

        gender.setBounds(90, 80, 300, 500);
        gender.setForeground(Color.WHITE);
        gendertxt.setColumns(13);

        department.setBounds(90, 80, 300, 400);
        department.setForeground(Color.WHITE);
        deptxt.setColumns(13);

        Add.setBackground(Color.WHITE);
        Add.setBounds(500,500,600,600);
        
         panel.add(Id);
        panel.add(idtxt);
         panel.add(gender);
        panel.add(gendertxt);
        panel.add(department);
        panel.add(deptxt);
       
       
        panel.add(Add);
        Add.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            exam a = new exam();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password");
            PreparedStatement add = con.prepareStatement("insert into student.ex values(?,?,?,?)");
            add.setString(1, a.nametxt.getText());
            add.setString(2, a.idtxt.getText());
            add.setString(3, a.gendertxt.getText());
            add.setString(4, a.deptxt.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(Add, this, "added suceccessfuly", 0, null);
            con.close();
            examtable();
        } 
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

           
            
        });
        
        app.add(panel);
        app.setSize(700, 500);
        app.setLayout(null);
        app.setVisible(true);
        
        
        

    }


    public void examtable() {
        String[] columns = { "Name", "ID", "Gender", "department" };
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password");
            st = con.createStatement();
            rs = st.executeQuery("select * from student.ex");
            String data[][] = new String[10][10];
            int i = 0;
            while (rs.next()) {
                String nam = rs.getString("Sname");
                String id = rs.getString("id");
                String gen = rs.getString("gender");
                String depa = rs.getString("dep");
                data[i][0] = nam;
                data[i][1] = id + "";
                data[i][2] = gen;
                data[i][3] = depa;
                i++;
            }
            JTable examtable = new JTable(data, columns);
            examtable.setBounds(200, 200, 300, 400);
            panel.add(examtable);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new exam();
        exam r = new exam();
        
    }
}
