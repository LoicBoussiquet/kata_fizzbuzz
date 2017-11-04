public class Fizzbuzz {

    public String doFizzbuzz(int numbers) {
        String stringFizz = "";
        for (int i = 1; i <= numbers; i++) {
            stringFizz += evaluateNumber(i);
            if (i != numbers) {
                stringFizz += " ";
            }
        }
        return stringFizz;
    }

    private String evaluateNumber(int number) {
        if (divideBy3(number) && divideBy5(number)) return "FizzBuzz";
        if (divideBy3(number)) return "Fizz";
        if (divideBy5(number)) return "Buzz";
        return String.valueOf(number);
    }

    private boolean divideBy3(int number) {
        return number % 3 == 0;
    }

    private boolean divideBy5(int number) {
        return number % 5 == 0;
    }
}
