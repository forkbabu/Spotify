package com.spotify.libs.connect;

public interface ConnectManager extends t, j, k {

    public enum ConnectManagerState {
        NOT_STARTED,
        STARTED,
        STOPPED
    }

    public enum ConnectState {
        UNKNOWN,
        NORMAL,
        DETECTED,
        ACTIVE,
        CONNECTING
    }

    public interface a {
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    @Override // com.spotify.libs.connect.t
    void a();

    @Deprecated
    void n(a aVar);
}
