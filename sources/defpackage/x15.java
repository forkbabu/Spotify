package defpackage;

import com.spotify.music.features.followfeed.hubs.components.a;
import com.spotify.music.features.followfeed.hubs.components.c;
import com.spotify.music.features.followfeed.hubs.components.g;
import com.spotify.music.features.followfeed.hubs.components.i;
import com.spotify.music.features.followfeed.hubs.components.k;

/* renamed from: x15  reason: default package */
public final class x15 implements fjf<w15> {
    private final wlf<k> a;
    private final wlf<c> b;
    private final wlf<g> c;
    private final wlf<a> d;
    private final wlf<i> e;

    public x15(wlf<k> wlf, wlf<c> wlf2, wlf<g> wlf3, wlf<a> wlf4, wlf<i> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w15(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
