package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.c0;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class LoadedFollowedShowsPresenterImpl$start$2 extends FunctionReferenceImpl implements nmf<c0, f> {
    LoadedFollowedShowsPresenterImpl$start$2(LoadedFollowedShowsPresenterImpl loadedFollowedShowsPresenterImpl) {
        super(1, loadedFollowedShowsPresenterImpl, LoadedFollowedShowsPresenterImpl.class, "onShowPlayerStateReceived", "onShowPlayerStateReceived(Lcom/spotify/music/podcast/freetierlikes/tabs/followed/ShowPlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        h.e(c0Var2, "p1");
        LoadedFollowedShowsPresenterImpl.d((LoadedFollowedShowsPresenterImpl) this.receiver, c0Var2);
        return f.a;
    }
}
