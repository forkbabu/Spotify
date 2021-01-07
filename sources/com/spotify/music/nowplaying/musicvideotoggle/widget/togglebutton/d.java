package com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton;

import com.spotify.player.model.PlayerState;

public final /* synthetic */ class d implements io.reactivex.functions.d {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return playerState.track().equals(playerState2.track()) && playerState.playbackId().equals(playerState2.playbackId());
    }
}
