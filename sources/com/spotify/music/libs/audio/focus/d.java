package com.spotify.music.libs.audio.focus;

import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RemotePlaybackStatus remotePlaybackStatus = (RemotePlaybackStatus) obj;
        this.a.getClass();
    }
}
