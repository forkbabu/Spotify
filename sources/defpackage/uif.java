package defpackage;

import com.spotify.loginflow.navigation.Destination;
import defpackage.pif;

/* renamed from: uif  reason: default package */
public final class uif implements fjf<y01<? extends Destination>> {
    private final wlf<Boolean> a;

    public uif(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean booleanValue = this.a.get().booleanValue();
        pif.a aVar = pif.a;
        return new oif(booleanValue);
    }
}
