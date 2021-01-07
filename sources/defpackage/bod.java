package defpackage;

import com.spotify.music.track.share.impl.video.service.a;
import com.spotify.remoteconfig.w7;
import defpackage.dod;

/* renamed from: bod  reason: default package */
public final class bod implements fjf<aod> {
    private final wlf<dod.a> a;
    private final wlf<w7> b;
    private final wlf<a> c;
    private final wlf<vnd> d;

    public bod(wlf<dod.a> wlf, wlf<w7> wlf2, wlf<a> wlf3, wlf<vnd> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aod(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
