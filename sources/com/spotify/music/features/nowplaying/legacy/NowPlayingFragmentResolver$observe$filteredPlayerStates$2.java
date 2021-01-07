package com.spotify.music.features.nowplaying.legacy;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingFragmentResolver$observe$filteredPlayerStates$2 extends FunctionReferenceImpl implements nmf<PlayerState, Optional<ContextTrack>> {
    public static final NowPlayingFragmentResolver$observe$filteredPlayerStates$2 a = new NowPlayingFragmentResolver$observe$filteredPlayerStates$2();

    NowPlayingFragmentResolver$observe$filteredPlayerStates$2() {
        super(1, PlayerState.class, AppProtocol.TrackData.TYPE_TRACK, "track()Lcom/google/common/base/Optional;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Optional<ContextTrack> invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        return playerState2.track();
    }
}
