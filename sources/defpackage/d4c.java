package defpackage;

import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import defpackage.d42;
import defpackage.j32;
import kotlin.jvm.internal.h;

/* renamed from: d4c  reason: default package */
public final class d4c implements v3 {
    private final b42 a;
    private final h32 b;

    public d4c(b42 b42, h32 h32) {
        h.e(b42, "trackContextMenuBuilder");
        h.e(h32, "episodeContextMenuBuilder");
        this.a = b42;
        this.b = h32;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.v3
    public r3 a(c cVar, String str, String str2) {
        h.e(cVar, "viewUri");
        h.e(str, "uri");
        h.e(str2, "title");
        l0 z = l0.z(cVar.toString());
        h.d(z, "SpotifyLink.of(viewUri.toString())");
        LinkType q = z.q();
        l0 z2 = l0.z(str);
        h.d(z2, "SpotifyLink.of(uri)");
        LinkType q2 = z2.q();
        if (q2 != null) {
            int ordinal = q2.ordinal();
            if (ordinal == 237) {
                j32.b c = this.b.a(str, str2).f(false).a(cVar).d(true).c(true);
                c.g(true);
                j32.h k = c.h(false).p(false).s(false).k(false);
                k.i(true);
                k.l(true);
                r3 b2 = k.b();
                h.d(b2, "episodeContextMenuBuilde…                  .fill()");
                return b2;
            } else if (ordinal == 273) {
                d42.f w = this.a.a(str, str2, cVar.toString()).a(cVar).t(q != LinkType.ALBUM).g(q != LinkType.ARTIST).r(true).w(false);
                w.c(true);
                r3 b3 = w.b();
                h.d(b3, "trackContextMenuBuilder\n…                  .fill()");
                return b3;
            }
        }
        r3 r3Var = r3.b;
        h.d(r3Var, "ContextMenuDelegate.EMPTY");
        return r3Var;
    }
}
