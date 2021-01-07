package com.spotify.music.libs.ageverification;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ AgeRestrictedContentFacade a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(AgeRestrictedContentFacade ageRestrictedContentFacade, String str) {
        this.a = ageRestrictedContentFacade;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Throwable) obj);
    }
}
