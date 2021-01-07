package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.Collections2;

public final /* synthetic */ class d2 implements m4 {
    public static final /* synthetic */ d2 a = new d2();

    private /* synthetic */ d2() {
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.m4
    public final boolean a(x3 x3Var) {
        return Collections2.any(x3Var.c().b().entrySet(), j.a);
    }
}
