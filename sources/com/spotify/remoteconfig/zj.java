package com.spotify.remoteconfig;

public final class zj implements fjf<PremiumDestinationProperties> {
    private final wlf<l0e> a;

    public zj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static PremiumDestinationProperties a(l0e l0e) {
        PremiumDestinationProperties premiumDestinationProperties = (PremiumDestinationProperties) l0e.a(g3.a);
        yif.g(premiumDestinationProperties, "Cannot return null from a non-@Nullable @Provides method");
        return premiumDestinationProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
