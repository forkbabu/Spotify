package com.spotify.music.libs.audio.focus;

import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ a0 a;

    public /* synthetic */ m(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        a0.f(this.a, (LocalPlaybackStatus) obj);
    }
}
