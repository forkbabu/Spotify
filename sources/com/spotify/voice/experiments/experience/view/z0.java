package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.k1;
import defpackage.u8f;

public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ k1.a a;
    public final /* synthetic */ u8f.i b;

    public /* synthetic */ z0(k1.a aVar, u8f.i iVar) {
        this.a = aVar;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1.g(k1.this, this.b.l().get());
    }
}
