package com.google.android.exoplayer2.offline;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ DownloadHelper a;

    public /* synthetic */ b(DownloadHelper downloadHelper) {
        this.a = downloadHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h();
    }
}
