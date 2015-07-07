/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Ershadi
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        try {
            Image image = ImageIO.read(getClass().getResource("../img/icon.png"));
            setIconImage(image);

        } catch (IOException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }

        setTitle("Siri Sadaham Ashramaya Stock Management System");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationDesktopPane = new javax.swing.JDesktopPane();
        viewStockButton = new javax.swing.JButton();
        addItemToTheStockButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expiringItemsList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        containerDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveBackupMenuItem = new javax.swing.JMenuItem();
        installFromBackupMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        createNewUserMenuItem = new javax.swing.JMenuItem();
        updateExistingUserMenuItem = new javax.swing.JMenuItem();
        removeUserMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        helpContentsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewStockButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        viewStockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_item.png"))); // NOI18N
        viewStockButton.setText("View Stock");
        viewStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockButtonActionPerformed(evt);
            }
        });

        addItemToTheStockButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addItemToTheStockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_item.png"))); // NOI18N
        addItemToTheStockButton.setText("Manage Items");
        addItemToTheStockButton.setToolTipText("");
        addItemToTheStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemToTheStockButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        expiringItemsList.setBackground(new java.awt.Color(240, 240, 240));
        expiringItemsList.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        expiringItemsList.setForeground(new java.awt.Color(255, 51, 51));
        expiringItemsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Chocolate biscuit 500g", "Maggie noodles 100g" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(expiringItemsList);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Items that expire this week");

        javax.swing.GroupLayout navigationDesktopPaneLayout = new javax.swing.GroupLayout(navigationDesktopPane);
        navigationDesktopPane.setLayout(navigationDesktopPaneLayout);
        navigationDesktopPaneLayout.setHorizontalGroup(
            navigationDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navigationDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewStockButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addItemToTheStockButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navigationDesktopPaneLayout.setVerticalGroup(
            navigationDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addItemToTheStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        navigationDesktopPane.setLayer(viewStockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navigationDesktopPane.setLayer(addItemToTheStockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navigationDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navigationDesktopPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navigationDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout containerDesktopPaneLayout = new javax.swing.GroupLayout(containerDesktopPane);
        containerDesktopPane.setLayout(containerDesktopPaneLayout);
        containerDesktopPaneLayout.setHorizontalGroup(
            containerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1149, Short.MAX_VALUE)
        );
        containerDesktopPaneLayout.setVerticalGroup(
            containerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        saveBackupMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveBackupMenuItem.setText("Save backup");
        saveBackupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBackupMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveBackupMenuItem);

        installFromBackupMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        installFromBackupMenuItem.setText("Install from backup");
        installFromBackupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installFromBackupMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(installFromBackupMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Accounts");

        createNewUserMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        createNewUserMenuItem.setText("Create new user");
        createNewUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewUserMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(createNewUserMenuItem);

        updateExistingUserMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        updateExistingUserMenuItem.setText("Update existing user");
        updateExistingUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateExistingUserMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(updateExistingUserMenuItem);

        removeUserMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        removeUserMenuItem.setText("Remove user");
        removeUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(removeUserMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        helpContentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        helpContentsMenuItem.setText("Help contents");
        jMenu2.add(helpContentsMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerDesktopPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationDesktopPane)
            .addComponent(containerDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemToTheStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemToTheStockButtonActionPerformed
        containerDesktopPane.removeAll();
        ManageItem addItem = new ManageItem();
        containerDesktopPane.add(addItem.addItemInternalFrame);
        addItem.addItemInternalFrame.setSize(containerDesktopPane.getWidth(), containerDesktopPane.getHeight());
    }//GEN-LAST:event_addItemToTheStockButtonActionPerformed

    private void viewStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockButtonActionPerformed
        containerDesktopPane.removeAll();
        SearchItem searchItem = new SearchItem();
        containerDesktopPane.add(searchItem.searchItemInternalFrame);
        searchItem.searchItemInternalFrame.setSize(containerDesktopPane.getWidth(), containerDesktopPane.getHeight());
    }//GEN-LAST:event_viewStockButtonActionPerformed

    private void saveBackupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBackupMenuItemActionPerformed
        JFileChooser saveBackupFileChooser = new JFileChooser();
        saveBackupFileChooser.showSaveDialog(null);
    }//GEN-LAST:event_saveBackupMenuItemActionPerformed

    private void installFromBackupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installFromBackupMenuItemActionPerformed
        JFileChooser installFromBackupFileChooser = new JFileChooser();
        installFromBackupFileChooser.showOpenDialog(null);
    }//GEN-LAST:event_installFromBackupMenuItemActionPerformed

    private void createNewUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewUserMenuItemActionPerformed
        CreateNewUser createNewUser = new CreateNewUser(this, false);
        createNewUser.setVisible(true);
        createNewUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_createNewUserMenuItemActionPerformed

    private void updateExistingUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateExistingUserMenuItemActionPerformed
        UpdateExistingUser updateExistingUser = new UpdateExistingUser(this, false);
        updateExistingUser.setVisible(true);
        updateExistingUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateExistingUserMenuItemActionPerformed

    private void removeUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserMenuItemActionPerformed
        RemoveUser removeUser = new RemoveUser(this, false);
        removeUser.setVisible(true);
        removeUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_removeUserMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemToTheStockButton;
    private javax.swing.JDesktopPane containerDesktopPane;
    private javax.swing.JMenuItem createNewUserMenuItem;
    private javax.swing.JList expiringItemsList;
    private javax.swing.JMenuItem helpContentsMenuItem;
    private javax.swing.JMenuItem installFromBackupMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane navigationDesktopPane;
    private javax.swing.JMenuItem removeUserMenuItem;
    private javax.swing.JMenuItem saveBackupMenuItem;
    private javax.swing.JMenuItem updateExistingUserMenuItem;
    private javax.swing.JButton viewStockButton;
    // End of variables declaration//GEN-END:variables
}