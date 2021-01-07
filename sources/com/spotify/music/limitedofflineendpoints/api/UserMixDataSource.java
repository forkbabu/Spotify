package com.spotify.music.limitedofflineendpoints.api;

import io.reactivex.z;

public interface UserMixDataSource {

    public enum TrackState {
        ADDED,
        REMOVED,
        DENIED,
        ERROR
    }

    z<TrackState> a(String str);

    z<TrackState> b();

    z<TrackState> c(String str);
}
