package com.spotify.music.features.playlistentity.trackcloud;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ o(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
