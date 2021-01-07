package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: zwa  reason: default package */
public final class zwa implements fjf<ywa> {
    private final wlf<pwa<Entity>> a;

    public zwa(wlf<pwa<Entity>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ywa(this.a.get());
    }
}
