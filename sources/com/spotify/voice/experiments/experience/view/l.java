package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.g1;
import defpackage.u8f;

public final /* synthetic */ class l implements si0 {
    public final /* synthetic */ g1.a a;

    public /* synthetic */ l(g1.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        g1.a aVar = this.a;
        u8f.i iVar = (u8f.i) obj;
        aVar.getClass();
        if (iVar.l().isPresent()) {
            g1.l(g1.this, new j(aVar, iVar));
        } else {
            g1.f(g1.this);
        }
    }
}
