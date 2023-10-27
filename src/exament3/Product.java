package exament3;

import javax.swing.DefaultComboBoxModel;


public class Product extends javax.swing.JFrame {
    private Pantalla padre;
    private Ropa selec; 
    private int index;
    
    
    public Product()
    {
        initComponents();
        llenarComboBox();
    }   
 
    public Product(Pantalla padre) 
    {
        initComponents();
        llenarComboBox();
        this.padre = padre;
    }

    
    
    
    
    
    
    private void llenarComboBox() {

        DefaultComboBoxModel<String> Box1 = new DefaultComboBoxModel<>();
        Box1.addElement("S");
        Box1.addElement("M");
        Box1.addElement("L");
        Box1.addElement("XL");
        box_Talla.setModel(Box1);

        DefaultComboBoxModel<String> Box2 = new DefaultComboBoxModel<>();
        Box2.addElement("Hombre");
        Box2.addElement("Mujer");
        Box2.addElement("Niño");
        Box2.addElement("Niña");
        box_Genero.setModel(Box2);
        
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_Cancelar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        txt_Stock = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Guardar = new javax.swing.JLabel();
        box_Talla = new javax.swing.JComboBox<>();
        box_Genero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png"))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.setContentAreaFilled(false);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, 60));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/guardar.png"))); // NOI18N
        btn_Guardar.setBorder(null);
        btn_Guardar.setContentAreaFilled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 110, 60));

        txt_Stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));

        txt_Precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));

        txt_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 30));

        lbl_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/añador.png"))); // NOI18N
        jPanel2.add(lbl_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 240, 50));

        box_Talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(box_Talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        box_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(box_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Frame 2.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String nombre = txt_Nombre.getText();
        int stock = Integer.parseInt(txt_Stock.getText());
        double precio = Double.parseDouble(txt_Precio.getText());
        Ropa ropa = new Ropa(nombre, stock, precio);

        this.padre.agregar(ropa);
        ropa.setIndiceTalla(box_Talla.getSelectedIndex());
        ropa.setIndiceGenero(box_Genero.getSelectedIndex());
        
        this.padre.setLocationRelativeTo(this);
        this.padre.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        
        this.padre.setLocationRelativeTo(this);
        this.padre.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_CancelarActionPerformed
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_Genero;
    private javax.swing.JComboBox<String> box_Talla;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Guardar;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Stock;
    // End of variables declaration//GEN-END:variables
}
