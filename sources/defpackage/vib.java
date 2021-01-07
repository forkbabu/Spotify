package defpackage;

import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: vib  reason: default package */
public final class vib implements fjf<uib> {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<Picasso> d;

    public vib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<Picasso> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uib(this.a, this.b, this.c, this.d);
    }
}
