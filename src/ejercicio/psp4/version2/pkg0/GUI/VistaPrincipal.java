/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.psp4.version2.pkg0.GUI;

import ejercicio.psp4.version2.pkg0.Analista;
import ejercicio.psp4.version2.pkg0.ESaldoNoValido;
import ejercicio.psp4.version2.pkg0.Empleado;
import ejercicio.psp4.version2.pkg0.Lista;
import ejercicio.psp4.version2.pkg0.Programador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Rodri
 */
public class VistaPrincipal extends javax.swing.JFrame {

    static Lista listaEmpleados = new Lista();

    public VistaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCargarEmple = new javax.swing.JButton();
        btnGuardarEmple = new javax.swing.JButton();
        btnInsertarEmple = new javax.swing.JButton();
        btnVisualizarEmple = new javax.swing.JButton();
        btnCreadoMasivo = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(200, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(200, 200));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLEADOS");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCargarEmple.setBackground(new java.awt.Color(26, 73, 136));
        btnCargarEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarEmple.setText("CARGAR EMPLEADO");
        btnCargarEmple.setBorder(null);
        btnCargarEmple.setBorderPainted(false);
        btnCargarEmple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarEmple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarEmpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarEmpleMouseExited(evt);
            }
        });
        btnCargarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEmpleActionPerformed(evt);
            }
        });

        btnGuardarEmple.setBackground(new java.awt.Color(26, 73, 136));
        btnGuardarEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmple.setText("GUARDAR EMPLEADO");
        btnGuardarEmple.setBorder(null);
        btnGuardarEmple.setBorderPainted(false);
        btnGuardarEmple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleActionPerformed(evt);
            }
        });

        btnInsertarEmple.setBackground(new java.awt.Color(26, 73, 136));
        btnInsertarEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarEmple.setText("NUEVO O INSERTAR");
        btnInsertarEmple.setBorder(null);
        btnInsertarEmple.setBorderPainted(false);
        btnInsertarEmple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEmpleActionPerformed(evt);
            }
        });

        btnVisualizarEmple.setBackground(new java.awt.Color(26, 73, 136));
        btnVisualizarEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarEmple.setText("VISUALIZAR EMPLEADO");
        btnVisualizarEmple.setBorder(null);
        btnVisualizarEmple.setBorderPainted(false);
        btnVisualizarEmple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEmpleActionPerformed(evt);
            }
        });

        btnCreadoMasivo.setBackground(new java.awt.Color(26, 73, 136));
        btnCreadoMasivo.setForeground(new java.awt.Color(255, 255, 255));
        btnCreadoMasivo.setText("CREADO MASIVO");
        btnCreadoMasivo.setBorder(null);
        btnCreadoMasivo.setBorderPainted(false);
        btnCreadoMasivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnOrdenar.setBackground(new java.awt.Color(26, 73, 136));
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.setBorder(null);
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCargarEmple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGuardarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInsertarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVisualizarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(btnCreadoMasivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCargarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreadoMasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setMaximumSize(new java.awt.Dimension(617, 531));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleActionPerformed

        Visualizar visualizarDatosEmple = new Visualizar();
        visualizarDatosEmple.setSize(540, 650);
        visualizarDatosEmple.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(visualizarDatosEmple, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_btnVisualizarEmpleActionPerformed

    private void btnInsertarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEmpleActionPerformed

        /*VistaEmpleado.setVisible(true);
        VistaEmpleado.setLocationRelativeTo(null);*/
    }//GEN-LAST:event_btnInsertarEmpleActionPerformed

    private void btnGuardarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleActionPerformed

        try {
            Empleado empleado1 = new Empleado(1, "Juan", 3000.0, 5000.0);
            Empleado empleado2 = new Empleado(2, "Maria", 3500.0, 5500.0);
            listaEmpleados.insertar(empleado1);
            listaEmpleados.insertar(empleado2);
            listaEmpleados.GuardarLista(listaEmpleados);
            listaEmpleados.serialization();

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarEmpleActionPerformed

    private void btnCargarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEmpleActionPerformed

        CargarEmpleados cargarEmpleadosVista = new CargarEmpleados();
        cargarEmpleadosVista.setSize(531, 650);
        cargarEmpleadosVista.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(cargarEmpleadosVista, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

    }//GEN-LAST:event_btnCargarEmpleActionPerformed

    private void btnCargarEmpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarEmpleMouseExited

        //btnCargarEmple.setBackground(Color.[26,73,136]);
    }//GEN-LAST:event_btnCargarEmpleMouseExited

    private void btnCargarEmpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarEmpleMouseEntered

        btnCargarEmple.setBackground(Color.blue);

    }//GEN-LAST:event_btnCargarEmpleMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VistaPrincipal vista = new VistaPrincipal();

                vista.setSize(800, 670);

                vista.show();

                Lista listaEmpleados = new Lista();

                // averiguar como pasar los empleados creados aqui para llevarlos a otros FRAMES (visualizar)
                try {
                    Programador prog1 = new Programador(1, "Rodrigo", "Masculino", 2000, 100, 4000);
                    Programador prog2 = new Programador(4, "Jesus", "Masculino", 1500, 200, 4000);
                    Programador prog3 = new Programador(6, "Maria", "Femenino", 1200, 150, 4000);
                    Programador prog4 = new Programador(2, "Steven", "Masculino", 2000, 200, 4000);
                    listaEmpleados.insertar(prog1);
                    listaEmpleados.insertar(prog2);
                    listaEmpleados.insertar(prog3);
                    listaEmpleados.insertar(prog4);

                } catch (ESaldoNoValido ex) {
                    Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                //listaEmpleados.mostrarLista();
                //listaEmpleados.mostrarLista();
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton btnCargarEmple;
    private javax.swing.JButton btnCreadoMasivo;
    private javax.swing.JButton btnGuardarEmple;
    private javax.swing.JButton btnInsertarEmple;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnVisualizarEmple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
