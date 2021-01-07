package com.spotify.music.share.logging;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayerState;
import com.spotify.share.sharedata.t;

public class a implements a8e {
    private final jz1 a;
    private final Optional<c> b;
    private final Context c;

    public a(Context context, jz1 jz1, Optional<c> optional) {
        this.c = context;
        this.a = jz1;
        this.b = optional;
    }

    @Override // defpackage.a8e
    public z7e a(t tVar, PlayerState playerState) {
        String cVar = this.b.isPresent() ? this.b.get().toString() : "";
        if (tVar.e() != null) {
            cVar = tVar.e();
        }
        Context context = this.c;
        cVar.getClass();
        return new LegacyShareEventEmitterImpl(context, cVar, tVar.g(), tVar.a(), playerState, this.a);
    }
}
