package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ u a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (DownloadHelper) obj);
    }
}
