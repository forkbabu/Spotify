package com.spotify.mobile.android.service.media;

import io.reactivex.functions.l;

public final /* synthetic */ class d0 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ d0(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return new u3(this.a, null);
    }
}
