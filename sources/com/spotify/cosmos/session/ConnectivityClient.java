package com.spotify.cosmos.session;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.a;

public interface ConnectivityClient {
    a setConnectivity(ConnectionType connectionType);
}
