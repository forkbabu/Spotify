package com.spotify.music.features.playlistentity.story.header;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

public final /* synthetic */ class b0 implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ b0(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
