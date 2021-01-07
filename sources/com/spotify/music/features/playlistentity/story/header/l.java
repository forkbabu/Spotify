package com.spotify.music.features.playlistentity.story.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "StoryHeaderPresenter failed to wait for scroll to position", new Object[0]);
    }
}
