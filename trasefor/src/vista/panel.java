/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel Diaz
 */
public class panel extends javax.swing.JFrame {

    /**
     * Creates new form panel
     */
    public panel() {
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

        ESCRITORIO = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menSistema = new javax.swing.JMenu();
        menCerrarS = new javax.swing.JMenuItem();
        menSalir = new javax.swing.JMenuItem();
        menCliente = new javax.swing.JMenu();
        menNuevo = new javax.swing.JMenuItem();
        menAdministrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ESCRITORIOLayout = new javax.swing.GroupLayout(ESCRITORIO);
        ESCRITORIO.setLayout(ESCRITORIOLayout);
        ESCRITORIOLayout.setHorizontalGroup(
            ESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        ESCRITORIOLayout.setVerticalGroup(
            ESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jMenuBar2.setToolTipText("");

        menSistema.setText("Sistema");

        menCerrarS.setText("Cerrar Sesión");
        menCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCerrarSActionPerformed(evt);
            }
        });
        menSistema.add(menCerrarS);

        menSalir.setText("Salir");
        menSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSalirActionPerformed(evt);
            }
        });
        menSistema.add(menSalir);

        jMenuBar2.add(menSistema);

        menCliente.setText("Cliente");

        menNuevo.setText("Nuevo ");
        menNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menNuevoActionPerformed(evt);
            }
        });
        menCliente.add(menNuevo);

        menAdministrar.setText("Administrar");
        menAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAdministrarActionPerformed(evt);
            }
        });
        menCliente.add(menAdministrar);

        jMenuBar2.add(menCliente);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ESCRITORIO)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ESCRITORIO)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menNuevoActionPerformed
         
        clienteAgregar GD = new clienteAgregar();
          this.ESCRITORIO.add(GD);
          GD.show();
    }//GEN-LAST:event_menNuevoActionPerformed

    private void menAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAdministrarActionPerformed
        clienteAdmin GDIAZ = new clienteAdmin();
          this.ESCRITORIO.add(GDIAZ);
          GDIAZ.show();
    }//GEN-LAST:event_menAdministrarActionPerformed

    private void menCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCerrarSActionPerformed
        String botones[] ={"Si","No"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿ Desea Cerrar el Sesion?", "Titulo", 0, 0, null, botones, this);
        if(eleccion== JOptionPane.YES_OPTION){
            login l = new login ();
            l.setVisible(true);
            this.dispose();
        }else if (eleccion==JOptionPane.NO_OPTION){
            System.out.println("Se cancelo el cierre");
        }
    }//GEN-LAST:event_menCerrarSActionPerformed

    private void menSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSalirActionPerformed
        String botones[] ={"Si","No"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿ Desea Salir de la Aplicaciòn?", "Titulo", 0, 0, null, botones, this);
        if(eleccion== JOptionPane.YES_OPTION){
            System.exit(0);
        }else if (eleccion==JOptionPane.NO_OPTION){
            System.out.println("Se cancelo el cierre");
        }
    }//GEN-LAST:event_menSalirActionPerformed

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane ESCRITORIO;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem menAdministrar;
    private javax.swing.JMenuItem menCerrarS;
    private javax.swing.JMenu menCliente;
    private javax.swing.JMenuItem menNuevo;
    private javax.swing.JMenuItem menSalir;
    private javax.swing.JMenu menSistema;
    // End of variables declaration//GEN-END:variables
}
