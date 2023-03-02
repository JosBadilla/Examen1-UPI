
package josephbadillaexamen1;

import java.util.Scanner;


public class JosephBadillaExamen1 {

    
     static Scanner sc = new Scanner(System.in);
            
    static String[] precioEntrada = new String[10];
    static String[] cantidadEntradas = new String[10];
    static String[] compradorEntrada = new String[10];
     static String[] localidaD = new String[10];
    static int numComprador = 0;
    static String[] cedulaD = new String[10];
   
   
    public static void main(String[] args) {
        
         int opcion = 0;

        do {
            MenuPrincipal();
            opcion = sc.nextInt();
            inicializarMenuPrincipal(opcion);
        } while (opcion != 7);

        sc.close();
        
      }
    
    static void MenuPrincipal() {
        System.out.println("-------Menú Principal-------");
        System.out.println("1. Comprar entrada Sol Norte/Sur.");
        System.out.println("2. Comprar entrada Sombra Este/Oeste.");
        System.out.println("3. Comprar entrada Preferencial.");
        System.out.println("4. Factura.");
        System.out.println("5. Salir.");
        System.out.print("Seleccione una opción: ");
    
        }
    
    static void inicializarMenuPrincipal(int opcion) {

        switch (opcion) {
            case 1:
                ComprarEntradaSolNorteSur();
                break;
            case 2:
                ComprarEntradaSombraEsteOeste();
                break;
            case 3:
                ComprarEntradaPreferencial();
                break;
            case 4:
               Factura();
                break;
            case 5:
                System.out.println("Gracias por utilizar el programa.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
       }
    
    
    static void ComprarEntradaSolNorteSur() {
        if (numComprador >= 10) {
            System.out.println("No se pueden incluir más entradas.");
            return;
        }

         System.out.print("Ingrese el nombre del comprador: ");
        String comprador = sc.next();
         System.out.print("Ingrese su cédula: ");
        String cedula = sc.next();
        System.out.print("Ingrese la cantidad de entradas que desea: ");
        String cantidadentradas = sc.next();
         System.out.print("Ingrese la localidad que desea: ");
        String localidad = sc.next();
        System.out.print("Digite el valor real de su entrada para realizar la compra: ");
        String precio = sc.next();
        compradorEntrada[numComprador] = cantidadentradas;
        cantidadEntradas[numComprador] = comprador;
        precioEntrada[numComprador] = precio;
        cedulaD[numComprador] = cedula;
        localidaD[numComprador] = localidad;
        numComprador++;
   
        System.out.println("Compra realizada con exito.");
    }
    static void ComprarEntradaSombraEsteOeste() {
        if (numComprador >= 10) {
            System.out.println("No se pueden incluir más entradas.");
            return;
        }

         System.out.print("Ingrese el nombre del comprador: ");
        String comprador = sc.next();
        System.out.print("Ingrese su cédula: ");
        String cedula = sc.next();
        System.out.print("Ingrese la cantidad de entradas que desea: ");
        String cantidadentradas = sc.next();
         System.out.print("Ingrese la localidad que desea: ");
        String localidad = sc.next();
        System.out.print("Digite el valor real de su entrada para realizar la compra: ");
        String precio = sc.next();
        compradorEntrada[numComprador] = cantidadentradas;
        cantidadEntradas[numComprador] = comprador;
        precioEntrada[numComprador] = precio;
        cedulaD[numComprador] = cedula;
        localidaD[numComprador] = localidad;
        numComprador++;
   
        System.out.println("Compra realizada con exito.");
    
         } 
   
    static void ComprarEntradaPreferencial() {
        if (numComprador >= 10) {
            System.out.println("No se pueden incluir más entradas.");
            return;
        }

         System.out.print("Ingrese el nombre del comprador: ");
        String comprador = sc.next();
        System.out.print("Ingrese su cédula: ");
        String cedula = sc.next();
        System.out.print("Ingrese la cantidad de entradas que desea: ");
        String cantidadentradas = sc.next();
        System.out.print("Ingrese la localidad que desea: ");
        String localidad = sc.next();
        System.out.print("Digite el valor real de su entrada para realizar la compra: ");
        String precio = sc.next();
        compradorEntrada[numComprador] = cantidadentradas;
        cantidadEntradas[numComprador] = comprador;
        precioEntrada[numComprador] = precio;
        cedulaD[numComprador] = cedula;
        localidaD[numComprador] = localidad;
        numComprador++;
   
        System.out.println("Compra realizada con exito.");
    
    
      } 
     static void Factura() {
        System.out.println("-------Reporte Todos los datos-------");
        for (int i = 0; i < numComprador; i++) {
            float factura;
            factura = 5236356;
            float servicioS;
            servicioS = 1000;
            System.out.println("Numero de Factura: " + factura);
            System.out.println("Nombre: " + cantidadEntradas[i]);
            System.out.println("Cedula: " + cedulaD[i]);
            System.out.println("Cantidad de entradas: " + compradorEntrada[i]);
            System.out.println("Localidad: " + localidaD[i]);
            System.out.println("Precio de cada una de las entradas: " + precioEntrada);
            System.out.println("Cargos por servicio: " + servicioS);
            System.out.println("Cargos por servicio: " + servicioS + precioEntrada);
            System.out.println("-------------------------");
           
 }
 }        

   }

     

 

