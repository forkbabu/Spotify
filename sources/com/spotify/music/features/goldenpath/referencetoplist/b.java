package com.spotify.music.features.goldenpath.referencetoplist;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return s.i0(z81.i().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).y(z81.h().a("Hi! I'm an error!").c("And I'm an explanation")).l()).g());
    }
}
