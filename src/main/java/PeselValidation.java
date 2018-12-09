public class PeselValidation {

    public static boolean validatePesel(String pesel){

        int [] wages={1,3,7,9,1,3,7,9,1,3,1};
        int sum=0;
        for(int i=0;i<wages.length;i++) {
            char c = pesel.charAt(i);
            int j= Integer.valueOf(String.valueOf(c));
            sum += wages[i]*j;
        }

        return sum % 10 == 0;
    }

}
