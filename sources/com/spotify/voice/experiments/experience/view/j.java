package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.g1;
import defpackage.u8f;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ g1.a a;
    public final /* synthetic */ u8f.i b;

    public /* synthetic */ j(g1.a aVar, u8f.i iVar) {
        this.a = aVar;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.e(g1.this, this.b.l().get());
    }
}
