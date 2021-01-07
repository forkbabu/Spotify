package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.k1;
import defpackage.r8f;

public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ k1.a a;
    public final /* synthetic */ r8f.b b;

    public /* synthetic */ w0(k1.a aVar, r8f.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1.a aVar = this.a;
        r8f.b bVar = this.b;
        k1.p(k1.this, bVar.f(), bVar.d(), bVar.e());
    }
}
