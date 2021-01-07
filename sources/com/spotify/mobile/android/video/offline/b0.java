package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;
import io.reactivex.a0;
import java.io.IOException;

class b0 implements DownloadHelper.b {
    final /* synthetic */ a0 a;
    final /* synthetic */ c0 b;

    b0(c0 c0Var, a0 a0Var) {
        this.b = c0Var;
        this.a = a0Var;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper.b
    public void a(DownloadHelper downloadHelper) {
        this.b.c(downloadHelper);
        this.a.onSuccess(downloadHelper);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper.b
    public void b(DownloadHelper downloadHelper, IOException iOException) {
        this.a.onError(iOException);
        downloadHelper.j();
    }
}
