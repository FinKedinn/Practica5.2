/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.dao.CompositorDAO;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaCrearCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaCrearCompositor;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaCrearCompositor ventanaCrearCompositor;
    private ControladorCompositor controladorCompositor;
    private ControladorCantante controladorCantante;
    private CompositorDAO compositorDAO;
    private CantanteDAO cantanteDAO;
    
    public VentanaPrincipal() {
        initComponents();
        this.compositorDAO = new CompositorDAO();
        this.cantanteDAO = new CantanteDAO();
        this.ventanaCrearCompositor = new VentanaCrearCompositor(controladorCompositor);
        this.controladorCompositor = new ControladorCompositor(compositorDAO, cantanteDAO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        cantanteMenu = new javax.swing.JMenu();
        crearCantanteMenuItem = new javax.swing.JMenuItem();
        eliminarCantanteMenuItem = new javax.swing.JMenuItem();
        actualizarCantanteMenuItem = new javax.swing.JMenuItem();
        listarCantanteMenuItem = new javax.swing.JMenuItem();
        BuscarCantanteMenuItem = new javax.swing.JMenuItem();
        compositorMenu = new javax.swing.JMenu();
        crearCompositorMenuItem = new javax.swing.JMenuItem();
        eliminarCompositorMenuItem = new javax.swing.JMenuItem();
        actualizarComposiorMenuItem = new javax.swing.JMenuItem();
        listarCompositorMenuItem = new javax.swing.JMenuItem();
        BuscarCompositorMenuItem = new javax.swing.JMenuItem();
        discoMenu = new javax.swing.JMenu();
        crearDiscoMenuItem = new javax.swing.JMenuItem();
        eliminarDiscoMenuItem = new javax.swing.JMenuItem();
        actualizarDiscoMenuItem = new javax.swing.JMenuItem();
        listarDiscoMenuItem = new javax.swing.JMenuItem();
        BuscarDiscoMenuItem1 = new javax.swing.JMenuItem();
        cancionMenu = new javax.swing.JMenu();
        crearCancionMenuItem = new javax.swing.JMenuItem();
        eliminarCancionMenuItem = new javax.swing.JMenuItem();
        actualizarCancionMenuItem = new javax.swing.JMenuItem();
        listarCancionMenuItem = new javax.swing.JMenuItem();
        BuscarCancionMenuItem = new javax.swing.JMenuItem();
        opcionesMenu = new javax.swing.JMenu();
        salirMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/download_1.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 240, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 250, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 80, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 100, 200));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 100, 160));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 290, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 240, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 80, 190));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e4.jpg"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, 150));

        cantanteMenu.setMnemonic('f');
        cantanteMenu.setText("Cantante");

        crearCantanteMenuItem.setMnemonic('o');
        crearCantanteMenuItem.setText("Crear");
        crearCantanteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCantanteMenuItemActionPerformed(evt);
            }
        });
        cantanteMenu.add(crearCantanteMenuItem);

        eliminarCantanteMenuItem.setMnemonic('s');
        eliminarCantanteMenuItem.setText("Eliminar");
        cantanteMenu.add(eliminarCantanteMenuItem);

        actualizarCantanteMenuItem.setMnemonic('a');
        actualizarCantanteMenuItem.setText("Actualizar");
        cantanteMenu.add(actualizarCantanteMenuItem);

        listarCantanteMenuItem.setMnemonic('x');
        listarCantanteMenuItem.setText("Listar");
        listarCantanteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCantanteMenuItemActionPerformed(evt);
            }
        });
        cantanteMenu.add(listarCantanteMenuItem);

        BuscarCantanteMenuItem.setText("Buscar");
        BuscarCantanteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCantanteMenuItemActionPerformed(evt);
            }
        });
        cantanteMenu.add(BuscarCantanteMenuItem);

        menuBar.add(cantanteMenu);

        compositorMenu.setMnemonic('e');
        compositorMenu.setText("Compositor");

        crearCompositorMenuItem.setMnemonic('o');
        crearCompositorMenuItem.setText("Crear");
        crearCompositorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCompositorMenuItemActionPerformed(evt);
            }
        });
        compositorMenu.add(crearCompositorMenuItem);

        eliminarCompositorMenuItem.setMnemonic('s');
        eliminarCompositorMenuItem.setText("Eliminar");
        compositorMenu.add(eliminarCompositorMenuItem);

        actualizarComposiorMenuItem.setMnemonic('a');
        actualizarComposiorMenuItem.setText("Actualizar");
        compositorMenu.add(actualizarComposiorMenuItem);

        listarCompositorMenuItem.setMnemonic('x');
        listarCompositorMenuItem.setText("Listar");
        listarCompositorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCompositorMenuItemActionPerformed(evt);
            }
        });
        compositorMenu.add(listarCompositorMenuItem);

        BuscarCompositorMenuItem.setText("Buscar");
        BuscarCompositorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCompositorMenuItemActionPerformed(evt);
            }
        });
        compositorMenu.add(BuscarCompositorMenuItem);

        menuBar.add(compositorMenu);

        discoMenu.setMnemonic('h');
        discoMenu.setText("Disco");

        crearDiscoMenuItem.setMnemonic('o');
        crearDiscoMenuItem.setText("Crear");
        crearDiscoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDiscoMenuItemActionPerformed(evt);
            }
        });
        discoMenu.add(crearDiscoMenuItem);

        eliminarDiscoMenuItem.setMnemonic('s');
        eliminarDiscoMenuItem.setText("Eliminar");
        discoMenu.add(eliminarDiscoMenuItem);

        actualizarDiscoMenuItem.setMnemonic('a');
        actualizarDiscoMenuItem.setText("Actualizar");
        discoMenu.add(actualizarDiscoMenuItem);

        listarDiscoMenuItem.setMnemonic('x');
        listarDiscoMenuItem.setText("Listar");
        listarDiscoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarDiscoMenuItemActionPerformed(evt);
            }
        });
        discoMenu.add(listarDiscoMenuItem);

        BuscarDiscoMenuItem1.setText("Buscar");
        BuscarDiscoMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDiscoMenuItem1ActionPerformed(evt);
            }
        });
        discoMenu.add(BuscarDiscoMenuItem1);

        menuBar.add(discoMenu);

        cancionMenu.setText("Cancion");

        crearCancionMenuItem.setMnemonic('o');
        crearCancionMenuItem.setText("Crear");
        crearCancionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCancionMenuItemActionPerformed(evt);
            }
        });
        cancionMenu.add(crearCancionMenuItem);

        eliminarCancionMenuItem.setMnemonic('s');
        eliminarCancionMenuItem.setText("Eliminar");
        cancionMenu.add(eliminarCancionMenuItem);

        actualizarCancionMenuItem.setMnemonic('a');
        actualizarCancionMenuItem.setText("Actualizar");
        cancionMenu.add(actualizarCancionMenuItem);

        listarCancionMenuItem.setMnemonic('x');
        listarCancionMenuItem.setText("Listar");
        listarCancionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCancionMenuItemActionPerformed(evt);
            }
        });
        cancionMenu.add(listarCancionMenuItem);

        BuscarCancionMenuItem.setText("Buscar");
        BuscarCancionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCancionMenuItemActionPerformed(evt);
            }
        });
        cancionMenu.add(BuscarCancionMenuItem);

        menuBar.add(cancionMenu);

        opcionesMenu.setText("Opciones");

        salirMenuItem.setText("Salir");
        opcionesMenu.add(salirMenuItem);

        menuBar.add(opcionesMenu);

        jMenu1.setText("Idioma");
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarCantanteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCantanteMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_listarCantanteMenuItemActionPerformed

    private void listarCompositorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCompositorMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarCompositorMenuItemActionPerformed

    private void crearCompositorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCompositorMenuItemActionPerformed
        if(ventanaCrearCompositor==null){
            ventanaCrearCompositor= new VentanaCrearCompositor(controladorCompositor);
            desktopPane.add(ventanaCrearCompositor);
        }
        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_crearCompositorMenuItemActionPerformed

    private void crearDiscoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDiscoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearDiscoMenuItemActionPerformed

    private void listarDiscoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarDiscoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarDiscoMenuItemActionPerformed

    private void crearCancionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCancionMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCancionMenuItemActionPerformed

    private void listarCancionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCancionMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarCancionMenuItemActionPerformed

    private void BuscarCantanteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCantanteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarCantanteMenuItemActionPerformed

    private void BuscarCompositorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCompositorMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarCompositorMenuItemActionPerformed

    private void BuscarDiscoMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDiscoMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDiscoMenuItem1ActionPerformed

    private void BuscarCancionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCancionMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarCancionMenuItemActionPerformed

    private void crearCantanteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCantanteMenuItemActionPerformed
        
    }//GEN-LAST:event_crearCantanteMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarCancionMenuItem;
    private javax.swing.JMenuItem BuscarCantanteMenuItem;
    private javax.swing.JMenuItem BuscarCompositorMenuItem;
    private javax.swing.JMenuItem BuscarDiscoMenuItem1;
    private javax.swing.JMenuItem actualizarCancionMenuItem;
    private javax.swing.JMenuItem actualizarCantanteMenuItem;
    private javax.swing.JMenuItem actualizarComposiorMenuItem;
    private javax.swing.JMenuItem actualizarDiscoMenuItem;
    private javax.swing.JMenu cancionMenu;
    private javax.swing.JMenu cantanteMenu;
    private javax.swing.JMenu compositorMenu;
    private javax.swing.JMenuItem crearCancionMenuItem;
    private javax.swing.JMenuItem crearCantanteMenuItem;
    private javax.swing.JMenuItem crearCompositorMenuItem;
    private javax.swing.JMenuItem crearDiscoMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu discoMenu;
    private javax.swing.JMenuItem eliminarCancionMenuItem;
    private javax.swing.JMenuItem eliminarCantanteMenuItem;
    private javax.swing.JMenuItem eliminarCompositorMenuItem;
    private javax.swing.JMenuItem eliminarDiscoMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem listarCancionMenuItem;
    private javax.swing.JMenuItem listarCantanteMenuItem;
    private javax.swing.JMenuItem listarCompositorMenuItem;
    private javax.swing.JMenuItem listarDiscoMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu opcionesMenu;
    private javax.swing.JMenuItem salirMenuItem;
    // End of variables declaration//GEN-END:variables

}
