
package applaundry;
import javax.swing.JTextArea;

import com.laundry.PBOmaven.emailMainclass;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.security.Permissions;
import com.laundry.PBOmaven.code;
/**
 *
 * @author iyanm
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        
    }

    private void initComponents() {

        PanelMenuUtama = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        SelesaiButton = new javax.swing.JButton();
        InputBajuButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JToggleButton();
        BtnMinimize = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JTextArea teks = new JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMenuUtama.setBackground(new java.awt.Color(0, 153, 153));

        // Menambahkan Judul
        Judul.setBackground(new java.awt.Color(0, 51, 51));
        Judul.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        Judul.setForeground(new java.awt.Color(51, 255, 0));
        Judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul.setText("Laundry App 1.0");
        Judul.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon("bg.png"))); // NOI18N

        // Menambahkan Tombol Laundry Selesai
        SelesaiButton.setBackground(new java.awt.Color(255, 255, 0));
        SelesaiButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        SelesaiButton.setText("Laundry Selesai");
        SelesaiButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SelesaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelesaiButtonActionPerformed(evt);
            }
        });

        // Menambahkan Tombol Input Baju
        InputBajuButton.setBackground(new java.awt.Color(255, 255, 51));
        InputBajuButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        InputBajuButton.setText("Memasukkan Baju");
        InputBajuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputBajuButtonActionPerformed(evt);
            }
        });

        // Menambahkan Tombol Exit
        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        // Menambahkan Tombol Minimize
        BtnMinimize.setBackground(new java.awt.Color(204, 0, 0));
        BtnMinimize.setText("-");
        BtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinimizeActionPerformed(evt);
            }
        });

        // Menambahkan Scroll Bar di TextArea
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(102, 255, 102));
        jTextArea1.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("* Bersih, Rapi ,Wangi\n* Nyaman Digunakan\n* Wangi Tahan Lama");

        PanelMenuUtama.add(teks);
        teks.setBounds(225, 305, 110, 45);
        teks.setBackground(new java.awt.Color(102, 255, 102));

        try {
            //object reading tester
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(("database")));
            code customerdata = (code) in.readObject();
            teks.setText("Total penghasilan : Rp."+"\n"+"Rp."+String.valueOf(customerdata.getIncomedata()));
            System.out.println(String.valueOf(customerdata.getIncomedata()));
        } catch (Exception e) {
            e.printStackTrace();
            // handle exception correctly.
        }

       


        jScrollPane1.setViewportView(jTextArea1);

        // Menambahkan Gambar
        jLabel1.setIcon(new javax.swing.ImageIcon("icon3.png")); // NOI18

        jLabel2.setIcon(new javax.swing.ImageIcon("icon (2).png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("icon (2).png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("icon (2).png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("icon (2).png")); // NOI18N

        javax.swing.GroupLayout PanelMenuUtamaLayout = new javax.swing.GroupLayout(PanelMenuUtama);
        PanelMenuUtama.setLayout(PanelMenuUtamaLayout);
        PanelMenuUtamaLayout.setHorizontalGroup(
            PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnMinimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                        .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputBajuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SelesaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuUtamaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Judul)
                .addGap(109, 109, 109))
        );
        PanelMenuUtamaLayout.setVerticalGroup(
            PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(BtnMinimize))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Judul)
                .addGap(9, 9, 9)
                .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(InputBajuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuUtamaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelesaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void InputBajuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Membuat action event yaitu jika object tersebut diklik akan mengarah ke object itu sendiri
        Menu2 m2 = new Menu2();
        m2.setVisible(true);
        this.dispose();

    }

    private void SelesaiButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //membuat action event yaitu jika object tersebut diklik akan mengarah ke object itu sendiri
        MenuSelesai ms = new MenuSelesai();
        emailMainclass emailing = new emailMainclass();
        ms.setVisible(true);
        this.dispose();

    }

    private void BtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {
        // Meminimalkan frame
        this.setState(1);
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        // Keluar dari program
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnMinimize;
    private javax.swing.JButton InputBajuButton;
    private javax.swing.JLabel Judul;
    private javax.swing.JPanel PanelMenuUtama;
    private javax.swing.JButton SelesaiButton;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

