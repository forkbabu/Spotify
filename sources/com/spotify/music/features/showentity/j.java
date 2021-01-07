package com.spotify.music.features.showentity;

import com.spotify.mobius.e0;
import com.spotify.music.features.showentity.t;
import com.spotify.playlist.models.Show;

public final /* synthetic */ class j implements ti0 {
    public final /* synthetic */ u a;

    public /* synthetic */ j(u uVar) {
        this.a = uVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        u uVar = this.a;
        t.b bVar = (t.b) obj;
        return e0.f(new q(uVar.d(), uVar.b(), uVar.a(), uVar.a() == Show.MediaType.UNKNOWN));
    }
}
