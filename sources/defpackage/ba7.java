package defpackage;

import com.spotify.remoteconfig.q6;
import com.squareup.picasso.Picasso;
import defpackage.z97;

/* renamed from: ba7  reason: default package */
public final class ba7 implements fjf<aa7> {
    private final wlf<q6> a;
    private final wlf<Picasso> b;
    private final wlf<z97.a> c;

    public ba7(wlf<q6> wlf, wlf<Picasso> wlf2, wlf<z97.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aa7(this.a.get(), this.b.get(), ejf.a(this.c));
    }
}
