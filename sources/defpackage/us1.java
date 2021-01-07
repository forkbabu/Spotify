package defpackage;

import com.spotify.player.sub.l;

/* renamed from: us1  reason: default package */
public final class us1 implements fjf<ts1> {
    private final wlf<l> a;

    public us1(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ts1(this.a.get());
    }
}
