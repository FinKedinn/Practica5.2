/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.Cancion;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Cancion;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaListarCancion extends javax.swing.JInternalFrame {

    private Compositor compositor;
    private ControladorCompositor controladorCompositor;
    public VentanaListarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnBuscarCompositor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancion = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setEnabled(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel12.setText("Apellido");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 114, 45));

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel13.setText("Nombre");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 114, 45));

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel14.setText("Codigo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 114, 45));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 295, -1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setEnabled(false);
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 295, -1));

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtApellido.setEnabled(false);
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 295, -1));

        btnBuscarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarCompositor.setText("Buscar");
        btnBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompositorActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jLabel15.setText("Buscar un compositor");
        jLabel15.setToolTipText("");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 465, -1));

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        tblCancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Letra", "Duracion"
            }
        ));
        jScrollPane1.setViewportView(tblCancion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.compositor = controladorCompositor.buscarCompositor(codigo);
        if (compositor != null) {
            txtApellido.setText(compositor.getApellido());
            txtNombre.setText(compositor.getNombre());
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "No se encontrado compositor");
        }
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        limipiarCampos();
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limipiarCampos();
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_formInternalFrameActivated

    private void limipiarCampos(){
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
    }
    
    private void cargarTabla() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        compositor = controladorCompositor.buscarCompositor(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
        List<Cancion> listaCancion = controladorCompositor.listarCanciones(compositor);
        if (!listaCancion.isEmpty()) {
            for (Cancion cancion : listaCancion) {
                String codigoCancion = String.valueOf(cancion.getCodigo());
                String titulo = cancion.getTitulo();
                String letra = cancion.getLetra();
                String duracion = String.valueOf(cancion.getTiempoEnMinutos());
                Object[] rowData = {codigoCancion, titulo, letra,duracion};
                modelo.addRow(rowData);
            }
            tblCancion.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "El compositor " + compositor.getNombre() + " " + compositor.getApellido() + " no tiene canciones registrados");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCancion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
