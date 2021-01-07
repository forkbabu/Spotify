package com.spotify.music.autoplay;

import android.content.Context;
import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public final /* synthetic */ z a;
    public final /* synthetic */ Context b;

    public /* synthetic */ m(z zVar, Context context) {
        this.a = zVar;
        this.b = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (RadioSeedBundle) obj);
    }
}
