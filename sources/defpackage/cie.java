package defpackage;

import java.util.regex.Pattern;

/* renamed from: cie  reason: default package */
public final class cie {
    private static final Pattern a = v3.i;

    public static boolean a(String str) {
        return !str.isEmpty() && a.matcher(str).matches();
    }
}
