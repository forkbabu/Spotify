package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.podcast.episode.util.h;
import defpackage.j32;

/* renamed from: lsc  reason: default package */
public final /* synthetic */ class lsc implements b4 {
    public final /* synthetic */ fm9 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ h32 c;
    public final /* synthetic */ com.spotify.music.libs.viewuri.c f;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ h p;
    public final /* synthetic */ ifd q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ tsc s;

    public /* synthetic */ lsc(fm9 fm9, c cVar, h32 h32, com.spotify.music.libs.viewuri.c cVar2, boolean z, boolean z2, h hVar, ifd ifd, boolean z3, tsc tsc) {
        this.a = fm9;
        this.b = cVar;
        this.c = h32;
        this.f = cVar2;
        this.n = z;
        this.o = z2;
        this.p = hVar;
        this.q = ifd;
        this.r = z3;
        this.s = tsc;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public final r3 p0(Object obj) {
        fm9 fm9 = this.a;
        c cVar = this.b;
        h32 h32 = this.c;
        com.spotify.music.libs.viewuri.c cVar2 = this.f;
        boolean z = this.n;
        boolean z2 = this.o;
        h hVar = this.p;
        ifd ifd = this.q;
        boolean z3 = this.r;
        tsc tsc = this.s;
        msc msc = (msc) obj;
        String c2 = msc.c();
        String e = msc.e();
        int d = msc.d();
        boolean a2 = fm9.a(cVar);
        j32.b c3 = h32.a(c2, msc.b()).f(msc.f()).a(cVar2).d(msc.a()).q(a2).c(z);
        c3.g(true);
        j32.j s2 = c3.h(!a2).p(false).s(z2);
        s2.o(new ksc(hVar, c2));
        j32.h k = s2.k(false);
        k.r(true);
        k.e(ifd);
        k.l(a2);
        k.n(z3);
        tsc.d(c2, e, d);
        return k.b();
    }
}
