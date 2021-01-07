package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.remoteconfig.RemoteConfigurationCosmosIntegration;

/* renamed from: su2  reason: default package */
public final class su2 implements fjf<RemoteConfigurationCosmosIntegration> {
    private final wlf<Cosmonaut> a;

    public su2(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RemoteConfigurationCosmosIntegration(this.a.get());
    }
}
