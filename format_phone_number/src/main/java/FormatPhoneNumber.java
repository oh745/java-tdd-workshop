public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        input = input.replaceAll("-","");
        input = input.replaceAll(" ","");
        return input;
    }

    public String solution(String input) {
        int count = 0;
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            count++;
            result += input.charAt(i);
            if(count == 3){
                result += "-";
                count = 0;
            }
        }
        return result = result.substring(0,result.length()-1);
    }

}
