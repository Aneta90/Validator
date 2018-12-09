import java.util.HashMap;
import java.util.Map;

class IDValidation implements Validator {

    public static int lettersToDigits(char letter) {

        Map<Character, Integer> lettersToDigitsMap = new HashMap<>();
        lettersToDigitsMap.put('1', 1);
        lettersToDigitsMap.put('2', 2);
        lettersToDigitsMap.put('3', 3);
        lettersToDigitsMap.put('4', 4);
        lettersToDigitsMap.put('5', 5);
        lettersToDigitsMap.put('6', 6);
        lettersToDigitsMap.put('7', 7);
        lettersToDigitsMap.put('8', 8);
        lettersToDigitsMap.put('9', 9);
        lettersToDigitsMap.put('0', 0);
        lettersToDigitsMap.put('A',10);
        lettersToDigitsMap.put('B', 11);
        lettersToDigitsMap.put('C', 12);
        lettersToDigitsMap.put('D', 13);
        lettersToDigitsMap.put('E', 14);
        lettersToDigitsMap.put('F', 15);
        lettersToDigitsMap.put('G', 16);
        lettersToDigitsMap.put('H', 17);
        lettersToDigitsMap.put('I', 18);
        lettersToDigitsMap.put('J', 19);
        lettersToDigitsMap.put('K', 20);
        lettersToDigitsMap.put('L', 21);
        lettersToDigitsMap.put('M', 22);
        lettersToDigitsMap.put('N', 23);
        lettersToDigitsMap.put('O', 24);
        lettersToDigitsMap.put('P', 25);
        lettersToDigitsMap.put('Q', 26);
        lettersToDigitsMap.put('R', 27);
        lettersToDigitsMap.put('S', 28);
        lettersToDigitsMap.put('T', 29);
        lettersToDigitsMap.put('U', 30);
        lettersToDigitsMap.put('W', 31);
        lettersToDigitsMap.put('Y', 32);
        lettersToDigitsMap.put('Z', 33);
        lettersToDigitsMap.put('Q', 34);
        lettersToDigitsMap.put('V', 35);
        lettersToDigitsMap.put('X', 36);

        return lettersToDigitsMap.get(letter);
    }

    public static boolean validateID(String id) {
        if (id == null) {
            throw new IllegalArgumentException("You have not typed any id!");
        }

        int wages[] = {7, 3, 1, 9 ,7, 3, 1, 7, 3,};
        int sum = 0;

        if (!id.matches("[A-Z]{3}[0-9]{6}")) {
            throw new IllegalArgumentException("Type 3 letters and 6 numbers to validate your id");
        }
        if (id.length() != 9) {
            throw new IllegalArgumentException("Your id must contain 9 characters");
        } else {
            int[] documentIntArray = new int[9];
            for (int i = 0; i < 9; i++) {
                documentIntArray[i] = lettersToDigits(id.charAt(i));
                sum += documentIntArray[i] * wages[i];
            }
            return sum % 10 == 0;
            }
    }

}
