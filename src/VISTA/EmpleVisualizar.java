package VISTA;

import CONTROLADOR.Lista.Nodo;
import MODELO.Analista;
import MODELO.Empleado;
import MODELO.ESaldoNoValido;
import VISTA.VistaPrincipal;
import MODELO.Programador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author Rodri
 */
public class EmpleVisualizar extends javax.swing.JPanel {

    VistaPrincipal Vista;

    public EmpleVisualizar(VistaPrincipal Vista) {
        initComponents();

        this.Vista = Vista;
        
        mostrarProgramadores();
        mostrarAnalistas();
        //Vista.mostrarProgramadoresOutPut();
    }

    //estos los muestro en los textfield de analistas para probar si visualizo los 1000 empleados metidos al azar
    public void mostrarEmpleados() {

        Empleado EmpleadoActualAux2 = (Empleado) Vista.listaEmpleados.getActual().getPrincipal();
        txtNumeroEmpleadoAnalista.setText(Integer.toString(EmpleadoActualAux2.getNumeroEmple()));
        txtNombreAnalista.setText(EmpleadoActualAux2.getNombre());
        txtSueldoAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldo()));
        txtSueldoMaxAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldoMax()));
        //txtAñosTrabajadosAnalista.setText(Double.toString(EmpleadoActualAux2.getAñosTrabajados()));
        //txtPlusAnualAnalista.setText(Double.toString(EmpleadoActualAux2.getPlusAnual()));
        txtFechaAltaAnalista.setText(EmpleadoActualAux2.getFechaAlta().getTime().toString());

    }

    public void mostrarProgramadores() {

        Programador EmpleadoActualAux = (Programador) Vista.listaProgramadores.getActual().getPrincipal();

        txtNumeroEmpleadoProg1.setText(Integer.toString(EmpleadoActualAux.getNumeroEmple()));
        txtNombreProg1.setText(EmpleadoActualAux.getNombre());
        txtSueldoProg1.setText(Double.toString(EmpleadoActualAux.getSueldo()));
        txtSueldoMaxProg1.setText(Double.toString(EmpleadoActualAux.getSueldoMax()));
        txtSueldoExtrMensualProg1.setText(Double.toString(EmpleadoActualAux.getSueldoExtraMensual()));
        txtGeneroProg1.setText(EmpleadoActualAux.getGenero());
        txtFechaAltaProg1.setText(EmpleadoActualAux.getFechaAlta().getTime().toString());

    }

    public void mostrarAnalistas() {

        Analista EmpleadoActualAux2 = (Analista) Vista.listaAnalistas.getActual().getPrincipal();
        txtNumeroEmpleadoAnalista.setText(Integer.toString(EmpleadoActualAux2.getNumeroEmple()));
        txtNombreAnalista.setText(EmpleadoActualAux2.getNombre());
        txtSueldoAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldo()));
        txtSueldoMaxAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldoMax()));
        txtAñosTrabajadosAnalista.setText(Double.toString(EmpleadoActualAux2.getAñosTrabajados()));
        txtPlusAnualAnalista.setText(Double.toString(EmpleadoActualAux2.getPlusAnual()));
        txtFechaAltaAnalista.setText(EmpleadoActualAux2.getFechaAlta().getTime().toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelAnalista = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumeroEmpleadoAnalista = new javax.swing.JTextField();
        txtNombreAnalista = new javax.swing.JTextField();
        txtSueldoAnalista = new javax.swing.JTextField();
        txtSueldoMaxAnalista = new javax.swing.JTextField();
        txtFechaAltaAnalista = new javax.swing.JTextField();
        txtPlusAnualAnalista = new javax.swing.JTextField();
        txtAñosTrabajadosAnalista = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanelProgramador1 = new javax.swing.JPanel();
        txtLabelNumeroEmpleadoProgramador1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNumeroEmpleadoProg1 = new javax.swing.JTextField();
        txtNombreProg1 = new javax.swing.JTextField();
        txtSueldoProg1 = new javax.swing.JTextField();
        txtSueldoMaxProg1 = new javax.swing.JTextField();
        txtFechaAltaProg1 = new javax.swing.JTextField();
        txtSueldoExtrMensualProg1 = new javax.swing.JTextField();
        txtGeneroProg1 = new javax.swing.JTextField();
        txtlabelProgramador1 = new javax.swing.JLabel();
        btnAnteriorProgramador = new javax.swing.JButton();
        btnSiguienteProgramador = new javax.swing.JButton();
        btnAnteriorAnalista = new javax.swing.JButton();
        btnSiguienteAnalista = new javax.swing.JButton();
        btnPrimeroAnalista = new javax.swing.JButton();
        btnUltimoAnalista = new javax.swing.JButton();
        btnPrimeroProgramador = new javax.swing.JButton();
        btnUltimoProgramador = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanelAnalista.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel16.setText("Numero Empleado");

        jLabel17.setText("Nombre:");

        jLabel18.setText("Sueldo:");

        jLabel19.setText("Sueldo Max:");

        jLabel20.setText("Fecha de alta");

        jLabel21.setText("Plus anual");

        jLabel22.setText("Años Trabajados");

        jLabel23.setBackground(new java.awt.Color(0, 102, 102));
        jLabel23.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        jLabel23.setText("ANALISTA");
        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelAnalistaLayout = new javax.swing.GroupLayout(jPanelAnalista);
        jPanelAnalista.setLayout(jPanelAnalistaLayout);
        jPanelAnalistaLayout.setHorizontalGroup(
            jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlusAnualAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtFechaAltaAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoMaxAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroEmpleadoAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAñosTrabajadosAnalista))
                .addContainerGap())
            .addGroup(jPanelAnalistaLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAnalistaLayout.setVerticalGroup(
            jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnalistaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNumeroEmpleadoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtSueldoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtSueldoMaxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtFechaAltaAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtPlusAnualAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtAñosTrabajadosAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelProgramador1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        txtLabelNumeroEmpleadoProgramador1.setText("Numero Empleado");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Sueldo:");

        jLabel12.setText("Sueldo Max:");

        jLabel13.setText("FechaDeAlta");

        jLabel14.setText("SueldoExtraMensual");

        jLabel15.setText("Género");

        txtlabelProgramador1.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        txtlabelProgramador1.setText("PROGRAMADOR");
        txtlabelProgramador1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelProgramador1Layout = new javax.swing.GroupLayout(jPanelProgramador1);
        jPanelProgramador1.setLayout(jPanelProgramador1Layout);
        jPanelProgramador1Layout.setHorizontalGroup(
            jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLabelNumeroEmpleadoProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaAltaProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoExtrMensualProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoMaxProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEmpleadoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelProgramador1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(txtlabelProgramador1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProgramador1Layout.setVerticalGroup(
            jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgramador1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtlabelProgramador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNumeroEmpleadoProgramador1)
                    .addComponent(txtNumeroEmpleadoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtSueldoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSueldoMaxProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtFechaAltaProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtSueldoExtrMensualProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtGeneroProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnAnteriorProgramador.setText("Anterior");
        btnAnteriorProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorProgramadorActionPerformed(evt);
            }
        });

        btnSiguienteProgramador.setText("Siguiente");
        btnSiguienteProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteProgramadorActionPerformed(evt);
            }
        });

        btnAnteriorAnalista.setText("Anterior");
        btnAnteriorAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorAnalistaActionPerformed(evt);
            }
        });

        btnSiguienteAnalista.setText("Siguiente");
        btnSiguienteAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteAnalistaActionPerformed(evt);
            }
        });

        btnPrimeroAnalista.setText("Primero");
        btnPrimeroAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroAnalistaActionPerformed(evt);
            }
        });

        btnUltimoAnalista.setText("Ultimo");
        btnUltimoAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoAnalistaActionPerformed(evt);
            }
        });

        btnPrimeroProgramador.setText("Primero");
        btnPrimeroProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroProgramadorActionPerformed(evt);
            }
        });

        btnUltimoProgramador.setText("Ultimo");
        btnUltimoProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoProgramadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnteriorAnalista)
                            .addComponent(btnPrimeroAnalista))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiguienteAnalista)
                            .addComponent(btnUltimoAnalista))))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnAnteriorProgramador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnPrimeroProgramador)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSiguienteProgramador)
                            .addComponent(btnUltimoProgramador))))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguienteProgramador)
                        .addComponent(btnAnteriorProgramador))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnteriorAnalista)
                        .addComponent(btnSiguienteAnalista)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeroAnalista)
                    .addComponent(btnUltimoAnalista)
                    .addComponent(btnPrimeroProgramador)
                    .addComponent(btnUltimoProgramador))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorProgramadorActionPerformed

        btnSiguienteProgramador.setEnabled(true);

        if (!Vista.listaProgramadores.esPrimero()) {
            mostrarProgramadores();
            Vista.listaProgramadores.visualizarAnterior();

        } else {

            mostrarProgramadores();
            Vista.listaProgramadores.visualizarAnterior();
            btnAnteriorProgramador.setEnabled(false);

        }


    }//GEN-LAST:event_btnAnteriorProgramadorActionPerformed

    private void btnSiguienteProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteProgramadorActionPerformed

        btnAnteriorProgramador.setEnabled(true);

        if (!Vista.listaProgramadores.esUltimo()) {
            mostrarProgramadores();
            Vista.listaProgramadores.avanzar();

        } else {
            mostrarProgramadores();
            Vista.listaProgramadores.avanzar();
            btnSiguienteProgramador.setEnabled(false);
        }


    }//GEN-LAST:event_btnSiguienteProgramadorActionPerformed

    private void btnSiguienteAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteAnalistaActionPerformed

        btnAnteriorAnalista.setEnabled(true);
        btnSiguienteAnalista.setEnabled(true);
        //para mostrar analistas solamente este es el BUENO
        if (!Vista.listaAnalistas.esUltimo()) {
            mostrarAnalistas();
            Vista.listaAnalistas.avanzar();

        } else {
            mostrarAnalistas();
            Vista.listaAnalistas.avanzar();
            btnSiguienteAnalista.setEnabled(false);
        }

        // para mostrar toooodos los empleados

        /*try{
           
            if (Vista.listaEmpleados.getActual() != null) {

            mostrarEmpleados();
            btnAnteriorAnalista.setEnabled(true);
            Vista.listaEmpleados.avanzar();
        }
            
        }catch(Exception e){
            
            System.out.println("Error");
        }*/
 /*if (!Vista.listaAnalistas.esUltimo()) {
            mostrarAnalistasOutPut();
            btnAnteriorAnalista.setEnabled(true);
            Vista.listaAnalistas.avanzar();
            
            if (Vista.listaAnalistas.esUltimo() || Vista.listaAnalistas.esVacio()) {
                btnSiguienteAnalista.setEnabled(false);
            }
        }*/

    }//GEN-LAST:event_btnSiguienteAnalistaActionPerformed

    private void btnPrimeroAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroAnalistaActionPerformed

        if (Vista.listaAnalistas.esPrimero()) {

            Analista EmpleadoActualAux2 = (Analista) Vista.listaAnalistas.getActual().getPrincipal();
            txtNumeroEmpleadoAnalista.setText(Integer.toString(EmpleadoActualAux2.getNumeroEmple()));
            txtNombreAnalista.setText(EmpleadoActualAux2.getNombre());
            txtSueldoAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldo()));
            txtSueldoMaxAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldoMax()));
            txtAñosTrabajadosAnalista.setText(Double.toString(EmpleadoActualAux2.getAñosTrabajados()));
            txtPlusAnualAnalista.setText(Double.toString(EmpleadoActualAux2.getPlusAnual()));
            txtFechaAltaAnalista.setText(EmpleadoActualAux2.getFechaAlta().getTime().toString());

            mostrarAnalistas();

        }
    }//GEN-LAST:event_btnPrimeroAnalistaActionPerformed

    private void btnUltimoAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoAnalistaActionPerformed

        Vista.listaAnalistas.mostrarAnalistasOutPut();

        if (Vista.listaAnalistas.esUltimo()) {

            Analista EmpleadoActualAux2 = (Analista) Vista.listaAnalistas.getActual().getPrincipal();

            txtNumeroEmpleadoAnalista.setText(Integer.toString(EmpleadoActualAux2.getNumeroEmple()));
            txtNombreAnalista.setText(EmpleadoActualAux2.getNombre());
            txtSueldoAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldo()));
            txtSueldoMaxAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldoMax()));
            txtAñosTrabajadosAnalista.setText(Double.toString(EmpleadoActualAux2.getAñosTrabajados()));
            txtPlusAnualAnalista.setText(Double.toString(EmpleadoActualAux2.getPlusAnual()));
            txtFechaAltaAnalista.setText(EmpleadoActualAux2.getFechaAlta().getTime().toString());

        }


    }//GEN-LAST:event_btnUltimoAnalistaActionPerformed

    private void btnAnteriorAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorAnalistaActionPerformed

        btnSiguienteAnalista.setEnabled(true);

        if (!Vista.listaAnalistas.esPrimero()) {
            mostrarAnalistas();
            Vista.listaAnalistas.visualizarAnterior();

        } else {

            mostrarAnalistas();
            Vista.listaAnalistas.visualizarAnterior();
            btnAnteriorAnalista.setEnabled(false);

        }


    }//GEN-LAST:event_btnAnteriorAnalistaActionPerformed

    private void btnPrimeroProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroProgramadorActionPerformed

        if (Vista.listaProgramadores.esPrimero()) {

            Programador EmpleadoActualAux = (Programador) Vista.listaProgramadores.getActual().getPrincipal();

            txtNumeroEmpleadoProg1.setText(Integer.toString(EmpleadoActualAux.getNumeroEmple()));
            txtNombreProg1.setText(EmpleadoActualAux.getNombre());
            txtSueldoProg1.setText(Double.toString(EmpleadoActualAux.getSueldo()));
            txtSueldoMaxProg1.setText(Double.toString(EmpleadoActualAux.getSueldoMax()));
            txtSueldoExtrMensualProg1.setText(Double.toString(EmpleadoActualAux.getSueldoExtraMensual()));
            txtGeneroProg1.setText(EmpleadoActualAux.getGenero());
            txtFechaAltaProg1.setText(EmpleadoActualAux.getFechaAlta().getTime().toString());
            
            Vista.listaProgramadores.mostrarAnalistasOutPut();

        }
    }//GEN-LAST:event_btnPrimeroProgramadorActionPerformed

    private void btnUltimoProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoProgramadorActionPerformed
       
        if (Vista.listaProgramadores.esUltimo()) {

            Programador EmpleadoActualAux = (Programador) Vista.listaProgramadores.getActual().getPrincipal();

            txtNumeroEmpleadoProg1.setText(Integer.toString(EmpleadoActualAux.getNumeroEmple()));
            txtNombreProg1.setText(EmpleadoActualAux.getNombre());
            txtSueldoProg1.setText(Double.toString(EmpleadoActualAux.getSueldo()));
            txtSueldoMaxProg1.setText(Double.toString(EmpleadoActualAux.getSueldoMax()));
            txtSueldoExtrMensualProg1.setText(Double.toString(EmpleadoActualAux.getSueldoExtraMensual()));
            txtGeneroProg1.setText(EmpleadoActualAux.getGenero());
            txtFechaAltaProg1.setText(EmpleadoActualAux.getFechaAlta().getTime().toString());
            
            Vista.listaProgramadores.mostrarAnalistasOutPut();

        }
    }//GEN-LAST:event_btnUltimoProgramadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnteriorAnalista;
    private javax.swing.JButton btnAnteriorProgramador;
    private javax.swing.JButton btnPrimeroAnalista;
    private javax.swing.JButton btnPrimeroProgramador;
    private javax.swing.JButton btnSiguienteAnalista;
    private javax.swing.JButton btnSiguienteProgramador;
    private javax.swing.JButton btnUltimoAnalista;
    private javax.swing.JButton btnUltimoProgramador;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAnalista;
    private javax.swing.JPanel jPanelProgramador1;
    private javax.swing.JTextField txtAñosTrabajadosAnalista;
    private javax.swing.JTextField txtFechaAltaAnalista;
    private javax.swing.JTextField txtFechaAltaProg1;
    private javax.swing.JTextField txtGeneroProg1;
    private javax.swing.JLabel txtLabelNumeroEmpleadoProgramador1;
    private javax.swing.JTextField txtNombreAnalista;
    private javax.swing.JTextField txtNombreProg1;
    private javax.swing.JTextField txtNumeroEmpleadoAnalista;
    private javax.swing.JTextField txtNumeroEmpleadoProg1;
    private javax.swing.JTextField txtPlusAnualAnalista;
    private javax.swing.JTextField txtSueldoAnalista;
    private javax.swing.JTextField txtSueldoExtrMensualProg1;
    private javax.swing.JTextField txtSueldoMaxAnalista;
    private javax.swing.JTextField txtSueldoMaxProg1;
    private javax.swing.JTextField txtSueldoProg1;
    private javax.swing.JLabel txtlabelProgramador1;
    // End of variables declaration//GEN-END:variables
}
