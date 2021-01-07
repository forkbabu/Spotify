package defpackage;

import android.content.res.Resources;
import com.spotify.android.glue.patterns.prettylist.u;
import com.squareup.picasso.Picasso;
import defpackage.mc7;
import defpackage.urc;

/* renamed from: qc7  reason: default package */
public final class qc7 implements fjf<pc7> {
    private final wlf<Resources> a;
    private final wlf<urc> b;
    private final wlf<Picasso> c;
    private final wlf<u> d;
    private final wlf<mc7.a> e;
    private final wlf<urc.b> f;

    public qc7(wlf<Resources> wlf, wlf<urc> wlf2, wlf<Picasso> wlf3, wlf<u> wlf4, wlf<mc7.a> wlf5, wlf<urc.b> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pc7(this.a.get(), this.b.get(), this.c.get(), ejf.a(this.d), ejf.a(this.e), ejf.a(this.f));
    }
}
