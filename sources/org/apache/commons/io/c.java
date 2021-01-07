package org.apache.commons.io;

import java.io.File;

public class c {
    private static final char a;

    static {
        Character.toString('.');
        char c = File.separatorChar;
        a = c;
        if (c != '\\') {
        }
    }

    static boolean a() {
        return a == '\\';
    }
}
