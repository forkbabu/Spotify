package defpackage;

import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.t;
import defpackage.pif;
import kotlin.jvm.internal.h;

/* renamed from: qif  reason: default package */
public final class qif implements fjf<y01<? extends Destination>> {
    private final wlf<t> a;

    public qif(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        pif.a aVar = pif.a;
        h.e(tVar, "loginFlowIntentBuilder");
        return new lif(tVar);
    }
}
