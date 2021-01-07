package org.apache.commons.lang3;

import java.util.Random;

public class c {
    private static final Random a = new Random();

    public static String a(int i) {
        Random random = a;
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            char[] cArr = new char[i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return new String(cArr);
                }
                char nextInt = (char) (random.nextInt(91) + 32);
                if (Character.isLetter(nextInt) || Character.isDigit(nextInt)) {
                    if (nextInt < 56320 || nextInt > 57343) {
                        if (nextInt < 55296 || nextInt > 56191) {
                            if (nextInt < 56192 || nextInt > 56319) {
                                cArr[i2] = nextInt;
                                i = i2;
                            }
                        } else if (i2 != 0) {
                            cArr[i2] = (char) (random.nextInt(128) + 56320);
                            i2--;
                            cArr[i2] = nextInt;
                            i = i2;
                        }
                    } else if (i2 != 0) {
                        cArr[i2] = nextInt;
                        i2--;
                        cArr[i2] = (char) (random.nextInt(128) + 55296);
                        i = i2;
                    }
                }
                i2++;
                i = i2;
            }
        } else {
            throw new IllegalArgumentException(je.q0("Requested random string length ", i, " is less than 0."));
        }
    }
}
