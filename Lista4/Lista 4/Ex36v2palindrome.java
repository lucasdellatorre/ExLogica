/**
 * Escreva a descriÃ§Ã£o da classe OperacoesString aqui.
 * 
 * @author (seu nome) 
 * @version (nÃºmero de versÃ£o ou data)
 */
public class Ex36v2palindrome
{
    //01234   5
    //arara   2   i=0 1 2     j=4 3 
    
    //0123    4   i=0 1 2      j=3 2
    //otto    2
    
    public static boolean ehPalindrome(String frase){  
        frase = frase.toLowerCase();                                                                //Ex: fundamentos       metade = 11/2 = 5   i=0, j=10
        int metade = frase.length()/2;                               //    012345678910
        int i,j;
        for(i=0,j=frase.length()-1; i<metade; i++,j--){               //Ex: arara            metade = 5/2 = 2     i=2  j =2
            if(frase.charAt(i)!=frase.charAt(j)) return false;
        }
        return true;
    }
}
