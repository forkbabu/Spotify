package com.spotify.mobile.android.video.cosmos;

import com.spotify.mobile.android.video.cosmos.i;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.exception.PlaybackException;
import com.spotify.mobile.android.video.model.PlayerError;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ i.a a;

    public /* synthetic */ b(i.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        i.a aVar = this.a;
        Long l = (Long) obj;
        i.this.n.c(PlayerError.fromVideoPlaybackError(new PlaybackException("Playback stuck", ErrorType.ERROR_PLAYBACK_STUCK), aVar.n));
        i.this.n.b(k.d);
    }
}
