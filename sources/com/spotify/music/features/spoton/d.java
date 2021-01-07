package com.spotify.music.features.spoton;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.b;

public final /* synthetic */ class d implements io.reactivex.d {
    public final /* synthetic */ SpotOnPlaybackManager a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PlayOrigin c;

    public /* synthetic */ d(SpotOnPlaybackManager spotOnPlaybackManager, String str, PlayOrigin playOrigin) {
        this.a = spotOnPlaybackManager;
        this.b = str;
        this.c = playOrigin;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.g(this.b, this.c, bVar);
    }
}
