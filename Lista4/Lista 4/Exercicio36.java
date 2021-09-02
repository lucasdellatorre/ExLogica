import java.util.Scanner;

public class Exercicio36 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine().toLowerCase();
        if(isPalindrome(palavra)) {
            System.out.printf("A palavra %s é palindroma.", palavra);
        } else{
            System.out.printf("A palavra %s não é palindroma pois seu inverso é %s.", palavra, inverteStr(palavra));
        }
    }
    
    public static String inverteStr(String palavras){
        String strInvertida = "";
        for(int i = palavras.length() - 1; i >= 0 ; i--){
            strInvertida += palavras.charAt(i);
        }
        return strInvertida;
    }

    public static boolean isPalindrome(String palavras){
        //String strInvertida = inverteStr(palavras);
        //if(palavras.equals(strInvertida)) return true;
        //return false;
        return palavras.equals(inverteStr(palavras));
    }
}
