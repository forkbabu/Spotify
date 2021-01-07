package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: m77  reason: default package */
public final class m77 implements fjf<s0> {
    private final wlf<c> a;

    public m77(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get().toString());
    }
}
