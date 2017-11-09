/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.ControlSolicitud;
import java.sql.SQLException;
import modelo.solicitudVehiculo;

/**
 *
 * @author Circus
 */
public class FrmNuevaSolicitud extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmNuevaSolicitud
     */
    public FrmNuevaSolicitud() {
        initComponents();
        mostrarRegistrosVehiculo();
        mostrarRegistrosEmpleado();
        mostrarRegistrosProveedor();
       mostrarSolicitudes();
       
    }
       public void mostrarRegistrosVehiculo(){
        String[] columnas = {"idVehiculo", "Modelo", "Marca", "clase", "placa", "color", "anio", "nota", "estado"};
        Object[] obj = new Object[9];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        String busqueda;
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from vehiculosvista";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getString("idVehiculo");
                obj[1] = rs.getString("modelo");
                obj[2] = rs.getString("marca");
                obj[3] = rs.getString("clase");
                obj[4] = rs.getString("placa");
                obj[5] = rs.getString("color");
                obj[6] = rs.getString("anio");
                obj[7] = rs.getString("nota");
                obj[8] = rs.getString("estado");
                modelo.addRow(obj);
            }
            this.tblVehiculo.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
       public void mostrarRegistrosEmpleado(){
        String[] columnas = {"idEmpleado", "Nombre"};
        Object[] obj = new Object[2];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        String busqueda;
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from vistaempleado";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("idEmpleado");
                obj[1] = rs.getString("nombre");
             
                modelo.addRow(obj);
            }
            this.tblEmpleado.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void mostrarRegistrosProveedor(){
        String[] columnas = {"idProveedor", "Nombre"};
        Object[] obj = new Object[2];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        String busqueda;
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from vistaproveedor";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("idProveedor");
                obj[1] = rs.getString("nombre");
             
                modelo.addRow(obj);
            }
            this.tblProveedor.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void mostrarSolicitudes(){
        String[] columnas = {"IdSolicitud", "IdEmpleado", "Fecha", "idProveedor", "idVehiculo"};
        Object[] obj = new Object[5];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        String busqueda;
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from solicitudvehiculo";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("idSolicitud");
                obj[1] = rs.getInt("idEmpleado");
                obj[2] = rs.getString("fecha");
                obj[3] = rs.getInt("idProveedor");
                obj[4] = rs.getInt("idVehiculo");
                modelo.addRow(obj);
            }
            this.tblBuscar.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        public void nuevaSolicitud(){
            solicitudVehiculo sv = new solicitudVehiculo();
            ControlSolicitud control = new ControlSolicitud();
           try{
               sv.setIdSolicitud(Integer.parseInt(this.txtidSolicitud.getText()));
               sv.setIdEmpleado(Integer.parseInt(this.txtidEmpleado.getText()));
               sv.setFecha(this.txtFecha.getText());
               sv.setIdProveedor(Integer.parseInt(this.txtidProveedor.getText()));
               sv.setIdVehiculo(Integer.parseInt(this.txtidVehiculo.getText()));
               String mensaje = control.agregarSolicitud(sv);
            JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);   
           }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
           }
            
        }
        public void Buscar(){
        String[] columnas = {"IdSolicitud", "IdEmpleado", "Fecha", "idProveedor", "idVehiculo"};
        Object[] obj = new Object[5];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        String busqueda;
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            busqueda = this.txtbusqueda.getText();
            String eleccion = (String)this.cmbEleccion.getSelectedItem();
            sql = "select * from solicitudvehiculo where " + eleccion + " like '" + busqueda + "%'";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getString("idSolicitud");
                obj[1] = rs.getString("idEmpleado");
                obj[2] = rs.getString("fecha");
                obj[3] = rs.getString("idProveedor");
                obj[4] = rs.getString("idVehiculo");
                modelo.addRow(obj);
            }
            this.tblBuscar.setModel(modelo);
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
            
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
        btnnuevaSolicitud = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblSolicitud = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblEmpleado1 = new javax.swing.JLabel();
        lblEmpleado2 = new javax.swing.JLabel();
        lblEmpleado3 = new javax.swing.JLabel();
        txtidSolicitud = new javax.swing.JTextField();
        txtidEmpleado = new javax.swing.JTextField();
        txtidVehiculo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtidProveedor = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cmbEleccion = new javax.swing.JComboBox<>();
        txtbusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();

        setTitle("Nueva Solicitud");

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        btnnuevaSolicitud.setBackground(new java.awt.Color(36, 47, 65));
        btnnuevaSolicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnnuevaSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevaSolicitud.setText("Nueva Solicitud");
        btnnuevaSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnuevaSolicitudMousePressed(evt);
            }
        });
        btnnuevaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevaSolicitudActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(36, 47, 65));
        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Solicitud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lblSolicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        lblSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        lblSolicitud.setText("idSolicitud");

        lblEmpleado.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado.setText("idEmpleado");

        lblEmpleado1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        lblEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado1.setText("Fecha");

        lblEmpleado2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        lblEmpleado2.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado2.setText("idProveedor");

        lblEmpleado3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        lblEmpleado3.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado3.setText("idVehiculo");

        txtidSolicitud.setBackground(new java.awt.Color(36, 47, 65));
        txtidSolicitud.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtidSolicitud.setForeground(new java.awt.Color(255, 255, 255));

        txtidEmpleado.setBackground(new java.awt.Color(36, 47, 65));
        txtidEmpleado.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtidEmpleado.setForeground(new java.awt.Color(255, 255, 255));

        txtidVehiculo.setBackground(new java.awt.Color(36, 47, 65));
        txtidVehiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtidVehiculo.setForeground(new java.awt.Color(255, 255, 255));

        txtFecha.setBackground(new java.awt.Color(36, 47, 65));
        txtFecha.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));

        txtidProveedor.setBackground(new java.awt.Color(36, 47, 65));
        txtidProveedor.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtidProveedor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblEmpleado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSolicitud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtidSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblEmpleado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblEmpleado2)
                                .addGap(18, 18, 18)
                                .addComponent(txtidProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleado1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolicitud))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleado)
                    .addComponent(txtidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleado2)
                            .addComponent(txtidProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleado3)
                            .addComponent(txtidVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEmpleado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel2);

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProveedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedor", jPanel3);

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblVehiculo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehiculo", jPanel5);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seleccione una opción de búsqueda");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cmbEleccion.setForeground(new java.awt.Color(204, 204, 204));
        cmbEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idSolicitud", "idEmpleado", "idVehiculo", "fecha", "idProveedor", " " }));

        txtbusqueda.setBackground(new java.awt.Color(36, 47, 65));
        txtbusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbusqueda.setBorder(null);
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyTyped(evt);
            }
        });

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBuscarMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tblBuscar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(cmbEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnnuevaSolicitud)
                                .addGap(159, 159, 159)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevaSolicitud)
                            .addComponent(btnSalir))))
                .addGap(28, 28, 28)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaSolicitudActionPerformed

    }//GEN-LAST:event_btnnuevaSolicitudActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtbusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyTyped
        // TODO add your handling code here:
        Buscar();
    }//GEN-LAST:event_txtbusquedaKeyTyped

    private void tblBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblBuscarMousePressed

    private void btnnuevaSolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevaSolicitudMousePressed
        // TODO add your handling code here:
        nuevaSolicitud();
        mostrarSolicitudes();
    }//GEN-LAST:event_btnnuevaSolicitudMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnnuevaSolicitud;
    private javax.swing.JComboBox<String> cmbEleccion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEmpleado1;
    private javax.swing.JLabel lblEmpleado2;
    private javax.swing.JLabel lblEmpleado3;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtidEmpleado;
    private javax.swing.JTextField txtidProveedor;
    private javax.swing.JTextField txtidSolicitud;
    private javax.swing.JTextField txtidVehiculo;
    // End of variables declaration//GEN-END:variables
}
