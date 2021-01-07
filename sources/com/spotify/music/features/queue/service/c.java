package com.spotify.music.features.queue.service;

import com.spotify.mobile.android.util.l0;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ p a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(p pVar, String str) {
        this.a = pVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (l0) obj);
    }
}
