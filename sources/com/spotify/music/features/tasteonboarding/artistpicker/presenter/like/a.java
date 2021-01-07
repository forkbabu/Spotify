package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ e a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(e eVar, boolean z, String str) {
        this.a = eVar;
        this.b = z;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (Boolean) obj);
    }
}
