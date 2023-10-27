    package exament3;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List; 
import javax.swing.DefaultComboBoxModel;

public class Pantalla extends javax.swing.JFrame 
{    
    DefaultListModel sropa = new DefaultListModel();
    List<Ropa> rpa = new ArrayList<>();
   
    public Pantalla() 
    {   initComponents();
        llenarComboBox();
        cargarRopa();
        lst_Ropa.setModel(sropa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Ropa = new javax.swing.JList<>();
        btn_Filtrar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        box_Talla = new javax.swing.JComboBox<>();
        box_Genero = new javax.swing.JComboBox<>();
        btn_Salir = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lst_Ropa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 470, 190));

        btn_Filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Group 16.png"))); // NOI18N
        btn_Filtrar.setBorder(null);
        btn_Filtrar.setContentAreaFilled(false);
        btn_Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FiltrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 110, 60));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Agregar.png"))); // NOI18N
        btn_Agregar.setBorder(null);
        btn_Agregar.setContentAreaFilled(false);
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 110, 60));

        box_Talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_Talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_TallaActionPerformed(evt);
            }
        });
        jPanel2.add(box_Talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        box_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_GeneroActionPerformed(evt);
            }
        });
        jPanel2.add(box_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir.png"))); // NOI18N
        btn_Salir.setBorder(null);
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 110, 60));

        btn_x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/x.png"))); // NOI18N
        btn_x.setBorder(null);
        btn_x.setContentAreaFilled(false);
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });
        jPanel2.add(btn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 110, 60));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Frame 3.png"))); // NOI18N
        jPanel2.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        llamarpantalla();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FiltrarActionPerformed
        DefaultListModel lst_filtrada = new DefaultListModel();

        int index1 = box_Talla.getSelectedIndex();
        int index2 = box_Genero.getSelectedIndex();

        for (Ropa ropa : rpa) {
        if (index1 == ropa.getIndiceTalla() && index2 == ropa.getIndiceGenero()) {
            lst_filtrada.addElement(ropa.getTexto());
        }
        }

        lst_Ropa.setModel(lst_filtrada);
    }//GEN-LAST:event_btn_FiltrarActionPerformed

    private void box_TallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_TallaActionPerformed
 
    }//GEN-LAST:event_box_TallaActionPerformed
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed
    private void box_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_GeneroActionPerformed
        
    }//GEN-LAST:event_box_GeneroActionPerformed
    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        lst_Ropa.setModel(sropa);
        llenarComboBox();
    }//GEN-LAST:event_btn_xActionPerformed

        
     
     
     
    public void agregar(Ropa ropa)
    {
        rpa.add(ropa);
        sropa.addElement(ropa.getTexto());
        lst_Ropa.setModel(sropa);
    }
    
    private void cargarRopa() {
        Ropa ropa1 = new Ropa("Camiseta Roja", 50, 19.99);
        ropa1.setIndiceTalla(0);
        ropa1.setIndiceGenero(0);
        rpa.add(ropa1);
        sropa.addElement(ropa1.getTexto());

        Ropa ropa2 = new Ropa("Pantalón Azul", 30, 39.99);
        ropa2.setIndiceTalla(2);
        ropa2.setIndiceGenero(0);
        rpa.add(ropa2);
        sropa.addElement(ropa2.getTexto());

        Ropa ropa3 = new Ropa("Blusa Rosa", 40, 29.99);
        ropa3.setIndiceTalla(1);
        ropa3.setIndiceGenero(1);
        rpa.add(ropa3);
        sropa.addElement(ropa3.getTexto());

        Ropa ropa4 = new Ropa("Falda Negra", 25, 49.99);
        ropa4.setIndiceTalla(3);
        ropa4.setIndiceGenero(1);
        rpa.add(ropa4);
        sropa.addElement(ropa4.getTexto());

        Ropa ropa5 = new Ropa("Camiseta Azul Niño", 60, 15.99);
        ropa5.setIndiceTalla(1);
        ropa5.setIndiceGenero(2);
        rpa.add(ropa5);
        sropa.addElement(ropa5.getTexto());

        Ropa ropa6 = new Ropa("Pantalón Verde Niño", 35, 29.99);
        ropa6.setIndiceTalla(0);
        ropa6.setIndiceGenero(2);
        rpa.add(ropa6);
        sropa.addElement(ropa6.getTexto());
        lst_Ropa.setModel(sropa);
    }
    
    
    
    private void llamarpantalla()
    {
        Product ref = new Product(this);
        ref.setLocationRelativeTo(null);
        ref.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_Genero;
    private javax.swing.JComboBox<String> box_Talla;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Filtrar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_x;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Ropa;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
