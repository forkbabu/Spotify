package com.spotify.music.features.nowplayingbar;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class NowPlayingBarFragment$onCreateView$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    NowPlayingBarFragment$onCreateView$1(NowPlayingBarFragment nowPlayingBarFragment) {
        super(1, nowPlayingBarFragment, NowPlayingBarFragment.class, "changeSnackbarVisibility", "changeSnackbarVisibility(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        NowPlayingBarFragment.K4((NowPlayingBarFragment) this.receiver, bool.booleanValue());
        return f.a;
    }
}
