package defpackage;

import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

/* renamed from: n24  reason: default package */
public final class n24 implements fjf<m24> {
    private final wlf<q> a;
    private final wlf<Picasso> b;

    public n24(wlf<q> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m24(this.a.get(), this.b.get());
    }
}
