package com.spotify.core.http;

public interface HttpConnectionDelegate {
    void abort();

    boolean isRequestStarted();

    void send(HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions);
}
