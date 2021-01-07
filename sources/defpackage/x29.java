package defpackage;

import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.d39;

/* renamed from: x29  reason: default package */
public class x29 extends d39<MusicItem.Type, MusicItem> implements c39 {
    private final w59 p;
    private final u59 q;
    private final c69 r;
    private final y59 s;
    private final wc9 t;

    public x29(w59 w59, u59 u59, c69 c69, y59 y59, wc9 wc9) {
        this.p = w59;
        this.q = u59;
        this.r = c69;
        this.s = y59;
        this.t = wc9;
        Z(w59);
        Z(u59);
        Z(y59);
        Z(c69);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [d39$e, com.spotify.encore.ViewProvider, d39$b, int] */
    /* access modifiers changed from: protected */
    @Override // defpackage.d39
    public void Y(d39.e<MusicItem.Type, MusicItem> eVar, ViewProvider viewProvider, MusicItem musicItem, int i) {
        eVar.a(viewProvider, musicItem, i);
        viewProvider.getView();
    }

    @Override // defpackage.c39
    public void d(u0 u0Var, String str) {
        this.s.d(u0Var, str);
        this.p.d(u0Var, str);
        z();
    }

    public void f0(da2<s0> da2) {
        this.p.l(new f29(da2));
        this.q.d(new k29(da2));
        this.s.m(new g29(da2));
        this.s.o(new m29(da2));
        this.s.n(new h29(da2));
        this.r.x(new d29(da2));
        this.r.w(new e29(da2));
        this.r.s(new l29(da2));
        this.r.q(new j29(this, da2));
        this.r.v(new i29(this, da2));
        c69 c69 = this.r;
        wc9 wc9 = this.t;
        wc9.getClass();
        c69.t(new v29(wc9));
    }

    public void g0() {
        this.p.l(null);
        this.q.d(null);
        this.s.m(null);
        this.s.o(null);
        this.s.n(null);
        this.r.x(null);
        this.r.w(null);
        this.r.s(null);
        this.r.q(null);
        this.r.v(null);
        this.r.t(null);
    }

    public /* synthetic */ void i0(da2 da2) {
        this.t.d();
        da2.accept(s0.b());
    }

    public /* synthetic */ void j0(da2 da2, String str, String str2, boolean z, int i) {
        if (z) {
            this.t.c(str2, i);
        } else {
            this.t.b(str2, i);
        }
        da2.accept(s0.A(str, Boolean.valueOf(z)));
    }
}
