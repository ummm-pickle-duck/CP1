/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    public static String Encrypt(String message, int incrementNumber,List<String> rotors ){
        // TODO - Implement the Encrypt method
        // Steps in brief
        final int startIndex = 101;
        List<String> encryptedMessage;
        for(int i=0; i < message.length(); i++)
        {
            int encrypt = (startIndex + incrementNumber + i) % 26;
            String encryptLetter = Integer.toString(encrypt);
            encryptedMessage.insert(encryptLetter);

            //char encryptLetter = (char)encrypt;
            
            //encryptedMessage.insert(encryptLetter);
        }

        // 1. Apply the CAESAR shift using the increment number
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        // 3. Return the encrypted string

        return encryptedMessage;
    }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        String rotor1;
        for(int i = 0; i < 26; i++)
        {
            if(message.charAt(i) == rotors[i])
            {
                rotor1 = rotors[i].toUpperCase();
                rotor1.charAt(i) = rotors[i].charAt(i);
            }
        }
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
