package com.spotify.music.libs.audio.focus;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ e(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f((PlayerState) obj);
    }
}
