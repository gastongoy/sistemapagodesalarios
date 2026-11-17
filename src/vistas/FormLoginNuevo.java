
package vistas;


public class FormLoginNuevo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormLoginNuevo.class.getName());

    public FormLoginNuevo() {
        initComponents();
        crearDisenoLogin();
    }

private javax.swing.JTextField campoUsuario;
private javax.swing.JPasswordField campoContrasena;

private final java.awt.Color VERDE =
        new java.awt.Color(27, 91, 60);

private final java.awt.Color FONDO =
        new java.awt.Color(246, 248, 247);

private final java.awt.Color TEXTO =
        new java.awt.Color(35, 46, 40);

private void crearDisenoLogin() {

    setTitle("Sistema de Pago de Salarios");
    setDefaultCloseOperation(
            javax.swing.WindowConstants.EXIT_ON_CLOSE
    );

    // Imagen del lado izquierdo
    java.net.URL ruta = getClass().getResource(
            "/vistas/fondo_oficina_login.png"
    );

    final java.awt.Image foto = ruta == null
            ? null
            : new javax.swing.ImageIcon(ruta).getImage();

    javax.swing.JPanel panelFoto = new javax.swing.JPanel() {

        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);

            java.awt.Graphics2D g2 =
                    (java.awt.Graphics2D) g.create();

            g2.setRenderingHint(
                    java.awt.RenderingHints.KEY_INTERPOLATION,
                    java.awt.RenderingHints.VALUE_INTERPOLATION_BILINEAR
            );

            if (foto != null) {

                int ancho = foto.getWidth(this);
                int alto = foto.getHeight(this);

                double escala = Math.max(
                        getWidth() / (double) ancho,
                        getHeight() / (double) alto
                );

                int nuevoAncho =
                        (int) Math.ceil(ancho * escala);

                int nuevoAlto =
                        (int) Math.ceil(alto * escala);

                g2.drawImage(
                        foto,
                        (getWidth() - nuevoAncho) / 2,
                        (getHeight() - nuevoAlto) / 2,
                        nuevoAncho,
                        nuevoAlto,
                        this
                );

            } else {

                g2.setColor(
                        new java.awt.Color(34, 54, 44)
                );

                g2.fillRect(
                        0, 0, getWidth(), getHeight()
                );

                g2.setColor(java.awt.Color.WHITE);
                g2.drawString(
                        "Imagen no encontrada",
                        25, 50
                );
            }

            g2.setColor(VERDE);
            g2.fillRect(
                    getWidth() - 3,
                    0,
                    3,
                    getHeight()
            );

            g2.dispose();
        }
    };

    panelFoto.setPreferredSize(
            new java.awt.Dimension(415, 570)
    );

    // Panel derecho
    javax.swing.JPanel panelFormulario =
            new javax.swing.JPanel(
                    new java.awt.GridBagLayout()
            );

    panelFormulario.setBackground(FONDO);

    panelFormulario.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(
                    30, 48, 30, 48
            )
    );

    java.awt.GridBagConstraints c =
            new java.awt.GridBagConstraints();

    c.gridx = 0;
    c.weightx = 1;
    c.fill = java.awt.GridBagConstraints.HORIZONTAL;

    int fila = 0;

    // Símbolo decorativo
    // Logo de recibo del proyecto
javax.swing.JLabel logo = new javax.swing.JLabel();
logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

java.net.URL rutaLogo =
        getClass().getResource("/vistas/icono_derecha.png");

if (rutaLogo != null) {
    javax.swing.ImageIcon icono =
            new javax.swing.ImageIcon(rutaLogo);

    java.awt.Image imagenLogo = icono.getImage()
            .getScaledInstance(
                    65, 65,
                    java.awt.Image.SCALE_SMOOTH
            );

    logo.setIcon(new javax.swing.ImageIcon(imagenLogo));
}

    logo.setFont(
            new java.awt.Font(
                    "Segoe UI Symbol",
                    java.awt.Font.PLAIN,
                    44
            )
    );

    logo.setForeground(VERDE);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 8, 0);
    panelFormulario.add(logo, c);

    // Nombre del sistema
    javax.swing.JLabel titulo = new javax.swing.JLabel(
            "Sistema de Pago de Salarios",
            javax.swing.SwingConstants.CENTER
    );

    titulo.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.BOLD,
                    22
            )
    );

    titulo.setForeground(TEXTO);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 8, 0);
    panelFormulario.add(titulo, c);

    // Subtítulo
    javax.swing.JLabel subtitulo =
            new javax.swing.JLabel(
                    "Gestión de nómina y remuneraciones",
                    javax.swing.SwingConstants.CENTER
            );

    subtitulo.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.PLAIN,
                    14
            )
    );

    subtitulo.setForeground(
            new java.awt.Color(105, 114, 108)
    );

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 30, 0);
    panelFormulario.add(subtitulo, c);

    // Etiqueta Usuario
    javax.swing.JLabel lblUsuario =
            new javax.swing.JLabel("Usuario");

    lblUsuario.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.BOLD,
                    14
            )
    );

    lblUsuario.setForeground(TEXTO);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 7, 0);
    panelFormulario.add(lblUsuario, c);

    // Campo usuario
    campoUsuario = new javax.swing.JTextField();

    prepararCampo(campoUsuario);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 19, 0);
    panelFormulario.add(campoUsuario, c);

    // Etiqueta Contraseña
    javax.swing.JLabel lblContrasena =
            new javax.swing.JLabel("Contraseña");

    lblContrasena.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.BOLD,
                    14
            )
    );

    lblContrasena.setForeground(TEXTO);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 7, 0);
    panelFormulario.add(lblContrasena, c);

    // Campo contraseña
    campoContrasena =
            new javax.swing.JPasswordField();

    prepararCampo(campoContrasena);

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 26, 0);
    panelFormulario.add(campoContrasena, c);

    // Botón iniciar sesión
    javax.swing.JButton botonIngresar =
            new javax.swing.JButton("Iniciar sesión");

    botonIngresar.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.BOLD,
                    15
            )
    );

    botonIngresar.setBackground(VERDE);
    botonIngresar.setForeground(java.awt.Color.WHITE);
    botonIngresar.setFocusPainted(false);
    botonIngresar.setOpaque(true);
    botonIngresar.setContentAreaFilled(true);

    botonIngresar.setPreferredSize(
            new java.awt.Dimension(350, 44)
    );

    botonIngresar.addActionListener(
            e -> iniciarSesionNueva()
    );

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 12, 0);
    panelFormulario.add(botonIngresar, c);

    // Botón salir
    javax.swing.JButton botonSalir =
            new javax.swing.JButton("Salir");

    botonSalir.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.PLAIN,
                    14
            )
    );

    botonSalir.setBackground(
            new java.awt.Color(224, 232, 226)
    );

    botonSalir.setForeground(TEXTO);
    botonSalir.setFocusPainted(false);
    botonSalir.setOpaque(true);
    botonSalir.setContentAreaFilled(true);

    botonSalir.setPreferredSize(
            new java.awt.Dimension(350, 40)
    );

    botonSalir.addActionListener(
            e -> System.exit(0)
    );

    c.gridy = fila++;
    c.insets = new java.awt.Insets(0, 0, 23, 0);
    panelFormulario.add(botonSalir, c);

    // Pie de página
    javax.swing.JLabel pie = new javax.swing.JLabel(
            "Versión 1.1  |  Grupo B",
            javax.swing.SwingConstants.CENTER
    );

    pie.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.PLAIN,
                    12
            )
    );

    pie.setForeground(
            new java.awt.Color(110, 119, 113)
    );

    c.gridy = fila;
    c.insets = new java.awt.Insets(0, 0, 0, 0);
    panelFormulario.add(pie, c);

    // Unir los dos paneles
    javax.swing.JPanel principal =
            new javax.swing.JPanel(
                    new java.awt.BorderLayout()
            );

    principal.add(
            panelFoto,
            java.awt.BorderLayout.WEST
    );

    principal.add(
            panelFormulario,
            java.awt.BorderLayout.CENTER
    );

    setContentPane(principal);

    setSize(940, 570);
    setResizable(false);
    setLocationRelativeTo(null);

    getRootPane().setDefaultButton(
            botonIngresar
    );

    revalidate();
    repaint();
}

// Diseño de los campos
private void prepararCampo(
        javax.swing.text.JTextComponent campo) {

    campo.setFont(
            new java.awt.Font(
                    "Segoe UI",
                    java.awt.Font.PLAIN,
                    15
            )
    );

    campo.setBackground(java.awt.Color.WHITE);
    campo.setForeground(TEXTO);
    campo.setCaretColor(VERDE);

    campo.setPreferredSize(
            new java.awt.Dimension(350, 42)
    );

    campo.setBorder(
            javax.swing.BorderFactory.createCompoundBorder(
                    javax.swing.BorderFactory.createLineBorder(
                            new java.awt.Color(160, 183, 169)
                    ),
                    javax.swing.BorderFactory.createEmptyBorder(
                            7, 12, 7, 12
                    )
            )
    );
}

// Autenticación con el DAO existente
private void iniciarSesionNueva() {

    String usuario = campoUsuario.getText().trim();

    String contrasena = new String(
            campoContrasena.getPassword()
    );

    dao.UsuarioDAO usuarioDAO =
            new dao.UsuarioDAO();

    if (usuarioDAO.login(usuario, contrasena)) {

        FormMenu menu = new FormMenu();

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        this.dispose();

    } else {

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Usuario y/o contraseña incorrectos"
        );
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> new FormLoginNuevo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
