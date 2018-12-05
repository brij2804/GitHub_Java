package com.regex.matcher;

import com.regex.common.RegexConstants;
import com.regex.inputs.InputStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

    public void method1() {
        Pattern pattern = Pattern.compile(RegexConstants.PATTERN_1);
        Matcher matcher = pattern.matcher(InputStrings.INPUT_STR_1);

        if (matcher.find()) {
            String grp0 = matcher.group(0);
            System.out.println(grp0);
        }
    }
    public void method2() {
        Pattern pattern = Pattern.compile(RegexConstants.PATTERN_INTEGERS_OF_UNDEFINED_LENGHT);
        Matcher matcher = pattern.matcher(InputStrings.INPUT_NUMBER);
        if (matcher.find()) {
            String grp0 = matcher.group(0);
            System.out.println(grp0);
        }
    }
    public void method3() {
        Pattern pattern = Pattern.compile(RegexConstants.PATTERN_INTEGERS_OF_UNDEFINED_LENGHT);
        Matcher matcher = pattern.matcher(InputStrings.INPUT_NUMBER_1);
        if (matcher.find()) {
            String grp0 = matcher.group(0);
            System.out.println(grp0);
        }else{
            System.out.println("pattern does not match");
        }
    }

    public void method4() {
        Pattern pattern = Pattern.compile(RegexConstants.PATTERN_INTEGER_OF_MAX_LENGTH_10);
        Matcher matcher = pattern.matcher(InputStrings.INPUT_NUMBER_1);
        if (matcher.find()) {
            String grp0 = matcher.group(0);
            System.out.println(grp0);
        }else{
            System.out.println("pattern does not match");
        }
    }
}
