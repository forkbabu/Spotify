package com.spotify.music.explicitcontent;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ ExplicitContentFacade a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(ExplicitContentFacade explicitContentFacade, String str, String str2) {
        this.a = explicitContentFacade;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, (Boolean) obj);
    }
}
