package defpackage;

import com.spotify.music.json.g;

/* renamed from: oxd  reason: default package */
public final class oxd implements fjf<nxd> {
    private final wlf<g> a;

    public oxd(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nxd(this.a.get());
    }
}
