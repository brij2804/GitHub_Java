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
}
