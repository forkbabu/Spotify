package com.spotify.music.features.ads;

import android.app.Activity;
import android.net.Uri;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ i80 c;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ g(i0 i0Var, Activity activity, i80 i80, String str, boolean z) {
        this.a = i0Var;
        this.b = activity;
        this.c = i80;
        this.f = str;
        this.n = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, this.f, this.n, (Uri) obj);
    }
}
