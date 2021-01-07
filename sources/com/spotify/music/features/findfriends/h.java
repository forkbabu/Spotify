package com.spotify.music.features.findfriends;

import com.google.common.collect.ImmutableList;
import com.spotify.music.follow.l;
import io.reactivex.functions.f;

public final /* synthetic */ class h implements f {
    public final /* synthetic */ q0 a;
    public final /* synthetic */ ImmutableList b;
    public final /* synthetic */ l c;

    public /* synthetic */ h(q0 q0Var, ImmutableList immutableList, l lVar) {
        this.a = q0Var;
        this.b = immutableList;
        this.c = lVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.d(this.b, this.c);
    }
}
