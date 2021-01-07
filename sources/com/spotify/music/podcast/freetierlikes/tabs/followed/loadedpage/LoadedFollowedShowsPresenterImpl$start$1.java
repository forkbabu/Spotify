package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class LoadedFollowedShowsPresenterImpl$start$1 extends FunctionReferenceImpl implements nmf<ryd, f> {
    LoadedFollowedShowsPresenterImpl$start$1(LoadedFollowedShowsPresenterImpl loadedFollowedShowsPresenterImpl) {
        super(1, loadedFollowedShowsPresenterImpl, LoadedFollowedShowsPresenterImpl.class, "onDataLoaded", "onDataLoaded(Lcom/spotify/podcast/models/model/Shows;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ryd ryd) {
        ryd ryd2 = ryd;
        h.e(ryd2, "p1");
        LoadedFollowedShowsPresenterImpl.c((LoadedFollowedShowsPresenterImpl) this.receiver, ryd2);
        return f.a;
    }
}
