package tasks.day2;

public class Task16 {
    public static void main(String[] args) {
        String ifade = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";
        ifade = ifade.replace("kötü","iyi");
        ifade = ifade.replace('.','!');
        //ifade = ifade.replace("kötü","iyi").replace('.','!');    ---> bu şekilde tek satırda yazılabilir.
        System.out.println(ifade);
    }
}


/*
= Açıklama =
Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız.

= Örnek Girdi =
Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

= Örnek Çıktı =
Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir!
*/
