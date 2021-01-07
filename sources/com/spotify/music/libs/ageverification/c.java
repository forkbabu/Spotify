package com.spotify.music.libs.ageverification;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ AgeRestrictedContentFacade a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(AgeRestrictedContentFacade ageRestrictedContentFacade, String str) {
        this.a = ageRestrictedContentFacade;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, (Optional) obj);
    }
}
