import java.util.*;

public class BAD_URLS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        System.out.println(urlFixer(url)); 
        sc.close();

    }

    public static String urlFixer(String url) {
        String correctURL = "";
        char[] ch = url.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            //if one backSlash is found it will append to the correctURL
            if (ch[i] == ('/')) {
                correctURL += ch[i];
                //then it will increase i until there is no backSlash
                while (i+1!=ch.length && ch[i + 1] == '/') {
                    i++;
                }
            } else {
                correctURL += ch[i];
            }

        }
        return correctURL;
    }
}