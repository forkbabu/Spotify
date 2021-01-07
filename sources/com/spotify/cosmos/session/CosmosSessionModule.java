package com.spotify.cosmos.session;

import com.spotify.cosmos.session.impl.ConnectivityClientImpl;
import com.spotify.cosmos.session.impl.SessionClientImpl;

public interface CosmosSessionModule {
    ConnectivityClient bindConnectivityClient(ConnectivityClientImpl connectivityClientImpl);

    SessionClient bindSessionClient(SessionClientImpl sessionClientImpl);
}
