/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package applaundry;

import com.laundry.PBOmaven.Customer;
import com.laundry.PBOmaven.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
//for saving obj
import java.io.*;
import java.security.Permissions;

/**
 *
 * @author iyanm
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Menu2() throws IllegalArgumentException{
        initComponents() ;
    }
    
  
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()   {
        PanelMenu2 = new javax.swing.JPanel();
        JenisBaju = new javax.swing.JLabel();
        TipeCucian = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Berat = new javax.swing.JLabel();
        Harga = new javax.swing.JLabel();
        PIlihanJenisBaju = new javax.swing.JComboBox<>();
        InputNama = new javax.swing.JTextField();
        PilihanTipeCucian = new javax.swing.JComboBox<>();
        InputEmail = new javax.swing.JTextField();
        InputBerat = new javax.swing.JTextField();
        OutputHarga = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        btnHitungHarga = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        gb = new javax.swing.JLabel();
        Customer pelanggan = new Customer();
        //code customerdata = new code();
        //saver objk

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMenu2.setBackground(new java.awt.Color(255, 0, 153));
        PanelMenu2.setForeground(new java.awt.Color(255, 0, 102));

        JenisBaju.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        JenisBaju.setText("Jenis Baju");
        btnTransaksi.setVisible(false);
        TipeCucian.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TipeCucian.setText("Tipe Cucian ");

        Nama.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Nama.setText("Nama");

        Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Email.setText("Email ");

        Berat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Berat.setText("Berat");

        Harga.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Harga.setText("Total Harga");

        PIlihanJenisBaju.setMaximumRowCount(20);
        PIlihanJenisBaju.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baju", "Selimut",}));

        InputNama.setText("Masukkan Nama ...");
        InputNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InputNamaMouseEntered(evt);
            }
        });

        PilihanTipeCucian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular ( 3 Hari )", "Kilat ( 1 Hari )" }));


        PilihanTipeCucian.setToolTipText("");
        PilihanTipeCucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihanTipeCucianActionPerformed(evt);
            }
        });

        InputEmail.setText("Masukkan Email ...");
        InputEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InputEmailMouseEntered(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHitungHarga.setBackground(new java.awt.Color(255, 255, 0));
        btnHitungHarga.setText("HitungHarga");
        btnHitungHarga.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //pertintah hitung untuk menghitung total transaksi
                pelanggan.setCustomer(PilihanTipeCucian.getSelectedIndex(),PIlihanJenisBaju.getSelectedIndex(),InputNama.getText(),InputEmail.getText(),Double.parseDouble(InputBerat.getText()));
                //System.out.println(pelanggan.getTotal());
                //System.out.println(PilihanTipeCucian.getSelectedIndex());
                btnTransaksi.setVisible(true);
                OutputHarga.setText(String.valueOf(pelanggan.getTotal()));
                //pelanggan.setIncome();
                //System.out.println(Double.valueOf(pelanggan.getIncome()));
                //System.out.println(pelanggan.getCode());



            }
        });

        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
                pelanggan.setCode();
                pelanggan.setIncome();
                System.out.println(pelanggan.getIncomedata());
                //System.out.println(customerdata.getIncomedata());
                //saving object to a file

                try {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(("database")));
                    code customerdata = (code) in.readObject();
                    System.out.println(customerdata.getCustomerCode());
                    System.out.println(pelanggan.getCode());
                    //delete file
                    File datawhile = new File("database");
                    datawhile.delete();
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("database"));
                    oos.writeObject(customerdata);

                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(String.valueOf(customerdata.getCustomerCode())));
                    out.writeObject(pelanggan);
                    //object reading tester
                    //ObjectInputStream in = new ObjectInputStream(new FileInputStream(("1")));
                    //Customer M2 = (Customer) in.readObject();
                    //System.out.println(M2.getNama());

                } catch (Exception e) {
                    e.printStackTrace();
                    // handle exception correctly.
                }


            }
        });

        gb.setIcon(new javax.swing.ImageIcon("raiden.png")); // NOI18N

        javax.swing.GroupLayout PanelMenu2Layout = new javax.swing.GroupLayout(PanelMenu2);
        PanelMenu2.setLayout(PanelMenu2Layout);
        PanelMenu2Layout.setHorizontalGroup(
            PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenu2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenu2Layout.createSequentialGroup()
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JenisBaju, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipeCucian)
                            .addComponent(Email)
                            .addComponent(Berat)
                            .addComponent(Harga)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PIlihanJenisBaju, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PilihanTipeCucian, 0, 273, Short.MAX_VALUE)
                            .addComponent(InputNama)
                            .addComponent(InputEmail)
                            .addComponent(InputBerat)
                            .addComponent(OutputHarga)))
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenu2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenu2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHitungHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
        );
        PanelMenu2Layout.setVerticalGroup(
            PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenu2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelMenu2Layout.createSequentialGroup()
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipeCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PilihanTipeCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JenisBaju, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(PIlihanJenisBaju))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMenu2Layout.createSequentialGroup()
                        .addComponent(gb)
                        .addGap(6, 6, 6)))
                .addGap(12, 12, 12)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(InputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Berat)
                    .addComponent(InputBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitungHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Harga)
                    .addComponent(OutputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {
        Sukses ms = new Sukses();
        ms.setVisible(true);
        this.dispose();
    }

    private void PilihanTipeCucianActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        this.dispose();
    }

    private void InputNamaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputEmailMouseEntered
        InputNama.setText("");
    }

    private void InputEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputEmailMouseEntered
        InputEmail.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true) ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Berat;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Harga;
    private javax.swing.JTextField InputBerat;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputNama;
    private javax.swing.JLabel JenisBaju;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField OutputHarga;

    private javax.swing.JComboBox<String> PIlihanJenisBaju;
    private javax.swing.JPanel PanelMenu2;
    private javax.swing.JComboBox<String> PilihanTipeCucian;
    private javax.swing.JLabel TipeCucian;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHitungHarga;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JLabel gb;
    // End of variables declaration//GEN-END:variables
}
