/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Kittur
 */
public class Update_Member extends javax.swing.JFrame {

    /**
     * Creates new form Update_Member
     */
    public Update_Member() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        lb4 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        lb7 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        lb3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel2.setText("the gamers arena");

        p1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                p1FocusLost(evt);
            }
        });

        lb4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb4.setText("Address");

        lb6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb6.setText("Gender");

        lb5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb5.setText("Email Address");

        t4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        t4.setText("                                          ");

        lb7.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb7.setText("password");

        r1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        r1.setText("Male");
        r1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r1ItemStateChanged(evt);
            }
        });

        r2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        r2.setText("Female");
        r2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r2ItemStateChanged(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb3.setText("contact");

        lb1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lb1.setText("Name");

        c1.setText("Show Password");
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(c1))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb6)
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(r2))
                            .addComponent(r1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lb5)
                                .addGap(140, 140, 140)
                                .addComponent(t3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb7)
                                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb4)
                                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(204, 204, 204)
                                                .addComponent(t1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(161, 161, 161)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(43, 43, 43)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb7)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb5)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(r2)
                        .addComponent(r1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        setSize(new java.awt.Dimension(642, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r1ItemStateChanged
        // TODO add your handling code here:
        if(r1.isSelected()==true)
        {
            t4.setText("MALE");
        }
    }//GEN-LAST:event_r1ItemStateChanged

    private void r2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r2ItemStateChanged
        // TODO add your handling code here:
        if(r1.isSelected()==true)
        {
            t4.setText("FEMALE");
        }
    }//GEN-LAST:event_r2ItemStateChanged

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        // TODO add your handling code here:
        if(c1.isSelected())

        p1.setEchoChar((char)0);

        else
        p1.setEchoChar('*');
    }//GEN-LAST:event_c1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Welcome I=new Welcome();
        I.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p1FocusLost
        // TODO add your handling code here:
         

String nm=t1.getText();
String pwd=new String(p1.getPassword());
String con;
String add;
String eml;
String g;


try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/gamers","piyush","piyush");
Statement s=c.createStatement();
 ResultSet rs=s.executeQuery("select * from old_members where Name='"+nm+"' and Password='"+pwd+"'");
 while(rs.next())
 {
       con=rs.getString("Contact");
       add=rs.getString("Address");
       eml=rs.getString("Email");
       g=rs.getString("Gender");
     t2.setText(""+con);
     ta1.setText(""+add);
     t3.setText(""+eml);
     t4.setText(""+g);
     
 }


}

catch(Exception e)
{
System.out.println(e);
}
      
        
    }//GEN-LAST:event_p1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a,b,c,d,e,f;
        a=t1.getText();
        b=new String(p1.getPassword());
        c=t2.getText();
        d=t3.getText();
        e=ta1.getText();
        f=t4.getText();
        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gamers","piyush","piyush");
             Statement st=con.createStatement();
             st.executeUpdate("Update new_members set Name='"+a+"',Contact='"+c+"',Address='"+d+"',Email='"+e+"',Gender='"+f+"' where Password='"+b+"'");
             JOptionPane.showMessageDialog(null,"UPDATED");
        }
    
        catch(Exception q)
        {
            System.out.println(q);
            
            
            
            
    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JPasswordField p1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}