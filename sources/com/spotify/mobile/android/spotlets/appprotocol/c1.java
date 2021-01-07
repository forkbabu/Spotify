package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class c1 implements l {
    public static final /* synthetic */ c1 a = new c1();

    private /* synthetic */ c1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        AppProtocol.PlayerState playerState = (AppProtocol.PlayerState) obj;
        int i = e4.D;
        AppProtocol.Track track = playerState.track;
        if (track.isEpisode && track.isPodcast) {
            return s.i0(playerState);
        }
        return IapException.b("Playback speed is only supported for Podcast playback");
    }
}
