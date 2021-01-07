package com.spotify.cosmos.clienttoken;

public interface ClientTokenModule {
    ClientTokenEndpoint bindClientTokenClient(ClientTokenClientImpl clientTokenClientImpl);
}
