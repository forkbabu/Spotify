package com.spotify.music.features.album.di;

import com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ AlbumAutoPlayUrlHandler.AnonymousClass1 a;

    public /* synthetic */ a(AlbumAutoPlayUrlHandler.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AlbumAutoPlayUrlHandler.b(AlbumAutoPlayUrlHandler.this, (PlayerState) obj);
    }
}
