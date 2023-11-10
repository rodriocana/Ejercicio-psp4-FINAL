/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VISTA;

import MODELO.Empleado;
import VISTA.VistaPrincipal;
import CONTROLADOR.Lista;
import CONTROLADOR.Lista.Nodo;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

/**
 *
 * @author Rodri
 */
public class VistaListaEmpleados extends javax.swing.JPanel {

    //public Lista listaEmpleados;
    VistaPrincipal Vista;

    public VistaListaEmpleados(VistaPrincipal Vista) {
        initComponents();

        this.Vista = Vista;

        jList1.setModel(modeloLista());
        jScrollPane1.setViewportView(jList1);

    }

    private DefaultListModel modeloLista() {

        DefaultListModel<String> modelo = new DefaultListModel<>();

        Nodo aux = Vista.listaEmpleados.getInicio();

        
        while (aux != null) {

            if (aux.getPrincipal() instanceof Empleado) {

                String infoObjeto = aux.getPrincipal().toString();  // POR QUE ESTA LINEA SE IMPRIME???
                modelo.addElement(infoObjeto);  // LE PASO infoObjeto y ahi dentro va cada toString de cada empleado

            } else {
                modelo.addElement("No hay elementos");
            }

            aux = aux.getSiguiente();

        }

        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(51, 102, 255));

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jScrollPane1.setForeground(new java.awt.Color(0, 51, 204));

        jList1.setBackground(new java.awt.Color(0, 51, 51));
        jList1.setFont(new java.awt.Font("Sitka Heading", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
