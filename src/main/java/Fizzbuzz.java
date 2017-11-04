public class Fizzbuzz {

    public String doFizzbuzz(int numbers) {
        String stringFizz = "";
        for (int i=1; i<=numbers; i++){
            if(divideBy3(i) && divideBy5(i)){
                stringFizz += "FizzBuzz";
            }
            else if(divideBy3(i)){
                stringFizz += "Fizz";
            }
            else if(divideBy5(i)){
                stringFizz += "Buzz";
            }
            else {
                stringFizz += i;
            }
            if (i != numbers){
                stringFizz += " ";
            }
        }
        return stringFizz;
    }

    private boolean divideBy3 (int number){
        if (number%3 == 0){
            return true;
        }
        return false;
    }

    private boolean divideBy5 (int number){
        if (number%5 == 0){
            return true;
        }
        return false;
    }
}
