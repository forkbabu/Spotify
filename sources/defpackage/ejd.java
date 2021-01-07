package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.db;

/* renamed from: ejd  reason: default package */
public final class ejd implements fjf<djd> {
    private final wlf<db> a;
    private final wlf<Context> b;

    public ejd(wlf<db> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new djd(this.a.get(), this.b.get());
    }
}
