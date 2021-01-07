package com.spotify.music.preview;

import com.spotify.music.preview.PreviewPlayerImpl;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ PreviewPlayerImpl.AnonymousClass1 a;

    public /* synthetic */ c(PreviewPlayerImpl.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PreviewPlayerImpl.x(PreviewPlayerImpl.this, (PlayerState) obj);
    }
}
