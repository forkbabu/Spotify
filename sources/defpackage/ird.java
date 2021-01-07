package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: ird  reason: default package */
public final class ird {
    private static final Pattern a = Pattern.compile("//");

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] split = a.split(uri.toString());
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }
}
