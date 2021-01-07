package defpackage;

import java.util.regex.Pattern;

/* renamed from: j85  reason: default package */
public class j85 {
    private static final Pattern a = Pattern.compile("(?<=\\s)\\.(?=\\w+)");

    public String a(String str) {
        return str == null ? "" : a.matcher(str).replaceAll("​.");
    }
}
