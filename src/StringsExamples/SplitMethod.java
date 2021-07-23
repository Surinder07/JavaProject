package StringsExamples;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {



        String s = new String("Hello My name is Surinder!");

        String[] newString = s.split("\\.");
        System.out.println(Arrays.toString(newString));

    }
}
