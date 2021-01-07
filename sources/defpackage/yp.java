package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: yp  reason: default package */
public final class yp {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(v vVar) {
        String j;
        while (true) {
            String j2 = vVar.j();
            if (j2 == null) {
                return null;
            }
            if (a.matcher(j2).matches()) {
                do {
                    j = vVar.j();
                    if (j == null) {
                        break;
                    }
                } while (!j.isEmpty());
            } else {
                Matcher matcher = wp.b.matcher(j2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(v vVar) {
        String j = vVar.j();
        return j != null && j.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        int i = f0.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : f0.M(split[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void e(v vVar) {
        int b = vVar.b();
        if (!b(vVar)) {
            vVar.K(b);
            StringBuilder V0 = je.V0("Expected WEBVTT. Got ");
            V0.append(vVar.j());
            throw new ParserException(V0.toString());
        }
    }
}
