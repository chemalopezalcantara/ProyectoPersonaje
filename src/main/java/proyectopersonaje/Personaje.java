/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersonaje;

import java.util.Scanner;
/**
 *
 * @author Víctor Navarro Sánchez
 * Tema 3 Programación
 */
public class Personaje {
    //constantes para controlar el número máximo de algunas caracteristicas de los personajes
    
    final int MAX_FUERZA = 100;
    final int MAX_INTELIGENCIA = 100;
    
    //variable estatica que se ira incrementado con la creación de cada personaje.
    
    static int numeroPersonajes;
    
    //atributos de los personajes
    String nombre;
    int edad;
    int altura;
    int inteligencia;
    int fuerza;
    
    String consultaNombre(){
        return this.nombre;
    }
    void cambiaNombre(String nombre){
        this.nombre=nombre;
    }
    
    int consultarEdad(){
        return this.edad;
    }
    void cambiarEdad(int edad){
        this.edad=edad;
    }
    int consultarAltura(){
        return this.altura;
    }
    void cambiarAltura(int altura){
        this.altura=altura;
    }
    int consultarInteligencia(){
        return this.inteligencia;
    }
    void cambiarInteligencia(int inteligencia){
        this.inteligencia=inteligencia;
    }
    int consultarFuerza(){
        return this.fuerza;
    }
    void cambiarFuerza(int fuerza){
        this.fuerza=fuerza;
    }
    
    

    //constructor con datos por defecto:
    public Personaje(){
      this.nombre = "Desconocido";
       this.edad = 0;
       this.altura = 0;
       this.inteligencia = 0;
       this.fuerza = 0;
       numeroPersonajes += 1;
    }
    
    //constructor con parametros:
    public Personaje(String nombre, int edad, int altura, int inteligencia, int fuerza) {
      this.nombre = nombre;
       this.edad = edad;
       this.altura = altura;
       this.inteligencia = inteligencia;
       this.fuerza = fuerza;
       numeroPersonajes += 1;
    }
    
    
    //metodos: 
    
    
    //metodo toString:

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", inteligencia=" + inteligencia + ", fuerza=" + fuerza + '}';
    }
    
    //metodo sumarFuerza:
    public int sumarFuerza (Personaje p){
        int sumaFuerzas;
        
        sumaFuerzas = this.fuerza + p.fuerza;
        
        return sumaFuerzas;
    }
    
    
    
    
    public static void main(String[] args){
        //instanciamos un objeto de la clase scanner para poder pedir datos al usario
        Scanner sc = new Scanner(System.in);
        
        //recogemos todos los datos y los almacenmaos
        System.out.println("Introduce el nombre del personaje:");
        String strNombre = sc.nextLine();
        System.out.println("Introduce la edad del personaje:");
        int intEdad = sc.nextInt();
        System.out.println("Introduce la altura del personaje:");
        int intAltura = sc.nextInt();
        System.out.println("Introduce la inteligencia del personaje:");
        int intInteligencia = sc.nextInt();
        System.out.println("Introduce la fuerza del personaje:");
        int intFuerza = sc.nextInt();
        
        
        //instanciamos un objeto de la clase personaje con los atribuso de que acabamos de pedir al usuario
        Personaje p1 = new Personaje();
        
        //pasamos como parametros los datos que hemos pedido al usuario
        p1.cambiaNombre(strNombre);
        p1.cambiarEdad(intEdad);
        p1.cambiarAltura(intAltura);
        p1.cambiarInteligencia(intInteligencia);
        p1.cambiarFuerza(intFuerza);
        
        //imprimos todos los datos
        System.out.println("los datos introducidos por el usuario son: ");
        System.out.println(p1.consultaNombre());
        System.out.println(p1.consultarEdad());
        System.out.println(p1.consultarAltura());
        System.out.println(p1.consultarInteligencia());
        System.out.println(p1.consultarFuerza());
        

        
        //datos con el constructor por defecto
        Personaje p2 = new Personaje();
        
        //pedimos los valores del personaje 2:
        System.out.println(" ");
        System.out.println("datos del personaje 2:");
        System.out.println(p2.consultaNombre());
        System.out.println(p2.consultarEdad());
        System.out.println(p2.consultarAltura());
        System.out.println(p2.consultarInteligencia());
        System.out.println(p2.consultarFuerza());
        
        
        //objeto con parametros para el nuevo constructor con parametros.
        
        Personaje p3 = new Personaje("frodo", 33, 126, 98, 38);
        //pedimos los valores del personaje 2:
        System.out.println(" ");
        System.out.println("datos del personaje 3:");
        System.out.println(p3.consultaNombre());
        System.out.println(p3.consultarEdad());
        System.out.println(p3.consultarAltura());
        System.out.println(p3.consultarInteligencia());
        System.out.println(p3.consultarFuerza());
        
        
        
        //muestra de datos usando metodo toString:
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        
        //metodo de suma de fuerzas:
        System.out.println(" ");
        System.out.println("La suma de las fuerzas de " + p1.consultaNombre() +  " y de " + p3.consultaNombre() + " es: " + p1.sumarFuerza(p3));
        System.out.println(" ");
        
        
        //ejercicio 7:
       // A continuación, desde el main, crea otro objeto de tipo Personaje utilizando el primer constructor, para posteriormente mostrar el contenido de los atributos por pantalla, pero ahora utilizando el toString() creado. Se visualizaría así:
       Personaje p4 = new Personaje();
       System.out.println(p4.toString());
       
       Personaje p5 = new Personaje("frodo", 33, 126, 98, 38); 
       Personaje p6 = new Personaje("Aragorn", 45, 185, 88, 92); 
       Personaje p7 = new Personaje("Legolas", 2931, 178, 93, 84); 
        
       
       //muestra los datos de los personajes después de crearlos utiliando el toString().
       System.out.println(p5.toString());
       System.out.println(p6.toString());
       System.out.println(p7.toString());
       
       //ahora cambia varias de sus propiedades...
       p5.cambiaNombre("HOMER SIMPSON");
       p6.cambiarEdad(80);
       p7.cambiarInteligencia(100);
       
       //vuelve a mostrar los datos:
       System.out.println(p5.toString());
       System.out.println(p6.toString());
       System.out.println(p7.toString());
       
       
       //crea un nuevo personaje y muestra sus datos con toString
       Personaje p8 = new Personaje("paco pepe", 50, 100, 150, 200);
       System.out.println(p8.toString());
       
       //cambia los datos y muestralo:
       
       p8.cambiarEdad(90);
       p8.cambiaNombre("PEPE PACO");
       System.out.println(p8.toString());
       
       // Cada vez que se crea un Personaje, puedes almacenarlos en diferentes variables ( objetos).
       System.out.println("el numero de personajes es: " + Personaje.numeroPersonajes);
       
       //muestra por pantalla la suma de las fuerzas...
       System.out.println("la suma de la fuerza de Frodo y legolas es: " + p5.sumarFuerza(p7));
       
       //muestra el contenido de max_fuerza:
       System.out.println("el valor de la constante MAX_FUERZA es: " + p8.MAX_FUERZA); 
       
       
}//final del metodo principal

    
} //final de la clase personaje

