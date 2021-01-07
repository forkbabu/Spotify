package defpackage;

import com.spotify.music.playactionhandler.impl.playorqueue.q;

/* renamed from: hec  reason: default package */
public final class hec implements fjf<cec> {
    private final wlf<q> a;

    public hec(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fec(this.a.get());
    }
}
