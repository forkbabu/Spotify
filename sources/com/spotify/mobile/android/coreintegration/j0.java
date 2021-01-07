package com.spotify.mobile.android.coreintegration;

import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.a0;

/* access modifiers changed from: package-private */
public class j0 implements a0 {
    private ConnectionType a = ConnectionType.CONNECTION_TYPE_UNKNOWN;
    private final OrbitServiceInterface b;

    j0(OrbitServiceInterface orbitServiceInterface) {
        this.b = orbitServiceInterface;
    }

    @Override // com.spotify.mobile.android.util.connectivity.a0
    public void a(ConnectionType connectionType, boolean z) {
        this.b.setConnectivityType(connectionType.d(), z);
        ConnectionType connectionType2 = this.a;
        if (connectionType != connectionType2) {
            this.a = connectionType;
            if (!connectionType.h()) {
                this.b.tryReconnectNow(!connectionType2.h() && connectionType2.g() != connectionType.g());
            }
        }
    }
}
