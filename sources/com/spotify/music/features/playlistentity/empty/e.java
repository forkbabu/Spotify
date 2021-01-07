package com.spotify.music.features.playlistentity.empty;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ e(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
