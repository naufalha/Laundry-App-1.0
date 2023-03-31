/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package applaundry;
import com.laundry.PBOmaven.Customer;
import com.laundry.PBOmaven.PboMavenApplication;
import org.springframework.boot.SpringApplication;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.security.Permissions;


/**
 *
 * @author iyanm
 */
public class MenuSelesai extends javax.swing.JFrame {

    /**
     * Creates new form MenuSelesai
     */
    public MenuSelesai() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuSelesai = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        InputKode = new javax.swing.JTextField();
        BtnOK = new javax.swing.JToggleButton();
        BtnKembali = new javax.swing.JToggleButton();
        gb = new javax.swing.JLabel();
        BtnSelesai = new javax.swing.JButton();
        TampilanNama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMenuSelesai.setBackground(new java.awt.Color(0, 153, 204));

        Judul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Judul.setText("Kode Laundry");

        InputKode.setBackground(new java.awt.Color(204, 255, 204));
        InputKode.setText("Masukkan Kode Laundry");
        InputKode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InputKodeMouseEntered(evt);
            }
        });
        InputKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputKodeActionPerformed(evt);
            }
        });

        BtnOK.setBackground(new java.awt.Color(255, 204, 102));
        BtnOK.setText("Ok");
        BtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOKActionPerformed(evt);
            }
        });

        BtnKembali.setBackground(new java.awt.Color(51, 255, 51));
        BtnKembali.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });

        gb.setIcon(new javax.swing.ImageIcon("anime.png")); // NOI18N

        BtnSelesai.setBackground(new java.awt.Color(204, 255, 51));
        BtnSelesai.setText("Selesai");
        BtnSelesai.setVisible(false);
        BtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelesaiActionPerformed(evt);
            }
        });

        TampilanNama.setBorder(null);

        javax.swing.GroupLayout PanelMenuSelesaiLayout = new javax.swing.GroupLayout(PanelMenuSelesai);
        PanelMenuSelesai.setLayout(PanelMenuSelesaiLayout);
        PanelMenuSelesaiLayout.setHorizontalGroup(
            PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuSelesaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PanelMenuSelesaiLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TampilanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        PanelMenuSelesaiLayout.setVerticalGroup(
            PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuSelesaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Judul)
                .addGap(12, 12, 12)
                .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TampilanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuSelesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuSelesaiLayout.createSequentialGroup()
                        .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputKodeActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {                                           
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        this.dispose();
    }

    private void BtnOKActionPerformed(java.awt.event.ActionEvent evt) {       
        //membaca file yang telah dibuat                               
        try {
            //object reading tester
            ObjectInputStream in = new ObjectInputStream(new FileInputStream((InputKode.getText())));
            Customer M2 = (Customer) in.readObject();
            System.out.println(M2.getNama());
            TampilanNama.setText(M2.getNama());
            BtnOK.setVisible(false);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("email"));
            out.writeObject(M2);
            File customer = new File(String.valueOf(InputKode.getText()));
            customer.delete();
            BtnSelesai.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            TampilanNama.setText("Kode Salah");


            // handle exception correctly.
        }
        

    }
    //action listener untuk button selesai untuk menampilkan halaman selesai
    private void BtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {
        String[] args = {};
        SpringApplication.run(PboMavenApplication.class, args);
        Selesai mu = new Selesai();
        mu.setVisible(true);

        this.dispose();

    }

    //memberi tahu bahwa inputan kode akan dihapus ketika mouse masuk ke dalam inputan kode
    private void InputKodeMouseEntered(java.awt.event.MouseEvent evt) {                                       
        InputKode.setText("");
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
            java.util.logging.Logger.getLogger(MenuSelesai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSelesai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSelesai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSelesai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSelesai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnKembali;
    private javax.swing.JToggleButton BtnOK;
    private javax.swing.JButton BtnSelesai;
    private javax.swing.JTextField InputKode;
    private javax.swing.JLabel Judul;
    private javax.swing.JPanel PanelMenuSelesai;
    private javax.swing.JTextField TampilanNama;
    private javax.swing.JLabel gb;
    // End of variables declaration//GEN-END:variables
}
