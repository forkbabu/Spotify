package com.spotify.music.carmode.navigation;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ i a;
    public final /* synthetic */ Context b;

    public /* synthetic */ h(i iVar, Context context) {
        this.a = iVar;
        this.b = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (String) obj);
    }
}
