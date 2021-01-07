package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;
import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class i implements c0 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ DownloadHelper b;

    public /* synthetic */ i(c0 c0Var, DownloadHelper downloadHelper) {
        this.a = c0Var;
        this.b = downloadHelper;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        c0 c0Var = this.a;
        DownloadHelper downloadHelper = this.b;
        c0Var.getClass();
        downloadHelper.i(new b0(c0Var, a0Var));
    }
}
