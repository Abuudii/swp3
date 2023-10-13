package at.ana.basic;

public class Ceaserverschluesselung {

    public static void main (String[] args){
        String result = encrypt(1,"hallo");
        System.out.println(result);
    }


    public static String encrypt(int shift, String stringToEncrypt){
        String encyptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();

        for(int i=0; i<inputData.length; i++){
            int  letter = inputData[i] + shift ;
            System.out.println("newLetter:" + Character.toString(letter));
            encyptedString += Character.toString(letter);
        }
        return encyptedString;
    }

}

