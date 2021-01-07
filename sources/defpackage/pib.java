package defpackage;

import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: pib  reason: default package */
public final class pib implements fjf<oib> {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<Picasso> d;
    private final wlf<thb> e;
    private final wlf<dib> f;
    private final wlf<mhb> g;

    public pib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<Picasso> wlf4, wlf<thb> wlf5, wlf<dib> wlf6, wlf<mhb> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static pib a(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<Picasso> wlf4, wlf<thb> wlf5, wlf<dib> wlf6, wlf<mhb> wlf7) {
        return new pib(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oib(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
