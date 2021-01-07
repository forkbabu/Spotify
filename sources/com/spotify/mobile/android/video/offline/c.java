package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ u a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (DownloadHelper) obj);
    }
}
