package defpackage;

import com.spotify.mobile.android.recentlyplayed.a;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.s;

/* renamed from: xj5  reason: default package */
public final class xj5 implements fjf<s<RecentlyPlayedItems>> {
    private final wlf<o1e<RecentlyPlayedItems>> a;
    private final wlf<a> b;
    private final wlf<s<Boolean>> c;
    private final wlf<ni5> d;
    private final wlf<pi5> e;
    private final wlf<ji5> f;

    public xj5(wlf<o1e<RecentlyPlayedItems>> wlf, wlf<a> wlf2, wlf<s<Boolean>> wlf3, wlf<ni5> wlf4, wlf<pi5> wlf5, wlf<ji5> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static xj5 a(wlf<o1e<RecentlyPlayedItems>> wlf, wlf<a> wlf2, wlf<s<Boolean>> wlf3, wlf<ni5> wlf4, wlf<pi5> wlf5, wlf<ji5> wlf6) {
        return new xj5(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return s.n(this.b.get().b().F(this.f.get()), this.c.get(), gj5.a).q(this.d.get()).q(this.e.get()).q(this.a.get());
    }
}
