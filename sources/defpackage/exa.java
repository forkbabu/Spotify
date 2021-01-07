package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: exa  reason: default package */
public final class exa implements fjf<dxa> {
    private final wlf<pwa<Entity>> a;

    public exa(wlf<pwa<Entity>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dxa(this.a.get());
    }
}
