package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

/* renamed from: ra3  reason: default package */
public final class ra3 implements fjf<String> {
    private final wlf<DiscoveryConfiguration> a;

    public ra3(wlf<DiscoveryConfiguration> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
