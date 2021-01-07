package com.spotify.mobile.android.video.offline;

import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;

public class y implements BetamaxOfflineManager {
    private final u a;
    private final t b;
    private final r82 c;

    public y(u uVar, t tVar, r82 r82) {
        this.a = uVar;
        this.b = tVar;
        this.c = r82;
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void a(s sVar) {
        this.c.a(sVar);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void b(String str) {
        this.a.i(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public long c(String str) {
        return this.b.i(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void d() {
        this.a.h();
        this.b.n();
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public e0 e(String str) {
        return this.b.h(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public boolean f(String str) {
        return this.b.l(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public BetamaxOfflineManager.BetamaxDownloadState g(String str) {
        return this.b.j(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void h() {
        this.a.c();
        this.b.k();
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void i(String str) {
        this.a.a(str);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public void j(s sVar) {
        this.c.l(sVar);
    }

    @Override // com.spotify.mobile.android.video.offline.BetamaxOfflineManager
    public boolean k(g0 g0Var, f0 f0Var) {
        BetamaxOfflineManager.BetamaxDownloadState j = this.b.j(g0Var.b());
        if (j == BetamaxOfflineManager.BetamaxDownloadState.STATE_DOWNLOADING || j == BetamaxOfflineManager.BetamaxDownloadState.STATE_COMPLETED) {
            return false;
        }
        this.a.b(g0Var, f0Var);
        return true;
    }
}
