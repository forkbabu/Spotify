package defpackage;

import android.util.DisplayMetrics;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;
import defpackage.gd5;

/* renamed from: hd5  reason: default package */
public final class hd5 implements fjf<gd5> {
    private final wlf<gd5.b> a;
    private final wlf<s> b;
    private final wlf<l72> c;
    private final wlf<sc5> d;
    private final wlf<DisplayMetrics> e;
    private final wlf<Picasso> f;
    private final wlf<Boolean> g;

    public hd5(wlf<gd5.b> wlf, wlf<s> wlf2, wlf<l72> wlf3, wlf<sc5> wlf4, wlf<DisplayMetrics> wlf5, wlf<Picasso> wlf6, wlf<Boolean> wlf7) {
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
        return new gd5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get().booleanValue());
    }
}
