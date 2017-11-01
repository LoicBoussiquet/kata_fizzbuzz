public class Fizzbuzz {

    public static String doFizzbuzz(int numbers) {
        String stringFizz = "";
        for (int i=1; i<=numbers; i++){
            if((i%3)==0&&(i%5)==0){
                stringFizz += "FizzBuzz";
            }
            else if((i%3)==0){
                stringFizz += "Fizz";
            }
            else if((i%5)==0){
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
}
