package defpackage;

import com.spotify.android.flags.c;
import com.spotify.music.features.browse.b;

/* renamed from: ge4  reason: default package */
public final class ge4 implements fjf<fe4> {
    private final wlf<cf4> a;
    private final wlf<c> b;
    private final wlf<cqe> c;
    private final wlf<b> d;

    public ge4(wlf<cf4> wlf, wlf<c> wlf2, wlf<cqe> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static fe4 a(cf4 cf4, c cVar, cqe cqe, b bVar) {
        return new fe4(cf4, cVar, cqe, bVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fe4(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
