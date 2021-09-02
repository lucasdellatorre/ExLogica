import java.util.Scanner;
/**
 * Faça um programa que leia as coordenadas de 2 pontos no plano (x1, y1) e
(x2, y2). A seguir, o programa deve calcular e escrever a distância euclidiana e também a distância de Manhattan entre esses pontos. Para isso,
dena um método que calcula a distância euclidiana usando a fórmula:
/**
 * 
 */
public class Ex5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double x, x1, y, y1;
        do{
            System.out.println("Informe o valor de x da Primeira cordenada: ");
            x = in.nextInt();
            System.out.println("Informe o valor de y da Primeira cordenada: ");
            y = in.nextInt();
            System.out.println("Informe o valor de x da Segunda cordenada: ");
            x1 = in.nextInt();
            System.out.println("Informe o valor de y da Segunda cordenada: ");
            y1 = in.nextInt();
        } while(x < 0 || y < 0 || x1 < 0 || y1 < 0);
        
        System.out.println("Distância Euclisiana entre os pontos " + "(" + x + " , " + y + ") e " + "(" + x1 + " , " + y1 + ") = " + eucli(x,x1,y,y1));
        System.out.println("Distância Manhattaneana entre os pontos " + "(" + x + " , " + y + ") e " + "(" + x1 + " , " + y1 + ") = " + man(x,x1,y,y1));
        
        
    }
    public static double eucli(double x, double x1, double y, double y1)
    {
         double d;
         d = Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
         return d;
    }
    public static double man(double x, double x1, double y, double y1)
    {
         double m;
         m = Math.abs(x-x1) + Math.abs(y-y1);
         return m;
    }
}
