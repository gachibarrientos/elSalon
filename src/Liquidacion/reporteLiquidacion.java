

package Liquidacion;

import Clases.Liquidacion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class reporteLiquidacion extends javax.swing.JDialog {

public static DefaultTableModel m;
public DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
private String titulos[];
public String strTituloPDF = "UTN -FRT";
public Liquidacion liq = new Liquidacion();
   
    public reporteLiquidacion(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    txtFechaDel.setVisible(false);
    txtFechaAl.setVisible(false);
    nuevo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        radioTodos = new javax.swing.JRadioButton();
        radioEmpleado = new javax.swing.JRadioButton();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaAl1 = new javax.swing.JTextField();
        txtFechaDel = new javax.swing.JTextField();
        txtFechaAl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        txtFechaDel2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Liquidaciones");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REPORTE DE LIQUIDACIONES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(711, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportee.png"))); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnImprimir.setText("ATRAS");
        btnImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        radioTodos.setBackground(new java.awt.Color(0, 204, 204));
        radioTodos.setFont(new java.awt.Font("Courier New", 1, 14));
        radioTodos.setForeground(new java.awt.Color(-1,true));
        radioTodos.setSelected(true);
        radioTodos.setText("MOSTRAR TODAS");
        radioTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTodosMouseClicked(evt);
            }
        });

        radioEmpleado.setBackground(new java.awt.Color(0, 204, 204));
        radioEmpleado.setFont(new java.awt.Font("Courier New", 1, 14));
        radioEmpleado.setForeground(new java.awt.Color(-1,true));
        radioEmpleado.setText("POR EMPLEADO");
        radioEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioEmpleadoMouseClicked(evt);
            }
        });
        radioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmpleadoActionPerformed(evt);
            }
        });

        lblDni.setFont(new java.awt.Font("Courier New", 1, 18));
        lblDni.setForeground(new java.awt.Color(-1,true));
        lblDni.setText("Nº DE DNI:");

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("DEL DIA:");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("AL DIA:");

        txtFechaAl1.setEditable(false);
        txtFechaAl1.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtFechaAl1.setForeground(new java.awt.Color(255, 0, 0));

        txtFechaDel.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtFechaDel.setEnabled(false);

        txtFechaAl.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtFechaAl.setEnabled(false);

        tablaReportes.setFont(new java.awt.Font("Tahoma", 1, 14));
        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReportes);

        txtFechaDel2.setEditable(false);
        txtFechaDel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtFechaDel2.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(radioTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblDni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaDel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTodos)
                    .addComponent(radioEmpleado)
                    .addComponent(txtDni)
                    .addComponent(lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFechaDel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaAl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-938)/2, (screenSize.height-579)/2, 938, 579);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
     if(radioTodos.isSelected()){
      if(!txtFechaDel2.getText().equals("") && !txtFechaAl1.getText().equals("")){
       muestra();
      }
      else{
       mustra2();
      }
     }
     else{
      if(!txtFechaDel2.getText().equals("") && !txtFechaAl1.getText().equals("")){
       muestra3();
      }
      else{
       muestra4();
      }
    }
}//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      m.setRowCount(0);
      nuevo();
    btnMostrar.setEnabled(true);
    radioTodos.setEnabled(true);
    radioEmpleado.setEnabled(true);
    radioTodos.setSelected(true);
    radioEmpleado.setSelected(false);
    txtDni.setText("");
    txtDni.setEditable(false);
    txtFechaDel.setText("");
    txtFechaAl1.setText("");
    txtFechaDel2.setText("");
    txtFechaAl.setText("");
    btnImprimir.setEnabled(false);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void radioTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTodosMouseClicked
        if(radioTodos.isSelected()==true){
            radioEmpleado.setSelected(false);
            txtDni.setEditable(false);
        }
        else{
         radioEmpleado.setSelected(true);
        }
}//GEN-LAST:event_radioTodosMouseClicked

    private void radioEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioEmpleadoMouseClicked
        if(radioEmpleado.isSelected()==true){
         txtDni.setEditable(true);
         txtDni.setFocusable(true);
         radioTodos.setSelected(false);
        }
        else{
         txtDni.setEditable(false);
         radioTodos.setSelected(false);
        }
}//GEN-LAST:event_radioEmpleadoMouseClicked

    private void radioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmpleadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_radioEmpleadoActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
         evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        if(k ==241 || k==209){
         evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        if (txtDni.getText().length()== 8){
         evt.consume();
        }
}//GEN-LAST:event_txtDniKeyTyped

    private void JDtChFechaDelOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaDelOnCommit

        String []datos=txtFechaDel.getText().split("/");
        String Dia, Mes, Ano;
        Ano="";
        Mes="";
        Dia="";
        Ano=datos[2];
        Mes=datos[1];
        Dia=datos[0];
        txtFechaDel2.setText(Dia +"-" + Mes + "-"+ Ano);
        txtFechaDel.setText(Ano +"-" + Mes + "-" + Dia);
}//GEN-LAST:event_JDtChFechaDelOnCommit

    private void JDtChFechaAlOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaAlOnCommit
        String []datos=txtFechaAl.getText().split("/");
        String Dia, Mes, Ano;
        Ano="";
        Mes="";
        Dia="";
        Ano=datos[2];
        Mes=datos[1];
        Dia=datos[0];
        txtFechaAl1 .setText(Dia+"-" + Mes + "-"+ Ano);
        txtFechaAl.setText(Ano+"-" + Mes + "-"+ Dia);
}//GEN-LAST:event_JDtChFechaAlOnCommit

    private void tablaReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReportesMouseClicked
    tablaReportes.setSelectionBackground(Color.YELLOW);
    detalleLiquidacionn dl = new detalleLiquidacionn(null,true);
    dl.setVisible(true);
}//GEN-LAST:event_tablaReportesMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
     dispose();
}//GEN-LAST:event_btnImprimirActionPerformed

private void nuevo() {
 txtFechaDel.setVisible(false);
 txtFechaAl.setVisible(false);
 titulos = new String[6];
 titulos[0] = "Dni del Empleado";
 titulos[1] = "Fecha Desde";
 titulos[2] = "Fecha Hasta";
 titulos[3] = "Salario Neto";
 titulos[4] = "Periodo de Liquidacion";
 titulos[5] = "idLiquidacion";
 m = new DefaultTableModel(null,titulos);
 tablaReportes.setModel(m);
 tablaReportes.getColumnModel().getColumn(5).setMaxWidth(0);
 tablaReportes.getColumnModel().getColumn(5).setMinWidth(0);
 tablaReportes.getColumnModel().getColumn(5).setPreferredWidth(0);
 
 for(int i=0; i < 5; i++){
 modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
 tablaReportes.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
 }
}

private void muestra() {
if(!txtFechaDel.getText().equals("")&& !txtFechaAl.getText().equals("")){
 btnMostrar.setEnabled(false);
 btnImprimir.setEnabled(true);
 radioEmpleado.setEnabled(false);
 radioTodos.setEnabled(false);
 liq.setFechaDesde(txtFechaDel.getText().toString());
 liq.setFechaHasta(txtFechaAl.getText().toString());
 liq.reporteCompleto();
 }
 else{
  JOptionPane.showMessageDialog(this,"Ingrese Rango de Fechas a buscar","Error",JOptionPane.ERROR_MESSAGE);
  btnMostrar.setEnabled(true);
  btnImprimir.setEnabled(false);
 }
}

private void mustra2() {
 btnMostrar.setEnabled(false);
 btnImprimir.setEnabled(true);
 radioEmpleado.setEnabled(false);
 radioTodos.setEnabled(false);
 liq.reporteCompletoLiquidacion();
}

private void muestra3() {
 if(!txtDni.getText().equals("") && !txtFechaDel.getText().equals("") && !txtFechaAl.getText().equals("")){
  btnMostrar.setEnabled(false);
  btnImprimir.setEnabled(true);
  radioEmpleado.setEnabled(false);
  radioTodos.setEnabled(false);
  liq.setFechaDesde(txtFechaDel.getText());
  liq.setFechaHasta(txtFechaAl.getText());
  liq.emp.setDni(Integer.parseInt(txtDni.getText()));
  liq.reporteLiquidacionPorCliente();
  }
  else{
   JOptionPane.showMessageDialog(this,"Ingrese Dni","Error",JOptionPane.ERROR_MESSAGE);
   btnMostrar.setEnabled(true);
   btnImprimir.setEnabled(false);
  }
}

private void muestra4() {
 if(!txtDni.getText().equals("")){
  btnMostrar.setEnabled(false);
  btnImprimir.setEnabled(true);
  radioEmpleado.setEnabled(false);
  radioTodos.setEnabled(false);
  liq.emp.setDni(Integer.parseInt(txtDni.getText().toString()));
  liq.reporteTotalEmpleado();
 }
 else{
  JOptionPane.showMessageDialog(this,"Ingrese Dni","Error",JOptionPane.ERROR_MESSAGE);
  btnMostrar.setEnabled(true);
  btnImprimir.setEnabled(false);
 }
}


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                reporteLiquidacion dialog = new reporteLiquidacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JRadioButton radioEmpleado;
    private javax.swing.JRadioButton radioTodos;
    public static javax.swing.JTable tablaReportes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaAl;
    private javax.swing.JTextField txtFechaAl1;
    private javax.swing.JTextField txtFechaDel;
    private javax.swing.JTextField txtFechaDel2;
    // End of variables declaration//GEN-END:variables

}