/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Circus
 */
public class FrmagregarVehiculo extends javax.swing.JInternalFrame {

    /** Creates new form frmagregarVehiculo */
    public FrmagregarVehiculo() {
        initComponents();
        this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblidMarca = new javax.swing.JLabel();
        lblidColor = new javax.swing.JLabel();
        lblidModelo = new javax.swing.JLabel();
        lbliAño = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtidModelo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtidColor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtidMarca = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtplaca = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        txtidClase = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtNota = new javax.swing.JTextField();
        lblidClase = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        cbmestado = new javax.swing.JComboBox<>();
        txtidAño = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Vehiculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblPlaca.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa");

        lblNota.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Nota");

        lblidMarca.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblidMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblidMarca.setText("idMarca");

        lblidColor.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblidColor.setForeground(new java.awt.Color(255, 255, 255));
        lblidColor.setText("idColor");

        lblidModelo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblidModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblidModelo.setText("idModelo");

        lbliAño.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbliAño.setForeground(new java.awt.Color(255, 255, 255));
        lbliAño.setText("idAño");

        txtidModelo.setBackground(new java.awt.Color(36, 47, 65));
        txtidModelo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtidModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtidModelo.setBorder(null);
        txtidModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidModeloKeyTyped(evt);
            }
        });

        txtidColor.setBackground(new java.awt.Color(36, 47, 65));
        txtidColor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtidColor.setForeground(new java.awt.Color(255, 255, 255));
        txtidColor.setBorder(null);
        txtidColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidColorKeyTyped(evt);
            }
        });

        txtidMarca.setBackground(new java.awt.Color(36, 47, 65));
        txtidMarca.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtidMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtidMarca.setBorder(null);
        txtidMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidMarcaKeyTyped(evt);
            }
        });

        txtplaca.setBackground(new java.awt.Color(36, 47, 65));
        txtplaca.setBorder(null);
        txtplaca.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("P### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtplaca.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado");

        txtidClase.setBackground(new java.awt.Color(36, 47, 65));
        txtidClase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtidClase.setForeground(new java.awt.Color(255, 255, 255));
        txtidClase.setBorder(null);
        txtidClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidClaseKeyTyped(evt);
            }
        });

        txtNota.setBackground(new java.awt.Color(36, 47, 65));
        txtNota.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtNota.setForeground(new java.awt.Color(255, 255, 255));
        txtNota.setBorder(null);
        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotaKeyTyped(evt);
            }
        });

        lblidClase.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblidClase.setForeground(new java.awt.Color(255, 255, 255));
        lblidClase.setText("idClase");

        cbmestado.setBackground(new java.awt.Color(36, 47, 65));
        cbmestado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbmestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));

        txtidAño.setBackground(new java.awt.Color(36, 47, 65));
        txtidAño.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtidAño.setForeground(new java.awt.Color(255, 255, 255));
        txtidAño.setBorder(null);
        txtidAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidAñoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota)
                    .addComponent(lblidClase)
                    .addComponent(lbliAño)
                    .addComponent(lblidModelo)
                    .addComponent(lblidColor)
                    .addComponent(lblidMarca)
                    .addComponent(lblEstado)
                    .addComponent(lblPlaca))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbmestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtidAño, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtplaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(txtidMarca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtidColor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtidModelo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtidClase, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNota, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbmestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbliAño)
                    .addComponent(txtidAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtidModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblidModelo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidColor)
                    .addComponent(txtidColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtidMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(91, 228, 138));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cliente999\\Desktop\\Nobilis5BE48A.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Vehiculo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setBackground(new java.awt.Color(36, 47, 65));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(36, 47, 65));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.setBorder(null);
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidModeloKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            evt.consume();
        }  if( this.txtidModelo.getText().length() == 3 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtidModeloKeyTyped

    private void txtidColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidColorKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            evt.consume();
        }  if( this.txtidColor.getText().length() == 3 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtidColorKeyTyped

    private void txtidMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidMarcaKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            evt.consume();
        }  if( this.txtidMarca.getText().length() == 3 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtidMarcaKeyTyped

    private void txtidClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidClaseKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            evt.consume();
        }  if( this.txtidClase.getText().length() == 3 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtidClaseKeyTyped

    private void txtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || Character.isWhitespace(validar)){

            evt.consume();
        }
        if( this.txtNota.getText().length() == 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtNotaKeyTyped

    private void txtidAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidAñoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            evt.consume();
        }  if( this.txtidAño.getText().length() == 3 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtidAñoKeyTyped

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (this.txtNota.getText().isEmpty() || this.txtidClase.getText().isEmpty() || this.txtidColor.getText().isEmpty() || this.txtidMarca.getText().isEmpty() || this.txtidModelo.getText().isEmpty() || this.txtidAño.getText().isEmpty() || this.txtplaca.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Campos vacios","Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed

    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirMousePressed

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
            java.util.logging.Logger.getLogger(FrmagregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmagregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmagregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmagregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmagregarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbmestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lbliAño;
    private javax.swing.JLabel lblidClase;
    private javax.swing.JLabel lblidColor;
    private javax.swing.JLabel lblidMarca;
    private javax.swing.JLabel lblidModelo;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtidAño;
    private javax.swing.JTextField txtidClase;
    private javax.swing.JTextField txtidColor;
    private javax.swing.JTextField txtidMarca;
    private javax.swing.JTextField txtidModelo;
    private javax.swing.JFormattedTextField txtplaca;
    // End of variables declaration//GEN-END:variables

}
