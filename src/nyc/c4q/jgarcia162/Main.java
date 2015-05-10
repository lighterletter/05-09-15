package nyc.c4q.jgarcia162;

public class Main {

    public static void main(String[] args) {
        //System.out.println(reverse("Quispe"));
        System.out.println(capitalize("is this a trick"));
        reverseWords("Java Love I");

        //Reverse - "Quispe" -> "epsiuQ"
        System.out.println(new StringBuilder("Quispe").reverse().toString());

    }

    //Uppercase words - "i love java" -> "I Love Java"
    public static String capitalize(String sentence){
        String[] words;
        sentence.toLowerCase();
        words = sentence.split(" ");
        String title="";
        for(int i =0;i<words.length;i++){
            title += words[i].toUpperCase().charAt(0) + words[i].substring(1) + " ";
            }
        return title;
    }

    //Reverse words - "Java Love I" -> "I Love Java"
    public static void reverseWords(String sentence){
        String[] words = sentence.split(" ");
        for (int i = words.length-1; i >= 0 ; i--) {
            System.out.print(words[i] + " ");
        }

    }

    //Parse Addition Expression - "3 + (4 + 2)" -> "9". Assume that the only operations are "+" and parentheses.
//    public static int additionExpression(String expression){
//        for (int i = 0; i < expression.length() ; i++) {
//            do{ }while(Character.isDigit(expression.charAt(i)));}
//        }
//    }
}

