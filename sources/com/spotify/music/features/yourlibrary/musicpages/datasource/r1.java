package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;

public final /* synthetic */ class r1 implements g {
    public final /* synthetic */ PublishSubject a;

    public /* synthetic */ r1(PublishSubject publishSubject) {
        this.a = publishSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((y3) obj);
    }
}
