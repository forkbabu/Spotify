package com.spotify.music.features.playlistentity.header;

import io.reactivex.functions.a;

public final /* synthetic */ class e implements a {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ e(k0 k0Var, boolean z, String str) {
        this.a = k0Var;
        this.b = z;
        this.c = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b, this.c);
    }
}
