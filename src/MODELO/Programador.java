/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import static MODELO.IFecha.AÑO;
import static MODELO.IFecha.DIA_DEL_MES;
import static MODELO.IFecha.MES_DEL_AÑO;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Rodri
 */
public class Programador extends Empleado implements IFecha{

    private double SueldoExtraMensual;
    private String Genero;

    public Programador(int numeroEmple,double SueldoExtraMensual, String Genero, String Nombre, double Sueldo, double SueldoMax, GregorianCalendar FechaAlta) throws ESaldoNoValido {
        super(numeroEmple,Nombre, Sueldo, SueldoMax, FechaAlta);
        this.SueldoExtraMensual = SueldoExtraMensual;
        this.Genero = Genero;
    }
    
     
     
     public Programador(int numeroEmple,String Nombre, String Genero,double Sueldo, double SueldoExtraMensual, double SueldoMax) throws ESaldoNoValido {
        super(numeroEmple,Nombre, Sueldo, SueldoMax);
        this.SueldoExtraMensual = SueldoExtraMensual;
        this.Genero = Genero;
    }
    
    

    public double getSueldoExtraMensual() {
        return SueldoExtraMensual;
    }

    public void setSueldoExtraMensual(double SueldoExtraMensual) {
        this.SueldoExtraMensual = SueldoExtraMensual;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    @Override
    public String toString() {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formato.format(FechaAlta.getTime());
        return "Programador{" +"Numero Empleado=" + numeroEmple + ", Nombre=" + Nombre + ", Sueldo=" + Sueldo + ", SueldoMax="  + SueldoMax + ", FechaAlta=" + fechaFormateada + ", SueldoExtraMensual=" + SueldoExtraMensual + ", Genero=" + Genero + '}';
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
