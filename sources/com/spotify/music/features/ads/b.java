package com.spotify.music.features.ads;

import android.app.Activity;
import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ i80 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ b(i80 i80, Activity activity) {
        this.a = i80;
        this.b = activity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Uri) obj);
    }
}
