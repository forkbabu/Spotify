package com.spotify.libs.connect.volume.controllers;

import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Float) obj).floatValue() != -1.0f;
    }
}
