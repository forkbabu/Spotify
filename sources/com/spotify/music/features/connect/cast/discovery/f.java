package com.spotify.music.features.connect.cast.discovery;

import com.google.common.base.Optional;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

public class f implements e {
    private final i a;

    public f(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.e
    public DiscoveryConfiguration a() {
        DiscoveryConfiguration.FeatureFlagOverrideValue featureFlagOverrideValue = DiscoveryConfiguration.FeatureFlagOverrideValue.NONE;
        if (this.a.a()) {
            Optional<DiscoveryConfiguration> b = this.a.b();
            if (b.isPresent()) {
                DiscoveryConfiguration discoveryConfiguration = b.get();
                DiscoveryConfiguration discoveryConfiguration2 = new DiscoveryConfiguration();
                discoveryConfiguration2.mDiscoverySupport.add(featureFlagOverrideValue);
                discoveryConfiguration2.mAppIds.add(DiscoveryConfiguration.b());
                discoveryConfiguration.getClass();
                discoveryConfiguration2.mAppIds.addAll(discoveryConfiguration.mAppIds);
                discoveryConfiguration2.mDiscoverySupport.addAll(discoveryConfiguration.mDiscoverySupport);
                discoveryConfiguration.mAppIds.clear();
                discoveryConfiguration.mDiscoverySupport.clear();
                discoveryConfiguration.mAppIds.addAll(discoveryConfiguration2.mAppIds);
                discoveryConfiguration.mDiscoverySupport.addAll(discoveryConfiguration2.mDiscoverySupport);
                return discoveryConfiguration;
            }
        }
        DiscoveryConfiguration discoveryConfiguration3 = new DiscoveryConfiguration();
        discoveryConfiguration3.mDiscoverySupport.add(featureFlagOverrideValue);
        discoveryConfiguration3.mAppIds.add(DiscoveryConfiguration.b());
        return discoveryConfiguration3;
    }
}
