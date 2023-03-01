/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conversor_Codigo;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class ConversorM_Panel extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    
    Conversor_Monedas con = new Conversor_Monedas();

   
    public ConversorM_Panel() {
        initComponents();
        this.imagenes(fondo,"src/Conversor_imagenes/fondoM.jpg");
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        conversion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        resultado1 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JLabel();
        optiones = new javax.swing.JComboBox<>();
        igual_lbl = new javax.swing.JLabel();
        bandera2 = new javax.swing.JLabel();
        bandera1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Conversion Monedas");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setSelected(true);

        jButton2.setText("Conversion Medidas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setSelected(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setSelected(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Inicio");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        conversion.setText("Convertir");
        conversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("Importe : ");

        num.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N

        resultado1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultado1.setBorder(new javax.swing.border.MatteBorder(null));

        resultado2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultado2.setBorder(new javax.swing.border.MatteBorder(null));

        optiones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        optiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boliviano a Dolar", "Boliviano a Euros", "Boliviano a Libras Esterlinas", "Boliviano a Yen Japones", "Boliviano a won sul Coreano", "Dolar a Boliviano", "Euros a Boliviano", "Libras Esterlinas a Boliviano", "Yen Japones a Boliviano", "won sul Coreano a Boliviano" }));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bandera1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandera2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optiones, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conversion)))
                .addGap(18, 18, 18))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optiones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(resultado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(igual_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bandera2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bandera1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 490, 240));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 540, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionActionPerformed
      double numero =Double.parseDouble(num.getText());
      int opcion = optiones.getSelectedIndex();
     
      
      con.setalgoritmo(opcion, numero);
      simbolo(opcion);
      this.imagenes(igual_lbl,"src/Conversor_imagenes/igual.jpg");
    }//GEN-LAST:event_conversionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        inicio_panel abrir = new inicio_panel();
      abrir.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      conversion_Medidas abrir = new conversion_Medidas();
      abrir.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorM_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorM_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorM_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorM_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorM_Panel().setVisible(true);
            }
        });
        
    }
        private void imagenes(JLabel lbl, String ruta){
        this.imagen =  new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    
    }  
        
     
      
       
      
     
     
     public void simbolo(int opcion){
       String result1 = String.valueOf(num.getText());
       String result2 = String.valueOf(con.getalgoritmo());
         
       if ( opcion == 0){
             resultado1.setText(" "+result1 +" BOB");
               this.imagenes(bandera1,"src/Conversor_imagenes/bolivia.png");
             
             resultado2.setText(result2 + " USD");
               this.imagenes(bandera2,"src/Conversor_imagenes/EU.png");
             
         
         }if (opcion == 1){ 
             resultado1.setText(" "+result1 +" BOB");
               this.imagenes(bandera1,"src/Conversor_imagenes/bolivia.png");
             
             resultado2.setText(result2 + " EUR");
               this.imagenes(bandera2,"src/Conversor_imagenes/europa.png");
        
         }if (opcion == 2){
             resultado1.setText(" "+result1 +" BOB");
               this.imagenes(bandera1,"src/Conversor_imagenes/bolivia.png");
               
             resultado2.setText(result2 + " GBP");
               this.imagenes(bandera2,"src/Conversor_imagenes/esterlinas.png");
        
         }if (opcion == 3){
             resultado1.setText(" "+result1 +" BOB");
               this.imagenes(bandera1,"src/Conversor_imagenes/bolivia.png");
               
             resultado2.setText(result2 + " JPY");
               this.imagenes(bandera2,"src/Conversor_imagenes/japon.png");
             
             
         }if (opcion == 4){
             resultado1.setText(" "+result1 +" BOB");
               this.imagenes(bandera1,"src/Conversor_imagenes/bolivia.png");
               
             resultado2.setText(result2 + " KRW");
               this.imagenes(bandera2,"src/Conversor_imagenes/corea.png");
        
         }if (opcion == 5){
             resultado1.setText(" "+result1 +" USD");
              this.imagenes(bandera1,"src/Conversor_imagenes/EU.png");
             
             resultado2.setText(result2 + " BOB");
              this.imagenes(bandera2,"src/Conversor_imagenes/bolivia.png");
          
         }if (opcion == 6){
             resultado1.setText(" "+result1 +" EUR");
               this.imagenes(bandera1,"src/Conversor_imagenes/europa.png");
             
             resultado2.setText(result2 + " BOB");
              this.imagenes(bandera2,"src/Conversor_imagenes/bolivia.png");
             
         
         }if (opcion == 7){
             resultado1.setText(" "+result1 +" GBP");
               this.imagenes(bandera1,"src/Conversor_imagenes/esterlinas.png");
             
             resultado2.setText(result2 + " BOB");
               this.imagenes(bandera2,"src/Conversor_imagenes/bolivia.png");
         
         }if (opcion == 8){
             resultado1.setText(" "+result1 +" JPY");
               this.imagenes(bandera1,"src/Conversor_imagenes/japon.png");
              
             resultado2.setText(result2 + " BOB");
               this.imagenes(bandera2,"src/Conversor_imagenes/bolivia.png");
             
         
         }if (opcion == 9){
             resultado1.setText(" "+result1 +" KRW");
               this.imagenes(bandera1,"src/Conversor_imagenes/corea.png");
               
             resultado2.setText(result2 + " BOB");
               this.imagenes(bandera2,"src/Conversor_imagenes/bolivia.png");
             
         }
         
     }   
    
     
     
        
      
      
        
     
     
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera1;
    private javax.swing.JLabel bandera2;
    private javax.swing.JButton conversion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel igual_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField num;
    private javax.swing.JComboBox<String> optiones;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel resultado1;
    private javax.swing.JLabel resultado2;
    // End of variables declaration//GEN-END:variables
}
