package defpackage;

import com.spotify.remoteconfig.hb;
import kotlin.jvm.internal.h;

/* renamed from: emd  reason: default package */
public final class emd implements fjf<cmd> {
    private final wlf<hb> a;

    public emd(wlf<hb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hb hbVar = this.a.get();
        h.e(hbVar, "properties");
        return new dmd(hbVar);
    }
}
