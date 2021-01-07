package com.spotify.mobile.android.video.cosmos;

import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ j a;

    public /* synthetic */ c(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        j.c(this.a, (VideoPlayerCommand) obj);
    }
}
