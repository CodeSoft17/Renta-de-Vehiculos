/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author cliente999
 */
public class FrmmenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InicioEmpleado
     */
    public FrmmenuPrincipal() {
        initComponents();   //Editar y elimar solo lo hace el administrador
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnVehiculos = new javax.swing.JMenu();
        jmenuBuscarVehiculo = new javax.swing.JMenuItem();
        jMenuAgregarVehiculo = new javax.swing.JMenuItem();
        jMenuEditarVehiculo = new javax.swing.JMenuItem();
        jMenuAnularVehiculo = new javax.swing.JMenuItem();
        mnSolicitudes = new javax.swing.JMenu();
        jMenuNuevaSolicitud = new javax.swing.JMenuItem();
        jMenuCancelarSolicitud = new javax.swing.JMenuItem();
        jMenuNuevoCLiente = new javax.swing.JMenu();
        jMenuNuevoCliente = new javax.swing.JMenuItem();
        jMenuBuscarCliente = new javax.swing.JMenuItem();
        jMenuEditarCLiente = new javax.swing.JMenuItem();
        jMenuELiminarCLiente = new javax.swing.JMenuItem();
        jMenuGestionEmpleados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuNuevaRenta = new javax.swing.JMenu();
        minuevaRenta = new javax.swing.JMenuItem();
        jMenuBuscarRenta = new javax.swing.JMenuItem();
        jMenuNuevoProveedor = new javax.swing.JMenu();
        minuevoProveedor = new javax.swing.JMenuItem();
        jMenuBuscarProveedor = new javax.swing.JMenuItem();
        jMenuEditarProveedor = new javax.swing.JMenuItem();
        jMenuELiminarProveedor = new javax.swing.JMenuItem();
        jMenuReporteVehiculos = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuReporteCLientes = new javax.swing.JMenuItem();
        jMenuReporteEmpleados = new javax.swing.JMenuItem();
        jMenuReporteProveedores = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(36, 47, 65));
        setName("frmmenuPrincipal"); // NOI18N

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        mnVehiculos.setText("Vehiculos");

        jmenuBuscarVehiculo.setText("Buscar Vehiculo");
        jmenuBuscarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmenuBuscarVehiculoMousePressed(evt);
            }
        });
        mnVehiculos.add(jmenuBuscarVehiculo);

        jMenuAgregarVehiculo.setText("Agregar Vehiculo");
        jMenuAgregarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAgregarVehiculoMousePressed(evt);
            }
        });
        mnVehiculos.add(jMenuAgregarVehiculo);

        jMenuEditarVehiculo.setText("Editar Vehiculo");
        jMenuEditarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEditarVehiculoMousePressed(evt);
            }
        });
        jMenuEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarVehiculoActionPerformed(evt);
            }
        });
        mnVehiculos.add(jMenuEditarVehiculo);

        jMenuAnularVehiculo.setText("Anular Vehiculo");
        jMenuAnularVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAnularVehiculoMousePressed(evt);
            }
        });
        mnVehiculos.add(jMenuAnularVehiculo);

        jMenuBar1.add(mnVehiculos);

        mnSolicitudes.setText("Solicitudes");

        jMenuNuevaSolicitud.setText("Nueva Solicitud");
        jMenuNuevaSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuNuevaSolicitudMousePressed(evt);
            }
        });
        mnSolicitudes.add(jMenuNuevaSolicitud);

        jMenuCancelarSolicitud.setText("Cancelar Solicitud");
        jMenuCancelarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuCancelarSolicitudMousePressed(evt);
            }
        });
        mnSolicitudes.add(jMenuCancelarSolicitud);

        jMenuBar1.add(mnSolicitudes);

        jMenuNuevoCLiente.setText("Clientes ");

        jMenuNuevoCliente.setText("Nuevo Cliente");
        jMenuNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuNuevoClienteMousePressed(evt);
            }
        });
        jMenuNuevoCLiente.add(jMenuNuevoCliente);

        jMenuBuscarCliente.setText("Buscar Cliente");
        jMenuBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBuscarClienteMousePressed(evt);
            }
        });
        jMenuNuevoCLiente.add(jMenuBuscarCliente);

        jMenuEditarCLiente.setText("Editar Clientes");
        jMenuEditarCLiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuEditarCLienteMousePressed(evt);
            }
        });
        jMenuNuevoCLiente.add(jMenuEditarCLiente);

        jMenuELiminarCLiente.setText("Eliminar Clientes");
        jMenuELiminarCLiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuELiminarCLienteMousePressed(evt);
            }
        });
        jMenuNuevoCLiente.add(jMenuELiminarCLiente);

        jMenuBar1.add(jMenuNuevoCLiente);

        jMenuGestionEmpleados.setText("Empleados");
        jMenuGestionEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuGestionEmpleadosMousePressed(evt);
            }
        });

        jMenuItem1.setText("Gestionar Empleaos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuGestionEmpleados.add(jMenuItem1);

        jMenuBar1.add(jMenuGestionEmpleados);

        jMenuNuevaRenta.setText("Rentas");

        minuevaRenta.setText("Nueva Renta");
        minuevaRenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minuevaRentaMousePressed(evt);
            }
        });
        jMenuNuevaRenta.add(minuevaRenta);

        jMenuBuscarRenta.setText("Buscar Renta");
        jMenuBuscarRenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBuscarRentaMousePressed(evt);
            }
        });
        jMenuNuevaRenta.add(jMenuBuscarRenta);

        jMenuBar1.add(jMenuNuevaRenta);

        jMenuNuevoProveedor.setText("Proveedores");

        minuevoProveedor.setText("Nuevo Proveedor");
        minuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuevoProveedorActionPerformed(evt);
            }
        });
        jMenuNuevoProveedor.add(minuevoProveedor);

        jMenuBuscarProveedor.setText("Buscar Proveedor");
        jMenuBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarProveedorActionPerformed(evt);
            }
        });
        jMenuNuevoProveedor.add(jMenuBuscarProveedor);

        jMenuEditarProveedor.setText("Editar Proveedor");
        jMenuNuevoProveedor.add(jMenuEditarProveedor);

        jMenuELiminarProveedor.setText("Eliminar Proveedor");
        jMenuNuevoProveedor.add(jMenuELiminarProveedor);

        jMenuBar1.add(jMenuNuevoProveedor);

        jMenuReporteVehiculos.setText("Reportes");

        jMenuItem6.setText("Reporte de Vehiculos");
        jMenuReporteVehiculos.add(jMenuItem6);

        jMenuReporteCLientes.setText("Reporte Clientes");
        jMenuReporteVehiculos.add(jMenuReporteCLientes);

        jMenuReporteEmpleados.setText("Reporte Empleados");
        jMenuReporteVehiculos.add(jMenuReporteEmpleados);

        jMenuReporteProveedores.setText("Reporte Proveedores");
        jMenuReporteVehiculos.add(jMenuReporteProveedores);

        jMenuBar1.add(jMenuReporteVehiculos);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBuscarProveedorActionPerformed

    private void minuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuevoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minuevoProveedorActionPerformed

    private void jmenuBuscarVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenuBuscarVehiculoMousePressed
        // TODO add your handling code here:
        FrmbuscarVehiculos buscar = new FrmbuscarVehiculos();
        desktop.add(buscar);
        buscar.setVisible(true);
    }//GEN-LAST:event_jmenuBuscarVehiculoMousePressed

    private void jMenuEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarVehiculoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuEditarVehiculoActionPerformed

    private void jMenuAgregarVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAgregarVehiculoMousePressed
        FrmagregarVehiculo agregar = new FrmagregarVehiculo();
        desktop.add(agregar);
        agregar.setVisible(true);
       
    }//GEN-LAST:event_jMenuAgregarVehiculoMousePressed

    private void jMenuEditarVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarVehiculoMousePressed
        FrmEditarVehiculos editar = new FrmEditarVehiculos();
        desktop.add(editar);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuEditarVehiculoMousePressed

    private void jMenuAnularVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAnularVehiculoMousePressed
        FrmanularVehiculos anular = new FrmanularVehiculos();
        desktop.add(anular);
        anular.setVisible(true);
    }//GEN-LAST:event_jMenuAnularVehiculoMousePressed

    private void jMenuBuscarRentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBuscarRentaMousePressed
        // TODO add your handling code here:
        FrmBuscarRenta rentab = new FrmBuscarRenta();
        desktop.add(rentab);
        rentab.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarRentaMousePressed

    private void minuevaRentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minuevaRentaMousePressed
        // TODO add your handling code here:
        FrmNuevaRenta nrenta = new FrmNuevaRenta();
        desktop.add(nrenta);
        nrenta.setVisible(true);
    }//GEN-LAST:event_minuevaRentaMousePressed

    private void jMenuNuevaSolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNuevaSolicitudMousePressed
        FrmNuevaSolicitud nsoli = new FrmNuevaSolicitud();
        desktop.add(nsoli);
        nsoli.setVisible(true);
    }//GEN-LAST:event_jMenuNuevaSolicitudMousePressed

    private void jMenuCancelarSolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCancelarSolicitudMousePressed
        FrmCancelarSolicitud csoli = new FrmCancelarSolicitud();
        desktop.add(csoli);
        csoli.setVisible(true);
    }//GEN-LAST:event_jMenuCancelarSolicitudMousePressed

    private void jMenuELiminarCLienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuELiminarCLienteMousePressed
        // TODO add your handling code here:
        FrmEliminarCliente elicli = new FrmEliminarCliente();
        desktop.add(elicli);
        elicli.setVisible(true);
    }//GEN-LAST:event_jMenuELiminarCLienteMousePressed

    private void jMenuNuevoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNuevoClienteMousePressed
        // TODO add your handling code here:
        FrmNuevoCliente nclien = new FrmNuevoCliente();
        desktop.add(nclien);
        nclien.setVisible(true);
    }//GEN-LAST:event_jMenuNuevoClienteMousePressed

    private void jMenuBuscarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBuscarClienteMousePressed
        // TODO add your handling code here:
        FrmBuscarCliente bcli = new FrmBuscarCliente();
        desktop.add(bcli);
        bcli.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarClienteMousePressed

    private void jMenuEditarCLienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarCLienteMousePressed
        // TODO add your handling code here:
        FrmEditarCliente edcli = new FrmEditarCliente();
        desktop.add(edcli);
        edcli.setVisible(true);
    }//GEN-LAST:event_jMenuEditarCLienteMousePressed

    private void jMenuGestionEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGestionEmpleadosMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuGestionEmpleadosMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
        FrmGestionEmpleados gestion = new FrmGestionEmpleados();
        desktop.add(gestion);
        gestion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MousePressed

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
            java.util.logging.Logger.getLogger(FrmmenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmmenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmmenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmmenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmmenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jMenuAgregarVehiculo;
    private javax.swing.JMenuItem jMenuAnularVehiculo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuscarCliente;
    private javax.swing.JMenuItem jMenuBuscarProveedor;
    private javax.swing.JMenuItem jMenuBuscarRenta;
    private javax.swing.JMenuItem jMenuCancelarSolicitud;
    private javax.swing.JMenuItem jMenuELiminarCLiente;
    private javax.swing.JMenuItem jMenuELiminarProveedor;
    private javax.swing.JMenuItem jMenuEditarCLiente;
    private javax.swing.JMenuItem jMenuEditarProveedor;
    private javax.swing.JMenuItem jMenuEditarVehiculo;
    private javax.swing.JMenu jMenuGestionEmpleados;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jMenuNuevaRenta;
    private javax.swing.JMenuItem jMenuNuevaSolicitud;
    private javax.swing.JMenu jMenuNuevoCLiente;
    private javax.swing.JMenuItem jMenuNuevoCliente;
    private javax.swing.JMenu jMenuNuevoProveedor;
    private javax.swing.JMenuItem jMenuReporteCLientes;
    private javax.swing.JMenuItem jMenuReporteEmpleados;
    private javax.swing.JMenuItem jMenuReporteProveedores;
    private javax.swing.JMenu jMenuReporteVehiculos;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jmenuBuscarVehiculo;
    private javax.swing.JMenuItem minuevaRenta;
    private javax.swing.JMenuItem minuevoProveedor;
    private javax.swing.JMenu mnSolicitudes;
    private javax.swing.JMenu mnVehiculos;
    // End of variables declaration//GEN-END:variables
}
