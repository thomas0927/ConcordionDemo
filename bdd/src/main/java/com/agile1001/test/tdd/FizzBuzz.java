package com.agile1001.test.tdd;

public class FizzBuzz {

    private int number;

    public FizzBuzz(int number) {
        this.number=number;
    }

    public String  say() {
        String fizzResult = ruleFizzResult();
        String buzzResult = ruleBuzzResult();
        if(!fizzResult.isEmpty() || !buzzResult.isEmpty()){
            return fizzResult+buzzResult;
        }
        return String.valueOf(number);
    }

    private String ruleBuzzResult() {
        if (isDivBy(5)) return "Buzz";
        return "";
    }

    private String ruleFizzResult() {
        if (isDivBy(3)) return "Fizz";
        return "";
    }

    private boolean isDivBy(int ruleNumber) {
        return number% ruleNumber ==0;
    }
}
