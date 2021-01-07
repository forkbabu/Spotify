package com.spotify.mobile.android.video.offline.logging;

import com.google.protobuf.u;
import com.spotify.messages.BetamaxDownloadError;
import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.exception.BetamaxDownloadException;
import com.spotify.mobile.android.video.offline.exception.ErrorType;
import com.spotify.mobile.android.video.offline.q;
import com.spotify.mobile.android.video.offline.r;

public class a implements r {
    private final gl0<u> a;
    private long b;
    private long c;

    public a(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void a(d0 d0Var, long j, Throwable th, long j2) {
        String str;
        ErrorType errorType = ErrorType.ERROR_UNKNOWN;
        ErrorType a2 = th instanceof BetamaxDownloadException ? ((BetamaxDownloadException) th).a() : errorType;
        if (a2 == errorType && this.c > 20) {
            a2 = ErrorType.ERROR_NO_INTERNET_CONNECTION;
            th = new BetamaxDownloadException("Failed to download video. No internet connection. ", a2);
        }
        BetamaxDownloadError.b r = BetamaxDownloadError.r();
        r.m(a2.d());
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        r.n(str);
        r.o(z42.p(th));
        r.p(z42.o(th));
        r.q(z42.n(th));
        r.t(d0Var.d());
        r.r("offline-coordinator");
        r.s(d0Var.b());
        this.a.c((BetamaxDownloadError) r.build());
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public /* synthetic */ void b(d0 d0Var, long j, long j2) {
        q.b(this, d0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public /* synthetic */ void c(d0 d0Var, long j) {
        q.c(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public /* synthetic */ void d(d0 d0Var, long j, long j2) {
        q.a(this, d0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public /* synthetic */ void e(d0 d0Var, long j, long j2) {
        q.d(this, d0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void f(d0 d0Var, long j, long j2) {
        if (j == this.b) {
            this.c++;
        } else {
            this.c = 0;
        }
        this.b = j;
    }
}
