package com.spotify.mobile.android.service.media;

import com.spotify.playlist.models.k;
import io.reactivex.functions.l;

public final /* synthetic */ class c0 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ c0(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3(this.a, (k) obj);
    }
}
