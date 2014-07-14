/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;

import CapaDatos.Conexionbd;
import Gestiones.GestionUsuario;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class Interfaz extends javax.swing.JFrame {

    GestionUsuario usuario = new GestionUsuario ();
    
   
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtCed = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos = new javax.swing.JTable();
        btnConsul = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnElimiinar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnInser = new javax.swing.JButton();
        jbtconsulta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Cedula ");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        Tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_datosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_datos);

        btnConsul.setText("Consultar por Id");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnElimiinar.setText("Eliminar");
        btnElimiinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiinarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnInser.setText("Insertar");
        btnInser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserActionPerformed(evt);
            }
        });

        jbtconsulta.setText("Consulta por tabla");
        jbtconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconsultaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtId)
                                .addComponent(txtNombre)
                                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElimiinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtconsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInser))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnConsul))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnModi)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnElimiinar)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbtconsulta)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserActionPerformed
         if ("0".equals(txtId.getText())||"".equals(txtId.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Id valida");
        }    
      else if ("".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Nombre");
        }    
      else if ("".equals(txtApe.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Apellido");
        }    
      else if ("".equals(txtCed.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de Cedula");
        }    
         
        else{
        usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        usuario.getUsuario().setNombre(txtNombre.getText());
        usuario.getUsuario().setApellido(txtApe.getText());
        usuario.getUsuario().setCedula(txtCed.getText());
        
        try {
            
         usuario.Insertar();
         JOptionPane.showMessageDialog(this, "Dato insertado correctamente");
         tabla();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
      }
    }//GEN-LAST:event_btnInserActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        // TODO add your handling code here:
 if ("".equals(txtId.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese un Id valida");
        } 
 else{
        usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        try
        {
            usuario.Consultar();
            JOptionPane.showMessageDialog(this, "EL DATO ENCONTRADO");
            txtId.setText(Integer.toString(usuario.getUsuario().getId()));
            txtNombre.setText(usuario.getUsuario().getNombre());
            txtApe.setText(usuario.getUsuario().getApellido());
            txtCed.setText(usuario.getUsuario().getCedula());
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
 }

       
    }//GEN-LAST:event_btnConsulActionPerformed

    private void Tabla_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_datosMouseClicked
        // TODO add your handling code here:
         int row = Tabla_datos.getSelectedRow();
        this.txtId.setText(Tabla_datos.getModel().getValueAt(row, 0).toString());
        this.txtNombre.setText(Tabla_datos.getModel().getValueAt(row, 1).toString());

        this.txtApe.setText(Tabla_datos.getModel().getValueAt(row, 2).toString());
        this.txtCed.setText(Tabla_datos.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_Tabla_datosMouseClicked

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        // TODO add your handling code here:
         usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        usuario.getUsuario().setNombre(txtNombre.getText());
        usuario.getUsuario().setApellido(txtApe.getText());
        usuario.getUsuario().setCedula(txtCed.getText());
        try
        {
            usuario.Modificar();
            JOptionPane.showMessageDialog(this, "El dato se modificó correctamente");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnElimiinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiinarActionPerformed
        // TODO add your handling code here:
        usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        usuario.getUsuario().setNombre(txtNombre.getText());
        usuario.getUsuario().setApellido(txtApe.getText());
        usuario.getUsuario().setCedula(txtCed.getText());
        try
        {
            usuario.Eliminar();
            JOptionPane.showMessageDialog(this, "El dato se eliminó correctamente");
            
            }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnElimiinarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtId.setText(Integer.toString(usuario.getUsuario().getId()));
        txtNombre.setText(usuario.getUsuario().getNombre());
        txtApe.setText(usuario.getUsuario().getApellido());
        txtCed.setText(usuario.getUsuario().getCedula());
      Tabla_datos.setModel(new DefaultTableModel());
       
            usuario.Nuevo();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jbtconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconsultaActionPerformed
        // TODO add your handling code here:
       tabla();
    
    }//GEN-LAST:event_jbtconsultaActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
public void tabla(){
     try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet sen = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM usuario");
        ResultSetMetaData res=sen.getMetaData();
        int NumeroColumnas=res.getColumnCount();
        DefaultTableModel modelo=new DefaultTableModel();
        this.Tabla_datos.setModel(modelo);
            for (int i = 1; i <= NumeroColumnas; i++) {
                modelo.addColumn(res.getColumnLabel(i));
            }
            while (sen.next()){
                Object [] fila = new Object[NumeroColumnas];
                for (int j = 0; j < NumeroColumnas; j++) {
                    
                    fila[j]=sen.getObject(j+1);
                }
                modelo.addRow(fila);
                
            }
        
                   
        }
        
             catch (SQLException ex1) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex1);
            }
        
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
}
    /**     * @param args the command line arguments

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_datos;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElimiinar;
    private javax.swing.JButton btnInser;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtconsulta;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
