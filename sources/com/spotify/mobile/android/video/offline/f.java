package com.spotify.mobile.android.video.offline;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ u a;
    public final /* synthetic */ String b;

    public /* synthetic */ f(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (Throwable) obj);
    }
}
