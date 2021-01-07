package com.spotify.cosmos.contentaccesstoken;

public interface ContentAccessTokenModule {
    ContentAccessTokenEndpoint bindContentAccessTokenClient(ContentAccessTokenClientImpl contentAccessTokenClientImpl);
}
