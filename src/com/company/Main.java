package com.company;
import  java.time.LocalDateTime ;
import  java.time.format.DateTimeFormatter ;
import java.util.*;

public class Main {
    public static String horaPedido() {
        String formato = "HH:mm";
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern(formato);
        LocalDateTime horaActual = LocalDateTime.now();
        return formateo.format(horaActual);
    }
    public static void main(String[] args) {

            String inputContraseña, inputUsuario, orden=" ", numOden= " ",local= " ", price=" ", repartidor="";
            Scanner sc = new Scanner(System.in);

            Username usuario1 = new Username("Keisy Morales", "2001");
            Order Pizza=new Order("0001","Pizza", "PizzaHut", "10.00","Javier Gomez");
            Order tacos=new Order("0002","TACOS", "Taco Bell", "8.00", "Marcos Gonzalez");
            Order hamburguesa =new Order("0002","Hamburguesa", "Burger King", "7.95", "Tomas Fuentes");

            System.out.println("\n Bienvenido al Sistema \n Ingrese su usuario");
            inputUsuario = sc.nextLine();
            System.out.println("\n Ingrese su contraseña");
            inputContraseña = sc.nextLine();

            System.out.println("\n Usuario: " + inputUsuario);
            System.out.println("\n contraseña: " + inputContraseña);

            if (inputUsuario.contains(usuario1.getNombre_usuario()) && inputContraseña.contains(usuario1.getPassword())) {
                System.out.println("Bienvenido" + " " + usuario1.getNombre_usuario());
            } else {
                System.out.println("\n Datos incorrectos, intentelo de nuevo");
            }

            int n;
            do {

                System.out.println(
                        "\n Menu\n 1 Cambiar la contraseña \n 2 Llenar información \n 3 Pedido \n 4 Salir \n");
                n = sc.nextInt();
                sc.nextLine();

                switch (n) {

                    case 1:
                        System.out.println("\n Ingrese su nueva contraseña: ");
                        usuario1.setPassword(sc.nextLine());
                        System.out.println("\n  Su nueva contraseña es: " + usuario1.getPassword());
                        break;

                    case 2:
                        System.out.println("\n Ingrese sus datos");
                        System.out.println("\n Ingrese su direccion");
                        usuario1.setDireccion(sc.nextLine());
                        System.out.println("\n Ingrese su Telefono");
                        usuario1.setTelefono(sc.nextLine());
                        System.out.println("\n Ingrese su DNI");
                        usuario1.setDNI(sc.nextLine());
                        System.out.println("\n Ingrese su nacionalidad");
                        usuario1.setNacionalidad(sc.nextLine());
                        break;

                    case 3:

                        int o = 0;
                            System.out.println("INGRESE 1 PARA PIZZA , INGRESE 2 PARA TACOS, INGRESE 3 PARA HAMBURGUESA ");
                         o=sc.nextInt();
                        sc.nextLine();

                        if (o==1){
                            numOden= Pizza.getOrderNumber();
                            orden= Pizza.getArticulo();
                            local= Pizza.getLocal();
                            price= Pizza.getPrice();
                            repartidor= Pizza.getRepartidor();
                        }
                        else if(o==2){
                            numOden = tacos.getOrderNumber();
                            orden= tacos.getArticulo();
                            local= tacos.getLocal();
                            price= tacos.getPrice();
                            repartidor= tacos.getRepartidor();

                        }
                        else if(o==3){
                            numOden= hamburguesa.getOrderNumber();
                            orden= hamburguesa.getArticulo();
                            local= hamburguesa.getLocal();
                            price= hamburguesa.getPrice();
                            repartidor= hamburguesa.getRepartidor();
                        }
                        break;
                    case 4:
                            System.out.println( usuario1.getNombre_usuario()+ " "+ " \n Orden #"+numOden+ "\n Su pedido: "+orden+ " "+ "\n Al local: "+local+
                            "\n Por un precio de: "+price+        "\n Se ha realizado a la hora: "+ " "+horaPedido()+ " "+
                                    "\n Su delivery va en camino, a cargo del repartidor: "+repartidor+ "\n Gracias por su compra");
                            break;
                    default:
                        System.out.println("Ingrese un valor válido");
                        break;
                }        
                
            } while ( n!=4);
        }

}
