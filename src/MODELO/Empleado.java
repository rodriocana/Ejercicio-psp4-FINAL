/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Rodri
 */
public class Empleado implements Serializable {

    int numeroEmple = 0;
    transient String Nombre;
    double Sueldo;
    double SueldoMax;
    GregorianCalendar FechaAlta;

    public Empleado(int numeroEmple, String Nombre, double Sueldo, double SueldoMax, GregorianCalendar FechaAlta) throws ESaldoNoValido {

        this.numeroEmple = numeroEmple;
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
        this.SueldoMax = SueldoMax;
        this.FechaAlta = new GregorianCalendar();

        // AQUI CREAMOS UNA EXCEPCION DENTRO DEL CONSTRUCTOR
        if (Sueldo > SueldoMax) {

            throw new ESaldoNoValido("Error!!!!!. Sueldo mayor que sueldo máximo");

        }
    }

    public Empleado(int numeroEmple, String Nombre, double Sueldo, double SueldoMax) throws ESaldoNoValido {

        this.numeroEmple = numeroEmple;
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
        this.SueldoMax = SueldoMax;
        this.FechaAlta = new GregorianCalendar();
        //FechaAlta.
        this.numeroEmple = numeroEmple++;

        // AQUI CREAMOS UNA EXCEPCION DENTRO DEL CONSTRUCTOR
        if (Sueldo > SueldoMax) {

            throw new ESaldoNoValido("Error!!!!!. Sueldo mayor que sueldo máximo");

        }

    }

    public Empleado() {

    }

    public int getNumeroEmple() {
        return numeroEmple;
    }

    public void setNumeroEmple(int numeroEmple) {
        this.numeroEmple = numeroEmple;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) throws ESaldoNoValido {

        if (Sueldo > SueldoMax) {

            throw new ESaldoNoValido("Error!!!!. Sueldo mayor que sueldo máximo");
        }
        this.Sueldo = Sueldo;
    }

    public double getSueldoMax() {
        return SueldoMax;
    }

    public void setSueldoMax(double SueldoMax) throws ESaldoNoValido {

        if (Sueldo > SueldoMax) {

            throw new ESaldoNoValido("Error!!!. Sueldo mayor sueldo máximo");
        }
        this.SueldoMax = SueldoMax;
    }

    public GregorianCalendar getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(GregorianCalendar Fecha) {
        this.FechaAlta = Fecha;
    }

    
    @Override
    public String toString() {
        
        
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFormateada = formato.format(FechaAlta.getTime());

        return "Empleado{ " + "NumeroEmpleado=" + numeroEmple + " , Nombre=" + Nombre + ", Sueldo=" + Sueldo + ", SueldoMax=" + SueldoMax + ", FechaAlta=" + fechaFormateada + '}';
    }

}
