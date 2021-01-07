package com.spotify.mobile.android.video.offline.logging;

import com.google.protobuf.u;
import com.spotify.messages.BetamaxDownloadSession;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.f0;
import com.spotify.mobile.android.video.offline.r;

public class BetamaxDownloadSessionLogger implements r {
    private final gl0<u> a;
    private final f0 b;
    private final y c;
    private ConnectionType d = ConnectionType.CONNECTION_TYPE_UNKNOWN;
    private long e;
    private long f;

    public enum DownloadSessionReasonEnd {
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        STOPPED("stopped"),
        ERROR(AppProtocol.LogMessage.SEVERITY_ERROR);
        
        private final String mReasonEnd;

        private DownloadSessionReasonEnd(String str) {
            this.mReasonEnd = str;
        }

        public String d() {
            return this.mReasonEnd;
        }
    }

    public BetamaxDownloadSessionLogger(gl0<u> gl0, f0 f0Var, y yVar) {
        this.a = gl0;
        this.b = f0Var;
        this.c = yVar;
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void a(d0 d0Var, long j, Throwable th, long j2) {
        this.a.c(g(d0Var, j, DownloadSessionReasonEnd.ERROR, j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void b(d0 d0Var, long j, long j2) {
        this.a.c(g(d0Var, j, DownloadSessionReasonEnd.COMPLETED, j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void c(d0 d0Var, long j) {
        this.e = j;
        this.d = this.c.a();
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void d(d0 d0Var, long j, long j2) {
        this.a.c(g(d0Var, j, DownloadSessionReasonEnd.CANCELLED, j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void e(d0 d0Var, long j, long j2) {
        this.a.c(g(d0Var, j, DownloadSessionReasonEnd.STOPPED, j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void f(d0 d0Var, long j, long j2) {
        if (this.f == 0) {
            this.f = j;
        }
    }

    public BetamaxDownloadSession g(d0 d0Var, long j, DownloadSessionReasonEnd downloadSessionReasonEnd, long j2) {
        long j3 = j2 - this.e;
        String a2 = t72.a(this.d);
        String a3 = t72.a(this.c.a());
        BetamaxDownloadSession.b s = BetamaxDownloadSession.s();
        s.p("offline-coordinator");
        s.r(d0Var.b());
        s.u(d0Var.d());
        s.q((j - this.f) / 1000);
        s.s(j3);
        s.t(downloadSessionReasonEnd.d());
        s.m((long) this.b.b());
        s.o(a2);
        s.n(a3);
        return (BetamaxDownloadSession) s.build();
    }
}
