package com.agile1001.test.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 *
 * Number 3 Fizz
 * Number 5 Buzz
 */
public class FizzBuzzTest {

    @ParameterizedTest(name="{index}=>{arguments}")
    @DisplayName("当报数为3的倍数时说Fizz")
    @MethodSource("test_case_当报数为_3_的倍数时说_fizz")
    void 当报数为_3_的倍数时说_fizz(int number,String expectAnswer,String message){
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String say = fizzBuzz.say();
        Assert.assertEquals(message, expectAnswer,say);

    }
    private static Stream<Arguments> test_case_当报数为_3_的倍数时说_fizz(){
        return Stream.of(
                Arguments.of(1,"1","1说1"),
                Arguments.of(2,"2","2说2"),
                Arguments.of(3,"Fizz","3说Fizz"),
                Arguments.of(4,"4","4说4"),
                Arguments.of(5,"Buzz","5说Buzz"),
                Arguments.of(6,"Fizz","6说Fizz"),
                Arguments.of(15,"FizzBuzz","15说FizzBuzz")
                );
    }
}
