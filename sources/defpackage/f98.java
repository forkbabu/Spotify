package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.libs.search.history.p;

/* renamed from: f98  reason: default package */
public final class f98 implements fjf<i> {
    private final wlf<p> a;

    public f98(wlf<p> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
