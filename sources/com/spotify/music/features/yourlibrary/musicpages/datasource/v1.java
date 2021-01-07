package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.functions.l;

public final /* synthetic */ class v1 implements l {
    public final /* synthetic */ v4 a;

    public /* synthetic */ v1(v4 v4Var) {
        this.a = v4Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return v4.j(this.a, (SongsMetadataFromTracks) obj);
    }
}
