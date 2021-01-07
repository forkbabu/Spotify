package com.spotify.mobile.android.service.media;

import io.reactivex.functions.a;

public final /* synthetic */ class s implements a {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ s(c2 c2Var, String str, String str2) {
        this.a = c2Var;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.i(this.b, this.c);
    }
}
