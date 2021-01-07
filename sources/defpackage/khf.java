package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: khf  reason: default package */
public final class khf {
    private static final Pattern a = Pattern.compile("\\?.*");
    private static final Uri b = Uri.parse("https://open.spotify.com/internal/pullcontext");

    public static Uri a(String str) {
        Uri parse = Uri.parse(str);
        return parse.equals(Uri.EMPTY) ? b : parse;
    }

    public static Uri b(Uri uri) {
        if (!uri.isHierarchical()) {
            return Uri.parse(a.matcher(uri.toString()).replaceFirst(""));
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("ecf")) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }
}
