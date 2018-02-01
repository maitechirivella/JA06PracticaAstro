/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06practica1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TestAstro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String infoAstro,modoOb;
        int opcion,masBrillante;
        String nombre;
        double brillo,distancia;
        int tipo;
        Astro astro1=new Astro();
        Astro astro2=new Astro();
        do {
            imprimirMenu();
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    astro1.setNombre("Alfa Centauri");
                    astro1.setTipo(0);
                    astro1.setBrillo(4.6);
                    astro1.setDistancia(4.3);
                    infoAstro=astro1.aString();
                    System.out.println(infoAstro);
                    break;
                case 2:
                    System.out.println("Introduce nombre del Astro:");
                    nombre=teclado.nextLine();
                    System.out.println("Introduce el tipo de Astro: Estrella=0,Nebulosa=1,Galaxia=2");
                    tipo=teclado.nextInt();
                    System.out.println("Introduce el brillo");
                    brillo=teclado.nextDouble();
                    System.out.println("Introduce distancia");
                    distancia=teclado.nextDouble();
                    astro2.setNombre(nombre);
                    astro2.setTipo(tipo);
                    astro2.setBrillo(brillo);
                    astro2.setDistancia(distancia);
                    infoAstro=astro2.aString();
                    System.out.println(infoAstro);
                    modoOb=astro2.visibleCon();
                    System.out.println("Se observa "+modoOb);
                    break;
                case 3:
                    masBrillante=astro1.masBrillante(astro2);
                    if(masBrillante==1)
                        System.out.println("El astro Alfa Centauri es mas brillante que el Astro "+astro2.getNombre());
                    else{
                        if(masBrillante==-1)
                            System.out.println("El astro Alfa Centauri es menos brillante que el Astro "+astro2.getNombre());
                        else
                            System.out.println("Son igual de brillantes los dos Astros");
                    }
                        break;
                case 4:
                    System.out.println("Fin del programa!");
                    break;
                default:
                    System.out.println("Porfavor introduzca una opcion valida");
                    break;
            }
        } while (opcion!=4);
    }
    public static void imprimirMenu(){
        System.out.println("1. Crear el Astro 'Alfa Centauri'");
        System.out.println("2. Crear un Astro y mostrar el modo de observación");
        System.out.println("3. Mostrar el astro mas brillante de los dos anteriores");
        System.out.println("4. Salir");
    }
}
