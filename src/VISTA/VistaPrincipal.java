/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import MODELO.Analista;
import MODELO.ESaldoNoValido;
import MODELO.Empleado;
import CONTROLADOR.Lista;
import MODELO.Programador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Rodri
 */
public class VistaPrincipal extends javax.swing.JFrame {

    Lista listaEmpleados = new Lista();
    Lista listaAnalistas = new Lista();
    Lista listaProgramadores = new Lista();

    VistaListaEmpleados VistaEmpleados;  // instanciamos un objeto de tipo VistaListaEmpleados para poder acceder al panel de jList.
    CreadoMasivoVista VistaCreadoMasivo;
    OrdenarVista VistaOrdenar;

    public VistaPrincipal() {
        initComponents();

        VistaEmpleados = new VistaListaEmpleados(this);

        CrearEmpleados();

        //mostrarEmpleados();  // para mostrarlos todos juntos
        agregarEmpleadosAListas(); // aqui guardo en dos listas distintas a los empleados, lista Analistas y lista Programadores
        mostrarAnalistas();
        mostrarProgramadores();

        btnCreadoMasivo.setVisible(false);
        btnOrdenar1.setVisible(false);

    }

    public void crearEmpleadosMasivos() throws ESaldoNoValido {
        Random random = new Random();
        int cantidadEmpleados = random.nextInt(200) + 1000;

        for (int i = 0; i < cantidadEmpleados; i++) {
            //double sueldo = 1000 + 4000 * random.nextDouble(); // Entre 1000 y 5000
            double sueldo = 1;
            double sueldoMax = 6000;
            //double sueldoMax = sueldo + (3000 * random.nextDouble()); // Mayor que el sueldo

            String[] nombres = {"Juan", "María", "Luis", "Ana", "Carlos", "Laura", "Pedro", "Sofía", "Diego", "Valeria"};
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            int numeroEmpleado = random.nextInt(2000) + 1;

            Empleado empleado = new Empleado();
            empleado.setNumeroEmple(numeroEmpleado);
            empleado.setNombre(nombreAleatorio);
            //empleado.setSueldo(sueldo);
            empleado.setSueldoMax(sueldoMax);

            int year = random.nextInt(44) + 1980; // Años entre 1980 y 2023
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(28) + 1; //

            GregorianCalendar fecha = new GregorianCalendar(year, month - 1, day);
            empleado.setFechaAlta(fecha);

            listaEmpleados.insertar(empleado);

        }
        System.out.println("Se han creado " + cantidadEmpleados + " empleados de forma aleatoria.");
    }

    /*public void crearEmpleadosMasivos() throws ESaldoNoValido {
        Random random = new Random();
        int cantidadEmpleados = random.nextInt(200) + 1000;
        double sueldo = 1000 + 4000 * random.nextDouble(); // Entre 1000 y 5000
        double sueldoMax = sueldo + (3000 * random.nextDouble()); // Mayor que el sueldo
        double sueldoExtraMensual = 1000 + 4000 * random.nextDouble();

        for (int i = 0; i < cantidadEmpleados; i++) {

            String[] nombres = {"Juan", "María", "Luis", "Ana", "Carlos", "Laura", "Pedro", "Sofía", "Diego", "Valeria"};
            String[] genero = {"Hombre", "Mujer", "No Binario"};
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            String generoAleatorio = genero[random.nextInt(genero.length)];
            int numeroEmpleado = random.nextInt(2000) + 1;
            int AñosTrabajados = random.nextInt(1) + 20;
            int plusAnual = random.nextInt(100) + 500;

            Empleado empleado;
            if (random.nextBoolean()) {
                Analista analista = new Analista(numeroEmpleado, nombreAleatorio, AñosTrabajados, sueldo, plusAnual, sueldoMax);
                analista.setNumeroEmple(numeroEmpleado);
                analista.setNombre(nombreAleatorio);
                //analista.setSueldo(200);
                analista.setSueldoMax(8000);
                analista.setAñosTrabajados(AñosTrabajados);
                analista.setPlusAnual(plusAnual);
                empleado = analista;
                listaAnalistas.insertar(analista);
            } else {
                Programador programador = new Programador(numeroEmpleado, nombreAleatorio, generoAleatorio, sueldoExtraMensual, sueldo, sueldoMax);
                programador.setNumeroEmple(numeroEmpleado);
                programador.setNombre(nombreAleatorio);
                //programador.setSueldo(200);
                //programador.setSueldoMax(8000);
                programador.setGenero(generoAleatorio);
                programador.setSueldoExtraMensual(sueldoExtraMensual);
                empleado = programador;
                listaProgramadores.insertar(programador);
            }

        }
        System.out.println("Se han creado " + cantidadEmpleados + " empleados de forma aleatoria.");
    }*/
    public void agregarEmpleadosAListas() {

        listaEmpleados.agregarEmpleadosAListas(listaAnalistas, listaProgramadores);
    }

    public void mostrarEmpleados() {
        listaEmpleados.mostrarLista();

    }

    public void mostrarAnalistas() {
        listaAnalistas.mostrarAnalistas();
    }

    public void mostrarProgramadores() {
        listaProgramadores.mostrarProgramadores();
    }

    private void CrearEmpleados() {

        try {
            Programador prog1 = new Programador(1, "Rodrigo", "Masculino", 2000, 100, 4000);
            Programador prog2 = new Programador(4, "Jesus", "Masculino", 1500, 200, 4000);
            Programador prog3 = new Programador(6, "Maria", "Femenino", 1200, 150, 4000);
            Programador prog4 = new Programador(2, "Steven", "Masculino", 2000, 200, 4000);
            Programador prog5 = new Programador(5, "Carmen", "Mujer", 2000, 200, 4000);
            listaEmpleados.insertar(prog1);
            listaEmpleados.insertar(prog2);
            listaEmpleados.insertar(prog3);
            listaEmpleados.insertar(prog4);
            listaEmpleados.insertar(prog5);

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Analista analista1 = new Analista(25, "Juan Antonio", 3, 2000, 2500, 3050);
            Analista analista2 = new Analista(99, "Tomás", 5, 2500, 3000, 4050);
            Analista analista3 = new Analista(8, "Miguel", 1, 3000, 2000, 5000);
            listaEmpleados.insertar(analista1);
            listaEmpleados.insertar(analista2);
            listaEmpleados.insertar(analista3);

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        btnListaEmpleados = new javax.swing.JButton();
        btnOrdenar1 = new javax.swing.JButton();
        btnCreadoMasivo = new javax.swing.JButton();
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
        btnGuardarEmple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleMouseExited(evt);
            }
        });
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
        btnInsertarEmple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertarEmpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertarEmpleMouseExited(evt);
            }
        });
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
        btnVisualizarEmple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarEmpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarEmpleMouseExited(evt);
            }
        });
        btnVisualizarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEmpleActionPerformed(evt);
            }
        });

        btnListaEmpleados.setBackground(new java.awt.Color(26, 73, 136));
        btnListaEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnListaEmpleados.setText("LISTA DE EMPLEADOS");
        btnListaEmpleados.setBorder(null);
        btnListaEmpleados.setBorderPainted(false);
        btnListaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListaEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListaEmpleadosMouseExited(evt);
            }
        });
        btnListaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEmpleadosActionPerformed(evt);
            }
        });

        btnOrdenar1.setBackground(new java.awt.Color(26, 73, 136));
        btnOrdenar1.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar1.setText("ORDENAR");
        btnOrdenar1.setBorder(null);
        btnOrdenar1.setBorderPainted(false);
        btnOrdenar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrdenar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrdenar1MouseExited(evt);
            }
        });
        btnOrdenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenar1ActionPerformed(evt);
            }
        });

        btnCreadoMasivo.setBackground(new java.awt.Color(26, 73, 136));
        btnCreadoMasivo.setForeground(new java.awt.Color(255, 255, 255));
        btnCreadoMasivo.setText("CREADO MASIVO");
        btnCreadoMasivo.setBorder(null);
        btnCreadoMasivo.setBorderPainted(false);
        btnCreadoMasivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreadoMasivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreadoMasivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreadoMasivoMouseExited(evt);
            }
        });
        btnCreadoMasivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreadoMasivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCargarEmple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGuardarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInsertarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVisualizarEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnCreadoMasivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrdenar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnListaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreadoMasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrdenar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setMaximumSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
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
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleActionPerformed

        /*Visualizar visualizarDatosEmple = new Visualizar();
        visualizarDatosEmple.setSize(540, 650);
        visualizarDatosEmple.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(visualizarDatosEmple, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();*/
        EmpleVisualizar vista = new EmpleVisualizar(this);
        vista.setSize(740, 650);
        vista.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(vista, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();


    }//GEN-LAST:event_btnVisualizarEmpleActionPerformed

    private void btnInsertarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEmpleActionPerformed

        InsertarVista visualizarInsertar = new InsertarVista(this);
        visualizarInsertar.setSize(740, 650);
        visualizarInsertar.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(visualizarInsertar, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

    }//GEN-LAST:event_btnInsertarEmpleActionPerformed

    private void btnGuardarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleActionPerformed

        try {
            Empleado empleado1 = new Empleado(1, "Juan", 3000.0, 5000.0);
            Empleado empleado2 = new Empleado(2, "Maria", 3500.0, 5500.0);
            listaEmpleados.insertar(empleado1);
            listaEmpleados.insertar(empleado2);
            listaEmpleados.serialization(listaEmpleados); // llama a la funcion que guarda los empleados creados

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarEmpleActionPerformed

    private void btnCargarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEmpleActionPerformed

        CargarEmpleados cargarEmpleadosVista = new CargarEmpleados(this);  // al this le paso VISTA
        cargarEmpleadosVista.setSize(740, 650);
        cargarEmpleadosVista.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(cargarEmpleadosVista, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

    }//GEN-LAST:event_btnCargarEmpleActionPerformed

    private void btnCargarEmpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarEmpleMouseExited

        btnCargarEmple.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnCargarEmpleMouseExited

    private void btnCargarEmpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarEmpleMouseEntered

        btnCargarEmple.setBackground(Color.blue);

    }//GEN-LAST:event_btnCargarEmpleMouseEntered

    private void btnGuardarEmpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleMouseEntered

        btnGuardarEmple.setBackground(Color.blue);
    }//GEN-LAST:event_btnGuardarEmpleMouseEntered

    private void btnInsertarEmpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarEmpleMouseEntered

        btnInsertarEmple.setBackground(Color.blue);
    }//GEN-LAST:event_btnInsertarEmpleMouseEntered

    private void btnVisualizarEmpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleMouseEntered

        btnVisualizarEmple.setBackground(Color.blue);
    }//GEN-LAST:event_btnVisualizarEmpleMouseEntered

    private void btnCreadoMasivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreadoMasivoMouseEntered

        btnCreadoMasivo.setBackground(Color.blue);
    }//GEN-LAST:event_btnCreadoMasivoMouseEntered

    private void btnListaEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaEmpleadosMouseEntered

        btnListaEmpleados.setBackground(Color.blue);
    }//GEN-LAST:event_btnListaEmpleadosMouseEntered

    private void btnGuardarEmpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleMouseExited

        btnGuardarEmple.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnGuardarEmpleMouseExited

    private void btnInsertarEmpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarEmpleMouseExited

        btnInsertarEmple.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnInsertarEmpleMouseExited

    private void btnVisualizarEmpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleMouseExited

        btnVisualizarEmple.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnVisualizarEmpleMouseExited

    private void btnCreadoMasivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreadoMasivoMouseExited

        btnCreadoMasivo.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnCreadoMasivoMouseExited

    private void btnListaEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaEmpleadosMouseExited
        btnListaEmpleados.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnListaEmpleadosMouseExited

    private void btnOrdenar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenar1MouseEntered

        btnOrdenar1.setBackground(Color.blue);
    }//GEN-LAST:event_btnOrdenar1MouseEntered

    private void btnOrdenar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenar1MouseExited

        btnOrdenar1.setBackground(new Color(26, 73, 136));
    }//GEN-LAST:event_btnOrdenar1MouseExited

    private void btnOrdenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenar1ActionPerformed

        System.out.println("Se ha ordenado la lista en JList");
        listaEmpleados.ordenarPorNumeroEmpleado();

        VistaOrdenar = new OrdenarVista(this);
        VistaOrdenar.setSize(1040, 650);
        VistaOrdenar.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(VistaOrdenar, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

        //listaAnalistas.ordenarPorNumeroEmpleado(); // si quiero ordenar solamente los analistas
    }//GEN-LAST:event_btnOrdenar1ActionPerformed

    private void btnListaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEmpleadosActionPerformed

        btnCreadoMasivo.setVisible(true);
        btnOrdenar1.setVisible(true);

        VistaEmpleados = new VistaListaEmpleados(this);
        VistaEmpleados.setSize(1040, 650);
        VistaEmpleados.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(VistaEmpleados, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

    }//GEN-LAST:event_btnListaEmpleadosActionPerformed

    private void btnCreadoMasivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreadoMasivoActionPerformed

        try {
            crearEmpleadosMasivos();

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        VistaCreadoMasivo = new CreadoMasivoVista(this);
        VistaCreadoMasivo.setSize(1040, 650);
        VistaCreadoMasivo.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(VistaCreadoMasivo, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();


    }//GEN-LAST:event_btnCreadoMasivoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VistaPrincipal vista = new VistaPrincipal();

                vista.setSize(940, 670);

                vista.show();

                Lista listaEmpleados = new Lista();

                // averiguar como pasar los empleados creados aqui para llevarlos a otros FRAMES (visualizar)
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
    private javax.swing.JButton btnListaEmpleados;
    private javax.swing.JButton btnOrdenar1;
    private javax.swing.JButton btnVisualizarEmple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
