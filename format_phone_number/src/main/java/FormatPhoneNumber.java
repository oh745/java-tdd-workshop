public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        input = input.replaceAll("-","");
        input = input.replaceAll(" ","");
        return input;
    }

    public String solution(String input) {
        input = removeNonDigit(input);
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
        if(input.length() % 3 == 0){
            return result = result.substring(0,result.length()-1);
        }

        String[] arr = result.split("-");
        if(arr[arr.length-1].length() == 1){
            result = "";
            for (int i = 0; i < arr.length-1; i++) {
                if( i == arr.length-2){
                    result += arr[i].charAt(0);
                    result += arr[i].charAt(1);
                    result += "-";
                    result += arr[i].charAt(2);
                    result += arr[arr.length-1];
                    break;
                }
                result += arr[i];
                result += "-";
            }
            return result;
        }

        return result;

    }

}
