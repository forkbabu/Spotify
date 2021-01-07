package defpackage;

import java.util.regex.Pattern;

/* renamed from: wjf  reason: default package */
public final class wjf {
    private static final Pattern a = Pattern.compile("^#([A-Fa-f0-9]{6})$");

    public static boolean a(String str) {
        return str != null && a.matcher(str).matches();
    }
}
