package com.spotify.music.features.voice;

import android.content.Intent;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ t a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ k(t tVar, Intent intent) {
        this.a = tVar;
        this.b = intent;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (u3) obj);
    }
}
