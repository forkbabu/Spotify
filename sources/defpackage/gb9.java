package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.music.features.yourlibrary.musicpages.datasource.g5;
import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b;
import defpackage.wb9;
import defpackage.zb9;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: gb9  reason: default package */
public class gb9 extends g5 {
    private final b b;
    private final jb9 c;
    private final MusicPagesFiltering d;
    private final lb9 e;
    private final y f;
    private final w3 g;
    private final String h;
    private final s<String> i;
    private final lf9 j;

    public gb9(jb9 jb9, b bVar, MusicPagesFiltering musicPagesFiltering, lb9 lb9, y yVar, lf9 lf9, w3 w3Var, String str, s<String> sVar) {
        this.b = bVar;
        this.c = jb9;
        this.d = musicPagesFiltering;
        this.e = lb9;
        this.f = yVar;
        this.g = w3Var;
        this.h = str;
        this.i = sVar;
        this.j = lf9;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.g5
    public s<y3> a() {
        s<Object> sVar = e0.a;
        bb9 bb9 = bb9.a;
        b bVar = this.b;
        lb9 lb9 = this.e;
        MusicPagesFiltering musicPagesFiltering = this.d;
        String str = this.h;
        s<String> sVar2 = this.i;
        lf9 lf9 = this.j;
        m f2 = i.f();
        f2.h(wb9.b.class, new bc9(lf9, bVar, lb9, sVar2));
        f2.h(wb9.a.class, new dc9(sVar2, lb9));
        f2.d(wb9.c.class, new lc9(musicPagesFiltering, str));
        MobiusLoop.f h2 = i.c(bb9, f2.i()).b(new za9(this)).d(new ab9(this)).e(cb9.a).h(i.a(this.g.c().Q(qc9.a).E().j0(pc9.a), this.d.g(this.h).E().j0(rc9.a)));
        zb9 zb9 = zb9.a;
        String str2 = this.h;
        zb9.a d2 = zb9.d();
        d2.b(str2);
        s<R> E = sVar.q(i.d(h2, d2.a())).E();
        jb9 jb9 = this.c;
        jb9.getClass();
        return E.j0(new db9(jb9));
    }

    public /* synthetic */ ia2 f() {
        return new o(this.f);
    }

    public /* synthetic */ ia2 g() {
        return new o(this.f);
    }
}
