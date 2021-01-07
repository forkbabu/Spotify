package defpackage;

import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: lib  reason: default package */
public final class lib implements fjf<kib> {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<rhb> d;
    private final wlf<Picasso> e;
    private final wlf<mhb> f;

    public lib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<rhb> wlf4, wlf<Picasso> wlf5, wlf<mhb> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kib(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
