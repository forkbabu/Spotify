package defpackage;

import com.google.common.base.Charsets;
import java.util.regex.Pattern;

/* renamed from: yz0  reason: default package */
public final class yz0 {
    private static final Pattern a = Pattern.compile("\\+");

    public static String a(String str) {
        return a.matcher(gf0.d(str, Charsets.UTF_8)).replaceAll("%20");
    }
}
