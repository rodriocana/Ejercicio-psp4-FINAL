/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VISTA;

import CONTROLADOR.Lista;
import MODELO.Empleado;
import javax.swing.DefaultListModel;

/**
 *
 * @author Rodri
 */
public class OrdenarVista extends javax.swing.JPanel {

    VistaPrincipal Vista;
    
    public OrdenarVista(VistaPrincipal Vista) {
        initComponents();
        
        this.Vista = Vista;
        
        jList3.setModel(modeloLista());
        jScrollPane3.setViewportView(jList3);
    }
    
    private DefaultListModel modeloLista() {

        DefaultListModel<String> modelo = new DefaultListModel<>();

        Lista.Nodo aux = Vista.listaEmpleados.getInicio();

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

        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();

        jScrollPane3.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jScrollPane3.setForeground(new java.awt.Color(0, 51, 204));

        jList3.setBackground(new java.awt.Color(0, 51, 51));
        jList3.setFont(new java.awt.Font("Sitka Heading", 1, 12)); // NOI18N
        jList3.setForeground(new java.awt.Color(255, 255, 255));
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
