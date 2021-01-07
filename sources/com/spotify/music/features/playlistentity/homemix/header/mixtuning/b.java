package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.view.View;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ o a;
    public final /* synthetic */ View b;

    public /* synthetic */ b(o oVar, View view) {
        this.a = oVar;
        this.b = view;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (xe6) obj);
    }
}
