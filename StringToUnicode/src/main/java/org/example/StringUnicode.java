package org.example;

import org.apache.commons.lang3.StringEscapeUtils;

public class StringUnicode {

    public static void main(String[] args) {

        String foreignText = "كلمة مرور صالحة لمرة واحدة\n" +
                "رمز: <OTP>\n" +
                "لـ: سداد فاتورة حكومية لمرة واحدة\n" +
                "مفوتر: <BILLER>\n" +
                "مبلغ: <AMOUNT> <CURRENCY>\n" +
                "في: <DATE>\n" +
                "عن طريق المصرفية المفتوحة";
        String response = StringEscapeUtils.escapeJava(foreignText);
        System.out.println(response);
    }
}