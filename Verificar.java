package hipercalculadora;
/**
 * @author Jão_4.2
 */
public class Verificar {
    public static String L[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                "q","r","s","t","u","v","x","w","y","z","A","B","C","D","E","F",
                                "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
                                "X","W","Y","Z","!","@","#","$","%","¨","&","*","(",")","¹","²",
                                "³","£","¢","¬","=","+","§","´","`","~","^",";",",",".",":","?",
                                "/","°","<",">","[","]","{","}","º","ª"," ",""};//90//90 
    public static boolean verify_treta(String letra){
    for (int i = 0; i < L.length; i++){
    if(letra.equals(L[i]))
    return true;
    }
    return false;
    }
}
