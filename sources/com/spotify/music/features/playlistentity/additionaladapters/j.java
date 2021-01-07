package com.spotify.music.features.playlistentity.additionaladapters;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ j(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
