package defpackage;

import com.spotify.music.newplaying.scroll.view.l;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: imb  reason: default package */
public class imb {
    private final lmb a;
    private final g<String> b;
    private final g<l> c;
    private final p d = new p();

    public imb(lmb lmb, g<String> gVar, g<l> gVar2) {
        this.a = lmb;
        this.b = gVar;
        this.c = gVar2;
    }

    public /* synthetic */ tpf a(String str) {
        return this.c.C(gmb.a).h0(1);
    }

    public /* synthetic */ void b(l lVar) {
        this.a.y();
    }

    public void c() {
        this.d.b(this.b.f0(new fmb(this)).subscribe(new hmb(this)));
    }

    public void d() {
        this.d.a();
    }
}
