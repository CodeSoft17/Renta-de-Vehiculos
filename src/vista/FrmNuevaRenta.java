/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControlRenta;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Renta;


/**
 *
 * @author joe
 */
public class FrmNuevaRenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmNuevaRenta
     */
    public FrmNuevaRenta() {
        initComponents();
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidCliente = new javax.swing.JTextField();
        txtidEmpleado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbtipoPago = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        btnnueva = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbBusqueda = new javax.swing.JComboBox<>();
        txtbusqueda = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRenta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbltipoPago1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        txtIdVehiculo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtIdRenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Nueva Renta");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("idCliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("idEmpleado");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        txtidCliente.setBackground(new java.awt.Color(36, 47, 65));
        txtidCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtidCliente.setBorder(null);
        jPanel2.add(txtidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, -1));

        txtidEmpleado.setBackground(new java.awt.Color(36, 47, 65));
        txtidEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtidEmpleado.setBorder(null);
        jPanel2.add(txtidEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 110, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("idVehiculo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        cmbtipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de Credito", " " }));
        jPanel2.add(cmbtipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 10));

        btnnueva.setBackground(new java.awt.Color(36, 47, 65));
        btnnueva.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnnueva.setForeground(new java.awt.Color(255, 255, 255));
        btnnueva.setText("Nueva");
        btnnueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnuevaMousePressed(evt);
            }
        });
        jPanel2.add(btnnueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(36, 47, 65));
        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        btnsalir.setBackground(new java.awt.Color(36, 47, 65));
        btnsalir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione una forma de busqueda");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        cmbBusqueda.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idCliente", "Nombre Cliente", "idEmpleado", "Empleado", "Tipo de Pago", " " }));
        jPanel2.add(cmbBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        txtbusqueda.setBackground(new java.awt.Color(36, 47, 65));
        txtbusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbusqueda.setBorder(null);
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyPressed(evt);
            }
        });
        jPanel2.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, 10));

        tblRenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRentaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRenta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1210, 170));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 20));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 110, 10));

        lbltipoPago1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltipoPago1.setForeground(new java.awt.Color(255, 255, 255));
        lbltipoPago1.setText("Tipo de Pago");
        jPanel2.add(lbltipoPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 20));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblEmpleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleados", jPanel1);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Clientes", jPanel3);

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblVehiculos);

        jTabbedPane1.addTab("Vehiculos", jScrollPane3);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 540, 220));

        txtIdVehiculo.setBackground(new java.awt.Color(36, 47, 65));
        txtIdVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        txtIdVehiculo.setBorder(null);
        jPanel2.add(txtIdVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, 20));

        txtFecha.setBackground(new java.awt.Color(36, 47, 65));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(null);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 20));

        txtTotal.setBackground(new java.awt.Color(36, 47, 65));
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setBorder(null);
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 20));

        txtIdRenta.setBackground(new java.awt.Color(36, 47, 65));
        txtIdRenta.setForeground(new java.awt.Color(36, 47, 65));
        txtIdRenta.setBorder(null);
        jPanel2.add(txtIdRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 20));

        jButton1.setText("Editar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirMouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        this.mostrarClientes();
        this.mostrarEmpleados();
        this.mostrarVehiculos();
        this.mostrarRenta();
    }//GEN-LAST:event_formComponentShown

    private void btnnuevaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevaMousePressed
        // TODO add your handling code here:
        this.ingresarRegistros();
        this.mostrarClientes();
        this.mostrarEmpleados();
        this.mostrarVehiculos();
        this.mostrarRenta();
    }//GEN-LAST:event_btnnuevaMousePressed

    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed
        // TODO add your handling code here:
        this.buscarRenta();
        this.mostrarClientes();
        this.mostrarEmpleados();
        this.mostrarVehiculos();
        this.mostrarRenta();
    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void tblRentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRentaMousePressed
        // TODO add your handling code here:
        this.llenarDatos();
    }//GEN-LAST:event_tblRentaMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        this.modificarRegistros();
        this.limpiar();
    }//GEN-LAST:event_jButton1MousePressed
    
    public void mostrarRenta(){     
        DefaultTableModel modelo = new DefaultTableModel();
        ControlRenta control = new ControlRenta();
        try{
            modelo = control.mostrarRenta();
            this.tblRenta.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarVehiculos(){
        DefaultTableModel modelo = new DefaultTableModel();
        ControlRenta control = new ControlRenta();
        try{
            modelo = control.mostrarVehiculos();
            this.tblVehiculos.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarEmpleados(){
        DefaultTableModel modelo = new DefaultTableModel();
        ControlRenta control = new ControlRenta();
        try{
            modelo = control.mostrarEmpleados();
            this.tblEmpleados.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarClientes(){
        DefaultTableModel modelo = new DefaultTableModel();
        ControlRenta control = new ControlRenta();
        try{
            modelo = control.mostrarClientes();
            this.tblClientes.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscarRenta(){
        DefaultTableModel modelo = new DefaultTableModel();
        ControlRenta control = new ControlRenta();
        try{           
            modelo = control.buscarRenta(String.valueOf(this.cmbBusqueda.getSelectedItem()), this.txtbusqueda.getText());
            this.tblRenta.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ingresarRegistros(){
        Renta re = new Renta();
        ControlRenta control = new ControlRenta();
        try{
            re.setIdCliente(Integer.valueOf(this.txtidCliente.getText()));
            re.setIdEmpleado(Integer.valueOf(this.txtidEmpleado.getText()));           
            re.setFecha(String.valueOf(this.txtFecha.getText()));            
            re.setTipoDePago(String.valueOf(this.cmbtipoPago.getSelectedItem()));           
            re.setIdVehiculo(Integer.parseInt(this.txtIdVehiculo.getText()));           
            re.setTotal(Double.valueOf(this.txtTotal.getText()));
                        
            String mensaje = control.agregarRenta(re);
            JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarRegistros(){
        Renta re = new Renta();
        ControlRenta control = new ControlRenta();
        int fila;
        fila = this.tblEmpleados.getSelectedRow();
        try{
            this.txtIdRenta.setText(String.valueOf(this.tblRenta.getValueAt(fila, 0)));
            re.setIdCliente(Integer.valueOf(this.txtidCliente.getText()));
            re.setIdEmpleado(Integer.valueOf(this.txtidEmpleado.getText()));
            re.setFecha(this.txtFecha.getText());
            re.setTipoDePago(String.valueOf(this.cmbtipoPago.getSelectedItem()));
            re.setIdVehiculo(Integer.valueOf(this.txtIdVehiculo.getText()));
            re.setTotal(Double.valueOf(this.txtTotal.getText()));
            int respuesta = JOptionPane.showConfirmDialog(this, "Desea modificare la renta seleccionada?", "Modificar", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.OK_OPTION){
                String mensaje = control.modificarRenta(re);
                JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                this.mostrarRenta();
                this.limpiar();
            }
            
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarRegistro(){
        Renta re = new Renta();
        ControlRenta control = new ControlRenta();
        int fila;
        fila = this.tblRenta.getSelectedRow();
        try{
            this.txtIdRenta.setText(String.valueOf(this.tblRenta.getValueAt(fila, 0)));
            re.setIdRenta(Integer.parseInt(this.txtIdRenta.getText()));
            int respuesta = JOptionPane.showConfirmDialog(this, "Desea eliminar la renta seleccionada?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.OK_OPTION){
                String mensaje = control.eliminarRenta(re);
                JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                this.mostrarRenta();
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void llenarDatos(){
        int fila = this.tblRenta.getSelectedRow();
        this.txtIdRenta.setText(String.valueOf(this.tblRenta.getValueAt(fila, 0)));      
        this.txtidCliente.setText(String.valueOf(this.tblRenta.getValueAt(fila, 2))); 
        this.txtidEmpleado.setText(String.valueOf(this.tblRenta.getValueAt(fila, 4))); 
        this.txtFecha.setText(String.valueOf(this.tblRenta.getValueAt(fila, 7))); 
        this.cmbtipoPago.setSelectedItem(String.valueOf(this.tblRenta.getValueAt(fila, 8))); 
        this.txtIdVehiculo.setText(String.valueOf(this.tblRenta.getValueAt(fila, 5))); 
        this.txtTotal.setText(String.valueOf(this.tblRenta.getValueAt(fila, 9)));
    }
    
    public void limpiar(){
        this.txtIdRenta.setText("");
        this.txtidCliente.setText("");
        this.txtidEmpleado.setText("");
        this.txtFecha.setText("");
        this.txtTotal.setText("");
        this.txtbusqueda.setText("");
        this.txtIdVehiculo.setText("");
        this.cmbBusqueda.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnnueva;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbBusqueda;
    private javax.swing.JComboBox<String> cmbtipoPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbltipoPago1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblRenta;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdRenta;
    private javax.swing.JTextField txtIdVehiculo;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JTextField txtidEmpleado;
    // End of variables declaration//GEN-END:variables
}
