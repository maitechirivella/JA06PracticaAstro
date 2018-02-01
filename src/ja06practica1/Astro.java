/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06practica1;

/**
 *
 * @author usuario
 */
public class Astro {
    private String nombre;
    private int tipo;
    private double brillo;
    private double distancia;
    
    public Astro (){
        this.nombre = "Sirius";
        this.tipo = 0;
        this.brillo = -1.42;
        this.distancia = 8.7;
    }

    public Astro(String nombre, int tipo, double brillo, double distancia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.brillo = brillo;
        this.distancia = distancia;
    }
    //consulta todos los datos de el Astro
    
    /*Metodo que devuelve un String con el total de los parametros del Astro
    *con este formato nombre: tipo(brillo,distancia)
    *@return @param resultado (String resultante)
    *@param tp (tipo) transformado en String
    *@param b (brillo redondeado)
    *@param d (distancia redondeado)
    */
    public String aString(){
        String resultado="";
        String tp="";//tipo
        double b=redondear(this.brillo);
        double d=redondear(this.distancia);
        switch(this.tipo){
            case 0: 
                tp="Estrella";
                break;
            case 1:
                tp="Nebulosa";
                break;
            case 2:
                tp="Galaxia";
                break;
        }
        resultado=this.nombre+": "+tp+" ("+b+", "+d+")";
        return resultado;
    }

    public void setBrillo(double brillo) {
        this.brillo = brillo;
    }
    public double redondear(double numero){
      return Math.floor(numero*100)/100;
    }
    public void consultaBrillo(){
        System.out.println(this.brillo);
    }
    public void modificaBrillo(){
        this.brillo = brillo;
    }
    //si son iguales dos astros
    public boolean equals(Astro a1){
        if(this.nombre.equals(a1.nombre)&&this.tipo==a1.tipo&&this.brillo==a1.brillo&&this.distancia==a1.distancia)
            return true;
        else
            return false;
    }
    //
    public double magnitudAbsoluta(){
        double m;
        double logd= Math.log10(this.distancia);
        m=this.brillo+(5*logd);
        return m;
    }
    /*
    *Se compara si el Astro actual es mas brillante en magnitud absoluta que un astro dado
    *@param Astro a (astro actual)
    *@param Astro a1 (astro dado)
    *@param brilloM (brillo en magnitud absoluta del Astro actual)
    *@param brilloM1(brillo en magnitud absoluta del Astro dado)
    *@return si a es mayor que a1 devuelve 1
    *@return si a es menor que a1 devuelve -1
    *@return si son iguales devuelve 0
    */
    public int masBrillante(Astro a1){
        Astro a=new Astro(this.nombre,this.tipo,this.brillo,this.distancia);
        double brilloM=a.magnitudAbsoluta();
        double brilloM1=a1.magnitudAbsoluta();
        if(brilloM>=brilloM1){
            if(brilloM>brilloM1)
                return 1;
            else
                return 0;
        }else
            return -1;
    }
    public String visibleCon(){
        String observado="";
        if(this.brillo<7){
            if(this.brillo<5)
                observado="a simple vista";
            else
                observado="con prismáticos";
        }else{
            if(this.brillo<=25)
                observado="con telescopio";
            else
                observado="con grandes telescopios";
        }
        
        return observado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getBrillo() {
        return brillo;
    }


    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
    
    
}
