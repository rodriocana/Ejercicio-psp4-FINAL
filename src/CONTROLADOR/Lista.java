/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Analista;
import MODELO.Empleado;
import MODELO.Programador;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class Lista<E> implements Serializable { //------------------------------------hace falta serializable?

    Nodo<E> inicio;  // Atributo tipo NODO para ver el comprobar el inicio de la lista
    Nodo<E> fin;  // atributo para comprobar el final de la lista
    Nodo<E> actual;
    private int contador = 0;

//    //INICIALIZAMOS TODO A NULL
    public Lista() {

        this.inicio = null;
        this.fin = null;
        this.actual = null;
    }
    // para ver si el empleado es el primero o no

    public boolean esPrimero() {
        if (this.actual.getAnterior() != null) {
            return false;
        } else {
            return true;
        }
    }

    //para ver si el empleado es ultimo o no
    public boolean esUltimo() {
        if (this.actual.getSiguiente() != null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esVacio() {
        if (contador <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo<E> getNodoActual() {
        Nodo<E> temporal = this.actual;
        return temporal;
    }

    public void insertar(E emple) {
        Nodo<E> NuevoNodo = new Nodo(emple);
        this.contador++;
        if (this.inicio == null) {
            NuevoNodo.setSiguiente(null);
            NuevoNodo.setAnterior(null);
            this.inicio = NuevoNodo;
            this.fin = NuevoNodo;
            System.out.println("CREADO " + this.contador);
            // iniciamos valor al nodo que iremos moviendo para ver toda la lista
            this.actual = NuevoNodo;
        } else {
            Nodo<E> temporal = this.fin;
            this.fin = NuevoNodo;
            temporal.setSiguiente(this.fin);
            NuevoNodo.setSiguiente(null);
            NuevoNodo.setAnterior(temporal);
            System.out.println("CREADO " + this.contador);
        }
    }

    // metodo que mete empleados en listas distintas, analistas y programadores
    public void agregarEmpleadosAListas(Lista listaAnalistas, Lista listaProgramadores) {
        Nodo<E> temporal = this.inicio;
        while (temporal != null) {
            Empleado empleado = (Empleado) temporal.getPrincipal();

            if (empleado instanceof Analista) {
                listaAnalistas.insertar(empleado);
            } else if (empleado instanceof Programador) {
                listaProgramadores.insertar(empleado);
            }

            temporal = temporal.getSiguiente();
        }

    }

    public void mostrarAnalistas() {
        Nodo<E> temporal = this.inicio;
        System.out.println("****ANALISTAS****");
        while (temporal != null) {
            Empleado empleado = (Empleado) temporal.getPrincipal();
            if (empleado instanceof Analista) {
                System.out.println(empleado);
            }
            temporal = temporal.getSiguiente();

        }
    }

    public void mostrarProgramadores() {
        Nodo<E> temporal = this.inicio;
        System.out.println("****PROGRAMADORES****");
        while (temporal != null) {
            Empleado empleado = (Empleado) temporal.getPrincipal();
            if (empleado instanceof Programador) {
                System.out.println(empleado);
            }
            temporal = temporal.getSiguiente();
        }
    }

    /*public boolean Sort() {

        Nodo<E> emple1 = inicio;
        Nodo<E> emple2 = emple1.siguiente;

        while (emple1 != null) {

            while (emple2 != null) {

                if (emple1.getIndice() > emple2.getIndice()) {

                   // intercambiarNodos();
                }

                emple2 = emple2.getSiguiente();
            }

            emple1 = emple1.getSiguiente();
            emple2 = emple1.getSiguiente();

        }

        return true;

    }*/
    // METODO PARA ORDENAR POR NUMERO EMPLEADO
    public void ordenarPorNumeroEmpleado() {
        Nodo<E> empleado1, empleado2;
        boolean cambios;

        do {
            cambios = false;  // booleano
            empleado1 = inicio;

            while (empleado1 != null && empleado1.getSiguiente() != null) {
                empleado2 = empleado1.getSiguiente();

                if (((Empleado) empleado1.getPrincipal()).getNumeroEmple() > ((Empleado) empleado2.getPrincipal()).getNumeroEmple()) {
                    intercambiarNodos(empleado1, empleado2);
                    cambios = true;
                }
                empleado1 = empleado1.getSiguiente();
            }
        } while (cambios);
    }
    // METODO PARA INTERCAMBIAR UN NODO POR OTRO

    private void intercambiarNodos(Nodo<E> nodo1, Nodo<E> nodo2) {
        E temporal = nodo1.getPrincipal();
        nodo1.setPrincipall(nodo2.getPrincipal());
        nodo2.setPrincipall(temporal);
    }

    public void mostrarLista() {
        actual = inicio;
        System.out.println("****LIST FIRST TO LAST****");
        Nodo<E> temporal = this.inicio;
        while (temporal != null) {
            // cuando llamas a imprimir el objeto, directamente te enseña el toString()
            System.out.println(temporal.getPrincipal());
            temporal = temporal.getSiguiente();
        }
    }

    public void mostrarListaReverse() {
        System.out.println("****LIST IN REVERSE****");
        Nodo<E> temporal = this.fin;
        while (temporal != null) {
            // cuando llamas a imprimir el objeto, directamente te enseña el toString()
            System.out.println(temporal.getPrincipal());
            temporal = temporal.getAnterior();
        }
    }

    /*public void BorrarNodo(E emple){

        Nodo<E> temporal = this.inicio;
        while (temporal != null) {
            //System.out.println(temp.getMain()+"  "+p);
            if (temporal.getPrincipal() == emple) {
                Nodo<E> auxDerecha = temporal.getSiguiente();
                Nodo<E> auxIzquierda = temporal.getAnterior();

                if (auxDerecha != null) {
                    auxIzquierda.setSiguiente(auxDerecha);
                } else {
                    this.inicio = auxDerecha;
                }
                if (auxDerecha != null) {
                    auxDerecha.setAnterior(auxIzquierda);
                }

                if (this.actual.esPrimero()) {
                    this.actual = auxDerecha;
                } else {
                    this.actual = auxIzquierda;
                }

                break;
            }
            temporal = temporal.getSiguiente();
        }
        contador--;
    }*/

 /*public void borrarTodo() {
        this.contador = 0;
        this.fin = null;
        this.inicio = null;
        this.actual = null;
    }*/

 /*public void modificar(E nodeToModify,E newData){  // new data para añador nuevos datos en textfield
        Nodo<E> temporal = this.inicio;
        while (temporal != null){
            if(temporal.getPrincipal()== nodeToModify){
                temporal.setPrincipall(newData);
                break;
            }
            temporal=temporal.getSiguiente();
        }
    }*/
    public E visualizarActual() {

        return this.actual.getPrincipal();

    }

   /* public void GuardarLista(Lista listaEmpleados) {

        try ( FileOutputStream fichero = new FileOutputStream("Empleados.ser");  ObjectOutputStream tuberia = new ObjectOutputStream(fichero)) {
            // Escribe la lista de empleados en el archivo
            tuberia.writeObject(listaEmpleados.getActual());
            System.out.println("Lista de empleados guardada correctamente en Empleados.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    public Lista getListaEmpleados(Lista listaEmpleados) {
        return listaEmpleados;
    }

    //PARA GUARDAR ARCHIVO EMPLEADOS
    public void serialization(Lista listaEmpleados) {

        try {
            FileOutputStream fileOut = new FileOutputStream("ListaEmpleadosSerializada.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            Nodo aux = this.inicio;

            while (aux != null) {

                out.writeObject(aux.getPrincipal());
                aux = aux.getSiguiente();
            }
            System.out.println("Lista de empleados guardada correctamente en la Raiz");
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //PARA CARGAR ARCHIVO EMPLEADOS
    public Lista cargarListaDesdeArchivo(String nombreArchivo) {
        Lista lista = null;
        
        try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            lista = (Lista) entrada.readObject();
            System.out.println("Lista cargada desde " + nombreArchivo + " correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la lista desde el archivo: " + e.getMessage());
        }
        return lista;
    }

    public E avanzar() {

        actual = actual.getSiguiente();

        return (E) this.actual.getSiguiente();

    }

    public E visualizarAnterior() {
        if (this.actual == null || this.actual.getAnterior() == null) {
            return null; // No hay empleado anterior
        } else {
            this.actual = this.actual.getAnterior();
            if (this.actual != null) {
                return this.actual.getPrincipal();
            } else {
                return null; // El nodo actual se ha vuelto nulo
            }
        }
    }

    public Nodo<E> getFin() {
        return fin;
    }

    public Nodo<E> getInicio() {
        return inicio;
    }

    public Nodo<E> getActual() {
        return actual;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int cont) {
        this.contador = contador;
    }

    // INNER CLASS por eso es privada
    //-----------------------------------------------------------------//
    public class Nodo<E> implements Serializable {  //------------------------------- hace falta serializable????

        private Nodo<E> siguiente;  // atributo para movernos al siguiente nodo.
        private Nodo<E> anterior;  // atributo para movernos al nodo anterior.
        private int indice;

        E principal;  // atributo para saber que empleado es el empleado actual

        public Nodo(E emple) {

            this.siguiente = null;
            this.anterior = null;
            this.principal = emple;
            Empleado aux = (Empleado) new Empleado();
            this.indice = aux.getNumeroEmple();

        }

        public Nodo<E> getSiguiente() {
            return this.siguiente;
        }

        public void setSiguiente(Nodo<E> fin) {
            this.siguiente = fin;
        }

        public E getPrincipal() {
            return principal;
        }

        public void setPrincipall(E emple) {
            this.principal = emple;
        }

        public Nodo<E> getAnterior() {
            return this.anterior;
        }

        public void setAnterior(Nodo<E> inicio) {
            this.anterior = inicio;
        }

        public boolean esPrimero() {
            if (this.anterior == null) {
                return true;
            } else {
                return false;
            }
        }

        public boolean esUltimo() {
            if (this.siguiente == null) {
                return true;
            } else {
                return false;
            }
        }

        public int getIndice() {
            return indice;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }

    }

}
