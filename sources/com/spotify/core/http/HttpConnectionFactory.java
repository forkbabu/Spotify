package com.spotify.core.http;

public interface HttpConnectionFactory {
    HttpConnectionDelegate createDelegate();
}
