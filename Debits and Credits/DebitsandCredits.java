import java.util.*;
import java.lang.*;

public class DebitsandCredits{


    public static float suma(float[] datos){
      float sum=0;
      for( float num : datos) {
          sum = sum+num;
      }
      return sum;
    }

    public static float maximo(float[] datos){
      float max=0;
      for (int i=0; i<datos.length;i++){
        if (datos[i]>max){
          max=datos[i];
        }
      }
      return max;
    }

    public static void main(String[]args){
      float[] debitos;
      float[] creditos;
      debitos=new float[15];
      creditos=new float[10];
      int d=0;
      int c=0;
      float dato;
      float sumacredito=0;
      float sumadebito=0;
      float saldo=0;
      Scanner userinput=new Scanner(System.in);
      while (true){
        System.out.print("1.Ingresar Débito\n2.Ingresar Crédito\n3.Ver Información de cuenta\n4.Historial\n5.Salir\n");
        System.out.print("Ingrese una opción");
        int opcion=userinput.nextInt();
        //Agregar un debito
        if (opcion==1){
          System.out.print("Ingrese el debito\n");
          dato=userinput.nextFloat();
          debitos[d]=dato;
          d+=1;
        }
        //Agregar un crédito
        if (opcion==2){
          System.out.print("Ingrese el crédito\n");
          dato=userinput.nextFloat();
          creditos[c]=dato;
          c+=1;
        }
        //Total créditos y debitos
        if (opcion==3){
          if (d>=9 && c>=4){
              sumadebito=suma(debitos);
              sumacredito=suma(creditos);
              saldo=sumacredito-sumadebito;
              float promediodebito=sumadebito/d;
              float promediocredito=sumacredito/c;
              float max=maximo(debitos);
              System.out.print("INFORMACIÓN BANCARIA\n");
              System.out.print("----------------------------------------\n");
              System.out.print("El total de créditos fue de:"+sumacredito+"\n");
              System.out.print("El total de debitos fue de:"+sumadebito+"\n");
              System.out.print("----------------------------------------\n");
              System.out.print("El saldo final es de:"+saldo+"\n");
              System.out.print("----------------------------------------\n");
              System.out.print("----------------------------------------\n");
              System.out.print("El promedio del crédito fue de:"+promediocredito+"\n");
              System.out.print("El promedio del debito fue de:"+promediodebito+"\n");
              System.out.print("----------------------------------------\n");
              System.out.print("El debito más grande de la cuenta fue:"+max+"\n");
              System.out.print("----------------------------------------\n");
            }
            else{
              System.out.print("Debe tener al menos 10 debitos y 5 créditos para generar información\n\n");
            }
          }

          if (opcion==4){
            if (d>=3 && c>=2){
              System.out.print("1.Ver Créditos\n2.Ver Debitos\n");
              int op=userinput.nextInt();
                if (op==1){
                  System.out.print("Créditos:\n");
                  for (int i=0;i<creditos.length;i++){
                    System.out.print(i+". "+creditos[i]+"\n");
                  }
              }
                if (op==2){
                  System.out.print("Debitos:\n");
                  for (int i=0;i<debitos.length;i++){
                  System.out.print(i+". "+debitos[i]+"\n");
                  }
                }
            }
            else{
              System.out.print("Debe tener al menos 10 debitos y 5 créditos para generar información\n\n");
            }
          }

          if (opcion==5){
            System.out.print("Exiting...");
            System.exit(0);
          }
        }
      }
    }
