package com.spotify.mobile.android.video.offline;

public interface BetamaxOfflineManager {

    public enum BetamaxDownloadState {
        STATE_NOT_STARTED,
        STATE_QUEUED,
        STATE_STOPPED,
        STATE_DOWNLOADING,
        STATE_COMPLETED,
        STATE_FAILED
    }

    void a(s sVar);

    void b(String str);

    long c(String str);

    void d();

    e0 e(String str);

    boolean f(String str);

    BetamaxDownloadState g(String str);

    void h();

    void i(String str);

    void j(s sVar);

    boolean k(g0 g0Var, f0 f0Var);
}
