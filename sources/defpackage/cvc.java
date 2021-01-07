package defpackage;

import com.spotify.remoteconfig.ea;
import defpackage.zuc;
import kotlin.jvm.internal.h;

/* renamed from: cvc  reason: default package */
public final class cvc implements fjf<Boolean> {
    private final wlf<ea> a;

    public cvc(wlf<ea> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ea eaVar = this.a.get();
        zuc.a aVar = zuc.a;
        h.e(eaVar, "properties");
        return Boolean.valueOf(eaVar.b());
    }
}
