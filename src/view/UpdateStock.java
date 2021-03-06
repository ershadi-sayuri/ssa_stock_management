/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ershadi
 */
public class UpdateStock extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public UpdateStock() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        addItemInternalFrame = new javax.swing.JInternalFrame();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        titleRadioButton = new javax.swing.JRadioButton();
        itemCodeRadioButton = new javax.swing.JRadioButton();
        itemComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockDetailsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        additemToTheStockjButton = new javax.swing.JButton();
        quantityTextField = new javax.swing.JTextField();
        inDateCalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        expireDateCalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        stockIdLabel = new javax.swing.JLabel();
        stockDetailClearButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        outDateCalendarCombo = new org.freixas.jcalendar.JCalendarCombo();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addItemInternalFrame.setClosable(true);
        addItemInternalFrame.setVisible(true);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel30.setText("Stock Details");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 51));
        jLabel31.setText("Select the item that you need from below.");

        jLabel32.setText("Search item from :");

        buttonGroup1.add(titleRadioButton);
        titleRadioButton.setText("Title");

        buttonGroup1.add(itemCodeRadioButton);
        itemCodeRadioButton.setText("Item code");

        stockDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock id", "Expire date", "In date", "Out date", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stockDetailsTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add / Update Item to the Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 18))); // NOI18N

        jLabel14.setText("Stock id :");

        jLabel18.setText("Expire date :");

        jLabel19.setText("In date :");

        jLabel20.setText("Item quantity :");

        additemToTheStockjButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        additemToTheStockjButton.setText("Save");
        additemToTheStockjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemToTheStockjButtonActionPerformed(evt);
            }
        });

        stockIdLabel.setText("jLabel16");

        stockDetailClearButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        stockDetailClearButton.setText("Clear");
        stockDetailClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockDetailClearButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Make sure to update the 'Out date' when the item is taking out from the stock. ");

        jLabel1.setText("Out date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("You can keep out date as blank when you are adding a new item.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stockDetailClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(additemToTheStockjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantityTextField)
                                    .addComponent(inDateCalendarCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stockIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(expireDateCalendarCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(outDateCalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(stockIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(expireDateCalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(inDateCalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(outDateCalendarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additemToTheStockjButton)
                    .addComponent(stockDetailClearButton)))
        );

        javax.swing.GroupLayout addItemInternalFrameLayout = new javax.swing.GroupLayout(addItemInternalFrame.getContentPane());
        addItemInternalFrame.getContentPane().setLayout(addItemInternalFrameLayout);
        addItemInternalFrameLayout.setHorizontalGroup(
            addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addItemInternalFrameLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addItemInternalFrameLayout.createSequentialGroup()
                        .addGroup(addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addItemInternalFrameLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(titleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(itemCodeRadioButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(addItemInternalFrameLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        addItemInternalFrameLayout.setVerticalGroup(
            addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addItemInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addItemInternalFrameLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(6, 6, 6)
                        .addGroup(addItemInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addItemInternalFrameLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel32))
                            .addComponent(titleRadioButton)
                            .addComponent(itemCodeRadioButton))
                        .addGap(7, 7, 7)
                        .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addItemInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addItemInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockDetailClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockDetailClearButtonActionPerformed
       stockIdLabel.setText(null);
       expireDateCalendarCombo.setSelectedItem(null);
       inDateCalendarCombo.setSelectedItem(null);
       quantityTextField.setText(null);
       outDateCalendarCombo.setSelectedItem(null);
    }//GEN-LAST:event_stockDetailClearButtonActionPerformed

    private void additemToTheStockjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemToTheStockjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additemToTheStockjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JInternalFrame addItemInternalFrame;
    private javax.swing.JButton additemToTheStockjButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.freixas.jcalendar.JCalendarCombo expireDateCalendarCombo;
    private org.freixas.jcalendar.JCalendarCombo inDateCalendarCombo;
    private javax.swing.JRadioButton itemCodeRadioButton;
    private javax.swing.JComboBox itemComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.freixas.jcalendar.JCalendarCombo outDateCalendarCombo;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton stockDetailClearButton;
    private javax.swing.JTable stockDetailsTable;
    private javax.swing.JLabel stockIdLabel;
    private javax.swing.JRadioButton titleRadioButton;
    // End of variables declaration//GEN-END:variables
}
