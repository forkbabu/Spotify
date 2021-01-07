package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.k1;
import defpackage.u8f;

public final /* synthetic */ class n0 implements si0 {
    public final /* synthetic */ k1.a a;

    public /* synthetic */ n0(k1.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        k1.a aVar = this.a;
        u8f.i iVar = (u8f.i) obj;
        aVar.getClass();
        if (iVar.l().isPresent()) {
            k1.o(k1.this, new z0(aVar, iVar));
        } else {
            k1.g(k1.this, "");
        }
    }
}
