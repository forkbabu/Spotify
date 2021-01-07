package defpackage;

import com.spotify.smartlock.store.j;
import com.spotify.smartlock.store.k;
import defpackage.je0;

/* renamed from: zme  reason: default package */
public final class zme implements fjf<j> {
    private final wlf<ae0> a;

    public zme(wlf<ae0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(je0.o.b, this.a.get());
    }
}
