package defpackage;

import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.json.g;
import defpackage.ov9;

/* renamed from: kv9  reason: default package */
public final class kv9 implements fjf<jv9> {
    private final wlf<qw9> a;
    private final wlf<ProcessType> b;
    private final wlf<zw9> c;
    private final wlf<yw9> d;
    private final wlf<cqe> e;
    private final wlf<ov9.a> f;
    private final wlf<g> g;
    private final wlf<nx9> h;
    private final wlf<ov9.b> i;

    public kv9(wlf<qw9> wlf, wlf<ProcessType> wlf2, wlf<zw9> wlf3, wlf<yw9> wlf4, wlf<cqe> wlf5, wlf<ov9.a> wlf6, wlf<g> wlf7, wlf<nx9> wlf8, wlf<ov9.b> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jv9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
