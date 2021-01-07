package com.spotify.music.spotlets.radio.service;

import com.google.common.base.Predicate;
import com.spotify.music.libs.viewuri.ViewUris;

public final /* synthetic */ class g implements Predicate {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        String str = (String) obj;
        int i = d0.p;
        return ViewUris.s0.a(str) || ViewUris.r0.a(str);
    }
}
