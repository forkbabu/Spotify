package com.spotify.libs.instrumentation.performance;

import java.util.NoSuchElementException;
import java.util.Scanner;

class n {
    private final String a;

    public n(String str) {
        this.a = str;
    }

    public long a(int i) {
        int i2 = i - 1;
        try {
            Scanner scanner = new Scanner(this.a);
            for (int i3 = 0; i3 < i2; i3++) {
                scanner.next();
            }
            return scanner.nextLong();
        } catch (NoSuchElementException unused) {
            return -1;
        }
    }
}
