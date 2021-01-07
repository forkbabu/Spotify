package com.spotify.music.features.playlistentity.story.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class s implements g {
    public static final /* synthetic */ s a = new s();

    private /* synthetic */ s() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "StoryHeaderPresenter: failed to get betamax configuration", new Object[0]);
    }
}
