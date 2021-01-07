package defpackage;

import com.spotify.mobile.android.ui.activity.c;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.connection.g;
import com.spotify.music.features.tasteonboarding.i;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: vn8  reason: default package */
public final class vn8 implements fjf<un8> {
    private final wlf<Boolean> a;
    private final wlf<Integer> b;
    private final wlf<k> c;
    private final wlf<y> d;
    private final wlf<ho8> e;
    private final wlf<s<g>> f;
    private final wlf<sm8> g;
    private final wlf<vl8> h;
    private final wlf<no8> i;
    private final wlf<c> j;
    private final wlf<com.spotify.music.features.tasteonboarding.c> k;
    private final wlf<i> l;

    public vn8(wlf<Boolean> wlf, wlf<Integer> wlf2, wlf<k> wlf3, wlf<y> wlf4, wlf<ho8> wlf5, wlf<s<g>> wlf6, wlf<sm8> wlf7, wlf<vl8> wlf8, wlf<no8> wlf9, wlf<c> wlf10, wlf<com.spotify.music.features.tasteonboarding.c> wlf11, wlf<i> wlf12) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new un8(this.a.get().booleanValue(), this.b.get().intValue(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
