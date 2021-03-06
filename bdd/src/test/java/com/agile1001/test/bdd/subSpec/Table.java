package com.agile1001.test.bdd.subSpec;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.timing.TimerExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;

/**
 * Created by Andrew on 15/09/2016.
 */
@RunWith(value = ConcordionRunner.class)
@Extensions(value = TimerExtension.class)
public class Table {
    public boolean checkFirstName(String name) {
        if (name == null) {
            return false;
        }
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        boolean b = p.matcher(name).matches();
        return b;
    }

    public int add(int x, int y) {
        return x + y;
    }

}
