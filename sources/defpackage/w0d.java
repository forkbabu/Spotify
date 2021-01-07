package defpackage;

import com.spotify.music.share.logging.ShareMenuLogger;
import defpackage.xzc;
import io.reactivex.y;

/* renamed from: w0d  reason: default package */
public final class w0d implements fjf<v0d> {
    private final wlf<x6e> a;
    private final wlf<y> b;
    private final wlf<xzc.a> c;
    private final wlf<ShareMenuLogger> d;

    public w0d(wlf<x6e> wlf, wlf<y> wlf2, wlf<xzc.a> wlf3, wlf<ShareMenuLogger> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v0d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
