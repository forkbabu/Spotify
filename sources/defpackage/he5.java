package defpackage;

import android.content.Context;
import com.spotify.music.features.spoton.q;
import defpackage.ge5;
import io.reactivex.y;

/* renamed from: he5  reason: default package */
public final class he5 implements fjf<ge5.b> {
    private final wlf<q> a;
    private final wlf<y> b;
    private final wlf<vd5> c;
    private final wlf<Context> d;
    private final wlf<uk8> e;
    private final wlf<cte> f;
    private final wlf<yk8> g;

    public he5(wlf<q> wlf, wlf<y> wlf2, wlf<vd5> wlf3, wlf<Context> wlf4, wlf<uk8> wlf5, wlf<cte> wlf6, wlf<yk8> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ge5.b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
