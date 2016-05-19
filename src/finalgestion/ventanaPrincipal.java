
package finalgestion;

import Liquidacion.nuevaLiquidacion;
import Ventas.reporteVentas;
import Ventas.nuevaVenta;
import Proveedores.listadoDeProveedores;
import Liquidacion.reporteLiquidacion;
import Conceptos.listadosConceptos;
import Empleados.listadoGrupoFamiliar;
import Empleados.historialEmpleados;
import Empleados.listadoEmpleados;
import Compras.reporteCompras;
import Compras.nuevaCompra;
import Clientes.listadoDeClientes;
import Clases.VentanaConFondo;
import Insumos.listadoDeInsumos;
import Servicios.listadoDeServicios;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class ventanaPrincipal extends VentanaConFondo  implements Runnable{
 String hora,minutos,segundos,ampm;
 Calendar calendario;
 Thread h1;
 public static int listCliente=0,listEmpleados=0,listGrupoFamiliar=0,
                    listInsumos=0,listServicios=0, listProveedores=0,
                    listPago=0,listReporteCompra=0;
    public ventanaPrincipal() {
     initComponents();
     h1 = new Thread(this);
     h1.start();
     setExtendedState(MAXIMIZED_BOTH);
     setImagen("/Imagenes/salondebelleza.jpg");
     lblDniEmpleado.setVisible(false);
     lblEmp.setVisible(false);
     lblEmpleado.setVisible(false);
     lblUsuario.setVisible(false);
     lblEmp1.setVisible(false);
     menuClientes.setVisible(false);
     menuEmpleados.setVisible(false);
     menuProveedores.setVisible(false);
     menuSalarios.setVisible(false);
     menuInsumo.setVisible(false);
     menuCompras.setVisible(false);
     menuVentas.setVisible(false);
     menuServicios.setVisible(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmp = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblDniEmpleado = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblEmp1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmenuArchivo = new javax.swing.JMenu();
        menuIniciarSesion = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuCambiarUsuario = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        menuNominaClientes = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        listadoEmpleados = new javax.swing.JMenuItem();
        historialEmpleados = new javax.swing.JMenuItem();
        listadoGrupoF = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        listadodeProveedores = new javax.swing.JMenuItem();
        menuServicios = new javax.swing.JMenu();
        listaDeServicios = new javax.swing.JMenuItem();
        menuInsumo = new javax.swing.JMenu();
        listaDeInsumos = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        nuevaVenta = new javax.swing.JMenuItem();
        menuListadoVentas = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        menuCompra = new javax.swing.JMenuItem();
        menuListadoCompras = new javax.swing.JMenuItem();
        menuSalarios = new javax.swing.JMenu();
        menuLiquidarSueldo = new javax.swing.JMenuItem();
        menuListadoConceptos = new javax.swing.JMenuItem();
        listaDeLiquidaciones = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuManual = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("elSalon System");
        setBackground(new java.awt.Color(-16777216,true));
        setForeground(new java.awt.Color(-16777216,true));

        lblEmp.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblEmp.setForeground(new java.awt.Color(-16711936,true));
        lblEmp.setText("EMPLEADO:");

        lblEmpleado.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(-16711936,true));
        lblEmpleado.setText("XXXXXXXXXXX");

        lblDniEmpleado.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblDniEmpleado.setForeground(new java.awt.Color(-16711936,true));
        lblDniEmpleado.setText("XXXXXXXXXXX");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHora.setForeground(new java.awt.Color(-16711936,true));
        lblHora.setText("00:00:00");

        lblEmp1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblEmp1.setForeground(new java.awt.Color(-16711936,true));
        lblEmp1.setText("USUARIO:");

        lblUsuario.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(-16711936,true));
        lblUsuario.setText("XXXXXXXXXXX");

        JmenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramientas.png"))); // NOI18N
        JmenuArchivo.setText("USUARIO");
        JmenuArchivo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        menuIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuIniciarSesion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciarSesion.png"))); // NOI18N
        menuIniciarSesion.setText("INICIAR SESION");
        menuIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarSesionActionPerformed(evt);
            }
        });
        JmenuArchivo.add(menuIniciarSesion);

        menuCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuCerrarSesion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descronectar.png"))); // NOI18N
        menuCerrarSesion.setText("CERRAR SESION");
        menuCerrarSesion.setEnabled(false);
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        JmenuArchivo.add(menuCerrarSesion);

        menuCambiarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuCambiarUsuario.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarUsuario.png"))); // NOI18N
        menuCambiarUsuario.setText("CAMBIAR CONTRASEÑA");
        menuCambiarUsuario.setEnabled(false);
        menuCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiarUsuarioActionPerformed(evt);
            }
        });
        JmenuArchivo.add(menuCambiarUsuario);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuSalir.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        menuSalir.setText("SALIR DE LA APLICACION");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        JmenuArchivo.add(menuSalir);

        jMenuBar1.add(JmenuArchivo);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevoEmpleado.png"))); // NOI18N
        menuClientes.setText("CLIENTES");
        menuClientes.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        menuNominaClientes.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuNominaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado de Clientes.png"))); // NOI18N
        menuNominaClientes.setText("PLANTILLA DE CLIENTES");
        menuNominaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNominaClientesActionPerformed(evt);
            }
        });
        menuClientes.add(menuNominaClientes);

        jMenuBar1.add(menuClientes);

        menuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.png"))); // NOI18N
        menuEmpleados.setText("EMPLEADOS");
        menuEmpleados.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        listadoEmpleados.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listadoEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoProveedores.png"))); // NOI18N
        listadoEmpleados.setText("PLANTILLA DE EMPLEADOS");
        listadoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoEmpleadosActionPerformed(evt);
            }
        });
        menuEmpleados.add(listadoEmpleados);

        historialEmpleados.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        historialEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial.png"))); // NOI18N
        historialEmpleados.setText("HISTORIAL DE EMPLEADOS");
        historialEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialEmpleadosActionPerformed(evt);
            }
        });
        menuEmpleados.add(historialEmpleados);

        listadoGrupoF.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listadoGrupoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoProveedores.png"))); // NOI18N
        listadoGrupoF.setText("GRUPO FAMILIAR");
        listadoGrupoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoGrupoFActionPerformed(evt);
            }
        });
        menuEmpleados.add(listadoGrupoF);

        jMenuBar1.add(menuEmpleados);

        menuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        menuProveedores.setText("PROVEEDORES");
        menuProveedores.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        listadodeProveedores.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listadodeProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoProveedores.png"))); // NOI18N
        listadodeProveedores.setText("PLANTILLA DE PROVEEDORES");
        listadodeProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadodeProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(listadodeProveedores);

        jMenuBar1.add(menuProveedores);

        menuServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        menuServicios.setText("SERVICIOS");
        menuServicios.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        listaDeServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        listaDeServicios.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listaDeServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaProductos.png"))); // NOI18N
        listaDeServicios.setText("LISTADO DE SERVICIOS");
        listaDeServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeServiciosActionPerformed(evt);
            }
        });
        menuServicios.add(listaDeServicios);

        jMenuBar1.add(menuServicios);

        menuInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        menuInsumo.setText("INSUMOS");
        menuInsumo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        listaDeInsumos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        listaDeInsumos.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listaDeInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaProductos.png"))); // NOI18N
        listaDeInsumos.setText("LISTADO DE INSUMOS");
        listaDeInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeInsumosActionPerformed(evt);
            }
        });
        menuInsumo.add(listaDeInsumos);

        jMenuBar1.add(menuInsumo);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        menuVentas.setText("VENTAS");
        menuVentas.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        nuevaVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        nuevaVenta.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        nuevaVenta.setText("NUEVA VENTA");
        nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentaActionPerformed(evt);
            }
        });
        menuVentas.add(nuevaVenta);

        menuListadoVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuListadoVentas.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuListadoVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportesVentas.png"))); // NOI18N
        menuListadoVentas.setText("LISTADO DE VENTAS");
        menuListadoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoVentasActionPerformed(evt);
            }
        });
        menuVentas.add(menuListadoVentas);

        jMenuBar1.add(menuVentas);

        menuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprass.png"))); // NOI18N
        menuCompras.setText("COMPRAS");
        menuCompras.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        menuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComprasActionPerformed(evt);
            }
        });

        menuCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        menuCompra.setText("COMPRA DE PRODUCTOS");
        menuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompraActionPerformed(evt);
            }
        });
        menuCompras.add(menuCompra);

        menuListadoCompras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuListadoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportesVentas.png"))); // NOI18N
        menuListadoCompras.setText("LISTADO DE COMPRAS");
        menuListadoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoComprasActionPerformed(evt);
            }
        });
        menuCompras.add(menuListadoCompras);

        jMenuBar1.add(menuCompras);

        menuSalarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero.png"))); // NOI18N
        menuSalarios.setText("SALARIOS");
        menuSalarios.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        menuLiquidarSueldo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuLiquidarSueldo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuLiquidarSueldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1378402589_Salary.png"))); // NOI18N
        menuLiquidarSueldo.setText("LIQUIDAR SUELDO");
        menuLiquidarSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLiquidarSueldoActionPerformed(evt);
            }
        });
        menuSalarios.add(menuLiquidarSueldo);

        menuListadoConceptos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuListadoConceptos.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuListadoConceptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizarConceptos.png"))); // NOI18N
        menuListadoConceptos.setText("LISTADO CONCEPTOS");
        menuListadoConceptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoConceptosActionPerformed(evt);
            }
        });
        menuSalarios.add(menuListadoConceptos);

        listaDeLiquidaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        listaDeLiquidaciones.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        listaDeLiquidaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaProductos.png"))); // NOI18N
        listaDeLiquidaciones.setText("REPORTE LIQUIDACIONES");
        listaDeLiquidaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeLiquidacionesActionPerformed(evt);
            }
        });
        menuSalarios.add(listaDeLiquidaciones);

        jMenuBar1.add(menuSalarios);

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        menuAyuda.setText("AYUDA");
        menuAyuda.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        menuManual.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Manual.png"))); // NOI18N
        menuManual.setText("MANUAL DE USUARIO");
        menuManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManualActionPerformed(evt);
            }
        });
        menuAyuda.add(menuManual);

        menuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAcerca.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        menuAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acercaDe.png"))); // NOI18N
        menuAcerca.setText("ACERCA DE...");
        menuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAcerca);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblEmp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDniEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpleado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 585, Short.MAX_VALUE)
                .addComponent(lblHora)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmp)
                            .addComponent(lblDniEmpleado)
                            .addComponent(lblEmpleado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmp1)
                            .addComponent(lblUsuario)))
                    .addComponent(lblHora))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1185, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarSesionActionPerformed
     logueo lg = new logueo(null,true);
     lg.setVisible(true);
}//GEN-LAST:event_menuIniciarSesionActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
   int salir = JOptionPane.showConfirmDialog(this, "¿REALMENTE DESEA CERRAR SESION?","Cierre de Sesion",0,3);
    if(salir==JOptionPane.OK_OPTION){
     menuIniciarSesion.setEnabled(true);
     menuCerrarSesion.setEnabled(false);
     menuCambiarUsuario.setEnabled(false);
     lblEmp.setVisible(false);
     lblEmpleado.setVisible(false);
     menuClientes.setVisible(false);
     menuEmpleados.setVisible(false);
     menuProveedores.setVisible(false);
     menuSalarios.setVisible(false);
     menuInsumo.setVisible(false);
     menuCompras.setVisible(false);
     menuVentas.setVisible(false);
     lblUsuario.setVisible(false);
     lblEmp1.setVisible(false);
    }
}//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
    int salir = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO?","",0,3);
    if(salir==JOptionPane.OK_OPTION){
        cerrar();
    }
}//GEN-LAST:event_menuSalirActionPerformed

    private void menuNominaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNominaClientesActionPerformed
     listadoDeClientes lc = new listadoDeClientes();
     lc.setVisible(true);
}//GEN-LAST:event_menuNominaClientesActionPerformed

    private void listaDeInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeInsumosActionPerformed
 listadoDeInsumos li = new listadoDeInsumos();
 li.setVisible(true);
}//GEN-LAST:event_listaDeInsumosActionPerformed

    private void nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaVentaActionPerformed
     nuevaVenta nv = new nuevaVenta(null,true);
     nv.setVisible(true);
}//GEN-LAST:event_nuevaVentaActionPerformed

    private void menuManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManualActionPerformed
     try {
      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Manual de Usuario - elSalonSystem.pdf");
     }
     catch (IOException e){
      System.out.print(e);
     }
}//GEN-LAST:event_menuManualActionPerformed

    private void menuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaActionPerformed
     acercaDe ad = new acercaDe(null,true);
     ad.setVisible(true);
}//GEN-LAST:event_menuAcercaActionPerformed

    private void menuListadoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoVentasActionPerformed
     reporteVentas rv = new reporteVentas(null,true);
     rv.setVisible(true);
    }//GEN-LAST:event_menuListadoVentasActionPerformed

    private void listadodeProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadodeProveedoresActionPerformed
     listadoDeProveedores lp = new listadoDeProveedores(null,true);
     lp.setVisible(true);
    }//GEN-LAST:event_listadodeProveedoresActionPerformed

    private void menuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompraActionPerformed
     nuevaCompra nc = new nuevaCompra(null,true);
     nc.setVisible(true);
    }//GEN-LAST:event_menuCompraActionPerformed

    private void menuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComprasActionPerformed
     
    }//GEN-LAST:event_menuComprasActionPerformed

    private void listadoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoEmpleadosActionPerformed
     listadoEmpleados le = new listadoEmpleados();
     le.setVisible(true);
    }//GEN-LAST:event_listadoEmpleadosActionPerformed

    private void menuListadoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoComprasActionPerformed
     reporteCompras rc = new reporteCompras(null,true);
     rc.setVisible(true);
    }//GEN-LAST:event_menuListadoComprasActionPerformed

    private void menuLiquidarSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLiquidarSueldoActionPerformed
     nuevaLiquidacion nl = new nuevaLiquidacion(null,true);
     nl.setVisible(true);
    }//GEN-LAST:event_menuLiquidarSueldoActionPerformed

    private void listaDeLiquidacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeLiquidacionesActionPerformed
     reporteLiquidacion ll = new reporteLiquidacion(null,true);
     ll.setVisible(true);
    }//GEN-LAST:event_listaDeLiquidacionesActionPerformed

    private void menuListadoConceptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoConceptosActionPerformed
//     actualizarConceptos ac = new actualizarConceptos(null,true);
//     ac.setVisible(true);
       listadosConceptos lc = new listadosConceptos(this, true);
       lc.setVisible(true);
    }//GEN-LAST:event_menuListadoConceptosActionPerformed

    private void menuCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiarUsuarioActionPerformed
     cambiarContraseña ac = new cambiarContraseña(null,true);
     ac.setVisible(true);
    }//GEN-LAST:event_menuCambiarUsuarioActionPerformed

    private void historialEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialEmpleadosActionPerformed
     historialEmpleados he = new historialEmpleados();
     he.setVisible(true);
    }//GEN-LAST:event_historialEmpleadosActionPerformed

    private void listadoGrupoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoGrupoFActionPerformed
        // TODO add your handling code here:
        listadoGrupoFamiliar gp = new listadoGrupoFamiliar();
        gp.setLocationRelativeTo(null);
        gp.setVisible(true);
    }//GEN-LAST:event_listadoGrupoFActionPerformed

    private void listaDeServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeServiciosActionPerformed
listadoDeServicios ls = new listadoDeServicios();
ls.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_listaDeServiciosActionPerformed

 private void cerrar(){
  System.exit(0);
 }

 public void run(){
Thread ct = Thread.currentThread();
while(ct == h1) {
calcula();
lblHora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
try {
Thread.sleep(1000);
}catch(InterruptedException e) {}
}
}

public void calcula () {
Calendar calendario = new GregorianCalendar();
Date fechaHoraActual = new Date();
calendario.setTime(fechaHoraActual);
ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
if(ampm.equals("PM")){
int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
hora = h>9?""+h:"0"+h;
}
else{
hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY); }
minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu JmenuArchivo;
    public static javax.swing.JMenuItem historialEmpleados;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lblDniEmpleado;
    public static javax.swing.JLabel lblEmp;
    public static javax.swing.JLabel lblEmp1;
    public static javax.swing.JLabel lblEmpleado;
    public static javax.swing.JLabel lblHora;
    public static final javax.swing.JLabel lblUsuario = new javax.swing.JLabel();
    public static javax.swing.JMenuItem listaDeInsumos;
    public static javax.swing.JMenuItem listaDeLiquidaciones;
    public static javax.swing.JMenuItem listaDeServicios;
    public static javax.swing.JMenuItem listadoEmpleados;
    public static javax.swing.JMenuItem listadoGrupoF;
    public static javax.swing.JMenuItem listadodeProveedores;
    public static javax.swing.JMenuItem menuAcerca;
    public static javax.swing.JMenu menuAyuda;
    public static javax.swing.JMenuItem menuCambiarUsuario;
    public static javax.swing.JMenuItem menuCerrarSesion;
    public static javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuCompra;
    public static javax.swing.JMenu menuCompras;
    public static javax.swing.JMenu menuEmpleados;
    public static javax.swing.JMenuItem menuIniciarSesion;
    public static javax.swing.JMenu menuInsumo;
    public static javax.swing.JMenuItem menuLiquidarSueldo;
    private javax.swing.JMenuItem menuListadoCompras;
    private javax.swing.JMenuItem menuListadoConceptos;
    public static javax.swing.JMenuItem menuListadoVentas;
    private javax.swing.JMenuItem menuManual;
    public static javax.swing.JMenuItem menuNominaClientes;
    public static javax.swing.JMenu menuProveedores;
    public static javax.swing.JMenu menuSalarios;
    private javax.swing.JMenuItem menuSalir;
    public static javax.swing.JMenu menuServicios;
    public static javax.swing.JMenu menuVentas;
    public static javax.swing.JMenuItem nuevaVenta;
    // End of variables declaration//GEN-END:variables



}
