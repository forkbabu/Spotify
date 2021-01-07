package com.spotify.music.libs.connect.access.animation.logic;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ NudgeResolver a;

    public /* synthetic */ b(NudgeResolver nudgeResolver) {
        this.a = nudgeResolver;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((Boolean) obj);
    }
}
