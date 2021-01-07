package com.spotify.music.lyrics.core.experience.presenter.controller;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class d implements g {
    private final /* synthetic */ nmf a;

    d(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
