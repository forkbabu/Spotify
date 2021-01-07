package com.spotify.mobile.android.core.internal;

import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;
import okhttp3.y;

public class HttpConnectionFactoryImpl implements HttpConnectionFactory {
    private final y mHttpClient;

    public HttpConnectionFactoryImpl(y yVar) {
        this.mHttpClient = yVar;
    }

    @Override // com.spotify.core.http.HttpConnectionFactory
    public HttpConnectionDelegate createDelegate() {
        return new HttpConnectionImpl(this.mHttpClient);
    }
}
