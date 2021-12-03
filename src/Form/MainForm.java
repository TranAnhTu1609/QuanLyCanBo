/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Dao.sharequyen;

/**
 *
 * @author Hoang Pham
 */
public class MainForm extends javax.swing.JFrame {

    private QuanLyCongNhanPanel qlcn;
    private QuanLyKiSu qlks;
    private QuanLyNhanVien qlnv;
    private Quanlytaikhoanpanel qltk;
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);

        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
//        windowlogin();
      dangnhapthanhcong();
       
    }
//    private void windowlogin()
//    {
//        
//        Login dialog = new Login(this, true);
//        
//        dialog.setVisible(true);
//        dangnhapthanhcong();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        quanlycongnhanbtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnquanlykisu = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnquanlynhanvien = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnquanlytaikhoan = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbltendangnhap = new javax.swing.JLabel();
        lblvaitro = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuquanlycongnhan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuquanlykisu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuquanlynhanvien = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuqltk = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\JAVA1\\QuanLyCanBo\\src\\icon\\log-out.png")); // NOI18N
        jButton1.setText("Thoát chương trình");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        quanlycongnhanbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book (1).png"))); // NOI18N
        quanlycongnhanbtn.setText("Quản lý công nhân");
        quanlycongnhanbtn.setFocusable(false);
        quanlycongnhanbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanlycongnhanbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanlycongnhanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlycongnhanbtnActionPerformed(evt);
            }
        });
        jToolBar1.add(quanlycongnhanbtn);
        jToolBar1.add(jSeparator2);

        btnquanlykisu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/worker.png"))); // NOI18N
        btnquanlykisu.setText("Quản lý kĩ sư");
        btnquanlykisu.setFocusable(false);
        btnquanlykisu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnquanlykisu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnquanlykisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquanlykisuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnquanlykisu);
        jToolBar1.add(jSeparator3);

        btnquanlynhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/team.png"))); // NOI18N
        btnquanlynhanvien.setText("Quản lý nhân viên");
        btnquanlynhanvien.setFocusable(false);
        btnquanlynhanvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnquanlynhanvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnquanlynhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquanlynhanvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnquanlynhanvien);
        jToolBar1.add(jSeparator4);

        btnquanlytaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/key.png"))); // NOI18N
        btnquanlytaikhoan.setText("Quản lý tài khoản");
        btnquanlytaikhoan.setFocusable(false);
        btnquanlytaikhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnquanlytaikhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnquanlytaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquanlytaikhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnquanlytaikhoan);

        lbltendangnhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltendangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblvaitro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblvaitro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addComponent(lbltendangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbltendangnhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblvaitro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Hệ thống");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator7);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jMenuItem5.setText("Thoát");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnuquanlycongnhan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuquanlycongnhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        mnuquanlycongnhan.setText("Quản lý công nhân");
        mnuquanlycongnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuquanlycongnhanActionPerformed(evt);
            }
        });
        jMenu2.add(mnuquanlycongnhan);
        jMenu2.add(jSeparator5);

        mnuquanlykisu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuquanlykisu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/worker (1).png"))); // NOI18N
        mnuquanlykisu.setText("Quản lý kĩ sư");
        mnuquanlykisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuquanlykisuActionPerformed(evt);
            }
        });
        jMenu2.add(mnuquanlykisu);
        jMenu2.add(jSeparator6);

        menuquanlynhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuquanlynhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/team (1).png"))); // NOI18N
        menuquanlynhanvien.setText("Quản lý nhân viên");
        menuquanlynhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuquanlynhanvienActionPerformed(evt);
            }
        });
        jMenu2.add(menuquanlynhanvien);
        jMenu2.add(jSeparator8);

        menuqltk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info (1).png"))); // NOI18N
        menuqltk.setText("Quản lý tài khoản");
        menuqltk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuqltkActionPerformed(evt);
            }
        });
        jMenu2.add(menuqltk);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tplMainBoard)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quanlycongnhanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlycongnhanbtnActionPerformed
         if(qlcn == null){
        qlcn = new QuanLyCongNhanPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/book (1).png"));
        tplMainBoard.addTab("Quản lý công nhân", icon, qlcn,"Quản lý công nhân" );
        tplMainBoard.setSelectedComponent(qlcn);
        }
        
    }//GEN-LAST:event_quanlycongnhanbtnActionPerformed

    private void btnquanlykisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquanlykisuActionPerformed
         if(qlks == null){
        qlks = new QuanLyKiSu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Worker (1).png"));
        tplMainBoard.addTab("Quản lý kĩ sư", icon, qlks,"Quản lý kĩ sư" );
        tplMainBoard.setSelectedComponent(qlks);
        }
        
    }//GEN-LAST:event_btnquanlykisuActionPerformed

    private void btnquanlynhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquanlynhanvienActionPerformed
        if(qlnv == null){
        qlnv = new QuanLyNhanVien();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/team.png"));
        tplMainBoard.addTab("Quản lý nhân viên", icon, qlnv,"Quản lý nhân viên" );
        }
        tplMainBoard.setSelectedComponent(qlnv);
    }//GEN-LAST:event_btnquanlynhanvienActionPerformed

    private void mnuquanlycongnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuquanlycongnhanActionPerformed
          if(qlcn == null){
        qlcn = new QuanLyCongNhanPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/book (1).png"));
        tplMainBoard.addTab("Quản lý công nhân", icon, qlcn,"Quản lý công nhân" );
        }
        tplMainBoard.setSelectedComponent(qlcn);
       
    }//GEN-LAST:event_mnuquanlycongnhanActionPerformed

    private void mnuquanlykisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuquanlykisuActionPerformed
         if(qlks == null){
        qlks = new QuanLyKiSu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Worker (1).png"));
        tplMainBoard.addTab("Quản lý kĩ sư", icon, qlks,"Quản lý kĩ sư" );
        }
        tplMainBoard.setSelectedComponent(qlks);
        
    }//GEN-LAST:event_mnuquanlykisuActionPerformed

    private void menuquanlynhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuquanlynhanvienActionPerformed
        if(qlnv == null){
        qlnv = new QuanLyNhanVien();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/team.png"));
        tplMainBoard.addTab("Quản lý nhân viên", icon, qlnv,"Quản lý nhân viên" );
        }
        tplMainBoard.setSelectedComponent(qlnv);
       
    }//GEN-LAST:event_menuquanlynhanvienActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//      tplMainBoard.removeAll();
//        windowlogin();
    System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//       
//        Login dialog = new Login(this, true);
//        
//        dialog.setVisible(true);
//        dangnhapthanhcong();
    }//GEN-LAST:event_formWindowOpened

    private void btnquanlytaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquanlytaikhoanActionPerformed
       if(qltk == null){
        qltk = new Quanlytaikhoanpanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/key.png"));
        tplMainBoard.addTab("Quản lý tài khoản", icon, qltk,"Quản lý tài khoản" );
        tplMainBoard.setSelectedComponent(qltk);
        }      
       
       
        
    }//GEN-LAST:event_btnquanlytaikhoanActionPerformed

    private void menuqltkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuqltkActionPerformed
        if(qltk == null){
        qltk = new Quanlytaikhoanpanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/key.png"));
        tplMainBoard.addTab("Quản lý tài khoản", icon, qltk,"Quản lý tài khoản" );
        tplMainBoard.setSelectedComponent(qltk);
        }
       
        
    }//GEN-LAST:event_menuqltkActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void dangnhapthanhcong() {
        lbltendangnhap.setText(sharequyen.nguoidangnhap.getTendangnhap().trim());
        lblvaitro.setText(sharequyen.nguoidangnhap.getVaitro().trim());
             
        
        
        if(sharequyen.nguoidangnhap.getVaitro().trim().equals("ADMIN"))
        {             
            mnuquanlykisu.setEnabled(true);
            menuquanlynhanvien.setEnabled(true);
            mnuquanlycongnhan.setEnabled(true);
            quanlycongnhanbtn.setEnabled(true);
             menuqltk.setEnabled(true);
            
            
        }
        if(sharequyen.nguoidangnhap.getVaitro().trim().equals("Thuong"))
        {
            btnquanlytaikhoan.setEnabled(false);
            menuqltk.setEnabled(false);          
            
            
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquanlykisu;
    private javax.swing.JButton btnquanlynhanvien;
    private javax.swing.JButton btnquanlytaikhoan;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbltendangnhap;
    private javax.swing.JLabel lblvaitro;
    private javax.swing.JMenuItem menuqltk;
    private javax.swing.JMenuItem menuquanlynhanvien;
    private javax.swing.JMenuItem mnuquanlycongnhan;
    private javax.swing.JMenuItem mnuquanlykisu;
    private javax.swing.JButton quanlycongnhanbtn;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}