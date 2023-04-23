public class Main {


    public static void main(String[] args){
        String message = "how are you doing today";
        int offset = 12;
        CaesorCipher caesorCipher = new CaesorCipher();

        System.out.println("Original message: " + message);
        System.out.println("Our offset: " + offset);
        System.out.println("Ciphered message: " + caesorCipher.cipher(message, offset));
    }

}
