package com.spotify.music.sociallistening.nearby.medium;

import android.net.nsd.NsdManager;
import kotlin.jvm.internal.Lambda;

final class NearbyMediumWifi$nsdManager$2 extends Lambda implements cmf<NsdManager> {
    final /* synthetic */ NearbyMediumWifi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NearbyMediumWifi$nsdManager$2(NearbyMediumWifi nearbyMediumWifi) {
        super(0);
        this.this$0 = nearbyMediumWifi;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public NsdManager invoke() {
        Object systemService = NearbyMediumWifi.b(this.this$0).getSystemService("servicediscovery");
        if (systemService != null) {
            return (NsdManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
    }
}
