/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import static MODELO.IFecha.AÑO;
import static MODELO.IFecha.DIA_DEL_MES;
import static MODELO.IFecha.MES_DEL_AÑO;
import java.util.GregorianCalendar;

import java.util.GregorianCalendar;

/**
 *
 * @author Rodri
 */
public class Analista extends Empleado implements IFecha {

    private double plusAnual;
    private int AñosTrabajados;

    public Analista(int numeroEmple, double plusAnual, int AñosTrabajados, String Nombre, double Sueldo, double SueldoMax, GregorianCalendar FechaAlta) throws ESaldoNoValido {
        super(numeroEmple, Nombre, Sueldo, SueldoMax, FechaAlta);
        this.plusAnual = plusAnual;
        this.AñosTrabajados = AñosTrabajados;
    }

    /*public Analista(int numeroEmple, double plusAnual, int AñosTrabajados, String Nombre, double Sueldo, double SueldoMax) throws ESaldoNoValido {
        super(numeroEmple, Nombre, Sueldo, SueldoMax);
        this.plusAnual = plusAnual;
        this.AñosTrabajados = AñosTrabajados;
    }*/
    public Analista(int numeroEmple, String Nombre, int AñosTrabajados, double Sueldo, double PlusAnual, double SueldoMax) throws ESaldoNoValido {
        super(numeroEmple, Nombre, Sueldo, SueldoMax);
        this.plusAnual = plusAnual;
        this.AñosTrabajados = AñosTrabajados;
    }

    public double getPlusAnual() {
        return plusAnual;
    }

    public void setPlusAnual(double plusAnual) {
        this.plusAnual = plusAnual;
    }

    public int getAñosTrabajados() {
        return AñosTrabajados;
    }

    public void setAñosTrabajados(int AñosTrabajados) {
        this.AñosTrabajados = AñosTrabajados;
    }

    @Override
    public String toString() {
        return "Analista{" + "Nombre=" + Nombre + ", Sueldo=" + Sueldo + ", SueldoMax=" + SueldoMax + ", FechaAlta=" + FechaAlta + ", Plus Anual=" + plusAnual + ", Años Trabajados=" + AñosTrabajados + '}';
    }

    @Override
    public int día() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(DIA_DEL_MES);
    }

    @Override
    public int mes() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(MES_DEL_AÑO) + 1;
    }

    @Override
    public int año() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(AÑO);
    }
}
