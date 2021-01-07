package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: ara  reason: default package */
public final class ara implements fjf<zqa> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public ara(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zqa(this.a.get(), this.b.get());
    }
}
