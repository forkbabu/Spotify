package defpackage;

import com.spotify.remoteconfig.o8;

/* renamed from: xdb  reason: default package */
public final class xdb implements fjf<wdb> {
    private final wlf<o8> a;

    public xdb(wlf<o8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wdb(this.a.get());
    }
}
