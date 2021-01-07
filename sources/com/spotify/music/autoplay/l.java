package com.spotify.music.autoplay;

import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {
    public final /* synthetic */ z a;
    public final /* synthetic */ RadioSeedBundle b;

    public /* synthetic */ l(z zVar, RadioSeedBundle radioSeedBundle) {
        this.a = zVar;
        this.b = radioSeedBundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z zVar = this.a;
        RadioSeedBundle radioSeedBundle = this.b;
        zVar.c(radioSeedBundle);
        return radioSeedBundle;
    }
}
