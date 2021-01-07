package com.spotify.mobile.android.service.media;

import io.reactivex.functions.a;

public final /* synthetic */ class t implements a {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t(c2 c2Var, String str, boolean z) {
        this.a = c2Var;
        this.b = str;
        this.c = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.j(this.b, this.c);
    }
}
