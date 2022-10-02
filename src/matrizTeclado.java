
import java.util.Scanner;

/*Creado por Rigoberto Sazo*/
public class matrizTeclado 
{
    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);
       int matriz[][] = new int[3][5]; //matriz 3 filas * 5 columnas
       
       System.out.println("-------- LLenando la matriz 3X5 --------\n");
       
        //Ciclos para llenar las filas y columnas
       for (int i=0; i < matriz.length; i++) 
       {
           for (int j=0; j < matriz[i].length; j++) 
           {
            System.out.print("Ingrese Datos Enteros [" + i + "," + j + "]: ");
            matriz[i][j] = entrada.nextInt();
            }      
        }
    
       //Mostrando los datos ingresados de la matriz
       System.out.println("\n------------ Matriz Llena -------------");
       for (int i=0; i < matriz.length; i++) 
       {
           System.out.println();
           for (int j=0; j < matriz[i].length; j++) 
           {
            System.out.print (matriz[i][j]+"\t");
           }
         System.out.println();
        }
    }
}
