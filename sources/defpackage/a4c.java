package defpackage;

import com.spotify.http.u;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.c;
import defpackage.z3c;

/* renamed from: a4c  reason: default package */
public final class a4c implements fjf<c> {
    private final wlf<u> a;

    public a4c(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        z3c.a aVar = z3c.a;
        return (c) je.d0(this.a.get(), "retrofitMaker", c.class, "retrofitMaker.createWebg…rYouEndpoint::class.java)");
    }
}
