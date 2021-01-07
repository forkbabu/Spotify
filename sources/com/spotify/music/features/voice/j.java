package com.spotify.music.features.voice;

import android.content.Intent;
import io.reactivex.functions.a;

public final /* synthetic */ class j implements a {
    public final /* synthetic */ t a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ j(t tVar, Intent intent) {
        this.a = tVar;
        this.b = intent;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b);
    }
}
