package modelo;

/**
 *
 * @author npaez
 */
public class FechaDetallada extends Fecha
{
    //-------------
    //Atributos
    //-------------
    private static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    //-------------
    //Metodos
    //-------------
    
    //Constructor nulo
    public FechaDetallada()
    {
        super();
    }
    
    public FechaDetallada(int pDia, int pMes, int pAnio)
    {
        super(pDia, pMes, pAnio);
    }
    
    public String toString()
    {
        return getDia() + " de " + meses[getMes()-1] + " de " + getAnio();
    }
}