package com.spotify.music.features.assistedcuration.search;

import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {
    private static final Pattern a = Pattern.compile("^spotify:internal:assisted-curation:([^:]+):([\\w:]+)");

    public static String a(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        Assertion.p("Bad uri");
        return null;
    }

    public static String b(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        Assertion.p("Bad uri");
        return null;
    }

    public static boolean c(String str) {
        return a.matcher(str).matches();
    }
}
