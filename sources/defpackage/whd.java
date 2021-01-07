package defpackage;

import com.spotify.zero.tracker.eventsender.b;

/* renamed from: whd  reason: default package */
public final class whd implements fjf<xhd> {
    private final wlf<fid> a;
    private final wlf<b> b;

    public whd(wlf<fid> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ohd(this.a.get(), this.b.get());
    }
}
