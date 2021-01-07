package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.g1;
import defpackage.r8f;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ g1.a a;
    public final /* synthetic */ r8f.a b;

    public /* synthetic */ f(g1.a aVar, r8f.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.a aVar = this.a;
        r8f.a aVar2 = this.b;
        g1.n(g1.this, aVar2.f(), aVar2.d(), aVar2.e());
    }
}
