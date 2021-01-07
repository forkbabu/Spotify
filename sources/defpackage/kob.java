package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.nowplaying.common.view.logging.c;

/* renamed from: kob  reason: default package */
public final class kob implements fjf<job> {
    private final wlf<c> a;
    private final wlf<ere> b;
    private final wlf<a> c;
    private final wlf<com.spotify.music.libs.viewuri.c> d;

    public kob(wlf<c> wlf, wlf<ere> wlf2, wlf<a> wlf3, wlf<com.spotify.music.libs.viewuri.c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new job(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
