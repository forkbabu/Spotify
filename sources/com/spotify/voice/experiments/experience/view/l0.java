package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.experiments.experience.view.k1;
import defpackage.u8f;

public final /* synthetic */ class l0 implements si0 {
    public final /* synthetic */ k1.a a;

    public /* synthetic */ l0(k1.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        k1.a aVar = this.a;
        aVar.getClass();
        ClientAction l = ((u8f.g) obj).l();
        if (l != null) {
            int ordinal = l.ordinal();
            if (ordinal == 5) {
                k1.this.r.g(k1.this.x.b(), k1.this.x.d());
            } else if (ordinal == 30) {
                k1.this.r.d(k1.this.x.b(), k1.this.x.d());
            }
        }
    }
}
