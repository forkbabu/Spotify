package com.spotify.music.features.ads.cmp;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ g a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ a(g gVar, Uri uri) {
        this.a = gVar;
        this.b = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Throwable) obj);
    }
}
