package com.spotify.music.features.playlistentity.trackcloud;

import com.google.common.base.Function;
import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import com.spotify.playlist.models.l;

public final /* synthetic */ class f implements Function {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return new u3((l) obj, TrackCloudShuffling.TrackType.IN_PLAYLIST);
    }
}
