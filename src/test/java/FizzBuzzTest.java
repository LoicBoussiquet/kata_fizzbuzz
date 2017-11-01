import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void test_Should_Print1(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(1);
        assertEquals(result, "1");
    }

    @Test
    public void test_Should_Print1_2(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(2);
        assertEquals(result, "1 2");
    }

    @Test
    public void test_Should_Print1_2_Fizz(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(3);
        assertEquals(result, "1 2 Fizz");
    }

    @Test
    public void test_Should_Print1_2_Fizz_4(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(4);
        assertEquals(result, "1 2 Fizz 4");
    }


    @Test
    public void test_Should_Print1_2_Fizz_4_Buzz(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(5);
        assertEquals(result, "1 2 Fizz 4 Buzz");
    }

    @Test
    public void test_Should_Print1_2_Fizz_4_Buzz_FizzBuzz(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.doFizzbuzz(15);
        assertEquals(result, "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
    }
}
