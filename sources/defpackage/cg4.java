package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: cg4  reason: default package */
public final class cg4 {
    private static boolean a(String str) {
        return ViewUris.t.a(str);
    }

    public static boolean b(String str) {
        return ViewUris.x.a(str);
    }

    public static boolean c(String str) {
        boolean z;
        if (ViewUris.u.a(str) || ViewUris.n0.b(str)) {
            if (!(ViewUris.v.a(str) || ViewUris.n0.b(str))) {
                z = true;
                if (!z || a(str) || b(str)) {
                    return true;
                }
                if (b(str) && !ViewUris.w.a(str)) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z ? true : true;
    }

    public static a d(String str) {
        if (a(str)) {
            return PageIdentifiers.BROWSE_GENRES;
        }
        return PageIdentifiers.FIND;
    }

    public static c e(String str) {
        if (b(str)) {
            return ViewUris.x.b(str);
        }
        if (a(str)) {
            return ViewUris.t.b(str);
        }
        return ViewUris.n0;
    }
}
