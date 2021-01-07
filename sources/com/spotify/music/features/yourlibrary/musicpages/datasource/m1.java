package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.g;
import io.reactivex.subjects.a;

public final /* synthetic */ class m1 implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ m1(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((y3) obj);
    }
}
