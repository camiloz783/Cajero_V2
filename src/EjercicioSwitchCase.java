import java.util.Scanner; 

public class EjercicioSwitchCase {


    public static void main(String[] args) {
        
     Scanner lector= new Scanner (System.in);   
     int usuario=123;
     int clave=123;
     int saldo=500000;
     int valor_aretirar;
     int clave_leida;
     int opcion=0;
     int cantidadAtransferir=0;
     int cuentaAtransferir;
     int operaciones [] = new int[5];
     int k=0;
    // arreglo operaciones de tipo entero
        
     System.out.print("ingrese usuario: ");
        //clave_leida=Integer.parseInt(lector.next());
         clave_leida = lector.nextInt();
         if(clave==clave_leida) {
             
         }
      System.out.print("ingrese la clave: ");
        //clave_leida=Integer.parseInt(lector.next());
         clave_leida = lector.nextInt();
         if(clave==clave_leida) {
             
                                
          do { 
         
             System.out.println(" Bienvenido al cajero");
             System.out.println("     Seleccione uan opcion     ");
             System.out.println("1. Retirar efectivo");
             System.out.println("2. Realizar transferencia");
             System.out.println("3. Consultar saldo");
             System.out.println("4. Salir ");
             
             opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    operaciones[k]=opcion;
                 System.out.println("1. Retirar efectivo");
                 System.out.println("Por favor ingrese la cantidad a retirar");
                      valor_aretirar = lector.nextInt();
                      if (valor_aretirar <= saldo ) {
                          saldo = saldo - valor_aretirar;
                         System.out.println("Su nuevo saldo es: " + saldo);
                      } else {
                          System.out.println("Fondos Insuficientes, su saldo es: " + saldo);
                      }
                      k++;
                 break;
                 case 2:
                    operaciones[k]=opcion;
                 System.out.println("3. Realizar transferencia");
                 System.out.println("Por favor ingrese el valor que desea transferir ");
                    cantidadAtransferir = lector.nextInt();
                    if (cantidadAtransferir <= saldo ){
                        saldo = saldo - cantidadAtransferir;
                        System.out.println("Digite el numero de cuenta al que desea transferir");
                        cuentaAtransferir = lector.nextInt();
                        System.out.println("Ud realizo una transaccion al numero de cuenta "+cuentaAtransferir+" por valor de "+cantidadAtransferir);
                        System.out.println("Su nuevo saldo es de "+saldo);
                 } else{
                        System.out.println("Ud No tiene fondos suficientes para realizar esta transferencia , su saldo es de "+saldo);
                    }
                    k++;
                 break;
                         
                case 3:
                    operaciones[k]=opcion;
                 System.out.println("5. Consultar saldo");
                 System.out.println("Su saldo es de : "+ saldo);
                 k++;
                 break;
                case 4:
                 System.out.println("6. Salir ");
                  System.out.println("Gracias por usar nuestro cajero...");
                      
                  System.exit(0);
                 break;
                default:
                 System.out.println("NO Selecciono una opcion valida");
                 
        }
        
            System.out.println("Para seguir digite 0, para salir digite 4");
               opcion = lector.nextInt();
            } while (opcion != 4); 
    }  else {
             System.out.println(" La Clave es incorrecta...");
         }
}
    
}
