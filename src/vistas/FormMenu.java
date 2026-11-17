/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import javax.swing.JOptionPane;

public class FormMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMenu.class.getName());

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
    }
            
// ===== NUEVO: DISEÑO DE DESARROLLADO POR =====

private void mostrarDesarrolladores() {

    java.awt.Color verde = new java.awt.Color(25, 88, 58);
    java.awt.Color fondo = new java.awt.Color(246, 248, 247);
    java.awt.Color texto = new java.awt.Color(38, 48, 42);
    java.awt.Color gris = new java.awt.Color(100, 110, 104);

    javax.swing.JDialog ventana =
            new javax.swing.JDialog(this, "Desarrollado por", true);

    ventana.setDefaultCloseOperation(
            javax.swing.JDialog.DISPOSE_ON_CLOSE
    );

    ventana.setSize(760, 550);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(this);

    javax.swing.JPanel principal =
            new javax.swing.JPanel(new java.awt.BorderLayout());

    principal.setBackground(fondo);

    // ENCABEZADO VERDE

    javax.swing.JPanel encabezado =
            new javax.swing.JPanel(new java.awt.BorderLayout());

    encabezado.setBackground(verde);
    encabezado.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(28, 30, 28, 30)
    );

    javax.swing.JLabel titulo =
            new javax.swing.JLabel("SISTEMA DE PAGO DE SALARIOS");

    titulo.setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24)
    );
    titulo.setForeground(java.awt.Color.WHITE);

    javax.swing.JLabel subtitulo =
            new javax.swing.JLabel("Gestión de nómina");

    subtitulo.setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14)
    );
    subtitulo.setForeground(new java.awt.Color(218, 231, 224));

    javax.swing.JPanel titulos =
            new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 7));

    titulos.setOpaque(false);
    titulos.add(titulo);
    titulos.add(subtitulo);

    encabezado.add(titulos, java.awt.BorderLayout.CENTER);
    principal.add(encabezado, java.awt.BorderLayout.NORTH);

    // CONTENIDO

    javax.swing.JPanel contenido =
            new javax.swing.JPanel(new java.awt.BorderLayout(0, 18));

    contenido.setBackground(fondo);
    contenido.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(25, 40, 15, 40)
    );

    javax.swing.JLabel grupo =
            new javax.swing.JLabel("DESARROLLADO POR  |  GRUPO B");

    grupo.setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 17)
    );
    grupo.setForeground(verde);

    contenido.add(grupo, java.awt.BorderLayout.NORTH);

    // INTEGRANTES

    String[][] integrantes = {
        {"Montserrat Candia", "6.978.556"},
        {"Víctor Rodríguez", "5.306.576"},
        {"Verónica Rolón", "6.183.559"},
        {"Gastón Ezequiel Fernández Goyburú", "5.450.511"},
        {"Josué Sanabria", "5.711.637"},
        {"Fabiana Ríos", "6.525.297"}
    };

    javax.swing.JPanel lista =
            new javax.swing.JPanel(new java.awt.GridLayout(6, 1, 0, 5));

    lista.setBackground(fondo);

    for (String[] integrante : integrantes) {

        javax.swing.JPanel fila =
                new javax.swing.JPanel(
                        new java.awt.BorderLayout(15, 0)
                );

        fila.setBackground(java.awt.Color.WHITE);
        fila.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createLineBorder(
                                new java.awt.Color(224, 230, 226)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(
                                10, 15, 10, 15
                        )
                )
        );

        javax.swing.JLabel nombre =
                new javax.swing.JLabel(integrante[0]);

        nombre.setFont(
                new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14)
        );
        nombre.setForeground(texto);

        javax.swing.JLabel cedula =
                new javax.swing.JLabel("CI: " + integrante[1]);

        cedula.setFont(
                new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14)
        );
        cedula.setForeground(gris);

        fila.add(nombre, java.awt.BorderLayout.CENTER);
        fila.add(cedula, java.awt.BorderLayout.EAST);

        lista.add(fila);
    }

    contenido.add(lista, java.awt.BorderLayout.CENTER);
    principal.add(contenido, java.awt.BorderLayout.CENTER);

    // BOTÓN ACEPTAR

    javax.swing.JPanel pie =
            new javax.swing.JPanel(
                    new java.awt.FlowLayout(
                            java.awt.FlowLayout.RIGHT, 35, 18
                    )
            );

    pie.setBackground(fondo);

    javax.swing.JButton aceptar =
            new javax.swing.JButton("Aceptar");

    aceptar.setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14)
    );

    aceptar.setBackground(verde);
    aceptar.setForeground(java.awt.Color.WHITE);
    aceptar.setFocusPainted(false);
    aceptar.setOpaque(true);

    aceptar.setPreferredSize(
            new java.awt.Dimension(135, 40)
    );

    // Cierra únicamente esta ventana
    aceptar.addActionListener(e -> ventana.dispose());

    pie.add(aceptar);
    principal.add(pie, java.awt.BorderLayout.SOUTH);

    ventana.setContentPane(principal);
    ventana.getRootPane().setDefaultButton(aceptar);
    ventana.setVisible(true);
}

// ===== FIN DEL CÓDIGO NUEVO =====


   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEmpleados = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        menuNomina = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        itemDesarrolladoPor = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE PAGO DE SALARIOS");
        setBackground(new java.awt.Color(244, 238, 232));

        jLabel1.setText("Sistema Pago de Salarios");

        menuEmpleados.setText("Empleados");

        jMenu6.setText("Registrar empleados");
        menuEmpleados.add(jMenu6);

        jMenu7.setText("Consultar empleados");
        menuEmpleados.add(jMenu7);

        jMenu8.setText("Sectores");
        menuEmpleados.add(jMenu8);

        jMenu9.setText("Parametros de Pago");
        menuEmpleados.add(jMenu9);

        jMenuBar1.add(menuEmpleados);

        menuNomina.setText("Nómina");

        jMenu10.setText("Registrar novedades");
        menuNomina.add(jMenu10);

        jMenu11.setText("Procesar nomina");
        menuNomina.add(jMenu11);

        jMenu12.setText("Consultar nominas");
        menuNomina.add(jMenu12);

        jMenuBar1.add(menuNomina);

        jMenu2.setText("Pagos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Información");

        itemDesarrolladoPor.setText("Desarrollado por");
        itemDesarrolladoPor.addActionListener(this::itemDesarrolladoPorActionPerformed);
        jMenu4.add(itemDesarrolladoPor);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addActionListener(this::jMenu5ActionPerformed);
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDesarrolladoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesarrolladoPorActionPerformed

    mostrarDesarrolladores();

  
    }//GEN-LAST:event_itemDesarrolladoPorActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu5ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemDesarrolladoPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuNomina;
    // End of variables declaration//GEN-END:variables
}
