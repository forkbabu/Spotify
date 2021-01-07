package defpackage;

import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.d39;

/* renamed from: a39  reason: default package */
public class a39 extends d39<MusicItem.Type, MusicItem> implements c39 {
    private final w59 p;
    private final u59 q;
    private final c69 r;

    public a39(w59 w59, u59 u59, c69 c69) {
        this.p = w59;
        this.q = u59;
        this.r = c69;
        Z(w59);
        Z(u59);
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
        this.p.d(u0Var, str);
        z();
    }

    public void f0(da2<s0> da2, zc9 zc9) {
        this.p.l(new n29(da2, zc9));
        this.p.m(new o29(da2, zc9));
        this.q.d(new s29(da2, zc9));
        this.r.x(new q29(da2));
        this.r.s(new t29(da2));
        this.r.q(new r29(da2));
        this.r.u(new u29(da2, zc9));
        this.r.r(new p29(da2));
    }

    public void g0() {
        this.p.l(null);
        this.p.m(null);
        this.q.d(null);
        this.r.x(null);
        this.r.s(null);
        this.r.q(null);
        this.r.u(null);
        this.r.r(null);
    }
}
