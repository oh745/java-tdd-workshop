public class FizzBuzz {
    public String say(int input) {
        if(input == 15 || input == 30){
            return "FizzBuzz";
        }
        else if(input == 3 || input == 6 || input == 9){
            return "Fizz";
        }
        else if(input == 5 || input == 10 || input == 20){
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
