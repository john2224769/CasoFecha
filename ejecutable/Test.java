package ejecutable;

import modelo.Fecha;

public class Test
{
    public static void main(String[] args) 
    {
        Fecha f1 = new Fecha(11,5,2023);
        f1.setDia(11);
        f1.setMes(5);
        f1.setAnio(2023);

        Fecha f2 = new Fecha(11,5,2023);
        f2.setDia(11);
        f2.setMes(5);
        f2.setAnio(2023);

        String S="Sistemas UIS Socorro";
        int pos1= S.indexOf("U", 0);
        int pos2= S.indexOf('U',0);
        Fecha f3 = new Fecha("12/05/20203");


        System.out.println("Dia: "+f1.getDia());
        System.out.println("Mes: "+f1.getMes());
        System.out.println("Año: "+f1.getAnio());
        System.out.println(f1+"\n");

        System.out.println("Dia: "+f2.getDia());
        System.out.println("Mes: "+f2.getMes());
        System.out.println("Año: "+f2.getAnio());
        System.out.println(f2+"\n");

        System.out.println(pos1);
        System.out.println(pos2+"\n");

        System.out.println("Dia: "+f3.getDia());
        System.out.println("Mes: "+f3.getMes());
        System.out.println("Año: "+f3.getAnio());
        System.out.println(f3+"\n");

        System.out.println(f1.equals(f2) ? "Las fechas son iguales" : "Las fechas son distintas");
    }
}