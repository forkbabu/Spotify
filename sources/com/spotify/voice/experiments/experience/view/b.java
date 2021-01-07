package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.g1;
import defpackage.r8f;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ g1.a a;
    public final /* synthetic */ r8f.b b;

    public /* synthetic */ b(g1.a aVar, r8f.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.a aVar = this.a;
        r8f.b bVar = this.b;
        g1.m(g1.this, bVar.f(), bVar.d(), bVar.e());
    }
}
