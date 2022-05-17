/* Fazer um programa para ler um numero inteiro N e uma matriz de ordem N, contendo numeros
* inteiros.Em seguida mostrar a diagonal principal e a quantidade de numeros negativos da matriz
* input       output
* 3
* 5 -3 10 -   Main diagonal 5 8 -4
* 15 8 2  -  Negative numbers = 2
* 7 9 -4  -  */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mat = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //leu cada elemento da matriz
                mat[i][j] = sc.nextInt();

            }
        }

        System.out.println("Diagonal Principal");
        for(int i = 0; i < n; i++){
            System.out.println(mat[i][i] + " ");
        }

        //calculos dos numeros negativos
        System.out.println();
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] < 0){
                    count += 1;
                }

            }
        }

        System.out.printf("Existem %d numeros negativos",count);


    }
}
