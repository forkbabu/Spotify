package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ g a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(g gVar, String str, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (u3) obj);
    }
}
