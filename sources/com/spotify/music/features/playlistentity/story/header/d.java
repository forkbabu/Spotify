package com.spotify.music.features.playlistentity.story.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ m0 a;

    public /* synthetic */ d(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.getClass();
        Logger.o((Throwable) obj, "error when fetching story header video", new Object[0]);
    }
}
