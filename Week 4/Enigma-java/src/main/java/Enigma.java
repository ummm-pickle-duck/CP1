/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {
    public static String Encrypt(String message, int incrementNumber, List<String> rotors){
        // TODO - Implement the Encrypt method
        // Steps in brief
        String upperMessage = message.toUpperCase();
        String encryptedMessage = "";
        String nextMessage = "";

        // ABCD
        // A + 4 + 0 = E
        char startIndex = 'A';

        int i = 0;
        for (char c : upperMessage.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                nextMessage += c;
            } else {
                char nextChar = (char)(((c - startIndex + incrementNumber + i) % 26) + startIndex);
                nextMessage += nextChar;
            }
            i += 1;
        }

        encryptedMessage = nextMessage;

        for (String rotor : rotors) {
            nextMessage = "";
            for (char c : encryptedMessage.toCharArray()) {
                if (c < 'A' || c > 'Z') {
                    nextMessage += c;
                } else {
                    // we should use modulo here in case there's special characters in the message
                    int rotorIndex = (c - startIndex) % 26;
                    nextMessage += rotor.charAt(rotorIndex);
                }
            }
            encryptedMessage = nextMessage;
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
        for(int i = 0; i < 26; i++)
        {
            if(message.charAt(i) == rotors[i])
            {
                
            }
        }
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
