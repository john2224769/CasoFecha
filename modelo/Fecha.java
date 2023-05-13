package modelo;

public class Fecha
{
    // Atributos 

    private int  dia, mes, anio;

    // Metodos 

    public Fecha ()
    {

    }

    public Fecha (String fecha)
    {
        int pos1 = fecha.indexOf('/');

        int pos2= fecha.lastIndexOf('/');

        String sDia = fecha.substring(0, pos1);
        dia= Integer.parseInt(sDia);

        String sMes = fecha.substring(pos1 +1, pos2);
        mes= Integer.parseInt(sMes);

        String sAnio= fecha.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);



    }

    public Fecha (int pDia, int pMes, int pAnio)
    {
        this.dia=pDia;
        this.mes=pMes;
        this.anio=pAnio;
    }

    public int getDia() 
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getMes() 
    {
        return mes;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public String toString()
    {
        return dia+"/"+mes+"/"+anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

}