package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.experiments.experience.view.g1;
import defpackage.u8f;

public final /* synthetic */ class i implements si0 {
    public final /* synthetic */ g1.a a;

    public /* synthetic */ i(g1.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        g1.a aVar = this.a;
        aVar.getClass();
        ClientAction l = ((u8f.g) obj).l();
        if (l != null) {
            int ordinal = l.ordinal();
            if (ordinal == 5) {
                g1.this.p.f(g1.this.q.b(), g1.this.q.d());
            } else if (ordinal == 30) {
                g1.this.p.d(g1.this.q.b(), g1.this.q.d());
            }
        }
    }
}
