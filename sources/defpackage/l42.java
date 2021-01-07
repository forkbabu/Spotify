package defpackage;

import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.d42;
import defpackage.j32;
import defpackage.n22;

/* renamed from: l42  reason: default package */
public class l42 implements v3 {
    private final l22 a;
    private final f b;
    private final h32 c;
    private final u22 d;
    private final r32 e;
    private final b42 f;

    public l42(l22 l22, f fVar, h32 h32, u22 u22, r32 r32, b42 b42) {
        this.a = l22;
        this.b = fVar;
        this.c = h32;
        this.d = u22;
        this.e = r32;
        this.f = b42;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.v3
    public r3 a(c cVar, String str, String str2) {
        cVar.getClass();
        str2.getClass();
        l0 z = l0.z(str);
        LinkType q = l0.z(cVar.toString()).q();
        boolean z2 = false;
        if (z.q() == LinkType.COLLECTION_ALBUM || z.q() == LinkType.COLLECTION_ARTIST) {
            str = z.H(0, 2);
        }
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 6) {
            n22.b a2 = this.a.a(str, str2).a(cVar);
            if (q != LinkType.ARTIST) {
                z2 = true;
            }
            return a2.g(z2).c(true).d(true).b();
        } else if (ordinal == 14) {
            return this.d.a(str, str2).a(cVar).d(false).b();
        } else {
            if (ordinal == 185 || ordinal == 210) {
                return this.b.a(str, str2).a(cVar).d(true).c(true).b();
            }
            if (ordinal == 237) {
                j32.b c2 = this.c.a(str, str2).f(true).a(cVar).d(false).c(q != LinkType.SHOW_SHOW);
                c2.g(false);
                return c2.h(true).p(false).s(false).k(false).b();
            } else if (ordinal == 246) {
                return this.e.a(str, str2).a(cVar).b();
            } else {
                if (ordinal != 273) {
                    return r3.b;
                }
                d42.c t = this.f.a(str, str2, cVar.toString()).a(cVar).t(q != LinkType.ALBUM);
                if (q != LinkType.ARTIST) {
                    z2 = true;
                }
                d42.f w = t.g(z2).r(true).w(cVar.b(ViewUris.l1.toString()));
                w.c(true);
                return w.b();
            }
        }
    }
}
