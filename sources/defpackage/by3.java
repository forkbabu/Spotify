package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.premiummini.k;
import com.spotify.remoteconfig.d5;

/* renamed from: by3  reason: default package */
public final class by3 implements fjf<ay3> {
    private final wlf<w> a;
    private final wlf<vwc> b;
    private final wlf<d5> c;
    private final wlf<k> d;

    public by3(wlf<w> wlf, wlf<vwc> wlf2, wlf<d5> wlf3, wlf<k> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ay3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
