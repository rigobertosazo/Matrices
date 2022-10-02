/*Creado por Rigoberto Sazo*/
public class matrizTablero 
{
    public static void main(String[] args)
    {
       int numeros [][] = new int [8][8];
       boolean sube = false;
       int i = 0;
       int valor = 64;  

        for (int[] array : numeros)
        {
            if (sube) 
            {
                for (i = 0; i < array.length; i++) 
                {
                    array[i] = valor;
                    valor--; 
                }
                sube = !sube;
            } else if (!sube) 
                {
                    for (i = 7; i >= 0; i--) {
                        array[i] = valor;
                        valor--;
                    }
                    sube = !sube;
                }
        }
        //Desplegando datos
        for (int[] array : numeros) 
        {
            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------------");
        }
   } //fin main  
} //fin Clase
