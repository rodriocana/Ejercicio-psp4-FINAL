/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VISTA;

import MODELO.Analista;
import MODELO.ESaldoNoValido;
import VISTA.VistaPrincipal;
import MODELO.Programador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class InsertarVista extends javax.swing.JPanel {

    VistaPrincipal Vista;

    public InsertarVista(VistaPrincipal Vista) {
        initComponents();
        

        this.Vista = Vista;
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProgramador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroEmpleadoProg = new javax.swing.JTextField();
        txtNombreProg = new javax.swing.JTextField();
        txtSueldoProg = new javax.swing.JTextField();
        txtSueldoMaxProg = new javax.swing.JTextField();
        txtFechaAltaProg = new javax.swing.JTextField();
        txtSueldoExtrMensualProg = new javax.swing.JTextField();
        txtGeneroProg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnInsertarProgramador1 = new javax.swing.JButton();
        jPanelAnalista2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtNumeroEmpleadoAnalista2 = new javax.swing.JTextField();
        txtNombreAnalista2 = new javax.swing.JTextField();
        txtSueldoAnalista2 = new javax.swing.JTextField();
        txtSueldoMaxAnalista2 = new javax.swing.JTextField();
        txtFechaAltaAnalista2 = new javax.swing.JTextField();
        txtPlusAnualAnalista2 = new javax.swing.JTextField();
        txtAñosTrabajadosAnalista2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btnInsertarAnalista = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jPanelProgramador.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel2.setText("Numero Empleado");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Sueldo:");

        jLabel5.setText("Sueldo Max:");

        jLabel6.setText("FechaDeAlta");

        jLabel7.setText("SueldoExtraMensual");

        jLabel8.setText("Género");

        jLabel10.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        jLabel10.setText("PROGRAMADOR");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelProgramadorLayout = new javax.swing.GroupLayout(jPanelProgramador);
        jPanelProgramador.setLayout(jPanelProgramadorLayout);
        jPanelProgramadorLayout.setHorizontalGroup(
            jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaAltaProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoExtrMensualProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoMaxProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEmpleadoProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroProg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelProgramadorLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProgramadorLayout.setVerticalGroup(
            jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgramadorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroEmpleadoProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSueldoProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSueldoMaxProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaAltaProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSueldoExtrMensualProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtGeneroProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnInsertarProgramador1.setBackground(new java.awt.Color(255, 51, 51));
        btnInsertarProgramador1.setFont(new java.awt.Font("Source Code Pro Medium", 1, 12)); // NOI18N
        btnInsertarProgramador1.setText("Insertar Programador");
        btnInsertarProgramador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnInsertarProgramador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProgramador1ActionPerformed(evt);
            }
        });

        jPanelAnalista2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel27.setText("Numero Empleado");

        jLabel28.setText("Nombre:");

        jLabel29.setText("Sueldo:");

        jLabel30.setText("Sueldo Max:");

        jLabel31.setText("Fecha de alta");

        jLabel32.setText("Plus anual");

        jLabel33.setText("Años Trabajados");

        txtNumeroEmpleadoAnalista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEmpleadoAnalista2ActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(0, 102, 102));
        jLabel34.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        jLabel34.setText("ANALISTA");
        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelAnalista2Layout = new javax.swing.GroupLayout(jPanelAnalista2);
        jPanelAnalista2.setLayout(jPanelAnalista2Layout);
        jPanelAnalista2Layout.setHorizontalGroup(
            jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalista2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlusAnualAnalista2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtFechaAltaAnalista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoMaxAnalista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoAnalista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroEmpleadoAnalista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreAnalista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAñosTrabajadosAnalista2))
                .addContainerGap())
            .addGroup(jPanelAnalista2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAnalista2Layout.setVerticalGroup(
            jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnalista2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtNumeroEmpleadoAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNombreAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtSueldoAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(txtSueldoMaxAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(txtFechaAltaAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtPlusAnualAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(txtAñosTrabajadosAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnInsertarAnalista.setBackground(new java.awt.Color(255, 51, 51));
        btnInsertarAnalista.setFont(new java.awt.Font("Source Code Pro Medium", 1, 12)); // NOI18N
        btnInsertarAnalista.setText("Insertar Analista");
        btnInsertarAnalista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnInsertarAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAnalistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnInsertarProgramador1)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertarAnalista))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelAnalista2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAnalista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarProgramador1)
                    .addComponent(btnInsertarAnalista))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarProgramador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProgramador1ActionPerformed

        int numeroEmple = Integer.parseInt(txtNumeroEmpleadoProg.getText());
        String Nombre = txtNombreProg.getText();
        Double Sueldo = (Double.parseDouble(txtSueldoProg.getText()));
        double SueldoMax = (Double.parseDouble(txtSueldoMaxProg.getText()));
        double SueldoExtraMensual = (Double.parseDouble(txtSueldoExtrMensualProg.getText()));
        String Genero = txtGeneroProg.getText();

        // CREAMOS EL NUEVO EMPLEADO PASANDOLE LOS ATRIBUTOS ESCRITOS EN LOS TEXTFIELD
        try {

            Programador prog = new Programador(numeroEmple, Nombre, Genero, Sueldo, SueldoExtraMensual, SueldoMax);
            Vista.listaEmpleados.insertar(prog); // INSTERTAMOS EL EMPLEADO
            Vista.listaEmpleados.mostrarLista();
            Vista.listaProgramadores.mostrarProgramadoresOutPut();
            Vista.listaEmpleados.mostrarProgramadoresOutPut();
            System.out.println("El empleado programador ha sido creado");

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnInsertarProgramador1ActionPerformed

    private void btnInsertarAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAnalistaActionPerformed

        int numeroEmple = Integer.parseInt(txtNumeroEmpleadoAnalista2.getText());
        String Nombre = txtNombreAnalista2.getText();
        Double Sueldo = (Double.parseDouble(txtSueldoAnalista2.getText()));
        double SueldoMax = (Double.parseDouble(txtSueldoMaxAnalista2.getText()));
        double plusAnual = (Double.parseDouble(txtPlusAnualAnalista2.getText()));
        int añosTrabajados = Integer.parseInt(txtAñosTrabajadosAnalista2.getText());

        // CREAMOS EL NUEVO EMPLEADO PASANDOLE LOS ATRIBUTOS ESCRITOS EN LOS TEXTFIELD
        try {

            Analista analista = new Analista(numeroEmple, Nombre, añosTrabajados, Sueldo, plusAnual, SueldoMax);
            Vista.listaEmpleados.insertar(analista); // INSTERTAMOS EL EMPLEADO
            //System.out.println("El empleado analista ha sido creado");

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        Vista.listaEmpleados.mostrarLista();
    }//GEN-LAST:event_btnInsertarAnalistaActionPerformed

    private void txtNumeroEmpleadoAnalista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEmpleadoAnalista2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEmpleadoAnalista2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertarAnalista;
    private javax.swing.JButton btnInsertarProgramador1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelAnalista2;
    private javax.swing.JPanel jPanelProgramador;
    private javax.swing.JTextField txtAñosTrabajadosAnalista2;
    private javax.swing.JTextField txtFechaAltaAnalista2;
    private javax.swing.JTextField txtFechaAltaProg;
    private javax.swing.JTextField txtGeneroProg;
    private javax.swing.JTextField txtNombreAnalista2;
    private javax.swing.JTextField txtNombreProg;
    private javax.swing.JTextField txtNumeroEmpleadoAnalista2;
    private javax.swing.JTextField txtNumeroEmpleadoProg;
    private javax.swing.JTextField txtPlusAnualAnalista2;
    private javax.swing.JTextField txtSueldoAnalista2;
    private javax.swing.JTextField txtSueldoExtrMensualProg;
    private javax.swing.JTextField txtSueldoMaxAnalista2;
    private javax.swing.JTextField txtSueldoMaxProg;
    private javax.swing.JTextField txtSueldoProg;
    // End of variables declaration//GEN-END:variables
}
