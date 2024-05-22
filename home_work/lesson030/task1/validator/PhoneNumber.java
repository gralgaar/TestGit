package home_work.lesson030.task1.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    PhoneNumber() {

    }

    public static boolean validate(CharSequence phoneNumber) {
        //Pattern p = Pattern.compile("\\+7\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}");
        //Pattern p = Pattern.compile("\\+7(\\S|\\s)*");
        //Pattern p = Pattern.compile("\\+7(\\s|\\(|\\)|\\d|-)*");

//
        Pattern p = Pattern.compile("\\+7\\s?\\(?\\d{3}\\)?\\s?\\d{3}-?\\d{2}-?\\d{2}");
        Matcher m = p.matcher(phoneNumber);
        return m.find();
    }
}
