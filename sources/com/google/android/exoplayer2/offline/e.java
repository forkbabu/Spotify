package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ DownloadHelper a;
    public final /* synthetic */ DownloadHelper.b b;

    public /* synthetic */ e(DownloadHelper downloadHelper, DownloadHelper.b bVar) {
        this.a = downloadHelper;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadHelper downloadHelper = this.a;
        DownloadHelper.b bVar = this.b;
        downloadHelper.getClass();
        bVar.a(downloadHelper);
    }
}
