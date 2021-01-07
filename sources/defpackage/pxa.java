package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: pxa  reason: default package */
public final class pxa {
    public static final c a(String str) {
        oxa oxa;
        if (str != null) {
            oxa = new oxa();
            oxa.c(str);
        } else {
            oxa = new oxa();
        }
        c b = ViewUris.o0.b(oxa.a());
        h.d(b, "ViewUris.SEARCH.verify(uriBuilder.build())");
        return b;
    }
}
