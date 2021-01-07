package com.spotify.music.libs.restrictedcontent.transformer;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ ContentRestrictedHelperImpl a;

    public /* synthetic */ b(ContentRestrictedHelperImpl contentRestrictedHelperImpl) {
        this.a = contentRestrictedHelperImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ContentRestrictedHelperImpl.f(this.a, ((Boolean) obj).booleanValue());
    }
}
