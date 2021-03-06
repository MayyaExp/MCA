
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author new
 */
public class TreeDemo extends javax.swing.JFrame {

    /**
     * Creates new form TreeDemo
     */
    DefaultMutableTreeNode root;
    DefaultTreeModel model;
    DefaultTableModel tblmdl;
    public TreeDemo() {
        initComponents();
        model=(DefaultTreeModel)tree.getModel();
        root=(DefaultMutableTreeNode)model.getRoot();
        tblmdl=(DefaultTableModel)table.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        tb = new javax.swing.JTabbedPane();
        panelItem = new javax.swing.JPanel();
        cmdAdd = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtEmpNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("items");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree);

        jSplitPane1.setLeftComponent(jScrollPane1);

        cmdAdd.setText("Add");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdNext.setText("Next");
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelItemLayout = new javax.swing.GroupLayout(panelItem);
        panelItem.setLayout(panelItemLayout);
        panelItemLayout.setHorizontalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdNext, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        panelItemLayout.setVerticalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cmdNext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        tb.addTab("Tree Check", panelItem);

        txtEmpNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpNoKeyPressed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpNo"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tb.addTab("Employees", jPanel1);

        jSplitPane1.setRightComponent(tb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        
        DefaultMutableTreeNode node=new DefaultMutableTreeNode("fan");
        root.add(node);
        
        System.out.println("hello");
        tree.scrollPathToVisible(new TreePath(node.getPath()));
        model.reload(root);
    }//GEN-LAST:event_cmdAddActionPerformed

    private void txtEmpNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpNoKeyPressed
        // TODO add your handling code here:
        int rw;
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            tblmdl.setRowCount(tblmdl.getRowCount()+1);
            rw=tblmdl.getRowCount()-1;
            table.setValueAt(txtEmpNo.getText(), rw, 0);
            
            
        }
    }//GEN-LAST:event_txtEmpNoKeyPressed

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        // TODO add your handling code here:
        tb.setSelectedIndex(tb.getSelectedIndex()+1);
    }//GEN-LAST:event_cmdNextActionPerformed

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
            java.util.logging.Logger.getLogger(TreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreeDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdNext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelItem;
    private javax.swing.JTable table;
    private javax.swing.JTabbedPane tb;
    private javax.swing.JTree tree;
    private javax.swing.JTextField txtEmpNo;
    // End of variables declaration//GEN-END:variables
}
