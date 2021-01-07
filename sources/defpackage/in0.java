package defpackage;

import com.spotify.http.j;
import com.spotify.http.t;

/* renamed from: in0  reason: default package */
public final class in0 implements fjf<t> {
    private final wlf<j> a;

    public in0(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j jVar = this.a.get();
        if (jVar != null) {
            return jVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
