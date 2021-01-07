package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.e;

/* renamed from: sa3  reason: default package */
public final class sa3 implements fjf<DiscoveryConfiguration> {
    private final wlf<e> a;

    public sa3(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        DiscoveryConfiguration a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
