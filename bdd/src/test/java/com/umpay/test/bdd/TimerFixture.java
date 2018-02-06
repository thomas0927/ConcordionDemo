package com.umpay.test.bdd;

import java.util.regex.Pattern;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.timing.TimerExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(value = ConcordionRunner.class)
@Extensions(value = TimerExtension.class)
public class TimerFixture {

    public void timeLong() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkFirstNameAsEmptyString() {
        return checkFirstName("");
    }

    public boolean checkFirstNameAsNull() {
        return checkFirstName(null);
    }

    public boolean checkFirstName(String name) {
        if (name == null) {
            return false;
        }
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        boolean b = p.matcher(name).matches();
        return b;
    }

    public boolean checkEmail(String email) {
        if (email == null) {
            return false;
        }
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * description : this is not a full validation, just a basic check.
     * @param dateString
     * @return
     * @author      <a href="mailto:zhangming@umpay.com">Thomas Zhang</a>
     * @version     1.0
     * @date        2018年2月2日下午5:40:47
     */
    public boolean checkDateFormat(String dateString) {
        return dateString.matches("^\\d+\\-\\d+\\-\\d+");
    }

    /**
     * description : Again, just a basic check
     * @param code
     * @return
     * @author      <a href="mailto:zhangming@umpay.com">Thomas Zhang</a>
     * @version     1.0
     * @date        2018年2月2日下午5:09:39
     */
    
    public boolean checkValidPostCode(int code) {
        timeLong();
        return (code > 0) && (code < 10000);
    }


}



