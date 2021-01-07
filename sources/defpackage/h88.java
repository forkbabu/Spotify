package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.libs.search.history.p;

/* renamed from: h88  reason: default package */
public final class h88 implements fjf<i> {
    private final wlf<p> a;

    public h88(wlf<p> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
