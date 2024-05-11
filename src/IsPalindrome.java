public class IsPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String intAsString = Integer.toString(x);
        StringBuilder number = new StringBuilder();
        StringBuilder reversedNumber = new StringBuilder();

        for(int i = 0; i < intAsString.split("").length; i++){
            number.append(intAsString.charAt(i));
        }
        for(int i = intAsString.length()-1; i >=0; i--){
            reversedNumber.append(intAsString.charAt(i));
        }
        return number.compareTo(reversedNumber) == 0;
    }
}
