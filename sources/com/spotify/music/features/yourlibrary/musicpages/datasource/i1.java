package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;

public final /* synthetic */ class i1 implements l {
    public static final /* synthetic */ i1 a = new i1();

    private /* synthetic */ i1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        for (Object obj2 : (Object[]) obj) {
            if (((Boolean) obj2).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
