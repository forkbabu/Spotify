package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: yqa  reason: default package */
public final class yqa implements fjf<xqa> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public yqa(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xqa(this.a.get(), this.b.get());
    }
}
