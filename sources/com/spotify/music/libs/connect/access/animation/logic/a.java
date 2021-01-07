package com.spotify.music.libs.connect.access.animation.logic;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ NudgeResolver a;

    public /* synthetic */ a(NudgeResolver nudgeResolver) {
        this.a = nudgeResolver;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((PlayerState) obj);
    }
}
