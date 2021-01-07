package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: f95  reason: default package */
public final class f95 implements fjf<s0> {
    private final wlf<c> a;

    public f95(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get().toString());
    }
}
