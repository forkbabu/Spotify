package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.r;

/* renamed from: q82  reason: default package */
public class q82 implements r {
    @Override // com.spotify.mobile.android.video.offline.r
    public void a(d0 d0Var, long j, Throwable th, long j2) {
        Logger.o(th, "onDownloadError downloadIdentity=%s bytesDownloaded=%d timestamp=%d", d0Var, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void b(d0 d0Var, long j, long j2) {
        Logger.b("onDownloadCompleted downloadIdentity=%s bytesDownloaded=%d timestamp=%d", d0Var, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void c(d0 d0Var, long j) {
        Logger.b("onDownloadCreated downloadIdentity=%s timestamp=%d", d0Var, Long.valueOf(j));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void d(d0 d0Var, long j, long j2) {
        Logger.b("onDownloadCancelled downloadIdentity=%s bytesDownloaded=%d timestamp=%d", d0Var, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void e(d0 d0Var, long j, long j2) {
        Logger.b("onDownloadStopped downloadIdentity=%s bytesDownloaded=%d timestamp=%d", d0Var, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // com.spotify.mobile.android.video.offline.r
    public void f(d0 d0Var, long j, long j2) {
        Logger.b("onDownloadProgressChanged downloadIdentity=%s bytesDownloaded=%d timestamp=%d", d0Var, Long.valueOf(j), Long.valueOf(j2));
    }
}
