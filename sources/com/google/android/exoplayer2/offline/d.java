package com.google.android.exoplayer2.offline;

import java.io.IOException;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ DownloadHelper a;
    public final /* synthetic */ IOException b;

    public /* synthetic */ d(DownloadHelper downloadHelper, IOException iOException) {
        this.a = downloadHelper;
        this.b = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
