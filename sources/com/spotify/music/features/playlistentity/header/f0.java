package com.spotify.music.features.playlistentity.header;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

public final /* synthetic */ class f0 implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ f0(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
