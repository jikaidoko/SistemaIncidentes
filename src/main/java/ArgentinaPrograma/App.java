package ArgentinaPrograma;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        int opc0 = -1;
        int opc1 = -1;
        Scanner sc = new Scanner(System.in);

        //Datos de mesa de ayuda
        String razonSocial;
        int cuit;
        int idCliente;
        String descProblema;
        int idProblema;
        int idTecnico;

        while(opc0 != 0){
            System.out.println("Sistema de Reportes de Incidentes");
            System.out.println("Seleccione el área al que pertenece:");
            System.out.println("0- Finalizar");
            System.out.println("1- Mesa de ayuda");
            System.out.println("2- RRHH");
            System.out.println("3- Comercial");

            opc0 = sc.nextInt();

            if(opc0 == 1){
                while(opc1 != 2) {
                    System.out.println("Registrar nuevo incidente?");
                    System.out.println("1- Si");
                    System.out.println("2- No");

                    opc1 = sc.nextInt();

                    if(opc1 == 1){

                        /*
                            Cuando un cliente llama, la mesa de ayuda le solicita los datos para identificarlo (razón social,
                            CUIT) y los ingresa en el sistema para que el mismo le muestre los servicios que el cliente
                            tiene contratados
                        */

                        System.out.print("Ingrese razón social: ");
                        razonSocial = sc.nextLine();

                        System.out.print("Ingrese CUIT: ");
                        cuit = sc.nextInt();

                        // Con los datos anteriores se visualiza los servicios contradados por el Cliente

                        /*
                            El operador (de la mesa de ayuda) solicita que le informen por cuál de esos servicios desea
                            reportar un incidente, junto con una descripción del problema y el tipo del problema.
                         */

                        System.out.print("Ingrese ID del servicio solicitado por el Cliente: ");
                        idCliente = sc.nextInt();

                        System.out.print("Ingrese descripción del problema: ");
                        descProblema = sc.nextLine();

                        System.out.print("Ingrese ID del problema: ");
                        idProblema = sc.nextInt();

                        // el sistema devuelve un listado de técnicos disponibles para resolver el problema

                        System.out.print("Seleccionar técnico: ");
                        idTecnico = sc.nextInt();

                        //Luego, informa al cliente que el incidente ha sido ingresado y la fecha posible de resolución.

                        /*
                            Al confirmarse el incidente, el sistema debe enviar una notificación al técnico informándole
                            que tiene un nuevo incidente para resolver.
                         */

                    }

                    if(opc1 == 2){

                    }

                    if(opc1 == 3){

                    }
                }
            }



        }



    }
}
