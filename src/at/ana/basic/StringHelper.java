package at.ana.basic;

public class StringHelper{

    public static void main(String[] args) {
        countLetters("Hans", 'a');
    }
    public static boolean isPalindrome(String text){

        return false;
    }

    public static int countLetters(String text, char search){
        //Hans
        char[] textArray = text.toCharArray();
        int count = 0;

        //0 1 2 3
        //H a n s

        for (int i=0; i<textArray.length; i++){

            if(textArray[i]==search){
                count++;
            }
        }

        return -1;
    }
}
//fertig
