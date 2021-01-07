package defpackage;

import android.content.res.Resources;
import com.spotify.remoteconfig.jb;

/* renamed from: nod  reason: default package */
public final class nod implements fjf<mod> {
    private final wlf<Resources> a;
    private final wlf<jb> b;

    public nod(wlf<Resources> wlf, wlf<jb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mod(this.a.get(), this.b.get());
    }
}
