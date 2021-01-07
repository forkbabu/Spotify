package defpackage;

import com.spotify.music.json.e;
import com.spotify.music.json.g;

/* renamed from: zx9  reason: default package */
public final class zx9 implements fjf<e> {
    private final wlf<g> a;

    public zx9(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b();
    }
}
