package com.spotify.mobile.android.cosmos.player.v2;

import java.util.List;

@Deprecated
public interface Player {

    public interface ActionCallback {
        void onActionForbidden(List<String> list);

        void onActionSuccess();
    }

    public interface PlayerStateObserver {
        void onPlayerStateReceived(LegacyPlayerState legacyPlayerState);
    }

    public interface PreparePlayCallback {
        void onPreparePlayFailed();

        void onPreparePlaySuccess(PlayerSession playerSession);
    }

    void fetchState(PlayerStateObserver playerStateObserver);

    LegacyPlayerState getLastPlayerState();

    String getViewUri();

    void pause();

    void play(PlayerContext playerContext, PlayOptions playOptions);

    void play(PlayerContext playerContext, PlayOptions playOptions, ActionCallback actionCallback);

    void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str);

    void preparePlay(PlayerContext playerContext, PlayOptions playOptions, PreparePlayCallback preparePlayCallback);

    void resume();

    void seekTo(long j);

    void skipToNextTrack();

    void skipToPreviousTrack();
}
