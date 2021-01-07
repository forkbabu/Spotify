package com.spotify.music.features.go.connection;

import io.reactivex.disposables.b;

public class a {
    private final ae5 a;
    private ConnectionState b = ConnectionState.NONE;
    private b c;

    public a(ae5 ae5) {
        this.a = ae5;
    }

    public ae5 a() {
        return this.a;
    }

    public b b() {
        return this.c;
    }

    public ConnectionState c() {
        return this.b;
    }

    public boolean d() {
        ConnectionState connectionState = this.b;
        return connectionState == ConnectionState.CONNECTING || connectionState == ConnectionState.CONNECTED;
    }

    public void e(b bVar) {
        this.c = bVar;
    }

    public void f(ConnectionState connectionState) {
        this.b = connectionState;
    }
}
