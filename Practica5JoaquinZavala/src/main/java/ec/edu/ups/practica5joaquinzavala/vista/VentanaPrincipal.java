/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.dao.CompositorDAO;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaActualizarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaBuscarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaCrearCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaEliminarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaListarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaActualizarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaBuscarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaCrearCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaEliminarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaListarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaBuscarDisco;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaCrearDisco;



/**
 *
 * @author SOPORTETICS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    private VentanaActualizarCantante ventanaActualizarCantante;
    private VentanaEliminarCantante ventanaEliminarCantante;
    private VentanaListarCantante ventanaListarCantante;

    private VentanaCrearCompositor ventanaCrearCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaActualizarCompositor ventanaActualizarCompositor;
    private VentanaEliminarCompositor ventanaEliminarCompositor;
    private VentanaListarCompositor ventanaListarCompositor;

    

    private ControladorCantante controladorCantante;
    private ControladorCompositor controladorCompositor;

    private CantanteDAO cantanteDAO;
    private CompositorDAO compositorDAO;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDAO = new CantanteDAO();
        controladorCantante = new ControladorCantante(cantanteDAO);
        compositorDAO = new CompositorDAO();
        controladorCompositor = new ControladorCompositor(compositorDAO, cantanteDAO);

    }

    //System.exit(0);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemMenuCrearCantante = new javax.swing.JMenuItem();
        itemMenuVerCantante = new javax.swing.JMenuItem();
        menuItemActualizarCantante = new javax.swing.JMenuItem();
        itemMenuEliminarCantante = new javax.swing.JMenuItem();
        menuItemListarCantante = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemMenuRegistrarDisco = new javax.swing.JMenuItem();
        menuItemBuscarDisco = new javax.swing.JMenuItem();
        menuItemActualizarDisco = new javax.swing.JMenuItem();
        menuItemEliminarDisco = new javax.swing.JMenuItem();
        menuItemListarDisco = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemRegistrarCompositor = new javax.swing.JMenuItem();
        menuItemBuscarCompositor = new javax.swing.JMenuItem();
        menuItemActualizarCompositor = new javax.swing.JMenuItem();
        menuItemEliminarCompositor = new javax.swing.JMenuItem();
        menuItemListarCompositor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemRegistrarCancion = new javax.swing.JMenuItem();
        menuItemBuscarCancion = new javax.swing.JMenuItem();
        menuItemActualizarCancion = new javax.swing.JMenuItem();
        menuItemEliminarCancion = new javax.swing.JMenuItem();
        menuItemListarCancion = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(2000, 1200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        menuBar.setMinimumSize(new java.awt.Dimension(400, 32000));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cantante");

        itemMenuCrearCantante.setMnemonic('o');
        itemMenuCrearCantante.setText("Registrar cantante");
        itemMenuCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCrearCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuCrearCantante);

        itemMenuVerCantante.setMnemonic('s');
        itemMenuVerCantante.setText("Buscar cantante");
        itemMenuVerCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuVerCantante);

        menuItemActualizarCantante.setMnemonic('a');
        menuItemActualizarCantante.setText("Actualizar cantante");
        menuItemActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemActualizarCantante);

        itemMenuEliminarCantante.setMnemonic('x');
        itemMenuEliminarCantante.setText("Eliminar cantante");
        itemMenuEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEliminarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuEliminarCantante);

        menuItemListarCantante.setText("Listar cantante");
        menuItemListarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCantanteActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemListarCantante);

        jMenu1.setText("Disco");

        itemMenuRegistrarDisco.setText("Registrar disco");
        itemMenuRegistrarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRegistrarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuRegistrarDisco);

        menuItemBuscarDisco.setText("Buscar disco");
        menuItemBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBuscarDisco);

        menuItemActualizarDisco.setText("Actualizar disco");
        menuItemActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemActualizarDisco);

        menuItemEliminarDisco.setText("Eliminar disco");
        menuItemEliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemEliminarDisco);

        menuItemListarDisco.setText("Listar disco");
        menuItemListarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemListarDisco);

        fileMenu.add(jMenu1);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Compositor");

        menuItemRegistrarCompositor.setMnemonic('t');
        menuItemRegistrarCompositor.setText("Registrar compositor");
        menuItemRegistrarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemRegistrarCompositor);

        menuItemBuscarCompositor.setMnemonic('y');
        menuItemBuscarCompositor.setText("Buscar compositor");
        menuItemBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemBuscarCompositor);

        menuItemActualizarCompositor.setMnemonic('p');
        menuItemActualizarCompositor.setText("Actualizar compositor");
        menuItemActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemActualizarCompositor);

        menuItemEliminarCompositor.setMnemonic('d');
        menuItemEliminarCompositor.setText("Eliminar compositor");
        menuItemEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemEliminarCompositor);

        menuItemListarCompositor.setText("Listar compositores");
        menuItemListarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemListarCompositor);

        jMenu2.setText("Cancion");

        menuItemRegistrarCancion.setText("Registrar cancion");
        menuItemRegistrarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRegistrarCancion);

        menuItemBuscarCancion.setText("Buscar cancion");
        menuItemBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemBuscarCancion);

        menuItemActualizarCancion.setText("Actualizar cancion");
        menuItemActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemActualizarCancion);

        menuItemEliminarCancion.setText("Eliminar cancion");
        menuItemEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEliminarCancion);

        menuItemListarCancion.setText("Listar cancion");
        menuItemListarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemListarCancion);

        editMenu.add(jMenu2);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

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

    private void itemMenuEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEliminarCantanteActionPerformed
        
    }//GEN-LAST:event_itemMenuEliminarCantanteActionPerformed

    private void itemMenuCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCrearCantanteActionPerformed
        
    }//GEN-LAST:event_itemMenuCrearCantanteActionPerformed

    private void itemMenuVerCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerCantanteActionPerformed
        
    }//GEN-LAST:event_itemMenuVerCantanteActionPerformed

    private void menuItemActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCantanteActionPerformed
        
    }//GEN-LAST:event_menuItemActualizarCantanteActionPerformed

    private void menuItemListarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCantanteActionPerformed
        
    }//GEN-LAST:event_menuItemListarCantanteActionPerformed

    private void menuItemRegistrarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCompositorActionPerformed
        if (ventanaCrearCompositor == null) {
            ventanaCrearCompositor = new VentanaCrearCompositor(controladorCompositor);
            desktopPane.add(ventanaCrearCompositor);
        }
        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarCompositorActionPerformed

    private void menuItemBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCompositorActionPerformed
        if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorCompositor);
            desktopPane.add(ventanaBuscarCompositor);
        }
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCompositorActionPerformed

    private void menuItemActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCompositorActionPerformed
        if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(controladorCompositor);
            desktopPane.add(ventanaActualizarCompositor);
        }
        ventanaActualizarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCompositorActionPerformed

    private void menuItemEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCompositorActionPerformed
        if (ventanaEliminarCompositor == null) {
            ventanaEliminarCompositor = new VentanaEliminarCompositor(controladorCompositor);
            desktopPane.add(ventanaEliminarCompositor);
        }
        ventanaEliminarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCompositorActionPerformed

    private void menuItemListarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCompositorActionPerformed
        
    }//GEN-LAST:event_menuItemListarCompositorActionPerformed

    private void itemMenuRegistrarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRegistrarDiscoActionPerformed
        
    }//GEN-LAST:event_itemMenuRegistrarDiscoActionPerformed

    private void menuItemBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarDiscoActionPerformed
        
    }//GEN-LAST:event_menuItemBuscarDiscoActionPerformed

    private void menuItemActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarDiscoActionPerformed
        
    }//GEN-LAST:event_menuItemActualizarDiscoActionPerformed

    private void menuItemEliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarDiscoActionPerformed
        
    }//GEN-LAST:event_menuItemEliminarDiscoActionPerformed

    private void menuItemListarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarDiscoActionPerformed

    }//GEN-LAST:event_menuItemListarDiscoActionPerformed

    private void menuItemRegistrarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCancionActionPerformed
        
    }//GEN-LAST:event_menuItemRegistrarCancionActionPerformed

    private void menuItemBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCancionActionPerformed
        
    }//GEN-LAST:event_menuItemBuscarCancionActionPerformed

    private void menuItemActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCancionActionPerformed
        
    }//GEN-LAST:event_menuItemActualizarCancionActionPerformed

    private void menuItemEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCancionActionPerformed
        
    }//GEN-LAST:event_menuItemEliminarCancionActionPerformed

    private void menuItemListarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCancionActionPerformed
       
    }//GEN-LAST:event_menuItemListarCancionActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemMenuCrearCantante;
    private javax.swing.JMenuItem itemMenuEliminarCantante;
    private javax.swing.JMenuItem itemMenuRegistrarDisco;
    private javax.swing.JMenuItem itemMenuVerCantante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemActualizarCancion;
    private javax.swing.JMenuItem menuItemActualizarCantante;
    private javax.swing.JMenuItem menuItemActualizarCompositor;
    private javax.swing.JMenuItem menuItemActualizarDisco;
    private javax.swing.JMenuItem menuItemBuscarCancion;
    private javax.swing.JMenuItem menuItemBuscarCompositor;
    private javax.swing.JMenuItem menuItemBuscarDisco;
    private javax.swing.JMenuItem menuItemEliminarCancion;
    private javax.swing.JMenuItem menuItemEliminarCompositor;
    private javax.swing.JMenuItem menuItemEliminarDisco;
    private javax.swing.JMenuItem menuItemListarCancion;
    private javax.swing.JMenuItem menuItemListarCantante;
    private javax.swing.JMenuItem menuItemListarCompositor;
    private javax.swing.JMenuItem menuItemListarDisco;
    private javax.swing.JMenuItem menuItemRegistrarCancion;
    private javax.swing.JMenuItem menuItemRegistrarCompositor;
    // End of variables declaration//GEN-END:variables

}
