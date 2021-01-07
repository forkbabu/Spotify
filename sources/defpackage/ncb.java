package defpackage;

import com.spotify.remoteconfig.m8;
import defpackage.mcb;
import kotlin.jvm.internal.h;

/* renamed from: ncb  reason: default package */
public final class ncb implements fjf<kcb> {
    private final wlf<m8> a;

    public ncb(wlf<m8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m8 m8Var = this.a.get();
        mcb.a aVar = mcb.a;
        h.e(m8Var, "androidLibsLyricsProperties");
        return new lcb(m8Var);
    }
}
